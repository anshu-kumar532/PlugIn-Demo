package com.github.anshukumar532.plugindemo.services

import com.github.anshukumar532.plugindemo.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
