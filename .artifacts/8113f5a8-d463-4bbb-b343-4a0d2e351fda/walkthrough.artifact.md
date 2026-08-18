# Walkthrough - Build and Manifest Fixes

I have fixed the build errors related to SDK version mismatches and manifest duplication.

## Changes Made

### Build Configuration
- Updated `targetSdk` to **37** in [build.gradle.kts](file:///media/androidboy/Media/University/Kelaniya/Study/Level%202/Semester%202/INTE%2022283%20-%20Mobile%20Applications%20Development/Lab/Lab%205%20%20-%20Activity/QuickCart/app/build.gradle.kts) to align with the `compileSdk` and dependency requirements.

### Android Manifest
- Cleaned up [AndroidManifest.xml](file:///media/androidboy/Media/University/Kelaniya/Study/Level%202/Semester%202/INTE%2022283%20-%20Mobile%20Applications%20Development/Lab/Lab%205%20%20-%20Activity/QuickCart/app/src/main/AndroidManifest.xml) by removing duplicate `<activity>` tags for `SignUpActivity`, `SettingsActivity`, and `CheckoutActivity`.

## Verification Results

### Automated Tests
- Ran `./gradlew assembleDebug` and the build finished **successfully**.

> [!NOTE]
> The app is now ready for deployment. The primary activity remains `SignUpActivity`.
