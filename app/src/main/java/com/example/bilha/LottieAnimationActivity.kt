package com.example.bilha

import android.content.Intent
import android.location.Location
import android.os.Bundle
import android.provider.Settings
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.bilha.ui.theme.BilhaTheme

class LottieAnimationActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            myLottie()

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun myLottie(){
    Column(modifier = Modifier.fillMaxSize()) {
        val mContext= LocalContext.current

        //TopAppBar
        TopAppBar(title = {Text(text = "About Us", fontWeight = FontWeight.Bold, fontFamily = FontFamily.SansSerif )},
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
        val composition by rememberLottieComposition(spec = LottieCompositionSpec.RawRes(R.raw.animation))
        val progress by animateLottieCompositionAsState(composition)

        LottieAnimation(composition, progress,
        modifier = Modifier.size(500.dp))

        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = {
            mContext.startActivity(Intent(mContext, LocationActivity::class.java))

        },
        modifier = Modifier.padding(120.dp),
        colors = ButtonDefaults.buttonColors(Color.Cyan),
        shape = CutCornerShape(5.dp)) {
            Text(text = "see location",
            color = Color.Black)

        }
        
    }


}

@Preview(showBackground = true)
@Composable
fun myLottiePreview(){
    myLottie()
}