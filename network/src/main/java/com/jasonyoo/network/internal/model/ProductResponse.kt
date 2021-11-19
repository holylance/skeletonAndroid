package com.jasonyoo.network.internal.model

import android.os.Parcelable
import com.jasonyoo.network.model.Product
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ProductResponse(
    val Id: String,
    val name: String,
    val Description: String,
    val price: Int,
    val photo: String
) : Parcelable {

    fun toProduct() = Product(
        id = Id,
        name = name,
        description = Description,
        price = price,
        photo = photo
    )
}
