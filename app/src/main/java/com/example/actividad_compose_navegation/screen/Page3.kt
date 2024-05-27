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
            Filas(img = R.drawable.cosecha, descript = "imagen3")
            Text(text = "Tiempo de Crecimiento",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp, 10.dp),
                textAlign = TextAlign.Center,
                fontSize = 21.sp,
                color = colorDorado)
            Text(text = "El tiempo de crecimiento de las plantas varía según la especie y las" +
                    " condiciones ambientales. Desde la germinación de la semilla hasta la maduración" +
                    " de la planta, cada etapa del crecimiento es crucial para el desarrollo saludable" +
                    " de la planta. Factores como la luz solar, la temperatura y el agua afectan el " +
                    "tiempo y la calidad del crecimiento de las plantas.",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp),
                textAlign = TextAlign.Justify)
            Column(modifier = Modifier
                .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally) {
                val colorDorado = colorResource(id = R.color.dorado)


                Button(onClick = { navegationHostController.navigate("view_2") },
                    colors = ButtonDefaults.buttonColors(colorDorado)) {
                    Text(text = "ENVIAR")
                }
                Puntos(pagerState)
            }

        }

    }
}