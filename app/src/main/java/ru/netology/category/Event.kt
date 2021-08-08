package ru.netology.category

import android.net.wifi.aware.PublishConfig
import ru.netology.attach.Attachment

data class Event(
        val id: Long,
        val authorId: Long,
        val author: String,
        val authorAvatar: String,
        val content: String,
        val published: Long,
        val type: String,
        val link: String,
        val speakerIds: String,
        val attachment: Attachment?= null

)

