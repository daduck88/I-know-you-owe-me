
package com.example.iknowyouoweme.domain.usecase.profile

import com.example.iknowyouoweme.data.repository.ProfileRepository
import com.example.iknowyouoweme.domain.model.Amount
import com.example.iknowyouoweme.domain.model.Debt
import com.example.iknowyouoweme.presentation.feature.profile.model.ProfileState

class GetProfileUseCase(private val profileRepository: ProfileRepository) {
    fun execute(): ProfileState {
        val profile = profileRepository.getProfile()
        val totalDebtsByCurrency = profile.debts
            .groupBy { it.amount.currency }
            .mapValues { (_, debts) -> debts.sumOf { it.amount.amount.toDouble() }.toFloat() }
            .map { (currency, total) -> Debt(currency.name, Amount(total, currency)) }

        return profile.copy(debts = totalDebtsByCurrency)
    }
}
