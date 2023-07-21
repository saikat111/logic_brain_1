package com.logichexa.logicbrain1.domain.use_case.upgrade

import com.logichexa.logicbrain1.domain.repository.PreferenceRepository
import javax.inject.Inject

class SetFirstTimeUseCase @Inject constructor(
    private val preferenceRepository: PreferenceRepository
) {
    operator fun invoke(isFirstTime: Boolean) = preferenceRepository.setFirstTime(isFirstTime)
}
