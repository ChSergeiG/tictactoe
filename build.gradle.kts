plugins {
    id("org.jetbrains.kotlin.jvm") version "1.8.22" apply false
    id("org.jetbrains.kotlin.plugin.allopen") version "1.8.22" apply false
    id("com.google.devtools.ksp") version "1.8.22-1.0.11" apply false
    id("com.github.johnrengelman.shadow") version "8.1.1" apply false
    id("io.micronaut.application") version "4.0.4" apply false
    id("io.micronaut.aot") version "4.0.4" apply false
}

allprojects {
    repositories {
        mavenCentral()
    }
}
