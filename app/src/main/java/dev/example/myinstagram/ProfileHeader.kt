// ProfileHeader.kt
package dev.example.myinstagram.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.BiasAlignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import dev.example.myinstagram.R

@Composable
fun ProfileHeader() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Image(
            painter = painterResource(id = R.drawable.one),
            contentDescription = "My Image",
            contentScale = ContentScale.Crop,
            alignment = BiasAlignment(-0.5f, -1f),
            modifier = Modifier
                .size(110.dp)
                .clip(CircleShape)
                .scale(1.4f)
                .border(2.dp, Color.Gray, CircleShape)
        )

        Spacer(modifier = Modifier.width(16.dp))

        Column(
            modifier = Modifier.fillMaxHeight()
        ) {
            Text("Сергій Дузя")

            Row(modifier = Modifier.padding(top = 8.dp)) {
                ProfileStat(count = "3", label = "Дописи")
                Spacer(modifier = Modifier.width(16.dp))
                ProfileStat(count = "36", label = "Читачі")
                Spacer(modifier = Modifier.width(16.dp))
                ProfileStat(count = "49", label = "Відстежується")
            }
        }
    }
}

@Composable
fun ProfileStat(count: String, label: String) {
    Column(
        modifier = Modifier.wrapContentWidth(),
        horizontalAlignment = Alignment.Start
    ) {
        Text(
            text = count,
            textAlign = TextAlign.Start
        )
        Text(
            text = label,
            textAlign = TextAlign.Start
        )
    }
}

