package com.jasonyoo.choco.network.mockdata

import com.jasonyoo.choco.network.model.LoginToken

object LoginTokenMock {
    fun generate(): LoginToken {
        return LoginToken(token = "token")
    }
}
