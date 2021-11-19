package com.jasonyoo.network.internal

import com.jasonyoo.network.ProductService
import com.jasonyoo.network.model.Product
import io.reactivex.rxjava3.core.Single

internal class ProductServiceImpl(
    private val productApiService: ProductApiService
) : ProductService {

    override fun getProducts(token: String): Single<List<Product>> {
        return productApiService.getProducts(token)
            .map { it.map { response -> response.toProduct() } }
    }
}