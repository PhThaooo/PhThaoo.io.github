package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.compose.foundation.layout.Arrangement
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.myapplication.ui.theme.MyApplicationTheme

import compose.icons.Octicons
import compose.icons.octicons.Package24
import compose.icons.octicons.HeartFill16


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Post()
                }
            }
        }
    }
}

@Composable
fun Post() {
    Column(
        Modifier
            .fillMaxWidth()
            .background(color = Color.White)
    ) {
        Row(
            modifier = Modifier
                .padding(horizontal = 8.dp, vertical = 4.dp)
        ) {
            Image(
                painterResource(id = R.drawable.avt) ,
                contentDescription ="avta" ,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(size = 40.dp)
                    .clip(CircleShape)
                    .border(1.dp, Color.Gray, CircleShape)
            )
            Column(
                modifier = Modifier
                    .padding(horizontal = 5.dp)


            ) {

                Text(text = "Emma")
                Row(
                    modifier = Modifier
                ) {
                    Text(
                        text = "1 giờ  ",
                        fontSize = 10.sp
                    )
                    IconButton(
                        onClick = { /*TODO*/ },
                        modifier = Modifier
                            .padding(vertical = 1.dp)
                            .size(size = 12.dp)
                    ) {
                        Icon(
                            imageVector = Octicons.Package24,
                            contentDescription = "Heart",
                            modifier = Modifier
                                .size(size = 30.dp),

                        )
                    }

                    }
                }
            }
        Text(text = "Happy New Year",
            modifier = Modifier
                .padding(horizontal = 8.dp)
            )
        Image(painterResource(id = R.drawable.post),
            contentDescription = null,
            modifier = Modifier
                .border(BorderStroke(2.dp, color = Color.Gray),
                    )
            )


        Row (
            modifier = Modifier ,
            ){

                Icon(Octicons.HeartFill16, contentDescription = null ,
                    modifier = Modifier
                        .padding(horizontal = 8.dp, vertical = 2.dp)

                    )

            Text( "21 likes",
                fontSize = 12.sp,
                fontWeight = FontWeight.ExtraBold,
                fontFamily = FontFamily.Monospace,
                modifier = Modifier
                    .padding(horizontal = 1.dp, vertical = 2.dp)
                    
            )
        }


    }

    }


    @Preview(showBackground = true)
    @Composable
    fun GreetingPreview() {
        MyApplicationTheme {
            Post()
        }
    }
