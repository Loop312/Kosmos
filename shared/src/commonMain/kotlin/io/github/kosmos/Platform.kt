package io.github.kosmos

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform