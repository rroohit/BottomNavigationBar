package com.r.bottomnavigation.feature.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.r.bottomnavigation.feature.NavGraphs
import com.r.bottomnavigation.feature.util.BottomBar
import com.r.bottomnavigation.ui.theme.BottomNavigationTheme
import com.ramcosta.composedestinations.DestinationsNavHost

@ExperimentalAnimationApi
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            BottomNavigationTheme {
                val navController = rememberNavController()

                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    bottomBar = {
                        BottomBar(navController = navController)
                    }
                ) {
                    DestinationsNavHost(
                        navGraph = NavGraphs.root,
                        navController = navController
                    )

                }

            }
        }
    }
}

