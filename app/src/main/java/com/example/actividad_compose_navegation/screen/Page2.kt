package com.example.actividad_compose_navegation.screen

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.PagerState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.actividad_compose_navegation.R

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun Section_2(pagerState : PagerState){
    Column(modifier = Modifier
        .fillMaxSize(),
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Column(modifier = Modifier
            .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally) {
            val colorDorado = colorResource(id = R.color.dorado)
            Filas(img = R.drawable.page2, descript = "imagen2")
            Text(text = "¿Por qué es importante?",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp, 10.dp),
                textAlign = TextAlign.Center,
                fontSize = 21.sp,
                color = colorDorado)
            Text(text = "El agro es esencial para la seguridad alimentaria, el desarrollo económico, y" +
                    "la sostenibilidad ambiental. Proporciona alimentos, empleo en áreas rurales," +
                    "y promueve la innovación tecnológica. Además, ayuda a mitigar el cambio climático" +
                    "y mantiene las tradiciones culturales. En resumen, el agro es vital para " +
                    "la alimentación, la economía y el medio ambiente.",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp),
                textAlign = TextAlign.Justify)
            Puntos(pagerState)
        }
    }
}