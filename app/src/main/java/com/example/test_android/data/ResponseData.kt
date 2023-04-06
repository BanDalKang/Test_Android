package com.example.test_android.data

import com.google.gson.annotations.SerializedName

data class ResponseData(
    @SerializedName("result")
    val result: String?,
    @SerializedName("status")
    val status: String?
)
