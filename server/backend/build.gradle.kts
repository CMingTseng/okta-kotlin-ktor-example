plugins {
    application
    kotlin("jvm")
}

group = "com.okta.demo.ktor"
version = "0.0.1"

application {
    mainClassName = "io.ktor.server.cio.EngineMain"
}

dependencies {
    implementation(kotlin("stdlib-jdk8", project.extra["kotlin_version"].toString()))
    implementation("ch.qos.logback:logback-classic:${project.extra["logback_version"].toString()}")
    implementation("io.ktor:ktor-server-cio:${project.extra["ktor_version"].toString()}")
    implementation("io.ktor:ktor-server-core:${project.extra["ktor_version"].toString()}")
    implementation("io.ktor:ktor-client-cio:${project.extra["ktor_version"].toString()}")
    implementation("io.ktor:ktor-html-builder:${project.extra["ktor_version"].toString()}")
    implementation("io.ktor:ktor-server-host-common:${project.extra["ktor_version"].toString()}")
    implementation("io.ktor:ktor-server-sessions:${project.extra["ktor_version"].toString()}")
    implementation("io.ktor:ktor-auth:${project.extra["ktor_version"].toString()}")
    implementation("com.okta.jwt:okta-jwt-verifier:${project.extra["okta_jwt_verifier_version"].toString()}")
    implementation("com.okta.jwt:okta-jwt-verifier-impl:${project.extra["okta_jwt_verifier_version"].toString()}")
}


