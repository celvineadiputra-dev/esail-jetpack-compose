package com.celvine.deb.esail.bby.presentation.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.celvine.deb.esail.bby.common.theme.ButtonStyle
import com.celvine.deb.esail.bby.common.theme.DodgerBlue
import com.celvine.deb.esail.bby.common.theme.Shapes
import com.celvine.deb.esail.bby.common.theme.White

@Composable
fun PrimaryButton(modifier: Modifier = Modifier, text: String, onClick: () -> Unit) {
    Button(
        modifier = modifier
            .fillMaxWidth()
            .height(63.dp),
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(containerColor = DodgerBlue),
        shape = Shapes.medium,
        elevation = ButtonDefaults.buttonElevation(0.dp)
    ) {
        Text(
            text = text,
            style = ButtonStyle.copy(color = White, fontSize = 19.sp)
        )
    }
}