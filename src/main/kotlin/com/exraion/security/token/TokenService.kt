package com.exraion.security.token

import com.exraion.security.token.TokenClaim
import com.exraion.security.token.TokenConfig
import io.ktor.server.application.*

interface TokenService {
    fun generate(
        config: TokenConfig,
        vararg claims: TokenClaim
    ): String

    suspend fun Application.invalidate(token: String, saveToDb: suspend String.() -> Unit)
}