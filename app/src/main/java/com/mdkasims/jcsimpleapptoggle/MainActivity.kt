package com.mdkasims.jcsimpleapptoggle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.mdkasims.jcsimpleapptoggle.ui.theme.JCSimpleAppToggleTheme
import com.mdkasims.jcsimpleapptoggle.views.AuthScreen
import com.mdkasims.jcsimpleapptoggle.views.CarList
import com.mdkasims.jcsimpleapptoggle.views.Greeting

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JCSimpleAppToggleTheme {
                val navController = rememberNavController()
                    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                        NavHost(
                            navController = navController,
                            startDestination = "greeting",
                            modifier = Modifier.padding(innerPadding)
                        ) {
                            composable("greeting") {
                                Greeting(name = "MdKasim", navController = navController)
                            }
                            composable("carlist") {
                                CarList()
                            }
                        }
                }
            }
        }
    }
}
