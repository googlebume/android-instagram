package dev.example.myinstagram

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun EditProfile() {
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        EditBtn(text = "Редагувати профіль")
        EditBtn(text = "Поширити профіль")
    }
}

@Composable
fun EditBtn(text: String) {
    Button(
        onClick = {},
        shape = RoundedCornerShape(28),
        border = ButtonDefaults.outlinedButtonBorder.copy(
            width = 1.5.dp,
            brush = Brush.linearGradient(
                listOf(Color.Black, Color.Black)
            )
        ),
        colors = ButtonDefaults.outlinedButtonColors(
            containerColor = Color.Transparent,
            contentColor = Color.Black
        ),
        contentPadding = PaddingValues(
            vertical = 6.dp,
            horizontal = 12.dp
        ),
        modifier = Modifier
            .defaultMinSize(minWidth = 1.dp, minHeight = 1.dp)
    ) {
        Text(text, fontSize = 16.sp)
    }
}
