package com.celvine.deb.esail.bby.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.celvine.deb.esail.bby.R
import com.celvine.deb.esail.bby.common.theme.Dark

@Composable
fun GreetingBar() {
    val interactionSource = remember { MutableInteractionSource() }
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column {
            Text(
                text = "Hello, 👋 Claudie Natalija",
                style = MaterialTheme.typography.h6.copy(fontSize = 16.sp)
            )
            Text(
                text = "What would you like to learn today ? \nSearh Below",
                style = MaterialTheme.typography.subtitle1.copy(color = Dark, fontSize = 12.sp)
            )
        }
        Image(
            modifier = Modifier
                .width(24.dp)
                .clickable(
                    interactionSource = interactionSource,
                    indication = null
                ) { },
            painter = painterResource(id = R.drawable.bell_icon),
            contentDescription = "Notification",
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingBarPreview() {
    GreetingBar()
}