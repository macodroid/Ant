package com.example.ant.data


// SMELL create string in res/values/strings.xml
fun exercises(): List<Exercise> {
    return listOf(
        Exercise(
            id = 1,
            name = "Bench press",
            sets = listOf(
                ExerciseSet(
                    reps = 10,
                    weight = 30
                ),
                ExerciseSet(
                    reps = 10,
                    weight = 40
                ),
                ExerciseSet(
                    reps = 10,
                    weight = 50
                ),
                ExerciseSet(
                    reps = 10,
                    weight = 60
                ),
            )
        ),
        Exercise(
            id = 2,
            name = "Pull ups",
            sets = listOf(
                ExerciseSet(
                    reps = 5,
                    weight = 0
                ),
                ExerciseSet(
                    reps = 5,
                    weight = 0
                ),
                ExerciseSet(
                    reps = 5,
                    weight = 0
                ),
                ExerciseSet(
                    reps = 5,
                    weight = 0
                ),
            )
        ),
        Exercise(
            id = 3,
            name = "Standing shoulder press dumbbells",
            sets = listOf(
                ExerciseSet(
                    reps = 10,
                    weight = 10
                ),
                ExerciseSet(
                    reps = 10,
                    weight = 10
                ),
                ExerciseSet(
                    reps = 10,
                    weight = 10
                ),
                ExerciseSet(
                    reps = 10,
                    weight = 10
                ),
            )
        ),
        Exercise(
            id = 1,
            name = "Dips",
            sets = listOf(
                ExerciseSet(
                    reps = 5,
                    weight = 0
                ),
                ExerciseSet(
                    reps = 5,
                    weight = 0
                ),
                ExerciseSet(
                    reps = 5,
                    weight = 0
                ),
                ExerciseSet(
                    reps = 5,
                    weight = 0
                ),
            )
        ),
    )
}