package com.github.hellcheg.typeannotationsrefactor.services

import com.intellij.openapi.project.Project
import com.github.hellcheg.typeannotationsrefactor.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
