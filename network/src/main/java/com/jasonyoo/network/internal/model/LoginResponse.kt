package com.jasonyoo.network.internal.model

import android.os.Parcelable
import com.jasonyoo.network.model.LoginToken
import kotlinx.android.parcel.Parcelize

@Parcelize
data class LoginResponse(
    val token: String
) : Parcelable {
    fun toLoginToken() = LoginToken(token)
}
