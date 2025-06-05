package dev.example.myinstagram

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun ProfilePosts() {
    val postImages = listOf(
        "one", "two", "three",
        "one", "two", "three",
        "one", "two", "three"
    )

    LazyColumn(
        modifier = Modifier
            .fillMaxWidth()
            .padding(2.dp)
            .height(400.dp)
    ) {
        val groupedPosts = postImages.chunked(3)

        items(groupedPosts.size) { rowIndex ->
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(1.dp),
                horizontalArrangement = Arrangement.spacedBy(2.dp)
            ) {
                groupedPosts[rowIndex].forEach { imageName ->
                    renderPost(
                        imageName,
                        modifier = Modifier
                            .weight(1f)
                            .aspectRatio(2f/3f)
                    )
                }

                val itemsInRow = groupedPosts[rowIndex].size
                if (itemsInRow < 3) {
                    repeat(3 - itemsInRow) {
                        Spacer(
                            modifier = Modifier
                                .weight(1f)
                                .aspectRatio(1f)
                        )
                    }
                }
            }
        }
    }
}



@Composable
fun renderPost(imgName: String, modifier: Modifier) {
    val context = LocalContext.current
    val resourceId = remember(imgName) {
        context.resources.getIdentifier(imgName, "drawable", context.packageName)
    }

    if (resourceId != 0) {
        Image(
            painter = painterResource(id = resourceId),
            contentDescription = null,
            modifier = modifier.padding(1.dp),
            contentScale = ContentScale.Crop
        )
    } else {
        Text(
            text = "⛔",
            modifier = modifier.padding(1.dp)
        )
    }
}
