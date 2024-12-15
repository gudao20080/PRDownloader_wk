@file:Suppress("UnstableApiUsage")

pluginManagement {
    repositories {
        maven { setUrl("https://maven.aliyun.com/repository/public") }
        maven { setUrl("https://maven.aliyun.com/repository/google") }
        maven { setUrl("https://maven.aliyun.com/repository/releases") }
        maven { setUrl("https://maven.aliyun.com/repository/gradle-plugin") }
        maven { setUrl( "https://maven.aliyun.com/repository/gradle") }
        maven { setUrl("https://repo.huaweicloud.com/repository/maven/") }
        maven { setUrl("https://jitpack.io") }

        google()
        mavenCentral()
        gradlePluginPortal()

//        maven { setUrl("https://chaquo.com/maven") }
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven { setUrl("https://jitpack.io") }
    }
}

rootProject.name = "prdownloader_wk"
include(":app")
include(":prdownloader")
