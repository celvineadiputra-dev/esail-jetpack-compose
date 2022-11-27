package com.celvine.deb.esail.bby.presentation.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.celvine.deb.esail.bby.R
import com.celvine.deb.esail.bby.common.theme.DodgerBlue
import com.celvine.deb.esail.bby.common.theme.SoftGray
import com.celvine.deb.esail.bby.common.theme.White

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchField(
    placeholder: String,
    value: String,
    enable: Boolean = true,
    onClick: () -> Unit = {},
    onValueChange: (String) -> Unit = {},
    onClear: () -> Unit = {}
) {
    OutlinedTextField(
        modifier = Modifier
            .fillMaxWidth()
            .height(63.dp)
            .clickable {
                onClick()
            },
        value = value,
        enabled = enable,
        colors = TextFieldDefaults.outlinedTextFieldColors(
            containerColor = White,
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
                modifier = Modifier
                    .width(24.dp)
                    .height(24.dp),
                painter = painterResource(id = R.drawable.search_icon),
                contentDescription = "Search Icon"
            )
        },
        trailingIcon = {
            if (value.length > 3) {
                Icon(
                    modifier = Modifier.clickable {
                        onClear()
                    },
                    painter = painterResource(id = R.drawable.ic_baseline_cancel_24),
                    contentDescription = "cancel",
                    tint = SoftGray
                )
            }
        },
        onValueChange = onValueChange,
        placeholder = {
            Row(
                modifier = Modifier.fillMaxHeight(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = placeholder,
                    style = MaterialTheme.typography.labelSmall.copy(fontWeight = FontWeight.Medium)
                )
            }
        },
    )
}