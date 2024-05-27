package com.example.actividad_compose_navegation.screen

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.app.NotificationCompat.getColor
import androidx.navigation.NavHostController
import com.example.actividad_compose_navegation.R



@OptIn(ExperimentalFoundationApi::class)
@Composable
fun Horizontal(navegationHostController: NavHostController){
    val pagerState = rememberPagerState(initialPage = 0) {
       3
    }
    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.SpaceAround) {
        Box(modifier = Modifier.fillMaxSize()){
            HorizontalPager(state = pagerState, modifier = Modifier.fillMaxSize()) {
                    page -> when(page) {
                0 -> Section_1(pagerState)
                1 -> Section_2(pagerState)
                2 -> Section_3(navegationHostController , pagerState)
            }
            }
        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun Section_1(pagerState : PagerState){
    Column(modifier = Modifier
        .fillMaxSize(),
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally) {

        Column(modifier = Modifier
            .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally) {
            val colorDorado = colorResource(id = R.color.dorado)
            Filas(img = R.drawable.tecnologiacampo, descript = "pagina1")
            Text(text = "Avances en la agricultura",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp, 10.dp),
                textAlign = TextAlign.Center,
                fontSize = 21.sp,
                color = colorDorado)
            Text(text = "La agricultura ha sido una actividad fundamental desde tiempos antiguos," +
                    " pero en las últimas décadas, el avance tecnológico ha acelerado su evolución." +
                    " La tecnología ha revolucionado los campos agrícolas, introduciendo innovaciones " +
                    "que transforman la manera en que se cultiva, cosecha y distribuye la comida..",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp),
                textAlign = TextAlign.Justify)
                Puntos(pagerState)

        }

    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun Puntos(pagerState: PagerState) {
    Row(modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center) {

        repeat(3){
            var color = if (pagerState.currentPage == it) Color.Black else colorResource(id = R.color.dorado)
            Box(modifier = Modifier
                .padding(2.dp)
                .clip(CircleShape)
                .background(color)
                .size(12.dp)){
            }
        }
    }
}

@Composable
fun Filas(
    img:Int,
    descript:String,
    modifier: Modifier = Modifier
        .fillMaxWidth(),
){
    Row{
        Image(painter = painterResource(id = img), contentDescription = descript, modifier = Modifier
            .width(350.dp)
            .height(350.dp)
            .padding(20.dp, 20.dp))
    }
}