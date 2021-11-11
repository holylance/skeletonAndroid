package com.jasonyoo.choco.di

import com.google.gson.GsonBuilder
import com.jasonyoo.choco.screen.main.MainViewModel
import org.koin.android.ext.android.getKoin
import org.koin.android.ext.koin.androidApplication
import org.koin.androidx.experimental.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    factory { androidApplication().getKoin() }
    factory { GsonBuilder().create() }

    viewModel<MainViewModel>()
}
