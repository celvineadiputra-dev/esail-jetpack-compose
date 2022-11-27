package com.celvine.deb.esail.bby.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.celvine.deb.esail.bby.common.theme.Dark
import com.celvine.deb.esail.bby.common.theme.White

@Composable
fun TopBar(modifier: Modifier = Modifier, title: String, icon: Int, onClick: () -> Unit = {}) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .background(color = White)
            .padding(horizontal = 16.dp, vertical = 10.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = title,
            style = MaterialTheme.typography.labelMedium.copy(
                color = Dark,
                fontSize = 16.sp,
                fontWeight = FontWeight.SemiBold
            )
        )
        IconButton(
            modifier = Modifier.width(18.dp), onClick = { onClick() }) {
            Icon(
                painter = painterResource(id = icon),
                contentDescription = "Cart", tint = Dark
            )
        }
    }
}