package com.mike.composition.domain.usecases

import com.mike.composition.domain.entity.GameSettings
import com.mike.composition.domain.entity.Level
import com.mike.composition.domain.repository.GameRepository

class GetGameSettingsUseCase(private val repository: GameRepository) {
    operator fun invoke(level: Level): GameSettings {
        return repository.getGameSettings(level)
    }
}