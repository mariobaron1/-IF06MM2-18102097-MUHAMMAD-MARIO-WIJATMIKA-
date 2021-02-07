package com.MuhammadMarioWijatmika_18102097.praktikum144.model

import com.google.gson.annotations.SerializedName

data class Message(
    @SerializedName("message")
    var message: String? = null
)
