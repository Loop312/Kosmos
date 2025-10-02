package io.github.kosmos.model

data class Project(
    val id: String,
    val name: String,
    val description: String,
    val startDate: String,
    val endDate: String,
    val status: String,
    val priority: String,
    val budget: Double,
    val createdAt: String,
    val updatedAt: String,
)