package com.example.bilha

import android.content.Intent
import android.graphics.drawable.Icon
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bilha.ui.theme.BilhaTheme

class ScrollActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            cardDemo()

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun cardDemo() {
    val mContext= LocalContext.current
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        //TopAppBar
        TopAppBar(title = {Text(text = "Imagepage", fontWeight = FontWeight.Bold, fontFamily = FontFamily.SansSerif )},
            colors= TopAppBarDefaults.largeTopAppBarColors(Color.Cyan),
            navigationIcon = {
                IconButton(onClick = {
                    mContext.startActivity(
                        Intent(
                            mContext,
                            ImageActivity::class.java
                        )
                    )
                }) {
                    androidx.compose.material3.Icon(
                        imageVector = Icons.Filled.ArrowBack,
                        contentDescription = "arrowback"
                    )

                }
                IconButton(onClick = {/*TODO*/ }) {
                    androidx.compose.material3.Icon(
                        imageVector = Icons.Filled.Share,
                        contentDescription = "share"
                    )


                }
                IconButton(onClick = {/*TODO*/ }) {
                    androidx.compose.material3.Icon(
                        imageVector = Icons.Filled.Settings,
                        contentDescription = "settings"
                    )

                }


        })


        Text(
            text = "Dashboard",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.SansSerif
        )


        Text(text = "TYPES OF FRUITS",
        fontSize = 30.sp,
        color = Color.Black,
            fontWeight = FontWeight.Bold
        )
        //Row1
        Row(modifier = Modifier.horizontalScroll(rememberScrollState())) {
            //First card
            Card(modifier = Modifier.size(200.dp)) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.img_24),
                        contentDescription = "",
                        modifier = Modifier.size(100.dp)
                    )
                    Text(
                        text = "APPLES",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold
                    )

                }
            }
            Spacer(modifier = Modifier.width(10.dp))
            //Second card
            Card(modifier = Modifier.size(200.dp)) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.img_25),
                        contentDescription = "",
                        modifier = Modifier.size(100.dp)
                    )
                    Text(
                        text = "MANGO",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold
                    )

                }
            }
            Spacer(modifier = Modifier.width(10.dp))
            //Third card
            Card(modifier = Modifier.size(200.dp)) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.img_26),
                        contentDescription = "",
                        modifier = Modifier.size(100.dp)
                    )
                    Text(
                        text = "PINEAPPLES",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold

                    )

                }
            }
            Spacer(modifier = Modifier.width(10.dp))
            //fourth card
            Card(modifier = Modifier.size(200.dp)) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.img_27),
                        contentDescription = "",
                        modifier = Modifier.size(100.dp)
                    )
                    Text(
                        text = "BANANA",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold,

                    )


                }
            }

        }



        Spacer(modifier = Modifier.width(10.dp))

        Text(text = "BEEDS OF ANIMALS",
            fontSize = 30.sp,
            color = Color.Black,
            fontWeight = FontWeight.Bold
        )
        //Row2
        Row(modifier = Modifier.horizontalScroll(rememberScrollState())) {
            //First card
            Card(modifier = Modifier.size(200.dp)) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.img_9),
                        contentDescription = "",
                        modifier = Modifier.size(100.dp)
                    )
                    Text(
                        text = "SCOOBY",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold
                    )

                }
            }
            Spacer(modifier = Modifier.width(10.dp))
            //Second card
            Card(modifier = Modifier.size(200.dp)) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.img),
                        contentDescription = "",
                        modifier = Modifier.size(100.dp)
                    )
                    Text(
                        text = "CHIHUAHUA",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold
                    )

                }
            }
            Spacer(modifier = Modifier.width(10.dp))
            //Third card
            Card(modifier = Modifier.size(200.dp)) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.img_3),
                        contentDescription = "",
                        modifier = Modifier.size(100.dp)
                    )
                    Text(
                        text = "GERMAN SHEPHERD",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold

                    )

                }
            }
            Spacer(modifier = Modifier.width(10.dp))
            //fourth card
            Card(modifier = Modifier.size(200.dp)) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.img_3),
                        contentDescription = "",
                        modifier = Modifier.size(100.dp)
                    )
                    Text(
                        text = "SIBERIAN HUSKY",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold,

                        )


                }
            }

        }



        Spacer(modifier = Modifier.width(10.dp))

        Text(text = "TYPES OF DRESSES",
            fontSize = 30.sp,
            color = Color.Black,
            fontWeight = FontWeight.Bold
        )
        //Row3
        Row(modifier = Modifier.horizontalScroll(rememberScrollState())) {
            //First card
            Card(modifier = Modifier.size(200.dp)) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.img_10),
                        contentDescription = "",
                        modifier = Modifier.size(100.dp)
                    )
                    Text(
                        text = "COLLAR DRESSES",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold
                    )

                }
            }
            Spacer(modifier = Modifier.width(10.dp))
            //Second card
            Card(modifier = Modifier.size(200.dp)) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.img_11),
                        contentDescription = "",
                        modifier = Modifier.size(100.dp)
                    )
                    Text(
                        text = "QUARTER SLEEVES",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold
                    )

                }
            }
            Spacer(modifier = Modifier.width(10.dp))
            //Third card
            Card(modifier = Modifier.size(200.dp)) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.img_12),
                        contentDescription = "",
                        modifier = Modifier.size(100.dp)
                    )
                    Text(
                        text = "PLEATED SKIRTS",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold

                    )

                }
            }
            Spacer(modifier = Modifier.width(10.dp))
            //fourth card
            Card(modifier = Modifier.size(200.dp)) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.img_13),
                        contentDescription = "",
                        modifier = Modifier.size(100.dp)
                    )
                    Text(
                        text = "AFRICAN DRESS",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold,

                        )


                }
            }

        }

        Spacer(modifier = Modifier.width(10.dp))

        Text(text = "TYPES OF AFRICAN FOODS",
            fontSize = 30.sp,
            color = Color.Black,
            fontWeight = FontWeight.Bold
        )
        //Row4
        Row(modifier = Modifier.horizontalScroll(rememberScrollState())) {
            //First card
            Card(modifier = Modifier.size(200.dp)) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.img_14),
                        contentDescription = "",
                        modifier = Modifier.size(100.dp)
                    )
                    Text(
                        text = "MANDAZI",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold
                    )

                }
            }
            Spacer(modifier = Modifier.width(10.dp))
            //Second card
            Card(modifier = Modifier.size(200.dp)) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.img_15),
                        contentDescription = "",
                        modifier = Modifier.size(100.dp)
                    )
                    Text(
                        text = "UGALI",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold
                    )

                }
            }
            Spacer(modifier = Modifier.width(10.dp))
            //Third card
            Card(modifier = Modifier.size(200.dp)) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.img_18),
                        contentDescription = "",
                        modifier = Modifier.size(100.dp)
                    )
                    Text(
                        text = "JOLOF RICE",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold

                    )

                }
            }
            Spacer(modifier = Modifier.width(10.dp))
            //fourth card
            Card(modifier = Modifier.size(200.dp)) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.img_17),
                        contentDescription = "",
                        modifier = Modifier.size(100.dp)
                    )
                    Text(
                        text = "GITHERI",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold,

                        )


                }
            }

        }

        Spacer(modifier = Modifier.width(10.dp))

        Text(text = "TYPES OF LADIES SHOES",
            fontSize = 30.sp,
            color = Color.Black,
            fontWeight = FontWeight.Bold
        )
        //Row5
        Row(modifier = Modifier.horizontalScroll(rememberScrollState())) {
            //First card
            Card(modifier = Modifier.size(200.dp)) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.img_19),
                        contentDescription = "",
                        modifier = Modifier.size(100.dp)
                    )
                    Text(
                        text = "OFFICE WEAR",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold
                    )

                }
            }
            Spacer(modifier = Modifier.width(10.dp))
            //Second card
            Card(modifier = Modifier.size(200.dp)) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.img_20),
                        contentDescription = "",
                        modifier = Modifier.size(100.dp)
                    )
                    Text(
                        text = "HEELS",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold
                    )

                }
            }
            Spacer(modifier = Modifier.width(10.dp))
            //Third card
            Card(modifier = Modifier.size(200.dp)) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.img_21),
                        contentDescription = "",
                        modifier = Modifier.size(100.dp)
                    )
                    Text(
                        text = "SPORT SHOES",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold

                    )

                }
            }
            Spacer(modifier = Modifier.width(10.dp))
            //fourth card
            Card(modifier = Modifier.size(200.dp)) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.img_22),
                        contentDescription = "",
                        modifier = Modifier.size(100.dp)
                    )
                    Text(
                        text = "SANDALS",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold,

                        )


                }
            }


        Spacer(modifier = Modifier.width(10.dp))

        Text(text = "TYPES OF VEHICLES",
            fontSize = 30.sp,
            color = Color.Black,
            fontWeight = FontWeight.Bold)

        //Row6
        Row(modifier = Modifier.horizontalScroll(rememberScrollState())) {
            //First card
            Card(modifier = Modifier.size(200.dp)) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.img_5),
                        contentDescription = "",
                        modifier = Modifier.size(100.dp)
                    )
                    Text(
                        text = "PRADO",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold
                    )

                }
            }
            Spacer(modifier = Modifier.width(10.dp))
            //Second card
            Card(modifier = Modifier.size(200.dp)) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.img_6),
                        contentDescription = "",
                        modifier = Modifier.size(100.dp)
                    )
                    Text(
                        text = "MAZDA",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold
                    )

                }
            }
            Spacer(modifier = Modifier.width(10.dp))
            //Third card
            Card(modifier = Modifier.size(200.dp)) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.img_7),
                        contentDescription = "",
                        modifier = Modifier.size(100.dp)
                    )
                    Text(
                        text = "MITSUBISHI",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold

                    )

                }
            }
            Spacer(modifier = Modifier.width(10.dp))
            //fourth card
            Card(modifier = Modifier.size(200.dp)) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.img_8),
                        contentDescription = "",
                        modifier = Modifier.size(100.dp)
                    )
                    Text(
                        text = "TOYOTA",
                        fontSize = 20.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold,

                        )


                }
            }



        }
        Spacer(modifier = Modifier.width(5.dp))
        Button(onClick = {
            mContext.startActivity(Intent(mContext,ScrollActivity::class.java))
        },
            shape = CutCornerShape(5.dp),
            modifier = Modifier.padding(start = 150.dp)
        ) {

            Text(text = "Next", color = Color.White)

        }
            Spacer(modifier = Modifier.height(50.dp))
            //Intent
            Button(onClick = {
                mContext.startActivity(Intent(mContext,FormActivity::class.java))

            },
                shape = CutCornerShape(5.dp),
                colors = ButtonDefaults.buttonColors(Color.DarkGray),
                modifier = Modifier.padding(start = 150.dp)
            ) {
                Text(text = "Next", color = Color.White, fontSize = 20.sp)

            }





    }

}}


@Preview(showBackground = true)
@Composable
fun cardDemoPreview(){
    cardDemo()
}
