package com.jasonyoo.choco.network.internal.model

import android.os.Parcelable
import com.jasonyoo.choco.network.model.LoginToken
import kotlinx.android.parcel.Parcelize

@Parcelize
internal data class LoginResponse(
    val token: String
) : Parcelable {
    fun toLoginToken() = LoginToken(token)
}
