package com.mike.composition.domain.entity

data class GameResult(
    val winner: Boolean,
    val countOfRightAnswers: Int,
    val countOfRQuestions: Int,
    val gameSettings: GameSettings
)