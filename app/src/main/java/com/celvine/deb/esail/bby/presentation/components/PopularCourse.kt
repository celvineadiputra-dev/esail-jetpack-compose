package com.celvine.deb.esail.bby.presentation.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
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
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.celvine.deb.esail.bby.R
import com.celvine.deb.esail.bby.common.theme.*
import com.celvine.deb.esail.bby.data.sources.CourseData
import com.celvine.deb.esail.bby.data.model.CourseModel
import com.celvine.deb.esail.bby.data.viewmodels.CoursesViewModel
import com.celvine.deb.esail.bby.ui.components.Mentor
import com.celvine.deb.esail.bby.ui.components.Star

import androidx.lifecycle.viewmodel.compose.viewModel
import com.celvine.deb.esail.bby.data.repositories.CoursesRepository
import com.celvine.deb.esail.bby.data.viewmodels.ViewModelFactory


@Composable
fun PopularCourse(
    viewModel: CoursesViewModel = viewModel(
        factory = ViewModelFactory(
            CoursesRepository()
        )
    )
) {
    val courses by viewModel.courses.collectAsState()
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
                style = MaterialTheme.typography.h6.copy(
                    fontSize = 16.sp,
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
                        if (item.isPopular) {
                            CardCourse(item = item)
                            Spacer(modifier = Modifier.width(10.dp))
                        }
                    }
                }
            }
        }
    }
}


@Composable
fun CardCourse(item: CourseModel) {
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
                style = MaterialTheme.typography.h6.copy(
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
                style = MaterialTheme.typography.subtitle2.copy(
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Normal, color = SoftGray2
                )
            )
            Spacer(modifier = Modifier.height(5.dp))
            Mentor(mentor = item.mentor)
            Spacer(modifier = Modifier.height(5.dp))
            Button(shape = RoundedCornerShape(12.dp),
                elevation = ButtonDefaults.elevation(0.dp), onClick = { /*TODO*/ }) {
                Text(
                    text = "Join Now",
                    style = MaterialTheme.typography.button.copy(
                        color = White,
                        fontSize = 11.sp,
                        fontWeight = FontWeight.SemiBold
                    )
                )
            }
        }
    }
}

@Composable
fun Price(isFree: Boolean = false, price: String = "0") {
    if (isFree) {
        Text(
            text = "Free",
            style = MaterialTheme.typography.subtitle2.copy(
                color = Ruby,
                fontWeight = FontWeight.SemiBold,
                fontSize = 12.sp,
            )
        )
    } else {
        Text(
            text = "Rp. $price",
            style = MaterialTheme.typography.subtitle2.copy(
                color = Green,
                fontWeight = FontWeight.SemiBold,
                fontSize = 12.sp
            )
        )
    }
}