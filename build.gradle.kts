// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
//    id("com.android.application") version "8.4.0" apply false
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.jb.kotlin.android) apply false
//    id("org.jetbrains.kotlin.android") version "2.0.0-RC1" apply false
//    id ("com.chaquo.python") version "15.0.1" apply false
    alias(libs.plugins.compose.compiler) apply false
    id("com.google.devtools.ksp") version "2.0.0-RC2-1.0.20"
    alias(libs.plugins.android.library) apply false
    id("androidx.room") version "2.6.1" apply false
}