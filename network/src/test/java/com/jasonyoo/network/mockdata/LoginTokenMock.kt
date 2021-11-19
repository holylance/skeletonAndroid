package com.jasonyoo.network.mockdata

import com.jasonyoo.network.model.LoginToken

object LoginTokenMock {
    fun generate(): LoginToken {
        return LoginToken(token = "token")
    }
}
