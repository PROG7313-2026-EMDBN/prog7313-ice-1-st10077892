package com.example.developertoolkitapp.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.developertoolkitapp.navigation.Routes

@Composable
fun HomeScreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        

        Button(onClick = {
            navController.navigate(Routes.DEVICE_INFO)
        }) {
            Text("Device Info")
        }

        Button(onClick = {
            navController.navigate(Routes.NOTES)
        }) {
            Text("Developer Notes")
        }

        Button(onClick = {
            navController.navigate(Routes.LINKS)
        }) {
            Text("Developer Links")
        }
    }
}