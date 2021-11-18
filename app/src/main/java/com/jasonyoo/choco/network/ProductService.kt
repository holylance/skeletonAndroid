package com.jasonyoo.choco.network

import com.jasonyoo.choco.network.model.Product
import io.reactivex.rxjava3.core.Single

/**
 * ProductService to call respective product endpoints
 */
interface ProductService {
    /**
     * Returns a list of product
     *
     * @return list of product or error
     */
    fun getProducts(token: String): Single<List<Product>>
}
