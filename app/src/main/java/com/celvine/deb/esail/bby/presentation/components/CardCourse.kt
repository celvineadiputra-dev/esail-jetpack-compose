package com.celvine.deb.esail.bby.presentation.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.celvine.deb.esail.bby.common.Capitalize
import com.celvine.deb.esail.bby.common.FormatPrice
import com.celvine.deb.esail.bby.common.theme.SoftGray
import com.celvine.deb.esail.bby.common.theme.SoftGray2
import com.celvine.deb.esail.bby.common.theme.White
import com.celvine.deb.esail.bby.data.model.CourseModel
import com.celvine.deb.esail.bby.ui.components.Star

@Composable
fun CardCourse(modifier: Modifier = Modifier, item: CourseModel, onClick: (Int) -> Unit) {
    Box(
        modifier = modifier
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
                text = Capitalize(item.title),
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
                Price(price = FormatPrice(item.price), isFree = item.isFree)
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