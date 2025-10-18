package com.tafreshiali.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.tafreshiali.theme.MusifyTheme

@Composable
internal fun BaseEmptyStateScreen(
    modifier: Modifier = Modifier,
    title: @Composable () -> Unit,
    description: @Composable () -> Unit,
    action: (@Composable () -> Unit)? = null,
) {
    Column(
        modifier = modifier.fillMaxSize().background(color = MusifyTheme.colorScheme.background),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        title()
        Spacer(modifier = Modifier.height(12.dp))
        description()
        action?.let { actionComponent ->
            Spacer(modifier = Modifier.height(16.dp))
            actionComponent()
        }
    }
}