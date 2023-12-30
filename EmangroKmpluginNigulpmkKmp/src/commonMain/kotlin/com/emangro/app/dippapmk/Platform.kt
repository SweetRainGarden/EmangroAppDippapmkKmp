package com.emangro.app.dippapmk

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform