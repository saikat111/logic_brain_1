package com.logichexa.logicbrain1.domain.use_case.profile

import com.logichexa.logicbrain1.domain.repository.PreferenceRepository
import javax.inject.Inject

class SetDarkModeUseCase @Inject constructor(
    private val preferenceRepository: PreferenceRepository
) {
    operator fun invoke(isDarkMode: Boolean) = preferenceRepository.setDarkMode(isDarkMode)
}
