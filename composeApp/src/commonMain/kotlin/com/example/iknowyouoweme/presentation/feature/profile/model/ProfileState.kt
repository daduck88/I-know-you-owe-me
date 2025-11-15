
package com.example.iknowyouoweme.presentation.feature.profile.model

import com.example.iknowyouoweme.domain.model.Debt

data class ProfileState(
    val userName: String = "",
    val debts: List<Debt> = emptyList()
)
