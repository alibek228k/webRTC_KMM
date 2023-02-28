package com.example.testwebrtc

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform