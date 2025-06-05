package dev.example.myinstagram

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun ProfileDescription() {

        Column(modifier = Modifier.fillMaxWidth()) {
            DescriptionRow(text = "🔥 FullStack dev")
            DescriptionRow(text = "\uD83D\uDDFD Nizhin City, Ukraine")
            DescriptionRow(text = "\uD83C\uDFC6 Public figure, scientist, orator, etc")
            DescriptionRow(text = "\uD83D\uDCDC Vinnytsia IT-Academy & Nizhyn Applied Collage")

        }
}


@Composable
fun DescriptionRow (text: String){
        Text(
            text = text
        )
}