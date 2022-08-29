package com.oliverspryn.android.accessibilitysample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.oliverspryn.android.accessibilitysample.ui.theme.AccessibilitySampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            AccessibilitySampleTheme {
                // CardWithDirections()
                CardWithImage()
            }
        }
    }
}

@Composable
fun CardWithDirections() {
    Card(
        modifier = Modifier.padding(16.dp)
    ) {
        Column(
            modifier = Modifier.padding(8.dp)
        ) {
            Text(
                text = "Google HQ to Apple HQ",
                style = MaterialTheme.typography.titleLarge
            )

            Text(
                text = "via CA-85 S",
                style = MaterialTheme.typography.titleSmall
            )

            Row(
                modifier = Modifier.padding(top = 16.dp)
            ) {
                Text(
                    text = "Start:",
                    style = MaterialTheme.typography.bodyMedium,

                    modifier = Modifier.width(70.dp)
                )

                Text(
                    text = "1600 Amphitheatre Pkwy, Mountain View, CA 94043",
                    style = MaterialTheme.typography.bodyMedium
                )
            }

            Row(
                modifier = Modifier.padding(top = 16.dp)
            ) {
                Text(
                    text = "End:",
                    style = MaterialTheme.typography.bodyMedium,

                    modifier = Modifier.width(70.dp)
                )

                Text(
                    text = "1 Apple Park Way, Cupertino, CA 95014",
                    style = MaterialTheme.typography.bodyMedium
                )
            }

            Row(
                modifier = Modifier.padding(top = 16.dp)
            ) {
                Text(
                    text = "Distance:",
                    style = MaterialTheme.typography.bodyMedium,

                    modifier = Modifier.width(70.dp)
                )

                Text(
                    text = "12.0 miles",
                    style = MaterialTheme.typography.bodyMedium
                )
            }

            Row(
                modifier = Modifier.padding(top = 4.dp)
            ) {
                Text(
                    text = "Time:",
                    style = MaterialTheme.typography.bodyMedium,

                    modifier = Modifier.width(70.dp)
                )

                Text(
                    text = "20 min",
                    style = MaterialTheme.typography.bodyMedium
                )
            }
        }
    }
}

@Composable
fun CardWithImage() {
    Card(
        modifier = Modifier.padding(16.dp)
    ) {
        Column(
            modifier = Modifier.padding(8.dp)
        ) {
            Text(
                text = "Example Title",
                style = MaterialTheme.typography.titleLarge
            )

            Row(
                modifier = Modifier.padding(top = 8.dp)
            ) {
                Image(
                    painter = painterResource(R.drawable.ic_launcher_foreground),
                    contentDescription = null,
                    modifier = Modifier
                        .background(color = Color.Black, shape = CircleShape)
                        .size(40.dp)
                )

                Text(
                    modifier = Modifier.padding(start = 8.dp),
                    text = "This is a longer paragraph used to describe something of value. It is decorated with an icon to the left, which you can see. It doesn't serve any value, it just looks nice.",
                    style = MaterialTheme.typography.bodyMedium
                )
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    AccessibilitySampleTheme {
        CardWithDirections()
    }
}