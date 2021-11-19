package com.jasonyoo.choco.screen.login

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.jasonyoo.network.LoginService
import com.jasonyoo.network.model.LoginToken
import com.jasonyoo.choco.screen.base.BaseViewModel
import com.jasonyoo.choco.util.TokenManager
import com.jasonyoo.choco.util.ViewState
import com.jasonyoo.choco.util.asViewState
import io.reactivex.rxjava3.schedulers.Schedulers

class LoginViewModel(
    private val apiService: LoginService,
    private val tokenManager: TokenManager
) : BaseViewModel() {

    private val _viewState = MutableLiveData<ViewState<LoginToken>>()
    val viewState: LiveData<ViewState<LoginToken>> = _viewState

    fun login(email: String, password: String) {
        apiService.login(email, password)
            .subscribeOn(Schedulers.io())
            .subscribe(::postState, ::postError)
            .let(::bind)
    }

    private fun postState(token: LoginToken) {
        tokenManager.setToken(token)
        _viewState.postValue(token.asViewState())
    }

    private fun postError(cause: Throwable) {
        _viewState.postValue(cause.asViewState())
    }
}
