package com.celvine.deb.esail.bby.presentation.components

import androidx.compose.animation.*
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.celvine.deb.esail.bby.common.theme.Dark
import com.celvine.deb.esail.bby.common.theme.Ruby
import com.celvine.deb.esail.bby.common.theme.White
import com.celvine.deb.esail.bby.data.model.ContentModel
import com.celvine.deb.esail.bby.data.model.SectionModel
import com.celvine.deb.esail.bby.data.sources.CourseContentData

@Composable
fun Accordion(itemModel: ContentModel, onClickItem: () -> Unit, expanded: Boolean) {
    Box(
        modifier = Modifier
            .background(color = White)
    ) {
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
            .background(color = White)
            .clickable(
                indication = null, // Removes the ripple effect on tap
                interactionSource = remember { MutableInteractionSource() }, // Removes the ripple effect on tap
                onClick = onClickItem
            )
            .padding(8.dp)
    ) {
        Text(
            text = questionText,
            fontSize = 17.sp,
            color = Dark,
            modifier = Modifier
                .fillMaxWidth()
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
        Column() {
            answerText.forEach { item ->
                Text(
                    text = item.Title,
                    fontSize = 16.sp,
                    color = Dark,
                    modifier = Modifier
                        .fillMaxWidth()
                )
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun AccordionPreview() {
    Column() {
        CourseContentData.data.forEach { item ->
            Accordion(
                itemModel = item,
                onClickItem = { /*TODO*/ },
                expanded = true
            )
        }
    }
}