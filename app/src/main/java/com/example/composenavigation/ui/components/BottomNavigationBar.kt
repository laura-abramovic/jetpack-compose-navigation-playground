package com.example.composenavigation.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.size
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.composenavigation.model.BottomNavigationItemState
import com.example.composenavigation.model.BottomNavigationItem
import com.example.composenavigation.ui.theme.DarkGray
import com.example.composenavigation.ui.theme.LightGray
import com.example.composenavigation.ui.theme.Orange

@Composable
fun BottomNavigationBar(
    items: List<BottomNavigationItemState>,
    onItemClick: (BottomNavigationItem) -> Unit
) {
    BottomNavigation(
        backgroundColor = DarkGray,
        contentColor = LightGray,
        modifier = Modifier
            .background(DarkGray)
            .navigationBarsPadding()
    ) {
        items.forEach { itemState ->
            BottomNavigationItem(
                icon = {
                    Icon(
                        imageVector = itemState.item.icon,
                        contentDescription = null,
                        modifier = Modifier.size(32.dp)
                    )
                },
                selected = itemState.isSelected,
                onClick = { onItemClick(itemState.item) },
                selectedContentColor = Orange,
                unselectedContentColor = LightGray
            )
        }
    }
}
