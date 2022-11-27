package com.celvine.deb.esail.bby.presentation.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.celvine.deb.esail.bby.R
import com.celvine.deb.esail.bby.common.theme.*
import com.celvine.deb.esail.bby.data.model.CourseModel
import com.celvine.deb.esail.bby.route.Routes
import com.celvine.deb.esail.bby.ui.components.Star


@Composable
fun PopularCourse(
    courses: List<CourseModel>,
    navController: NavController
) {
    Column {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(end = 16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Popular Courses",
                style = MaterialTheme.typography.bodyLarge.copy(
                    fontWeight = FontWeight.Bold
                )
            )
            Icon(painter = painterResource(id = R.drawable.more_icon), contentDescription = "more")
        }
        Spacer(modifier = Modifier.height(20.dp))
        Box(modifier = Modifier.fillMaxWidth()) {
            BoxWithConstraints(modifier = Modifier.fillMaxWidth()) {
                LazyRow(modifier = Modifier.fillMaxWidth(), state = rememberLazyListState()) {
                    items(courses, key = { it.id }) { item ->
                        CardCourse(item = item, onClick = {
                            navController.navigate(Routes.Detail.createRoute(item.id))
                        })
                        Spacer(modifier = Modifier.width(10.dp))
                    }
                }
            }
        }
    }
}


@Composable
fun CardCourse(item: CourseModel, onClick: (Int) -> Unit) {
    Box(
        modifier = Modifier
            .width(280.dp)
            .clip(shape = RoundedCornerShape(16.dp))
            .background(color = White)
            .border(BorderStroke(1.4.dp, SolidColor(SoftGray)), shape = RoundedCornerShape(16.dp))
            .padding(14.dp)
            .clickable(
                indication = null,
                interactionSource = remember { MutableInteractionSource() },
            ) {
                onClick(item.id)
            }
    ) {
        Column {
            AsyncImage(
                model = ImageRequest.Builder(LocalContext.current)
                    .data(item.banner)
                    .crossfade(true).build(),
                contentDescription = item.title,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(134.dp)
                    .clip(
                        shape = RoundedCornerShape(12.dp)
                    )
            )
            Spacer(modifier = Modifier.height(12.dp))
            Text(
                text = item.title,
                overflow = TextOverflow.Ellipsis,
                maxLines = 1,
                style = MaterialTheme.typography.bodyLarge.copy(
                    fontSize = 17.sp,
                    fontWeight = FontWeight.SemiBold
                )
            )
            Spacer(modifier = Modifier.height(4.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Price(price = item.price, isFree = item.isFree)
                Star(rating = item.rating)
            }
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = item.sortDesc,
                overflow = TextOverflow.Ellipsis,
                maxLines = 2,
                style = MaterialTheme.typography.bodySmall.copy(
                    fontWeight = FontWeight.Normal, color = SoftGray2
                )
            )
            Spacer(modifier = Modifier.height(5.dp))
            Mentor(mentor = item.Captain.Name)
        }
    }
}

@Composable
fun Price(isFree: Boolean = false, price: String = "0") {
    if (isFree) {
        Text(
            text = "Free",
            style = MaterialTheme.typography.bodySmall.copy(
                color = Ruby,
                fontWeight = FontWeight.SemiBold,
                fontSize = 12.sp,
            )
        )
    } else {
        Text(
            text = "Rp. $price",
            style = MaterialTheme.typography.bodySmall.copy(
                color = Green,
                fontWeight = FontWeight.SemiBold,
                fontSize = 12.sp
            )
        )
    }
}