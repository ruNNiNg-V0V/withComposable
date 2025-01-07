package com.example.withcomposable

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.withcomposable.ui.theme.WithComposableTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            WithComposableTheme {
                // 리니어 레이아웃
                Column(modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center)
                {
                    theText("Lake Louise")
                    theImage("lake_1")
                    theText("Lake Louise, AB, 캐나다")
                }
            }
        }
    }
}

@Composable
fun theText(s: String) {
    Text(
        text = "$s"
    )
}

@Composable
fun theImage(src : String){
    val context = LocalContext.current
    val resourceId = context.resources.getIdentifier(src, "drawable", context.packageName)
    Image(
        painter = painterResource(id = resourceId),
        contentDescription = src
    )
}

// 미리보기
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    WithComposableTheme {
        WithComposableTheme {
            // 리니어 레이아웃
            Column(modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center)
            {
                theText("Lake Louise")
                theImage("lake_1")
                theText("Lake Louise, AB, 캐나다")
            }
        }
    }
}