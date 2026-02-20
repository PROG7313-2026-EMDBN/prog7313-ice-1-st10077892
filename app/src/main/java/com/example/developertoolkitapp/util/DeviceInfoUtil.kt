package com.example.developertoolkitapp.util

import android.os.Build
import com.example.developertoolkitapp.model.DeviceInfo

object DeviceInfoUtil {
    fun getDeviceInfo(): DeviceInfo {
        return DeviceInfo(
            androidVersion = Build.VERSION.RELEASE ?: "Unknown",
            sdkLevel = Build.VERSION.SDK_INT,
            deviceModel = Build.MODEL ?: "Unknown"
        )
    }
}