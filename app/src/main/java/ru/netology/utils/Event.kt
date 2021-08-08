package ru.netology.utils

import android.net.wifi.aware.PublishConfig

data class Event(
        val id: Long,
        val author: String,
        val content: String,
        val published: String,
        var liked: Boolean = false,
        var likes: Int,
        var toSend: Boolean = false,
        var toSends: Int,
        var viewing: Boolean = false,
        var viewings: Int

)