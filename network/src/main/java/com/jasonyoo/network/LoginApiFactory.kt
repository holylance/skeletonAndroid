package com.jasonyoo.network

import com.jasonyoo.network.base.internal.RetrofitService
import com.jasonyoo.network.internal.LoginApiService
import com.jasonyoo.network.internal.LoginServiceImpl

object LoginApiFactory {
    fun create(): LoginService {
        return LoginServiceImpl(LoginApiService.create(RetrofitService().retrofit))
    }
}
