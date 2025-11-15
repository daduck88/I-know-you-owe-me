
package com.daduck.iknowyouowe.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.iknowyouoweme.presentation.feature.profile.ui.ProfileScreen

sealed class Screen(val route: String) {
    object Profile : Screen("profile")
}

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.Profile.route) {
        composable(Screen.Profile.route) {
            ProfileScreen()
        }
    }
}
