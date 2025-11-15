
package com.example.iknowyouoweme.data.repository

import com.example.iknowyouoweme.domain.model.Amount
import com.example.iknowyouoweme.domain.model.Currency
import com.example.iknowyouoweme.domain.model.Debt
import com.example.iknowyouoweme.presentation.feature.profile.model.ProfileState

class ProfileRepositoryImpl : ProfileRepository {
    override fun getProfile(): ProfileState {
        return ProfileState(
            userName = "John Doe",
            debts = listOf(
                Debt("1", Amount(100f, Currency.USD)),
                Debt("2", Amount(200f, Currency.EUR)),
                Debt("3", Amount(50f, Currency.USD))
            )
        )
    }
}
