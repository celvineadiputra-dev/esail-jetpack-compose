package com.celvine.deb.esail.bby.presentation.screen

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.celvine.deb.esail.bby.R
import com.celvine.deb.esail.bby.common.theme.*
import com.celvine.deb.esail.bby.data.sources.ProfileItem

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProfileScreen(navController: NavController) {
    Scaffold { paddingValues ->
        val padding = paddingValues
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .background(color = White2)
        ) {
            item {
                Header()
                Body()
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {
                    TextButton(onClick = { /*TODO*/ }) {
                        Text(
                            text = "Log Out",
                            style = MaterialTheme.typography.bodyMedium.copy(
                                fontWeight = FontWeight.SemiBold,
                                color = Ruby
                            )
                        )
                    }
                }
            }
        }
    }
}


@Composable
fun ImageProfile() {
    AsyncImage(
        model = ImageRequest.Builder(LocalContext.current)
            .data("https://avatars.githubusercontent.com/u/69514214?v=4").crossfade(true).build(),
        contentDescription = "Image Profile",
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .clip(CircleShape)
            .border(width = 2.dp, color = DodgerBlue, CircleShape)
            .width(120.dp)
            .height(120.dp)
    )
}


@Composable
fun ItemMenuProfile(icon: Int, label: String) {
    val context = LocalContext.current
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable {
                Toast
                    .makeText(context, "Feature in development", Toast.LENGTH_SHORT)
                    .show()
            }
            .padding(horizontal = 20.dp, vertical = 15.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row {
            Icon(
                modifier = Modifier
                    .width(20.dp)
                    .height(20.dp),
                painter = painterResource(id = icon),
                contentDescription = "Icon",
                tint = SoftGray2
            )
            Spacer(modifier = Modifier.width(12.dp))
            Text(
                text = label,
                style = MaterialTheme.typography.bodyMedium.copy(
                    fontSize = 14.sp,
                    fontWeight = FontWeight.SemiBold
                )
            )
        }
        Icon(
            modifier = Modifier
                .width(20.dp)
                .height(20.dp),
            painter = painterResource(id = R.drawable.ic_baseline_keyboard_arrow_right_24),
            contentDescription = "Icon"
        )
    }
}

@Composable
fun Header() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = White)
            .padding(12.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        ImageProfile()
        Spacer(modifier = Modifier.height(12.dp))
        Text(
            text = "Celvine Adi Putra",
            style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.SemiBold)
        )
        Spacer(modifier = Modifier.height(5.dp))
        Text(
            text = "celvineadiputra2@gmail.com",
            style = MaterialTheme.typography.displaySmall.copy(
                fontWeight = FontWeight.Normal,
                fontSize = 12.sp
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
fun Body() {
    Column(modifier = Modifier.padding(20.dp)) {
        Card(colors = CardDefaults.cardColors(containerColor = White)) {
            ProfileItem.data.forEach { item ->
                ItemMenuProfile(icon = item.Icon, label = item.Label)
            }
        }
    }
}