package com.jasonyoo.choco

import android.app.Application
import com.jasonyoo.choco.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import org.koin.core.module.Module

class ChocoApp : Application() {

    override fun onCreate() {
        super.onCreate()

        initKoin()
    }

    private fun initKoin() {
        startKoin {
            androidContext(this@ChocoApp)
            modules(koinModules())
        }
    }

    private fun koinModules(): List<Module> {
        return listOf(appModule)
    }
}
