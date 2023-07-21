package com.logichexa.logicbrain1.domain.use_case.upgrade

import com.logichexa.logicbrain1.domain.repository.PreferenceRepository
import javax.inject.Inject

class IsProVersionUseCase @Inject constructor(
    private val preferenceRepository: PreferenceRepository
) {
    operator fun invoke() = preferenceRepository.isProVersion()
}