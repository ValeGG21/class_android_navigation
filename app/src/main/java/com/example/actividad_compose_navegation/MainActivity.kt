package com.example.actividad_compose_navegation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.actividad_compose_navegation.ControllerNavegation.NavComponent
import com.example.actividad_compose_navegation.ui.theme.Actividad_Compose_NavegationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Actividad_Compose_NavegationTheme {
                NavComponent()
            }
        }
    }
}