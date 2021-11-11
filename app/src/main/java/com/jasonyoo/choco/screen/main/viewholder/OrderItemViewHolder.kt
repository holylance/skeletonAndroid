package com.jasonyoo.choco.screen.main.viewholder

import androidx.core.net.toUri
import com.jasonyoo.choco.databinding.OrderItemBinding
import com.jasonyoo.choco.screen.main.model.OrderItem
import com.jasonyoo.choco.util.listadapter.BindingViewHolder
import com.jasonyoo.choco.util.listadapter.ListItemAction

class OrderItemViewHolder(
    private val binding: OrderItemBinding
) : BindingViewHolder<OrderItem, ListItemAction>(binding.root) {

    override fun bind(item: OrderItem, primaryAction: (OrderItem) -> Unit) {
        with(binding) {
            root.setOnClickListener { primaryAction.invoke(item) }

            name.text = item.name
            description.text = item.description
            price.text = item.price
            icon.setImageURI(item.icon.toUri())
        }
    }
}
