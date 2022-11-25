package com.celvine.deb.esail.bby.presentation.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.celvine.deb.esail.bby.R
import com.celvine.deb.esail.bby.common.theme.*
import com.celvine.deb.esail.bby.presentation.components.Price
import com.celvine.deb.esail.bby.presentation.components.PrimaryButton
import com.celvine.deb.esail.bby.presentation.components.PrimaryOutlineButton

@Composable
fun DetailScreen(navController: NavController) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(color = White2)
    ) {
        item {
            BannerCourse()
            DetailCourse()
            Captain()
        }
    }
}

@Composable
fun BannerCourse() {
    Box {
        AsyncImage(
            model = ImageRequest.Builder(LocalContext.current)
                .data("https://buildwithangga.com/storage/assets/thumbnails/UI%20Styleguide%20With%20Figma%201.jpeg")
                .crossfade(true).build(),
            contentDescription = "Image Profile",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp)
        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Button(
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(containerColor = White, contentColor = Dark)
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        painter = painterResource(id = R.drawable.arrow_back),
                        contentDescription = "cx"
                    )
                    Text(text = "Back")
                }
            }

            FilledIconButton(
                onClick = { /*TODO*/ },
                colors = IconButtonDefaults.filledIconButtonColors(containerColor = White)
            ) {
                Icon(
                    modifier = Modifier.width(24.dp),
                    painter = painterResource(id = R.drawable.seedling_icon),
                    contentDescription = "Add to Wishlist"
                )
            }
        }
    }
}

@Composable
fun DetailCourse() {
    Card(
        modifier = Modifier.padding(horizontal = 30.dp, vertical = 20.dp),
        colors = CardDefaults.cardColors(containerColor = White)
    ) {
        Column(modifier = Modifier.padding(20.dp)) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "Development", style = MaterialTheme.typography.labelMedium.copy(
                        color = MaximumYellowRed,
                        fontWeight = FontWeight.SemiBold, fontSize = 12.sp
                    )
                )
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        modifier = Modifier
                            .width(10.dp)
                            .height(10.dp),
                        painter = painterResource(id = R.drawable.star_icon),
                        contentDescription = "Star", tint = MaximumYellowRed
                    )
                    Spacer(modifier = Modifier.width(5.dp))
                    Text(
                        text = "4.9",
                        style = MaterialTheme.typography.labelMedium.copy(
                            color = Dark,
                            fontWeight = FontWeight.SemiBold, fontSize = 12.sp
                        )
                    )
                }
            }
            Spacer(modifier = Modifier.height(12.dp))
            Text(
                text = "Full-Stack JavaScript Developer 2021: Website Top Up Voucher Game",
                style = MaterialTheme.typography.titleMedium.copy(
                    color = Dark,
                    fontSize = 13.sp,
                    fontWeight = FontWeight.SemiBold
                )
            )
            Spacer(modifier = Modifier.height(12.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row {
                    Info(label = "102 Videos", icon = R.drawable.play)
                    Spacer(modifier = Modifier.width(10.dp))
                    Info(label = "4h 31m", icon = R.drawable.timer)
                }
                Price(isFree = false, price = "132K")
            }
            Spacer(modifier = Modifier.height(12.dp))
            Text(
                text = "MERN Stack adalah pengembangan website dari Front-End sampai Back-End dengan memakai satu bahasa pemrograman yaitu Javascript.",
                style = MaterialTheme.typography.bodySmall.copy(
                    color = Dark,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Normal
                )
            )
            Spacer(modifier = Modifier.height(12.dp))
            PrimaryButton(text = "Enroll Now", onClick = {})
            Spacer(modifier = Modifier.height(6.dp))
            Row(modifier = Modifier.fillMaxWidth()) {
                PrimaryOutlineButton(modifier = Modifier.weight(1f), label = "Add to cart")
                Spacer(modifier = Modifier.width(5.dp))
                PrimaryOutlineButton(modifier = Modifier.weight(1f), label = "Add to wishlist")
            }
        }
    }
}

@Composable
fun Info(label: String, icon: Int) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Icon(
            modifier = Modifier.width(12.dp),
            painter = painterResource(id = icon),
            contentDescription = "X"
        )
        Spacer(modifier = Modifier.width(5.dp))
        Text(
            text = label,
            style = MaterialTheme.typography.labelSmall.copy(
                color = Dark,
                fontSize = 12.sp,
                fontWeight = FontWeight.SemiBold,
                lineHeight = 0.sp
            )
        )
    }
}

@Composable
fun Captain() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 30.dp)
    ) {
        Text(
            text = "Captain",
            style = MaterialTheme.typography.bodyMedium.copy(fontWeight = FontWeight.SemiBold)
        )
        Spacer(modifier = Modifier.height(5.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                AsyncImage(
                    model = ImageRequest.Builder(LocalContext.current)
                        .data("https://avatars.githubusercontent.com/u/69514214?v=4")
                        .crossfade(true)
                        .build(),
                    contentDescription = "Image Profile",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .clip(CircleShape)
                        .width(54.dp)
                        .height(54.dp)
                )
                Spacer(modifier = Modifier.width(10.dp))
                Column() {
                    Text(
                        text = "Debby Falensya",
                        style = MaterialTheme.typography.labelMedium.copy(
                            fontWeight = FontWeight.SemiBold,
                            fontSize = 13.sp
                        )
                    )
                    Text(
                        text = "Mandarin Teacher",
                        style = MaterialTheme.typography.labelSmall.copy(
                            fontWeight = FontWeight.Normal,
                            fontSize = 10.sp
                        )
                    )
                }
            }

            Icon(
                modifier = Modifier.width(24.dp),
                painter = painterResource(id = R.drawable.comments),
                contentDescription = "Say hay to captain",
                tint = HonoluluBlue
            )
        }
    }
}