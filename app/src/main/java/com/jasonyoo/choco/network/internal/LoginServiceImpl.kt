package com.jasonyoo.choco.network.internal

import com.jasonyoo.choco.network.LoginService
import com.jasonyoo.choco.network.internal.model.LoginRequest
import com.jasonyoo.choco.network.model.LoginToken
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
