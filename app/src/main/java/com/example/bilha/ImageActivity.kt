package com.example.bilha

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bilha.ui.theme.BilhaTheme

class ImageActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            myimage()
        }
    }
}

@Composable
fun myimage() {
    Column(modifier = Modifier.fillMaxSize().padding(10.dp)) {
        Text(
            text = "BREEDS OF DOGS",
            fontSize = 30.sp,
            color = Color.Black,
            fontFamily = FontFamily.SansSerif,
            modifier = Modifier.padding(start = 50.dp),
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(20.dp))
        //Fist row
        Row {
            Image(
                painter = painterResource(id = R.drawable.img),
                contentDescription = "bulldog",
                modifier = Modifier.size(width = 200.dp, height = 150.dp)
            )


            Column {
                Text(
                    text = "BULLDOG",
                    fontSize = 20.sp,
                )
                Text(text = "The dog is a domestic animal",
                fontSize = 20.sp)

            }

        }
        Spacer(modifier = Modifier.height(20.dp))
        //Second row
        Row {
            Image(
                painter = painterResource(id = R.drawable.img_1),
                contentDescription = "bulldog",
                modifier = Modifier.size(width = 200.dp, height = 150.dp)
            )

            Column {
                Text(
                    text = "GERMAN SHEPHERED",
                    fontSize = 20.sp,
                )
                Text(text = "The dog is a domestic animal",
                fontSize = 20.sp)
            }

        }
        Spacer(modifier = Modifier.height(20.dp))
        //Third row
        Row {
            Image(
                painter = painterResource(id = R.drawable.img_3),
                contentDescription = "bulldog",
                modifier = Modifier.size(width = 200.dp, height = 150.dp)
            )


            Column {
                Text(
                    text = "SIBERIAN HUSKY ",
                    fontSize = 20.sp,
                )
                Text(text = "The dog is a domestic animal",
                fontSize = 20.sp)

            }
        }
        Spacer(modifier = Modifier.height(20.dp))
        //Circular image
        Image(painter = painterResource(id = R.drawable.img), contentDescription ="image",
        modifier = Modifier
            .size(128.dp)
            .clip(shape = CircleShape),
        contentScale = ContentScale.Crop)

    }
}


@Preview(showBackground = true)
@Composable
fun myimagePreview(){
    myimage()

}
