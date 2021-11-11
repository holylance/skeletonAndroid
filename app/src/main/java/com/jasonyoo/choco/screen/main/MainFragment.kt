package com.jasonyoo.choco.screen.main

import android.os.Bundle
import android.view.View
import androidx.core.os.bundleOf
import com.jasonyoo.choco.R
import com.jasonyoo.choco.databinding.FragmentMainBinding
import com.jasonyoo.choco.screen.base.BaseFragment
import com.jasonyoo.choco.screen.main.adapter.OrderTypeFactory
import com.jasonyoo.choco.screen.main.model.OrderItem
import com.jasonyoo.choco.util.ViewState
import com.jasonyoo.choco.util.listadapter.ListItemAction
import com.jasonyoo.choco.util.listadapter.ListItemAdapter
import com.jasonyoo.choco.util.observe
import com.jasonyoo.choco.util.viewBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainFragment : BaseFragment(R.layout.fragment_main) {

    private val binding by viewBinding(FragmentMainBinding::bind)
    private val adapter = ListItemAdapter<OrderItem, ListItemAction>(
        typeFactory = OrderTypeFactory(),
        primaryAction = ::onItemClick
    )
    override val viewModel by viewModel<MainViewModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.listOrder.adapter = adapter
    }

    override fun onDestroyView() {
        binding.listOrder.adapter = null
        super.onDestroyView()
    }

    override fun observeViewState() {
        observe(viewModel.viewState) { state ->
            when (state) {
                is ViewState.Success -> adapter.setItems(state.value)
                else -> adapter.setItems(emptyList())
            }
        }
    }

    private fun onItemClick(data: OrderItem) {
        navigateToDetails(data.id)
    }

    private fun navigateToDetails(id: Int) {
        safeNavigate(
            R.id.to_fragment_order_details,
            bundleOf( ORDER_ID to id )
        )
    }

    companion object {
        const val ORDER_ID = "order_id"
    }
}
