package com.example.todolist.domain.model

import com.example.todolist.presentation.widget.PokemonType

data class PokemonDetail(
    val name: String,
    val index: Int,
    val image: String,
    val types: List<PokemonType>,
    val weight: Double,
    val height: Double,
    val moves: List<String>,
    val description: String,
    val statsList: List<Stats>
)

data class Stats(
    val name: String,
    val value: Int
)