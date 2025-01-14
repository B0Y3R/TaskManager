package com.example.taskmanager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.taskmanager.ui.theme.TaskManagerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TaskManagerTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center,

                    ) {
                        SuccessImage()
                        Text(text = "All tasks completed", fontSize = 24.sp, fontWeight = FontWeight.Bold)
                        Text(text = "Nice work!", fontSize = 16.sp)
                    }
                }
            }
        }
    }


}

@Composable
fun SuccessImage() {
    val image = painterResource(id = R.drawable.ic_task_completed)
    Image(painter = image, contentDescription = null, modifier = Modifier.fillMaxSize(.5f))
}




@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TaskManagerTheme {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            ) {
                SuccessImage()
                Text(text = "All tasks completed", fontSize = 24.sp, fontWeight = FontWeight.Bold)
                Text(text = "Nice work!", fontSize = 16.sp)
            }
        }
    }
}