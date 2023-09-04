package com.example.bilha

import android.content.Intent
import android.os.Bundle
import android.provider.Settings
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.airbnb.lottie.compose.LottieAnimation
import com.example.bilha.ui.theme.BilhaTheme

class HomePageActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            items()

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun items(){
    val mContext= LocalContext.current
    Column(modifier = Modifier.fillMaxSize()) {
        //TopAppBar
        TopAppBar(title = {Text(text = "Homepage", fontWeight = FontWeight.Bold, fontFamily = FontFamily.SansSerif )},
            colors= TopAppBarDefaults.largeTopAppBarColors(Color.Cyan),
            navigationIcon = {
                IconButton(onClick = {
                    mContext.startActivity(
                        Intent(
                            mContext, SplashScreenActivity::class.java
                        )
                    )
                }) {
                    Icon(
                        imageVector = Icons.Filled.ArrowBack,
                        contentDescription = "arrowback"
                    )

                }

            },
            actions = {

                IconButton(onClick = {val shareIntent= Intent(Intent.ACTION_SEND)
                    shareIntent.type="text/plain"
                    shareIntent.putExtra(Intent.EXTRA_TEXT,"Check out this is our company")
                    mContext.startActivity(Intent.createChooser(shareIntent,"Share")) }) {
                    Icon(
                        imageVector = Icons.Filled.Share,
                        contentDescription = "share"
                    )


                }
                IconButton(onClick = { val settingsIntent= Intent(Settings.ACTION_SEARCH_SETTINGS)
                    mContext.startActivity(settingsIntent)}) {
                    Icon(
                        imageVector = Icons.Filled.Settings,
                        contentDescription = "settings"
                    )

                }


            })
        Spacer(modifier = Modifier.height(20.dp))
        //cards
        Card(modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp)
            .clickable { mContext.startActivity(Intent(mContext, FormActivity::class.java)) }){
            Row(modifier = Modifier.padding(20.dp)){
                Text(text = "Registration Page",
                fontSize = 20.sp,
                color = Color.Black,
                fontWeight = FontWeight.Bold)

            }
            
        }
        Spacer(modifier = Modifier.height(20.dp))
        Card(modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp)
            .clickable { mContext.startActivity(Intent(mContext, PracticalActivity::class.java)) }) {
            Row(modifier = Modifier.padding(20.dp)){
                Text(text = "View Products",
                    fontSize = 20.sp,
                    color = Color.Black,
                    fontWeight = FontWeight.Bold)

            }

        }
        Spacer(modifier = Modifier.height(20.dp))

        Card(modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp)
            .clickable {
                mContext.startActivity(Intent(mContext, ImageActivity::class.java))
            }) {
            Row(modifier = Modifier.padding(20.dp)){
                Text(text = "Image Page",
                    fontSize = 20.sp,
                    color = Color.Black,
                    fontWeight = FontWeight.Bold)

            }

        }
        Spacer(modifier = Modifier.height(20.dp))
        Card(modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp)
            .clickable { mContext.startActivity(Intent(mContext, IntentActivity::class.java)) }){
            Row(modifier = Modifier.padding(20.dp)){
                Text(text = "Click to go to",
                    fontSize = 20.sp,
                    color = Color.Black,
                    fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.height(20.dp))
                Text(text = "  Intents", fontSize = 20.sp, fontWeight = FontWeight.Bold, color = Color.Blue)

            }

        }
        Spacer(modifier = Modifier.height(20.dp))
        Card(modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp)
            .clickable {
                mContext.startActivity(Intent(mContext, LottieAnimationActivity::class.java))
            }) {
            Row(modifier = Modifier.padding(20.dp)){
                Text(text = "Lottie Animation",
                    fontSize = 20.sp,
                    color = Color.Black,
                    fontWeight = FontWeight.Bold)

            }

        }
        Spacer(modifier = Modifier.height(20.dp))
        Card(modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp)
            .clickable {
                mContext.startActivity(Intent(mContext, ScrollActivity::class.java))
            }) {
            Row(modifier = Modifier.padding(20.dp)){
                Text(text = "Scroll Page",
                    fontSize = 20.sp,
                    color = Color.Black,
                    fontWeight = FontWeight.Bold)

            }

        }



    }

}

@Preview(showBackground = true)
@Composable
fun itemsPreview(){
    items()

}