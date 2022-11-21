package com.celvine.deb.esail.bby.ui.components

import androidx.compose.foundation.layout.*
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
import com.celvine.deb.esail.bby.ui.theme.Transparant

@Composable
fun SearchField(placeholder: String, value: MutableState<String>) {
    OutlinedTextField(
        modifier = Modifier
            .fillMaxWidth()
            .height(63.dp),
        value = value.value,
        colors = TextFieldDefaults.outlinedTextFieldColors(
            backgroundColor = SoftGray,
            unfocusedBorderColor = SoftGray,
            focusedBorderColor = Transparant,
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
        onValueChange = {
            value.value = it
        },
        placeholder = {
            Row(modifier = Modifier.fillMaxHeight(),verticalAlignment = Alignment.CenterVertically) {
                Text(text = placeholder, style = MaterialTheme.typography.caption.copy(fontWeight = FontWeight.Medium))
            }
        },
    )
}