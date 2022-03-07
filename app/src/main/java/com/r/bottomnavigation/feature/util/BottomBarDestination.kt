package com.r.bottomnavigation.feature.util

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.ui.graphics.vector.ImageVector
import com.r.bottomnavigation.R
import com.r.bottomnavigation.feature.destinations.CartScreenDestination
import com.r.bottomnavigation.feature.destinations.FavoriteScreenDestination
import com.r.bottomnavigation.feature.destinations.HomeScreenDestination
import com.r.bottomnavigation.feature.destinations.ProfileScreenDestination
import com.ramcosta.composedestinations.spec.DirectionDestinationSpec

enum class BottomBarDestination(
    val direction: DirectionDestinationSpec,
    val icon: Int,
    val label: String
) {

    Home(HomeScreenDestination, R.drawable.ic_home, "Home"),
    Favorite(FavoriteScreenDestination, R.drawable.ic_heart, "Favorite"),
    Cart(CartScreenDestination, R.drawable.ic_credit_card, "Favorite"),
    Profile(ProfileScreenDestination, R.drawable.ic_person, "Profile"),


}