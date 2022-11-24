package com.celvine.deb.esail.bby.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.celvine.deb.esail.bby.R
import com.celvine.deb.esail.bby.ui.theme.DodgerBlue
import com.celvine.deb.esail.bby.ui.theme.SoftGray
import com.celvine.deb.esail.bby.ui.theme.White

@Composable
fun SearchField(
    placeholder: String,
    value: MutableState<String>,
    enable: Boolean = true,
    onClick: () -> Unit = {},
    callBack: () -> Unit = {}
) {
    OutlinedTextField(
        modifier = Modifier
            .fillMaxWidth()
            .height(63.dp)
            .clickable {
                onClick()
            },
        value = value.value,
        enabled = enable,
        colors = TextFieldDefaults.outlinedTextFieldColors(
            backgroundColor = White,
            unfocusedBorderColor = White,
            focusedBorderColor = SoftGray,
            cursorColor = DodgerBlue
        ),
        shape = RoundedCornerShape(12.dp),
        maxLines = 1,
        singleLine = true,
        textStyle = TextStyle(
            fontWeight = FontWeight.Medium,
        ),
        leadingIcon = {
            Icon(
                painter = painterResource(id = R.drawable.search_icon),
                contentDescription = "Search Icon"
            )
        },
        trailingIcon = {
            if (value.value.length > 3) {
                Icon(
                    modifier = Modifier.clickable {
                        value.value = ""
                    },
                    painter = painterResource(id = R.drawable.ic_baseline_cancel_24),
                    contentDescription = "cancel",
                    tint = SoftGray
                )
            }
        },
        onValueChange = {
            value.value = it
            callBack()
        },
        placeholder = {
            Row(
                modifier = Modifier.fillMaxHeight(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = placeholder,
                    style = MaterialTheme.typography.caption.copy(fontWeight = FontWeight.Medium)
                )
            }
        },
    )
}