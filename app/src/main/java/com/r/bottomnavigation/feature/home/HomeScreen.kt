package com.r.bottomnavigation.feature.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.r.bottomnavigation.R
import com.r.bottomnavigation.ui.theme.Color_Transp_1
import com.r.bottomnavigation.ui.theme.Icon_color
import com.r.bottomnavigation.ui.theme.Text_color
import com.ramcosta.composedestinations.annotation.Destination

@Destination(start = true)
@Composable
fun HomeScreen(
) {

    var text by remember { mutableStateOf("Search Your Topic..") }


    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 16.dp, start = 12.dp, end = 12.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        TextField(
            value = text,
            onValueChange = { text = it },
            colors = TextFieldDefaults.textFieldColors(
                textColor = Text_color,
                disabledTextColor = Color.Transparent,
                backgroundColor = Color_Transp_1,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                disabledIndicatorColor = Color.Transparent
            ),
            leadingIcon = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_search),
                    contentDescription = "search",
                    tint = Icon_color

                )
            },
            trailingIcon = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_voice),
                    contentDescription = "voice",
                    tint = Icon_color
                )
            },
            modifier = Modifier
                .height(height = 54.dp)
                .fillMaxWidth()
                .graphicsLayer {
                    shape = RoundedCornerShape(
                        50
                    )
                    clip = true
                }
        )


    }


}