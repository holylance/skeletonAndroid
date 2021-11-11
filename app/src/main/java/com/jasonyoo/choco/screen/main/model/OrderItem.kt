package com.jasonyoo.choco.screen.main.model

import com.jasonyoo.choco.util.listadapter.ListItemModel
import com.jasonyoo.choco.util.listadapter.ListItemTypeFactory

data class OrderItem(
    val id: Int,
    val name: String,
    val description: String,
    val price: String,
    val icon: String
) : ListItemModel {
    override fun type(typeFactory: ListItemTypeFactory) = typeFactory.type(this)
}
