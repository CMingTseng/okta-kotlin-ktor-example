buildscript {
    repositories {
        mavenLocal()
        mavenCentral()
        jcenter()
        maven { url = uri("https://kotlin.bintray.com/ktor") }
        gradlePluginPortal()
        google()
    }

    dependencies {

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

