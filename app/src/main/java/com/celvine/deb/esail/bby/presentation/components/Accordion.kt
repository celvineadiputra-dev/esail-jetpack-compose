package com.celvine.deb.esail.bby.presentation.components

import androidx.compose.animation.*
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.celvine.deb.esail.bby.R
import com.celvine.deb.esail.bby.common.theme.Dark
import com.celvine.deb.esail.bby.common.theme.Ruby
import com.celvine.deb.esail.bby.common.theme.SoftGray2
import com.celvine.deb.esail.bby.common.theme.White
import com.celvine.deb.esail.bby.data.model.ContentModel
import com.celvine.deb.esail.bby.data.model.SectionModel
import com.celvine.deb.esail.bby.data.sources.CourseContentData

@Composable
fun Accordion(itemModel: ContentModel, onClickItem: () -> Unit, expanded: Boolean) {
    Card(colors = CardDefaults.cardColors(containerColor = White)) {
        Column {
            HeaderView(questionText = itemModel.Title, onClickItem = onClickItem)
            ExpandableView(answerText = itemModel.Sections, isExpanded = expanded)
        }
    }
}

@Composable
fun HeaderView(questionText: String, onClickItem: () -> Unit) {
    Box(
        modifier = Modifier
            .clickable(
                indication = null, // Removes the ripple effect on tap
                interactionSource = remember { MutableInteractionSource() }, // Removes the ripple effect on tap
                onClick = onClickItem
            )
            .padding(horizontal = 12.dp, vertical = 8.dp)
    ) {
        Text(
            text = questionText,
            color = Dark,
            modifier = Modifier
                .fillMaxWidth(),
            style = MaterialTheme.typography.bodyMedium.copy(
                fontWeight = FontWeight.SemiBold,
                fontSize = 12.sp
            )
        )
    }
}

@Composable
fun ExpandableView(answerText: List<SectionModel>, isExpanded: Boolean) {
    // Opening Animation
    val expandTransition = remember {
        expandVertically(
            expandFrom = Alignment.Top,
            animationSpec = tween(300)
        ) + fadeIn(
            animationSpec = tween(300)
        )
    }

    // Closing Animation
    val collapseTransition = remember {
        shrinkVertically(
            shrinkTowards = Alignment.Top,
            animationSpec = tween(300)
        ) + fadeOut(
            animationSpec = tween(300)
        )
    }

    AnimatedVisibility(
        visible = isExpanded,
        enter = expandTransition,
        exit = collapseTransition
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 12.dp, vertical = 2.dp)
        ) {
            answerText.forEach { item ->
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(
                            painter = painterResource(id = R.drawable.circle_play),
                            contentDescription = "play",
                            modifier = Modifier.width(14.dp),
                            tint = SoftGray2
                        )
                        Spacer(modifier = Modifier.width(5.dp))
                        Text(
                            text = item.Title,
                            style = MaterialTheme.typography.labelSmall.copy(
                                fontWeight = FontWeight.SemiBold,
                                fontSize = 12.sp,
                                color = Dark
                            )
                        )
                    }
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Icon(
                            painter = painterResource(id = R.drawable.timer),
                            contentDescription = "Time",
                            modifier = Modifier.width(12.dp),
                            tint = SoftGray2
                        )
                        Spacer(modifier = Modifier.width(5.dp))
                        Text(
                            text = item.Time,
                            style = MaterialTheme.typography.labelSmall.copy(
                                fontWeight = FontWeight.SemiBold,
                                fontSize = 12.sp
                            )
                        )
                    }
                }
            }
        }
    }
}