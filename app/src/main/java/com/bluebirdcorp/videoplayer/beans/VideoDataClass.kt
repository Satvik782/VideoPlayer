package com.bluebirdcorp.videoplayer.beans

import android.net.Uri

data class VideoDataClass(
    val uri: Uri,
    val name: String,
    val duration: Int,
    val size: Int
)
