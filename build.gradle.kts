buildscript {
    val ktor_version: String by project
    val kotlin_version: String by project
    val logback_version: String by project
    val okta_jwt_verifier_version: String by project
    extra.apply {
        set("kotlin_version", kotlin_version)
        set("ktor_version", ktor_version)
        set("logback_version", logback_version)
        set("okta_jwt_verifier_version", okta_jwt_verifier_version)
    }
    repositories {
        mavenLocal()
        mavenCentral()
        jcenter()
        maven { url = uri("https://kotlin.bintray.com/ktor") }
        gradlePluginPortal()
        google()
    }

    dependencies {
        classpath(kotlin("gradle-plugin", rootProject.extra["kotlin_version"].toString()))
    }
}

subprojects{
    repositories {
        mavenLocal()
        mavenCentral()
        jcenter()
        maven { url = uri("https://kotlin.bintray.com/ktor") }
        gradlePluginPortal()
        google()
    }
}

