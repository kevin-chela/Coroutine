plugins {
    kotlin("jvm") version "2.0.0"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.4") // Make sure to use the latest version
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}