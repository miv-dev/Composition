package com.mike.composition.domain.repository

import com.mike.composition.domain.entity.GameSettings
import com.mike.composition.domain.entity.Level
import com.mike.composition.domain.entity.Question

interface GameRepository {
    fun generateQuestion(
        maxSumValue: Int,
        countOfOptions: Int
    ): Question
    fun getGameSettings(level: Level): GameSettings
}