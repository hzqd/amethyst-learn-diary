plugins {
    kotlin("jvm") version "1.3.61"
    application
}

group = "org.github.hzqd.ikfr.tank-wars"
version = "0.0.1"

application {
    mainClassName = "com.github.hzqd.ikfr.tank.wars.AppKt"
}

repositories {
    jcenter()
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation("org.frice:engine:1.8.5")
    implementation("io.arrow-kt:arrow-core:0.10.4")
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
}