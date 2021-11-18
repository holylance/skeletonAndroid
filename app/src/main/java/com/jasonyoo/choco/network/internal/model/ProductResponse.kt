package com.jasonyoo.choco.network.internal.model

import android.os.Parcelable
import com.jasonyoo.choco.network.model.Product
import kotlinx.android.parcel.Parcelize

@Parcelize
internal data class ProductResponse(
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
