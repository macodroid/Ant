package com.example.ant.data

// exercise -> name, List<Progress>
// progress -> reps, weighs

data class Exercise(
    val id: Long,
    val name: String,
    val sets: List<ExerciseSet>
)

