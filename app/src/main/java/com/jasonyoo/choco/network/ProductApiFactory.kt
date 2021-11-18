package com.jasonyoo.choco.network

import com.jasonyoo.choco.network.base.internal.RetrofitService
import com.jasonyoo.choco.network.internal.ProductApiService
import com.jasonyoo.choco.network.internal.ProductServiceImpl

object ProductApiFactory {
    fun create(): ProductService {
        return ProductServiceImpl(ProductApiService.create(RetrofitService().retrofit))
    }
}
