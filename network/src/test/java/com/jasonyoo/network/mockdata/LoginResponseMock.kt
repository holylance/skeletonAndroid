package com.jasonyoo.network.mockdata

import com.jasonyoo.network.internal.model.LoginResponse

object LoginResponseMock {

    fun generate(): LoginResponse {
        return LoginResponse(token = "token")
    }
}
