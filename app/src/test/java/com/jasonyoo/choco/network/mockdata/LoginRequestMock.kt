package com.jasonyoo.choco.network.mockdata

import com.jasonyoo.choco.network.internal.model.LoginRequest

internal object LoginRequestMock {

    fun generate(): LoginRequest {
        return LoginRequest(
            email = "email",
            password = "password"
        )
    }
}
