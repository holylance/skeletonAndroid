package com.jasonyoo.choco.network.internal.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
internal data class LoginRequest(
    val email: String,
    val password: String
) : Parcelable
