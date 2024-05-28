package com.example.actividad_compose_navegation.screen

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.PagerState
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.actividad_compose_navegation.R


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun Section_3(navegationHostController: NavHostController, pagerState: PagerState){
    Column(modifier = Modifier
        .fillMaxSize(),
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Column(modifier = Modifier
            .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally) {
            val colorDorado = colorResource(id = R.color.dorado)
            Filas(img = R.drawable.page3, descript = "imagen3")
            Text(text = "Si deseas conocer más sobre el agro dale \"INGRESAR\" ",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp),
                textAlign = TextAlign.Center)
            Column(modifier = Modifier
                .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally) {
                val colorDorado = colorResource(id = R.color.black)


                Button(onClick = { navegationHostController.navigate("view_2") },
                    colors = ButtonDefaults.buttonColors(colorDorado)) {
                    Text(text = "I N G R E S A R")
                }
                Puntos(pagerState)
            }

        }

    }
}