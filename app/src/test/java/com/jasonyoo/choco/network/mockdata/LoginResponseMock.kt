package com.jasonyoo.choco.network.mockdata

import com.jasonyoo.choco.network.internal.model.LoginResponse

internal object LoginResponseMock {

    fun generate(): LoginResponse {
        return LoginResponse(token = "token")
    }
}
