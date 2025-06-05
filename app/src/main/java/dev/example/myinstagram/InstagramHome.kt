package dev.example.myinstagram

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun InstagramHome(name: String, modifier: Modifier = Modifier) {
    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .background(Color.Black),
        verticalArrangement = Arrangement.spacedBy(0.dp)
    ) {
        item {
            TopBar()
        }
        item {
            StoriesRow()
        }
        items(5) {
            PostItem("artworkout_es", R.drawable.some_bg)
        }
    }
}


@Composable
fun TopBar() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 12.dp, vertical = 10.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = "Instagram",
            color = Color.White,
            fontSize = 26.sp,
            fontWeight = FontWeight.Bold
        )
        Row {
            Icon(
                painter = painterResource(id = R.drawable.inactive_heart_icon),
                contentDescription = "Heart",
                tint = Color.White,
                modifier = Modifier.size(24.dp)
            )
            Spacer(modifier = Modifier.padding(end = 16.dp))
            Icon(
                painter = painterResource(id = R.drawable.coment_icon),
                contentDescription = "DM",
                tint = Color.White,
                modifier = Modifier.size(24.dp)
            )
        }
    }
}

@Composable
fun StoriesRow() {
    LazyRow(
        modifier = Modifier.padding(vertical = 8.dp)
    ) {
        items(10) { index ->
            StoryItem("user$index")
        }
    }
}

@Composable
fun StoryItem(username: String) {
    Column(
        modifier = Modifier
            .padding(horizontal = 8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .size(104.dp)
                .background(Color.Magenta, CircleShape)
        ){
            Box(
                modifier = Modifier
                    .size(100.dp)
                    .background(Color.DarkGray, CircleShape)
                    .border(3.dp, Color.Black, CircleShape)
            )
        }
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = username,
            color = Color.White,
            fontSize = 14.sp,
            maxLines = 1
        )
    }
}

@Composable
fun Feed() {
    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(0.dp)
    ) {
        items(5) {
            PostItem("artworkout_es", R.drawable.some_bg)
        }
    }
}

@Composable
fun PostItem(username: String, imageRes: Int) {
    Column(modifier = Modifier.fillMaxWidth()) {
        // Post Header
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .size(40.dp)
                    .background(Color.Gray, CircleShape)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = username,
                color = Color.White,
                fontWeight = FontWeight.SemiBold
            )
            Spacer(modifier = Modifier.weight(1f))
            Icon(
                painter = painterResource(id = R.drawable.dots_icon),
                contentDescription = "More Options",
                tint = Color.White,
                modifier = Modifier.size(20.dp)
            )
        }

        // Post Image
        Image(
            painter = painterResource(id = imageRes),
            contentDescription = "Post Image",
            modifier = Modifier
                .fillMaxWidth()
                .aspectRatio(1f)
        )

        // Post Actions
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 8.dp, vertical = 6.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painter = painterResource(id = R.drawable.inactive_heart_icon),
                contentDescription = "Like",
                tint = Color.White,
                modifier = Modifier.size(24.dp)
            )
            Spacer(modifier = Modifier.width(12.dp))
            Icon(
                painter = painterResource(id = R.drawable.coment_icon),
                contentDescription = "Comment",
                tint = Color.White,
                modifier = Modifier.size(24.dp)
            )
            Spacer(modifier = Modifier.width(12.dp))
            Icon(
                painter = painterResource(id = R.drawable.plain_iconpng),
                contentDescription = "Share",
                tint = Color.White,
                modifier = Modifier.size(24.dp)
            )
            Spacer(modifier = Modifier.weight(1f))
            Icon(
                painter = painterResource(id = R.drawable.inactive_bookmark_icon),
                contentDescription = "Save",
                tint = Color.White,
                modifier = Modifier.size(24.dp)
            )
        }

        // Post Info
        Column(modifier = Modifier.padding(horizontal = 12.dp)) {
            Text("Вподобали: user123 та ще 20", color = Color.White, fontSize = 14.sp)
            Spacer(modifier = Modifier.height(2.dp))
            Text(
                text = "$username: Це приклад допису в Instagram",
                color = Color.White,
                fontSize = 14.sp,
                maxLines = 2
            )
            Spacer(modifier = Modifier.height(8.dp))
        }
    }
}
