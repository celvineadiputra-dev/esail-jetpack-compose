package com.celvine.deb.esail.bby.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Star
import androidx.compose.material.icons.outlined.StarHalf
import androidx.compose.material.icons.outlined.StarOutline
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.celvine.deb.esail.bby.R
import com.celvine.deb.esail.bby.ui.theme.HonoluluBlue
import com.celvine.deb.esail.bby.ui.theme.SoftGray
import com.celvine.deb.esail.bby.ui.theme.SoftGray2
import com.celvine.deb.esail.bby.ui.theme.White
import java.lang.Math.ceil
import java.lang.Math.floor


@Composable
fun PopularCourse() {
    Column {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Popular Courses",
                style = MaterialTheme.typography.h6.copy(fontSize = 16.sp)
            )
            Icon(painter = painterResource(id = R.drawable.more_icon), contentDescription = "more")
        }
        Spacer(modifier = Modifier.height(20.dp))
        val items = (1..10).map { "item $it" }
        Box(modifier = Modifier.fillMaxWidth()) {
            BoxWithConstraints(modifier = Modifier.fillMaxWidth()) {
                LazyRow(modifier = Modifier.fillMaxWidth(), state = rememberLazyListState()) {
                    itemsIndexed(items) { index, item ->
                        CardCourse()
                        Spacer(modifier = Modifier.width(10.dp))
                    }
                }
            }
        }
    }
}


@Composable
fun CardCourse() {
    Box(
        modifier = Modifier
            .width(280.dp)
            .clip(shape = RoundedCornerShape(16.dp))
            .background(color = White)
            .border(BorderStroke(1.4.dp, SolidColor(SoftGray)), shape = RoundedCornerShape(16.dp))
            .padding(14.dp)
    ) {
        Column {
            AsyncImage(
                model = ImageRequest.Builder(LocalContext.current)
                    .data("https://developer.android.com/static/codelabs/jetpack-compose-animation/img/5bb2e531a22c7de0.png?hl=id")
                    .crossfade(true).build(),
                contentDescription = "ex",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(134.dp)
                    .clip(
                        shape = RoundedCornerShape(12.dp)
                    )
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "This is heading",
                style = MaterialTheme.typography.h6.copy(
                    fontSize = 20.sp,
                    fontWeight = FontWeight.SemiBold
                )
            )
            Spacer(modifier = Modifier.height(4.dp))
            Row(verticalAlignment = Alignment.CenterVertically) {
                RatingBar(rating = 2.5)
                Spacer(modifier = Modifier.width(5.dp))
                Text(
                    text = "2.5 (203)",
                    style = MaterialTheme.typography.subtitle1.copy(
                        fontSize = 11.sp,
                        fontWeight = FontWeight.Medium,
                        color = SoftGray
                    )
                )
            }
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "lorem ipsum dolor si amet, conscteur abad adapscing, more",
                style = MaterialTheme.typography.subtitle2.copy(
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Normal, color = SoftGray
                )
            )
        }
    }
}

@Composable
fun RatingBar(
    modifier: Modifier = Modifier,
    rating: Double = 0.0,
    stars: Int = 5,
    starsColor: Color = HonoluluBlue,
) {

    val filledStars = kotlin.math.floor(rating).toInt()
    val unfilledStars = (stars - kotlin.math.ceil(rating)).toInt()
    val halfStar = !(rating.rem(1).equals(0.0))

    Row(modifier = modifier) {
        repeat(filledStars) {
            Icon(
                modifier = Modifier.width(15.dp),
                imageVector = Icons.Outlined.Star,
                contentDescription = null,
                tint = starsColor
            )
        }

        if (halfStar) {
            Icon(
                modifier = Modifier.width(15.dp),
                imageVector = Icons.Outlined.StarHalf,
                contentDescription = null,
                tint = starsColor
            )
        }

        repeat(unfilledStars) {
            Icon(
                modifier = Modifier.width(15.dp),
                imageVector = Icons.Outlined.StarOutline,
                contentDescription = null,
                tint = SoftGray
            )
        }
    }
}