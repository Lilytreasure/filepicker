package com.atwa.filepicker.request

import android.content.Intent
import android.net.Uri

interface PickerRequest {
    val intent : Intent
    suspend fun invokeCallback(uri: Uri)
}