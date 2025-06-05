package dev.example.myinstagram

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.scale
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.padding

@Composable
fun Header() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 8.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Text(
            text = "googlebume ↴",
            fontSize = 18.sp,
            modifier = Modifier.scale(1.1f)
        )

        Image(
            painter = painterResource(id = R.drawable.burger),
            contentDescription = "Menu Icon",
            modifier = Modifier
                .size(32.dp)
                .scale(1.2f),
            contentScale = ContentScale.Fit
        )
    }
}
