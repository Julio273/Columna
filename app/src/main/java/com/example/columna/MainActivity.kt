package com.example.columna

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*

import androidx.compose.ui.layout.ContentScale
//import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.columna.ui.theme.MyComposeApplicationTheme
import androidx.compose.foundation.background

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.Image

import androidx.compose.ui.res.painterResource


import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow




class MainActivity : ComponentActivity() {

override fun onCreate(savedInstanceState: Bundle?) {
super.onCreate(savedInstanceState)
setContent {
app()

}
}
}

@Composable
fun app(){
LazyColumn(
modifier=Modifier
.fillMaxSize()
.background(Color.Red)

){ // inicio lazycolumn
item{ // inicio item
Image(
painter= painterResource(id=R.drawable.logo),
contentDescription="logo",
modifier=Modifier.height(400.dp),
contentScale = ContentScale.Crop

)

Image(
painter= painterResource(id=R.drawable.logo),
contentDescription="logo",
modifier=Modifier.height(400.dp),
contentScale = ContentScale.Crop

)

Image(
painter= painterResource(id=R.drawable.logo),

contentDescription="logo",
modifier=Modifier.height(400.dp),
contentScale = ContentScale.Crop

)


LazyRow ()
{
item{

Text(
text="text1",
modifier=Modifier.padding(16.dp),
color=Color.White
)
Text(
text="text2",
modifier=Modifier.padding(16.dp),
color=Color.White
)
Text(
text="text3",
modifier=Modifier.padding(16.dp),
color=Color.White
)
Text(
text="text4",
modifier=Modifier.padding(16.dp),
color=Color.White
)
Text(
text="text5",
modifier=Modifier.padding(16.dp),
color=Color.White
)
Text(
text="text6",
modifier=Modifier.padding(16.dp),
color=Color.White
)
Text(
text="text7",
modifier=Modifier.padding(16.dp),
color=Color.White
)
Text(
text="text8",
modifier=Modifier.padding(16.dp),
color=Color.White
)
Text(
text="text9",
modifier=Modifier.padding(16.dp)
)

Text(
text="text10",
modifier=Modifier.padding(16.dp)

)
Text (
text="text11",
modifier=Modifier.padding(16.dp)

)

Text(
text="text12",
modifier=Modifier.padding(16.dp)
)

Text(
    text="t14",
    modifier=Modifier.padding(16.dp)
)









}//fin item LazyR
}//fin LazyRow

} //fin item
}//fin lazycomlum
}//fin fun
