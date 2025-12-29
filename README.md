# Laborator04

## Project Setup

This project has been configured as a multi-project Android Gradle workspace with separate run configurations for solutions (Java) and solutions-Kotlin projects, each containing ContactsManager and PhoneDialer applications.

## Project Structure

Four separate Android applications:
- solutions/ContactsManager (Java)
- solutions/PhoneDialer (Java)
- solutions-Kotlin/ContactsManager (Kotlin)
- solutions-Kotlin/PhoneDialer (Kotlin)

## Configuration Details

### Multi-Project Gradle Configuration
- Root-level settings.gradle.kts configures four projects as separate submodules
- Root-level build.gradle.kts with common plugin configuration
- Gradle wrapper files copied to root for unified build management

### Version Control Cleanup
- Comprehensive .gitignore with Android project rules
- Removed local.properties, build directories, and .iml files

### UI Layout Improvements
- PhoneDialer: Centered EditText and GridLayout with proper padding
- ContactsManager: Added consistent padding to form layouts

## Usage

### Build Projects
```bash
./gradlew :solutions-contacts-manager-app:build
./gradlew :solutions-phone-dialer-app:build
./gradlew :solutions-kotlin-contacts-manager-app:build
./gradlew :solutions-kotlin-phone-dialer-app:build
```

### View Project Structure
```bash
./gradlew projects
```

## Result
✅ Multi-project Gradle workspace configured
✅ Four separate run configurations
✅ Clean version control setup
✅ Improved UI layouts
✅ All projects build successfully
