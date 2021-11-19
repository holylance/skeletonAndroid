package com.jasonyoo.choco.util

import com.jasonyoo.network.model.LoginToken
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.subjects.BehaviorSubject

object TokenManager {

    private val tokenSubject = BehaviorSubject.create<LoginToken>()

    fun getCurrentToken(): Observable<LoginToken> {
        return tokenSubject.hide()
    }

    fun setToken(token: LoginToken) {
        tokenSubject.onNext(token)
    }
}
