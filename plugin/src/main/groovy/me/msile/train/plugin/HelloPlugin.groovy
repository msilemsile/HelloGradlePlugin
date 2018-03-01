package me.msile.train.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

class HelloPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        project.extensions.add("HelloPluginExt", HelloPluginExt)
        project.task('hello').doLast {
            HelloPluginExt ext = project.HelloPluginExt
            println ext.hello
        }
    }
}
