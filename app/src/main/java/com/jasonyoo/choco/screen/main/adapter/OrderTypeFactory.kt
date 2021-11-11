package com.jasonyoo.choco.screen.main.adapter

import android.view.ViewGroup
import com.jasonyoo.choco.R
import com.jasonyoo.choco.databinding.OrderItemBinding
import com.jasonyoo.choco.screen.main.model.OrderItem
import com.jasonyoo.choco.screen.main.viewholder.OrderItemViewHolder
import com.jasonyoo.choco.util.listadapter.BindingViewHolder
import com.jasonyoo.choco.util.listadapter.ListItemModel
import com.jasonyoo.choco.util.listadapter.ListItemTypeFactory

class OrderTypeFactory : ListItemTypeFactory {

    override fun type(item: ListItemModel): Int {
        return when (item) {
            is OrderItem -> R.layout.order_item
            else -> error("Invalid type")
        }
    }

    override fun createViewHolder(parent: ViewGroup, type: Int): BindingViewHolder<*, *> {
        return when (type) {
            R.layout.order_item -> OrderItemViewHolder(
                createBinding(OrderItemBinding::inflate, parent)
            )
            else -> error("Invalid layout")
        }
    }
}
