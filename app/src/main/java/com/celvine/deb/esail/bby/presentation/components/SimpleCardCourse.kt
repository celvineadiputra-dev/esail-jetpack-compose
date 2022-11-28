package com.celvine.deb.esail.bby.presentation.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.celvine.deb.esail.bby.common.FormatPrice
import com.celvine.deb.esail.bby.common.theme.White
import com.celvine.deb.esail.bby.data.model.CourseModel
import com.celvine.deb.esail.bby.route.Routes
import com.celvine.deb.esail.bby.ui.components.Star


@Composable
fun SimpleCardCourse(item: CourseModel, navController: NavController) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable {
                navController.navigate(Routes.Detail.createRoute(item.id))
            },
        elevation = CardDefaults.cardElevation(defaultElevation = 0.4.dp),
        colors = CardDefaults.cardColors(containerColor = White)
    ) {
        Row(modifier = Modifier.padding(10.dp), verticalAlignment = Alignment.CenterVertically) {
            AsyncImage(
                model = ImageRequest.Builder(LocalContext.current)
                    .data(item.banner)
                    .crossfade(true).build(),
                contentDescription = item.title,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .width(64.dp)
                    .height(64.dp)
                    .clip(
                        shape = RoundedCornerShape(12.dp)
                    )
            )
            Spacer(modifier = Modifier.width(15.dp))
            Column {
                Text(
                    text = item.title,
                    overflow = TextOverflow.Ellipsis,
                    maxLines = 1,
                    style = MaterialTheme.typography.labelMedium.copy(
                        fontSize = 12.sp,
                        fontWeight = FontWeight.SemiBold
                    )
                )
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Mentor(mentor = item.Captain.Name)
                    Star(rating = item.rating)
                }
                Spacer(modifier = Modifier.height(5.dp))
                Price(isFree = item.isFree, price = FormatPrice(item.price))
            }
        }
    }
}