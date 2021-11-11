package com.jasonyoo.choco.screen.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.jasonyoo.choco.screen.base.BaseViewModel
import com.jasonyoo.choco.screen.main.model.OrderItem
import com.jasonyoo.choco.util.ViewState
import com.jasonyoo.choco.util.asViewState

class MainViewModel : BaseViewModel() {

    private val _viewState = MutableLiveData<ViewState<List<OrderItem>>>()
    val viewState: LiveData<ViewState<List<OrderItem>>> = _viewState

    init {
        _viewState.postValue(createItems().asViewState())
    }

    private fun createItems(): List<OrderItem> {
        return listOf(
            OrderItem(
                id = 1,
                name = "name1",
                description = "description1",
                price = "10",
                icon = ""
            ),
            OrderItem(
                id = 2,
                name = "name2",
                description = "description2",
                price = "100",
                icon = ""
            )
        )
    }
}
