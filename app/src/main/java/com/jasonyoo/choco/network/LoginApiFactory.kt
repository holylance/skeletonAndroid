package com.jasonyoo.choco.network

import com.jasonyoo.choco.network.base.internal.RetrofitService
import com.jasonyoo.choco.network.internal.LoginApiService
import com.jasonyoo.choco.network.internal.LoginServiceImpl

object LoginApiFactory {
    fun create(): LoginService {
        return LoginServiceImpl(LoginApiService.create(RetrofitService().retrofit))
    }
}
