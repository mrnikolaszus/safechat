package org.nickz.safechat.plugins

import org.gradle.api.Plugin
import org.gradle.api.Project

@Suppress("unused")
internal class TestPrintPlugin : Plugin<Project> {

    override fun apply(project: Project) {
        println("Test Plugin Activated")
    }
}