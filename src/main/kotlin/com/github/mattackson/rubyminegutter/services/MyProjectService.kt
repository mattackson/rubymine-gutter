package com.github.mattackson.rubyminegutter.services

import com.github.mattackson.rubyminegutter.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
