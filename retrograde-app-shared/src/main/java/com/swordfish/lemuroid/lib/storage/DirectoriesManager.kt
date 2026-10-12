package com.swordfish.lemuroid.lib.storage

import android.content.Context
import java.io.File
import android.os.Environment

class DirectoriesManager(private val appContext: Context) {
    @Deprecated("Use the external states directory")
    fun getInternalStatesDirectory(): File =
        File(appContext.filesDir, "states").apply {
            mkdirs()
        }

    fun getCoresDirectory(): File =
        File(appContext.filesDir, "cores").apply {
            mkdirs()
        }

    fun getSystemDirectory(): File =
        File(appContext.filesDir, "system").apply {
            mkdirs()
        }

    fun getStatesDirectory(): File =
        File(dataDirectory, "states").apply { mkdirs() }

    fun getStatesPreviewDirectory(): File =
        File(dataDirectory, "state-previews").apply { mkdirs() }

    fun getSavesDirectory(): File =
        File(dataDirectory, "saves").apply { mkdirs() }

    fun getInternalRomsDirectory(): File =
        File(appContext.getExternalFilesDir(null), "roms").apply {
            mkdirs()
        }

    private val dataDirectory: File by lazy {
        File(Environment.getExternalStorageDirectory(), "LemuroidData")
    }
}
