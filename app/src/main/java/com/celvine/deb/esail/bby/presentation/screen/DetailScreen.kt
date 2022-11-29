package com.celvine.deb.esail.bby.presentation.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.celvine.deb.esail.bby.R
import com.celvine.deb.esail.bby.common.UiState
import com.celvine.deb.esail.bby.common.theme.*
import com.celvine.deb.esail.bby.data.model.CaptainModel
import com.celvine.deb.esail.bby.data.model.CourseModel
import com.celvine.deb.esail.bby.data.viewmodels.*
import com.celvine.deb.esail.bby.di.Injection
import com.celvine.deb.esail.bby.presentation.components.*
import com.celvine.deb.esail.bby.route.Routes

@Composable
fun DetailScreen(
    navController: NavController,
    id: Int,
    contentViewModel: ContentViewModel = androidx.lifecycle.viewmodel.compose.viewModel(
        factory = ViewModelContentFactory(
            Injection.provideContentRepository()
        )
    ),
    wishListViewModel: WishlistViewModel = androidx.lifecycle.viewmodel.compose.viewModel(
        factory = ViewModelWishListFactory(
            Injection.provideWishlistRepository()
        )
    ),
    detailViewModel: DetailViewModel = androidx.lifecycle.viewmodel.compose.viewModel(
        factory = ViewModelDetailFactory(
            Injection.provideDetailRepository()
        )
    ),
    cartViewModel: CartViewModel = androidx.lifecycle.viewmodel.compose.viewModel(
        factory = ViewModelCartListFactory(
            Injection.provideCartRepository()
        )
    )
) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(color = White2)
    ) {
        item {
            detailViewModel.uiState.collectAsState(initial = UiState.Loading).value.let { uiState ->
                when (uiState) {
                    is UiState.Loading -> {
                        detailViewModel.getById(id = id)
                    }
                    is UiState.Success -> {
                        BannerCourse(navController = navController, image = uiState.data.banner)
                        DetailCourse(
                            wishListViewModel = wishListViewModel,
                            cartViewModel = cartViewModel,
                            detail = uiState.data
                        )
                        Captain(captain = uiState.data.Captain)
                        Content(id = uiState.data.id, contentViewModel = contentViewModel)
                    }
                    is UiState.Error -> {

                    }
                }
            }
        }
    }
}

@Composable
fun BannerCourse(navController: NavController, image: String) {
    Box {
        AsyncImage(
            model = ImageRequest.Builder(LocalContext.current)
                .data(image)
                .crossfade(true).build(),
            contentDescription = "Image Profile",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp)
        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Button(
                onClick = {
                    navController.popBackStack()
                },
                colors = ButtonDefaults.buttonColors(containerColor = White, contentColor = Dark)
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        painter = painterResource(id = R.drawable.arrow_back),
                        contentDescription = "back"
                    )
                    Text(text = "Back")
                }
            }

            FilledIconButton(
                onClick = {
                    navController.navigate(Routes.Cart.routes)
                },
                colors = IconButtonDefaults.filledIconButtonColors(containerColor = White)
            ) {
                Icon(
                    modifier = Modifier.width(24.dp),
                    painter = painterResource(id = R.drawable.cart_shopping),
                    contentDescription = "Cart Page"
                )
            }
        }
    }
}

@Composable
fun DetailCourse(
    wishListViewModel: WishlistViewModel,
    cartViewModel: CartViewModel,
    detail: CourseModel
) {
    wishListViewModel.isAdded(detail.id)
    cartViewModel.isAdded(detail.id)
    val isWishlist by wishListViewModel.inWishlist.collectAsState()
    val isCartList by cartViewModel.inCartList.collectAsState()
    Card(
        modifier = Modifier.padding(horizontal = 20.dp, vertical = 20.dp),
        colors = CardDefaults.cardColors(containerColor = White)
    ) {
        Column(modifier = Modifier.padding(20.dp)) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = detail.category, style = MaterialTheme.typography.labelMedium.copy(
                        color = MaximumYellowRed,
                        fontWeight = FontWeight.SemiBold, fontSize = 12.sp
                    )
                )
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        modifier = Modifier
                            .width(10.dp)
                            .height(10.dp),
                        painter = painterResource(id = R.drawable.star_icon),
                        contentDescription = "Star", tint = MaximumYellowRed
                    )
                    Spacer(modifier = Modifier.width(5.dp))
                    Text(
                        text = detail.rating,
                        style = MaterialTheme.typography.labelMedium.copy(
                            color = Dark,
                            fontWeight = FontWeight.SemiBold, fontSize = 12.sp
                        )
                    )
                }
            }
            Spacer(modifier = Modifier.height(12.dp))
            Text(
                text = detail.title,
                style = MaterialTheme.typography.titleMedium.copy(
                    color = Dark,
                    fontSize = 13.sp,
                    fontWeight = FontWeight.SemiBold
                )
            )
            Spacer(modifier = Modifier.height(12.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row {
                    Info(label = "${detail.totalVideo} Videos", icon = R.drawable.play)
                    Spacer(modifier = Modifier.width(10.dp))
                    Info(label = detail.totalTime, icon = R.drawable.timer)
                }
                Price(isFree = false, price = "132K")
            }
            Spacer(modifier = Modifier.height(12.dp))
            ExpandedText(text = detail.desc)
            Spacer(modifier = Modifier.height(6.dp))
            Row(modifier = Modifier.fillMaxWidth()) {
                PrimaryOutlineButton(
                    modifier = Modifier.weight(1f),
                    label = if (isCartList) "Remove" else "Add to cart",
                    onClick = {
                        if (isCartList) {
                            cartViewModel.removeFromCartList(detail.id, price = detail.price)
                        } else {
                            cartViewModel.addToCartList(detail.id, price = detail.price)
                        }
                    }
                )
                Spacer(modifier = Modifier.width(5.dp))
                PrimaryOutlineButton(modifier = Modifier.weight(1f),
                    label = if (isWishlist) "Remove" else "Add to wishlist",
                    onClick = {
                        if (isWishlist) {
                            wishListViewModel.removeFromWishlist(detail.id)
                        } else {
                            wishListViewModel.addToWishlist(detail.id)
                        }
                    })
            }
        }
    }
}

@Composable
fun Info(label: String, icon: Int) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Icon(
            modifier = Modifier.width(12.dp),
            painter = painterResource(id = icon),
            contentDescription = "X"
        )
        Spacer(modifier = Modifier.width(5.dp))
        Text(
            text = label,
            style = MaterialTheme.typography.labelSmall.copy(
                color = Dark,
                fontSize = 12.sp,
                fontWeight = FontWeight.SemiBold,
                lineHeight = 0.sp
            )
        )
    }
}

@Composable
fun Captain(captain: CaptainModel) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp)
    ) {
        Text(
            text = "Captain",
            style = MaterialTheme.typography.bodyMedium.copy(fontWeight = FontWeight.SemiBold)
        )
        Spacer(modifier = Modifier.height(5.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                AsyncImage(
                    model = ImageRequest.Builder(LocalContext.current)
                        .data(captain.Image)
                        .crossfade(true)
                        .build(),
                    contentDescription = "Image Profile",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .clip(CircleShape)
                        .width(54.dp)
                        .height(54.dp)
                )
                Spacer(modifier = Modifier.width(10.dp))
                Column {
                    Text(
                        text = captain.Name,
                        style = MaterialTheme.typography.labelMedium.copy(
                            fontWeight = FontWeight.SemiBold,
                            fontSize = 13.sp
                        )
                    )
                    Text(
                        text = captain.Job,
                        style = MaterialTheme.typography.labelSmall.copy(
                            fontWeight = FontWeight.Normal,
                            fontSize = 10.sp
                        )
                    )
                }
            }

            Icon(
                modifier = Modifier.width(24.dp),
                painter = painterResource(id = R.drawable.comments),
                contentDescription = "Say hay to captain",
                tint = HonoluluBlue
            )
        }
    }
}

@Composable
fun Content(id: Int, contentViewModel: ContentViewModel) {
    val openId by contentViewModel.openId.collectAsState()
    contentViewModel.uiState.collectAsState(initial = UiState.Loading).value.let { uiState ->
        when (uiState) {
            is UiState.Loading -> {
                contentViewModel.getContent(id = id)
            }
            is UiState.Success -> {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 20.dp, vertical = 10.dp)
                ) {
                    Text(
                        text = "Course Content",
                        style = MaterialTheme.typography.bodyMedium.copy(fontWeight = FontWeight.SemiBold)
                    )
                    uiState.data.forEach { item ->
                        Accordion(itemModel = item, onClickItem = {
                            contentViewModel.setOpenId(item.Id)
                        }, expanded = openId == item.Id)

                        Spacer(modifier = Modifier.height(10.dp))
                    }
                }
            }
        }
    }
}