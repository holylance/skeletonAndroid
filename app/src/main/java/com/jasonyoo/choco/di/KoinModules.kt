package com.jasonyoo.choco.di

import com.google.gson.GsonBuilder
import com.jasonyoo.network.LoginApiFactory
import com.jasonyoo.choco.screen.login.LoginViewModel
import com.jasonyoo.choco.screen.main.MainViewModel
import com.jasonyoo.choco.util.TokenManager
import org.koin.android.ext.android.getKoin
import org.koin.android.ext.koin.androidApplication
import org.koin.androidx.experimental.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    factory { androidApplication().getKoin() }
    factory { GsonBuilder().create() }

    single { LoginApiFactory.create() }
    single { TokenManager }

    viewModel<LoginViewModel>()
    viewModel<MainViewModel>()
}
