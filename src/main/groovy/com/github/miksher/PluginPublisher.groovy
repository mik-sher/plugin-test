package com.github.miksher

import org.gradle.api.Plugin
import org.gradle.api.Project
import net.researchgate.release.ReleasePlugin
import org.jfrog.gradle.plugin.artifactory.ArtifactoryPlugin

class PluginPublisher implements Plugin<Project> {
    @Override
    void apply(Project project) {
        project.plugins.apply(ReleasePlugin)
        project.plugins.apply(ArtifactoryPlugin)
    }
}
