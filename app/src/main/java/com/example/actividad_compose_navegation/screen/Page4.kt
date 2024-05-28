package com.example.actividad_compose_navegation.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.actividad_compose_navegation.R


@Composable
fun Section_4(navegationHostController: NavHostController) {
    val items = listOf("Tractor", "Semillas", "Fertilizante", "Invernadero", "Riego", "Cosechadora", "Arado", "Compost", "Herbicida",
        "Pesticida", "Cultivo hidropónico", "Dron agrícola")


    val imgs = listOf(R.drawable.page4, R.drawable.page4_2, R.drawable.page43, R.drawable.page44,
        R.drawable.page45, R.drawable.page46, R.drawable.page47, R.drawable.page48,R.drawable.page49,R.drawable.page410,R.drawable.page411
    )
    val mix = listOf(
        "Agricultor", R.drawable.agricultor,
        "Ganado", R.drawable.ganado,
        "Sostenibilidad", R.drawable.sostenible,
        "Campos Tecnológicos", R.drawable.campo,
        "Herramientas", R.drawable.herramientas,
        "Cosechas", R.drawable.verduras
    )


    LazyColumn(modifier = Modifier.fillMaxSize()) {
        item {
            LazyRow(modifier = Modifier.fillMaxWidth()) {
                items(items) { item ->
                    Text(text = item, modifier = Modifier.padding(16.dp))
                }
            }
        }

        item {
            LazyRow(modifier = Modifier.fillMaxWidth()) {
                items(imgs) { imagenes ->
                    Image(
                        painter = painterResource(id = imagenes),
                        contentDescription = "",
                        modifier = Modifier.padding(16.dp)
                    )
                }
            }
        }

        items(mix) { item ->
            when (item) {
                is String -> {
                    Text(text = item, modifier = Modifier.padding(16.dp))
                }
                is Int -> {
                    Image(
                        painter = painterResource(id = item),
                        contentDescription = "",
                        modifier = Modifier.padding(16.dp,15.dp)
                    )
                }
            }
        }

        item {
            val colorDorado = colorResource(id = R.color.dorado)
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                contentAlignment = Alignment.Center
            ) {
                Button(
                    onClick = {
                        navegationHostController.navigate("view_1")
                    },
                    modifier = Modifier.fillMaxWidth().padding(100.dp, 0.dp),
                    colors = ButtonDefaults.buttonColors(colorDorado)
                ) {
                    Text(text = "R E G R E S A R")
                }
            }
        }
    }
}
