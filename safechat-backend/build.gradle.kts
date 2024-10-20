plugins {
    alias(libs.plugins.kotlin.jvm)
    id("test-plugin") apply true
}

group = "com.nickz.safechat"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(libs.kotlin.test)
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(17)
}