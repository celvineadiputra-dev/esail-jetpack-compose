package com.celvine.deb.esail.bby.presentation.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.celvine.deb.esail.bby.common.theme.ButtonStyle
import com.celvine.deb.esail.bby.common.theme.DodgerBlue
import com.celvine.deb.esail.bby.common.theme.Shapes
import com.celvine.deb.esail.bby.common.theme.White

@Composable
fun PrimaryButton(text: String, onClick: () -> Unit) {
    Button(
        modifier = Modifier
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


@Preview(showBackground = true)
@Composable
fun PrimaryButtonPreview() {
    PrimaryButton(text = "HELLO", onClick = {})
}