// Top-level build file where you can add configuration options common to all sub-projects/modules.
// AGP 9 compiles Kotlin itself (built-in Kotlin), so no separate kotlin-gradle-plugin is needed.
buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:9.4.0")
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.layout.buildDirectory)
}
