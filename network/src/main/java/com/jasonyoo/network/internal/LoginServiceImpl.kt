package com.jasonyoo.network.internal

import com.jasonyoo.network.LoginService
import com.jasonyoo.network.internal.model.LoginRequest
import com.jasonyoo.network.model.LoginToken
import io.reactivex.rxjava3.core.Single

internal class LoginServiceImpl(
    private val loginApiService: LoginApiService
) : LoginService {

    override fun login(
        email: String,
        password: String
    ): Single<LoginToken> {
        return loginApiService.postLogin(LoginRequest(email, password))
            .map { it.toLoginToken() }
    }
}
