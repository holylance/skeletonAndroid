package com.jasonyoo.choco.util

/**
 * Runs the block if object is null.
 */
inline fun <T> T?.ifNull(block: () -> Unit): T? {
    if (this == null) block()
    return this
}
