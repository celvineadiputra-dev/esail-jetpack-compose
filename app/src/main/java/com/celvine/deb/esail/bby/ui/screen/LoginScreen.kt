package com.celvine.deb.esail.bby.ui.screen

import androidx.compose.foundation.*
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.celvine.deb.esail.bby.R
import com.celvine.deb.esail.bby.ui.components.PasswordTextField
import com.celvine.deb.esail.bby.ui.components.PrimaryButton
import com.celvine.deb.esail.bby.ui.components.PrimaryTextField
import com.celvine.deb.esail.bby.ui.theme.*
import kotlin.reflect.KFunction1

@Composable
fun LoginScreen() {
    val scrollState = rememberScrollState()
    Column(
        modifier = Modifier
            .scrollable(state = scrollState, orientation = Orientation.Vertical)
            .padding(16.dp)
    ) {
        WelcomeText()
        Spacer(modifier = Modifier.height(20.dp))
        Tabby()

        Spacer(modifier = Modifier.height(40.dp))
        Text(text = "Email", style = MaterialTheme.typography.subtitle1.copy(fontSize = 15.sp))
        Spacer(modifier = Modifier.height(3.dp))
        PrimaryTextField(placeholder = "Enter your email address")

        Spacer(modifier = Modifier.height(15.dp))
        Text(text = "Password", style = MaterialTheme.typography.subtitle1.copy(fontSize = 15.sp))
        Spacer(modifier = Modifier.height(3.dp))
        PasswordTextField(placeholder = "Password")

        Spacer(modifier = Modifier.height(5.dp))
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.End) {
            TextButton(
                onClick = {},
            ) {
                Text(
                    text = "Forgot Password",
                    style = MaterialTheme.typography.subtitle1.copy(
                        fontSize = 15.sp,
                        color = SoftGray
                    )
                )
            }
        }

        Spacer(modifier = Modifier.height(15.dp))
        PrimaryButton(text = "Login", onClick = {})

        Spacer(modifier = Modifier.height(25.dp))
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
            Text(
                text = "Signin with Google or Facebook",
                style = MaterialTheme.typography.subtitle2.copy(color = SoftGray)
            )
        }
        Spacer(modifier = Modifier.height(25.dp))
        Row(modifier = Modifier.fillMaxWidth()) {
            Row(
                modifier = Modifier
                    .border(width = 2.dp, color = SoftGray, shape = RoundedCornerShape(12.dp))
                    .padding(vertical = 20.dp, horizontal = 10.dp)
                    .weight(1f),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.google),
                    contentDescription = "Google Icon",
                    modifier = Modifier
                        .width(24.dp)
                        .height(24.dp)
                )
                Spacer(modifier = Modifier.width(7.dp))
                Text(text = "Google", style = MaterialTheme.typography.button)
            }

            Spacer(modifier = Modifier.width(5.dp))

            Row(
                modifier = Modifier
                    .border(width = 2.dp, color = SoftGray, shape = RoundedCornerShape(12.dp))
                    .padding(vertical = 20.dp, horizontal = 10.dp)
                    .weight(1f),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.facebook),
                    contentDescription = "Facebook Icon",
                    modifier = Modifier
                        .width(24.dp)
                        .height(24.dp)
                )
                Spacer(modifier = Modifier.width(7.dp))
                Text(text = "Facebook", style = MaterialTheme.typography.button)
            }
        }
        Spacer(modifier = Modifier.height(10.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Don't have an account ?",
                style = MaterialTheme.typography.subtitle1.copy(color = SoftGray)
            )
            Spacer(modifier = Modifier.width(5.dp))
            TextButton(onClick = { /*TODO*/ }) {
                Text(
                    text = "Sign Up",
                    style = MaterialTheme.typography.button.copy(
                        color = DodgerBlue,
                        fontWeight = FontWeight.Bold
                    )
                )
            }
        }
    }
}

@Composable
fun WelcomeText() {
    Column {
        Text(
            text = "Welcome Back 👋",
            style = MaterialTheme.typography.h3.copy(
                color = DodgerBlue,
                fontSize = 25.sp,
                fontWeight = FontWeight.SemiBold
            )
        )
        Spacer(modifier = Modifier.height(7.dp))
        Text(
            text = "We happy to you again, To use your account, your should login first",
            style = MaterialTheme.typography.subtitle1.copy(color = SoftGray)
        )
    }
}

@Composable
fun Tabby() {
    var currentActive by remember {
        mutableStateOf(0)
    }

    fun setCurrentActive(index: Int) {
        currentActive = index
    }
    Card(
        modifier = Modifier
            .fillMaxWidth(), shape = RoundedCornerShape(12.dp)
    ) {
        Row(
            modifier = Modifier
                .background(SoftGray)
                .fillMaxWidth()
                .padding(horizontal = 10.dp, vertical = 5.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            TabbyCard(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f), label = "Email Address",
                isActive = currentActive == 0,
                index = 0,
                setCurrentActive = ::setCurrentActive
            )
            Spacer(modifier = Modifier.width(5.dp))
            TabbyCard(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f), label = "Phone Number",
                isActive = currentActive == 1,
                index = 1,
                setCurrentActive = ::setCurrentActive
            )
        }
    }
}

@Composable
fun TabbyCard(
    modifier: Modifier,
    label: String,
    isActive: Boolean = false,
    index: Int,
    setCurrentActive: KFunction1<Int, Unit>
) {
    Button(
        modifier = modifier,
        onClick = { setCurrentActive(index) },
        shape = RoundedCornerShape(12.dp),
        colors = ButtonDefaults.buttonColors(backgroundColor = if (isActive) White else Transparant),
        elevation = ButtonDefaults.elevation(0.dp),
    ) {
        Text(
            text = label,
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.button.copy(fontSize = 12.sp)
        )
    }
}