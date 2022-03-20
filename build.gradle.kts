import org.jetbrains.kotlin.daemon.common.findPortAndCreateRegistry
import org.jetbrains.kotlin.gradle.targets.js.webpack.KotlinWebpackConfig

plugins {
    kotlin("js") version "1.6.10"
}

group = "com.oyosite.ticon"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://maven.pkg.jetbrains.space/public/p/kotlinx-html/maven")
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("org.jetbrains.kotlinx:kotlinx-html:0.7.2")
}

kotlin {
    js(IR) {
        binaries.executable()
        browser {
            runTask {
                devServer = devServer?.copy(port=3000)
            }
            commonWebpackConfig {
                cssSupport.enabled = true
            }
            //findPortAndCreateRegistry(9, 8081, 8090)
        }
    }
}