package com.jasonyoo.choco.network

import java.util.logging.Level
import java.util.logging.Logger
import okhttp3.mockwebserver.MockResponse
import okhttp3.mockwebserver.MockWebServer

fun MockWebServer.enqueueSilently(response: MockResponse) {
    Logger.getLogger(this::class.java.name).level = Level.WARNING
    enqueue(response)
}
