package com.example.bilha

import android.content.Intent
import android.os.Bundle
import android.provider.MediaStore
import android.provider.Settings
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
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
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import com.example.bilha.ui.theme.BilhaTheme

class IntentActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            myIntent()

        }
    }


}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun myIntent(){
    val mContext= LocalContext.current
   Column(modifier = Modifier
       .fillMaxSize()
       .paint(
           painterResource(id = R.drawable.img_28),
           contentScale = ContentScale.FillBounds
       )
   ) {
       //TopAppBar
       TopAppBar(title = {Text(text = "IntentActivity", fontWeight = FontWeight.Bold, fontFamily = FontFamily.SansSerif )},
           colors= TopAppBarDefaults.largeTopAppBarColors(Color.Cyan),
           navigationIcon = {
               IconButton(onClick = {
                   mContext.startActivity(Intent(mContext, ScrollActivity::class.java
                       )
                   )
               }) {
                   androidx.compose.material3.Icon(
                       imageVector = Icons.Filled.ArrowBack,
                       contentDescription = "arrowback"
                   )

               }

           },
           actions = {

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

       //Intent
       Spacer(modifier = Modifier.width(10.dp))

       //STK
       OutlinedButton(onClick = {
                                val simToolkitLaunchIntent=
                                    mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                                simToolkitLaunchIntent?.let { mContext.startActivity(it) }

       },
           modifier = Modifier
               .size(width = 300.dp, height = 70.dp)
               .padding(start = 20.dp, end = 20.dp, top = 20.dp),
           shape = CutCornerShape(5.dp),
           border = BorderStroke(3.dp, Color.Black)
       ){
           Text(text = "PAY VIA MPESA", color = Color.Black, fontSize = 20.sp)
       }
       Spacer(modifier = Modifier.width(10.dp))

       //EMAIL
       OutlinedButton(onClick = {
                   val shareIntent=Intent(Intent.ACTION_SEND)
                    shareIntent.type="text/plain"
                     shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("bilhaaketch13@gmail.com"))
                     shareIntent.putExtra(Intent.EXTRA_SUBJECT,"subject")
                     shareIntent.putExtra(Intent.EXTRA_TEXT,"Hello this is the email")
                     mContext.startActivity(shareIntent)
       },
           modifier = Modifier
               .size(width = 300.dp, height = 70.dp)
               .padding(start = 20.dp, end = 20.dp, top = 20.dp),
           shape = CutCornerShape(5.dp),
           border = BorderStroke(3.dp, Color.Black)
       ){
           Text(text = "EMAIL", color = Color.Black, fontSize = 20.sp)
       }
       Spacer(modifier = Modifier.width(10.dp))

       //SHARE
       OutlinedButton(onClick = {
           val shareIntent=Intent(Intent.ACTION_SEND)
           shareIntent.type="text/plain"
           shareIntent.putExtra(Intent.EXTRA_TEXT,"Check out this is our company")
           mContext.startActivity(Intent.createChooser(shareIntent,"Share"))
       },
           modifier = Modifier
               .size(width = 300.dp, height = 70.dp)
               .padding(start = 20.dp, end = 20.dp, top = 20.dp),
           shape = CutCornerShape(5.dp),
           border = BorderStroke(3.dp, Color.Black)
       ){
           Text(text = "SHARE", color = Color.Black, fontSize = 20.sp)
       }
       Spacer(modifier = Modifier.width(10.dp))

       //CALL
       OutlinedButton(onClick = {
           val callIntent=Intent(Intent.ACTION_DIAL)
           callIntent.data="tel:0728751409".toUri()
           mContext.startActivity(callIntent)
                                },
           modifier = Modifier
               .size(width = 300.dp, height = 70.dp)
               .padding(start = 20.dp, end = 20.dp, top = 20.dp),
           shape = CutCornerShape(5.dp),
           border = BorderStroke(3.dp, Color.Black)
       ){
           Text(text = "CALL", color = Color.Black, fontSize = 20.sp)
       }
       Spacer(modifier = Modifier.width(10.dp))

       //SMS
       OutlinedButton(onClick = {
           val smsIntent=Intent(Intent.ACTION_SENDTO)
           smsIntent.data="smsto:0710399448".toUri()
           smsIntent.putExtra("sms_body","Hello mum,how has yor day been?")
           mContext.startActivity(smsIntent)
       },
           modifier = Modifier
               .size(width = 300.dp, height = 70.dp)
               .padding(start = 20.dp, end = 20.dp, top = 20.dp),
           shape = CutCornerShape(5.dp),
           border = BorderStroke(3.dp, Color.Black)
       ){
           Text(text = "SMS", color = Color.Black, fontSize = 20.sp)
       }
       Spacer(modifier = Modifier.width(10.dp))

       //CAMERA
       OutlinedButton(onClick = {
           val cameraIntent=Intent(MediaStore.ACTION_IMAGE_CAPTURE)
           if (cameraIntent.resolveActivity(mContext.packageManager)!=null){
               mContext.startActivity(cameraIntent)
           }else{
               println("Camera app is not available")
           }
       },
           modifier = Modifier
               .size(width = 300.dp, height = 70.dp)
               .padding(start = 20.dp, end = 20.dp, top = 20.dp),
           shape = CutCornerShape(5.dp),
           border = BorderStroke(3.dp, Color.Black)
       ){
           Text(text = "CAMERA", color = Color.Black, fontSize = 20.sp)
       }
       Spacer(modifier = Modifier.width(10.dp))

       //SETTINGS
       OutlinedButton(onClick = {
                     val settingsIntent=Intent(Settings.ACTION_SEARCH_SETTINGS)
                      mContext.startActivity(settingsIntent)
       },
           modifier = Modifier
               .size(width = 300.dp, height = 70.dp)
               .padding(start = 20.dp, end = 20.dp, top = 20.dp),
           shape = CutCornerShape(5.dp),
           border = BorderStroke(3.dp, Color.Black)
       ){
           Text(text = "SETTINGS", color = Color.Black, fontSize = 20.sp)
       }


   }

}


@Preview(showBackground = true)
@Composable
fun myIntentPreview(){
    myIntent()

}
