package com.celvine.deb.esail.bby.ui.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.MaterialTheme
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.celvine.deb.esail.bby.R
import com.celvine.deb.esail.bby.ui.theme.SoftGray2

@Composable
fun Mentor(mentor: String) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Icon(
            modifier = Modifier
                .width(12.dp)
                .height(12.dp),
            painter = painterResource(id = R.drawable.round_icon),
            contentDescription = "mentor",
            tint = SoftGray2
        )
        Spacer(modifier = Modifier.width(5.dp))
        Text(
            text = mentor,
            style = MaterialTheme.typography.caption.copy(
                fontWeight = FontWeight.SemiBold,
                fontSize = 9.sp,
                color = SoftGray2
            )
        )
    }
}