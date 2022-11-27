package com.celvine.deb.esail.bby.presentation.components

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
import com.celvine.deb.esail.bby.common.theme.Transparant

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
                text = "Hello, 👋 Celvine",
                style = MaterialTheme.typography.bodyLarge.copy(
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 13.sp
                )
            )
            Text(
                text = "What would you like to learn today ? \nSearh Below",
                style = MaterialTheme.typography.bodySmall.copy(color = Dark)
            )
        }
        FilledIconButton(
            onClick = { /*TODO*/ },
            colors = IconButtonDefaults.filledIconButtonColors(containerColor = Transparant)
        ) {
            Icon(
                modifier = Modifier.width(20.dp),
                painter = painterResource(id = R.drawable.cart_shopping),
                contentDescription = "Cart"
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingBarPreview() {
    GreetingBar()
}