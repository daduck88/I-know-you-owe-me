
package com.example.iknowyouoweme.presentation.feature.profile.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.iknowyouoweme.data.repository.ProfileRepositoryImpl
import com.example.iknowyouoweme.domain.usecase.profile.GetProfileUseCase
import com.example.iknowyouoweme.presentation.feature.profile.ProfileViewModel
import com.example.iknowyouoweme.presentation.feature.profile.model.ProfileState

@Composable
fun ProfileScreen(viewModel: ProfileViewModel) {
    val uiState by viewModel.uiState.collectAsState()

    LaunchedEffect(Unit) {
        viewModel.getProfile()
    }

    Column(modifier = Modifier.padding(16.dp)) {
        Text(text = "User: ${uiState.userName}")
        uiState.debts.forEach {
            Text(text = "${it.amount.amount} ${it.amount.currency}")
        }
    }
}

@Composable
fun ProfileScreen() {
    val viewModel = ProfileViewModel(GetProfileUseCase(ProfileRepositoryImpl()))
    ProfileScreen(viewModel)
}
