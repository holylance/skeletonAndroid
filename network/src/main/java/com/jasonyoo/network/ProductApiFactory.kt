package com.jasonyoo.network

import com.jasonyoo.network.base.internal.RetrofitService
import com.jasonyoo.network.internal.ProductApiService
import com.jasonyoo.network.internal.ProductServiceImpl

object ProductApiFactory {
    fun create(): ProductService {
        return ProductServiceImpl(ProductApiService.create(RetrofitService().retrofit))
    }
}
