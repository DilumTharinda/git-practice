# Implementation Plan - Update UI to Match Design PDFs

The user wants to update the application's interface to match the designs provided in `Sign Up.pdf`, `Settings.pdf`, and `Checkout.pdf`. The new design features a clean, Material-based look with a teal primary color and specific layout structures.

## User Review Required

> [!IMPORTANT]
> The UI will be updated using Material Design 3 components where appropriate (e.g., `TextInputLayout` for outlined fields). This will change the look and feel from standard `EditText` to modern outlined boxes.

## Proposed Changes

### Resources

#### [MODIFY] [colors.xml](file:///media/androidboy/Media/University/Kelaniya/Study/Level%202/Semester%202/INTE%2022283%20-%20Mobile%20Applications%20Development/Lab/Lab%205%20%20-%20Activity/QuickCart/app/src/main/res/values/colors.xml)
- Add `primary_teal` (`#1A6361`) and `divider_grey` (`#E0E0E0`).

#### [MODIFY] [themes.xml](file:///media/androidboy/Media/University/Kelaniya/Study/Level%202/Semester%202/INTE%2022283%20-%20Mobile%20Applications%20Development/Lab/Lab%205%20%20-%20Activity/QuickCart/app/src/main/res/values/themes.xml)
- Set `colorPrimary` to `@color/primary_teal`.
- Define styles for `PrimaryButton` and `SectionHeader`.

### Layouts

#### [MODIFY] [activity_sign_up.xml](file:///media/androidboy/Media/University/Kelaniya/Study/Level%202/Semester%202/INTE%2022283%20-%20Mobile%20Applications%20Development/Lab/Lab%205%20%20-%20Activity/QuickCart/app/src/main/res/layout/activity_sign_up.xml)
- Add "Sign Up" title.
- Wrap input fields in outlined `TextInputLayout`.
- Style the "Create Account" button with teal background and rounded corners.
- Improve vertical spacing.

#### [MODIFY] [activity_settings.xml](file:///media/androidboy/Media/University/Kelaniya/Study/Level%202/Semester%202/INTE%2022283%20-%20Mobile%20Applications%20Development/Lab/Lab%205%20%20-%20Activity/QuickCart/app/src/main/res/layout/activity_settings.xml)
- Add "Settings" title.
- Group items under "Account", "Preferences", and "Support" headers.
- Add horizontal dividers between list items.
- Style the "Continue to Checkout" button.

#### [MODIFY] [activity_checkout.xml](file:///media/androidboy/Media/University/Kelaniya/Study/Level%202/Semester%202/INTE%2022283%20-%20Mobile%20Applications%20Development/Lab/Lab%205%20%20-%20Activity/QuickCart/app/src/main/res/layout/activity_checkout.xml)
- Style the item name and price.
- Redesign the quantity control to match the PDF (Minus button, Quantity, Plus button in a row).
- Use outlined/square buttons for quantity adjustment.
- Style the "Pay Now" button at the bottom.

## Verification Plan

### Automated Tests
- Run `gradlew assembleDebug` to ensure layouts compile correctly.

### Manual Verification
- Deploy the app to verify the visual appearance matches the PDFs.
- Verify that interactivity (button clicks, input validation, quantity adjustment) still works as expected.
