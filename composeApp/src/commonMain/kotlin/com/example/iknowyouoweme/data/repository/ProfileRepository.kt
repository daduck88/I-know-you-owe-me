
package com.example.iknowyouoweme.data.repository

import com.example.iknowyouoweme.presentation.feature.profile.model.ProfileState

interface ProfileRepository {
    fun getProfile(): ProfileState
}
