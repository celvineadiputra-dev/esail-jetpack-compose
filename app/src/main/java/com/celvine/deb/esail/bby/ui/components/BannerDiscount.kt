package com.celvine.deb.esail.bby.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.celvine.deb.esail.bby.R
import com.celvine.deb.esail.bby.ui.theme.DodgerBlue
import com.celvine.deb.esail.bby.ui.theme.HonoluluBlue
import com.celvine.deb.esail.bby.ui.theme.White

@Composable
fun BannerDiscount() {
    Card(
        modifier = Modifier.fillMaxWidth(),
        backgroundColor = HonoluluBlue,
        shape = RoundedCornerShape(22.dp),
        contentColor = White
    ) {
        Box(modifier = Modifier.fillMaxSize()) {
            Image(
                modifier = Modifier.align(Alignment.BottomEnd),
                painter = painterResource(id = R.drawable.ornament_discount_bottom),
                contentDescription = "bg"
            )
            Image(
                modifier = Modifier.align(Alignment.TopStart),
                painter = painterResource(id = R.drawable.ornament_discount_top),
                contentDescription = "bg"
            )
            Column(
                modifier = Modifier.padding(
                    start = 24.dp,
                    top = 30.dp,
                    bottom = 30.dp,
                    end = 24.dp
                )
            ) {
                Text(
                    text = "25% OFF *",
                    style = MaterialTheme.typography.h6.copy(color = White, fontSize = 15.sp)
                )
                Text(
                    text = "Today's Special",
                    style = MaterialTheme.typography.h6.copy(
                        color = White,
                        fontSize = 22.sp,
                        fontWeight = FontWeight.SemiBold
                    )
                )
                Text(
                    text = "Get a Discount for Every \n Course Order Only Valid for \n Today.!",
                    style = MaterialTheme.typography.h6.copy(color = White, fontSize = 13.sp)
                )
            }
        }
    }
}