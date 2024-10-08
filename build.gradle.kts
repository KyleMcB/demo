plugins {
    kotlin("jvm") version "2.0.20"
    application
}
application {
    mainClass.set("com.xingpeds.MainKt")
}
group = "com.xingpeds"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(19)
}