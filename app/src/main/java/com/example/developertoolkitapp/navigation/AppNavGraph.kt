package com.example.developertoolkitapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

import com.example.developertoolkitapp.ui.screens.HomeScreen
import com.example.developertoolkitapp.ui.screens.DeviceInfo
import com.example.developertoolkitapp.ui.screens.NotesScreen
import com.example.developertoolkitapp.ui.screens.LinksScreen

@Composable
fun AppNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Routes.hgfghftrdrtdtfcvyyuhgui
    ) {

        composable(Routes.HOME) {
            HomeScreen(navController)
        }

        composable(Routes.DEVICE_INFO) {
            DeviceInfo()
        }

        composable(Routes.NOTES) {
            NotesScreen()
        }

        composable(Routes.LINKS) {
            LinksScreen()
        }
    }
}