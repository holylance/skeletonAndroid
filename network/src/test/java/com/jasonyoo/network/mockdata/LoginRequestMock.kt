package com.jasonyoo.network.mockdata

import com.jasonyoo.network.internal.model.LoginRequest

object LoginRequestMock {

    fun generate(): LoginRequest {
        return LoginRequest(
            email = "email",
            password = "password"
        )
    }
}
