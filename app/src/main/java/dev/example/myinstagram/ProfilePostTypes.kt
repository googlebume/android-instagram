package dev.example.myinstagram

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.Color

@Composable()
fun ProfilePostTypes() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 8.dp),
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 8.dp),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            renderPostTypeBtn("nine_grid_icon")
            renderPostTypeBtn("shorts_icon")
            renderPostTypeBtn("tag_pin_icon")

        }
        Box(
            modifier = Modifier
                .height(2.dp)
                .width(36.dp)
                .background(Color.Black)
        )
    }



}


@Composable
fun renderPostTypeBtn(imgName: String) {
    val context = LocalContext.current
    val resourceId = remember(imgName) {
        context.resources.getIdentifier(imgName, "drawable", context.packageName)
    }

    if (resourceId != 0) {
        Image(
            painter = painterResource(id = resourceId),
            contentDescription = "Menu Icon",
            modifier = Modifier
                .size(28.dp),
            contentScale = ContentScale.Fit
        )
    } else {
        Text("INF")
    }
}
