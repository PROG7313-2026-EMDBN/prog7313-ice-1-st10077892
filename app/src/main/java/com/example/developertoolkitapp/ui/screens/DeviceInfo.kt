package com.example.developertoolkitapp.ui.screens

import android.os.Build
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.developertoolkitapp.model.DeviceInfo

@Composable
fun DeviceInfo() {

    // ✅ Create the model here
    val deviceInfo = DeviceInfo(
        androidVersion = Build.VERSION.RELEASE ?: "Unknown",
        sdkLevel = Build.VERSION.SDK_INT,
        deviceModel = Build.MODEL ?: "Unknown"
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text("Device Information", style = MaterialTheme.typography.headlineMedium)

        Spacer(Modifier.height(16.dp))

        Text("Android Version: ${deviceInfo.androidVersion}")
        Text("SDK Level: ${deviceInfo.sdkLevel}")
        Text("Device Model: ${deviceInfo.deviceModel}")
    }
}