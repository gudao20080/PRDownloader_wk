plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-parcelize")
    id("com.google.devtools.ksp")
//    id("com.chaquo.python")
//    kotlin("jvm") version "2.0.0-RC3" // or kotlin("multiplatform") or any other kotlin plugin
//    kotlin("plugin.serialization") version "2.0.0-RC1"
    alias(libs.plugins.compose.compiler)
    alias(libs.plugins.jb.serialization)
}

android {
    namespace = "com.sample"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.sample"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }

        ndk {
            abiFilters.add("arm64-v8a")
            abiFilters.add("x86_64")
        }
    }


    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
//    composeOptions {
//        kotlinCompilerExtensionVersion = "1.5.14"
//    }

    composeCompiler {
    }

    packaging {
        jniLibs {
            useLegacyPackaging = true
        }

        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.navigation.compose)
    implementation(libs.navigation.ui.ktx)
    implementation(libs.androidx.work.runtime.ktx)
    val composeBom = platform("androidx.compose:compose-bom:2024.05.00")

    implementation(composeBom)
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    // Optional - Add window size utils
    implementation(libs.androidx.material3.windowSizeClass)
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(libs.androidx.runtime.livedata)

    androidTestImplementation(composeBom)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(libs.androidx.ui.test.junit4)
//    debugImplementation(libs.androidx.ui.tooling)
//    debugImplementation(libs.androidx.ui.test.manifest)
    debugImplementation(libs.bundles.compose.ui.debug)

    implementation(libs.androidx.constraintlayout.compose)

//    implementation(libs.coil.compose)
//    implementation(libs.xxpermissions)
//    implementation(libs.motiontoast)
//    implementation(libs.utilcodex)
//    implementation(libs.kittinunf.result) //for JVM support

    // define a BOM and its version
//    implementation(platform("com.squareup.okhttp3:okhttp-bom:4.12.0"))
//    implementation("com.squareup.okhttp3:okhttp")
//    implementation("com.squareup.okhttp3:logging-interceptor")

//    implementation(libs.kotlinx.serialization.json)

//    implementation(libs.youtubedl.library)
    implementation(project(":prdownloader"))

//    annotationProcessor(libs.androidx.room.compiler)
//    implementation(libs.androidx.room.runtime)
//    ksp(libs.androidx.room.compiler)

//    implementation(libs.mmkv)
//    implementation(project(":ytdlpwrapperlibrary"))
}