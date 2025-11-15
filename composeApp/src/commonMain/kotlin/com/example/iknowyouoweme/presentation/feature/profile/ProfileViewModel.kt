
package com.example.iknowyouoweme.presentation.feature.profile

import com.example.iknowyouoweme.domain.usecase.profile.GetProfileUseCase
import com.example.iknowyouoweme.presentation.feature.profile.model.ProfileState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class ProfileViewModel(private val getProfileUseCase: GetProfileUseCase) {

    private val _uiState = MutableStateFlow(ProfileState())
    val uiState: StateFlow<ProfileState> = _uiState

    fun getProfile() {
        _uiState.value = getProfileUseCase.execute()
    }
}
