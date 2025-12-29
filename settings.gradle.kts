pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

rootProject.name = "Laborator04"

// Include solutions (Java) projects
include(":solutions-contacts-manager-app")
project(":solutions-contacts-manager-app").projectDir = file("solutions/ContactsManager/app")

include(":solutions-phone-dialer-app")
project(":solutions-phone-dialer-app").projectDir = file("solutions/PhoneDialer/app")

// Include solutions-Kotlin projects
include(":solutions-kotlin-contacts-manager-app")
project(":solutions-kotlin-contacts-manager-app").projectDir = file("solutions-Kotlin/ContactsManager/app")

include(":solutions-kotlin-phone-dialer-app")
project(":solutions-kotlin-phone-dialer-app").projectDir = file("solutions-Kotlin/PhoneDialer/app")
