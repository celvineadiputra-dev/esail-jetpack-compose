package com.celvine.deb.esail.bby.presentation.components

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.celvine.deb.esail.bby.common.theme.Dark
import com.celvine.deb.esail.bby.common.theme.Shapes

@Composable
fun PrimaryOutlineButton(modifier: Modifier, label: String) {
    OutlinedButton(
        modifier = modifier,
        shape = Shapes.medium,
        onClick = { /*TODO*/ }) {
        Text(
            text = label,
            style = MaterialTheme.typography.bodySmall.copy(
                color = Dark,
                fontWeight = FontWeight.SemiBold, fontSize = 11.sp
            )
        )
    }
}