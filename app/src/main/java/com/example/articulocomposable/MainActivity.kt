package com.example.articulocomposable

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.articulocomposable.ui.theme.ArticuloComposableTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArticuloComposableTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TutorialCompose(
                        stringResource(R.string.texto1),
                        stringResource(R.string.texto2),
                        stringResource(R.string.texto3)
                    )
                }
            }
        }
    }
}

@Composable
fun TutorialCompose(texto1: String, texto2: String, texto3: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.fotokotlin1_7)

    Column(modifier = modifier.fillMaxSize()) {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.FillWidth


        )
        Text(
            text = texto1,
            fontSize = 24.sp,
            modifier = Modifier.padding(16.dp, 16.dp, 16.dp, 16.dp)
        )

        Text(
            text = texto2,
            modifier = Modifier
                .padding(start = 16.dp, end = 16.dp),
            textAlign = TextAlign.Justify
        )

        Text(
            text = texto3,
            modifier = Modifier
                .padding(16.dp, 16.dp, 16.dp, 16.dp),
            textAlign = TextAlign.Justify
        )


    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ArticuloComposableTheme {
        TutorialCompose(
            stringResource(R.string.texto1),
            stringResource(R.string.texto2),
            stringResource(R.string.texto3)
        )


    }
}