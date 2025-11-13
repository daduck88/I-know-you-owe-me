package com.daduck.iknowyouowe

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform