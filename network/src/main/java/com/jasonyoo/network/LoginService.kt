package com.jasonyoo.network

import com.jasonyoo.network.model.LoginToken
import io.reactivex.rxjava3.core.Single

/**
 * LoginService to call respective login endpoints
 */
interface LoginService {
    /**
     * Returns a token
     *
     * @return a token or error
     */
    fun login(email: String, password: String): Single<LoginToken>
}
