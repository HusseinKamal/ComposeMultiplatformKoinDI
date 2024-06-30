This is a Kotlin Multiplatform project targeting Android, iOS, Desktop.
Here we used Koin dependency injection in Android, iOS, Desktop.
* `/composeApp` is for code that will be shared across your Compose Multiplatform applications.
  It contains several subfolders:
  - `commonMain` is for code that’s common for all targets.
  - Other folders are for Kotlin code that will be compiled for only the platform indicated in the folder name.
    For example, if you want to use Apple’s CoreCrypto for the iOS part of your Kotlin app,
    `iosMain` would be the right folder for such calls.

* `/iosApp` contains iOS applications. Even if you’re sharing your UI with Compose Multiplatform, 
  you need this entry point for your iOS app. This is also where you should add SwiftUI code for your project.


Learn more about [Kotlin Multiplatform](https://www.jetbrains.com/help/kotlin-multiplatform-dev/get-started.html)…
- Android Screenshot
![AndroidScreen](https://github.com/HusseinKamal/ComposeMultiplatformKoinDI/assets/29864161/e6b2b96b-2279-4023-870f-4ab198dc6dd1)

- Desktop
<img width="801" alt="DsktopScreen" src="https://github.com/HusseinKamal/ComposeMultiplatformKoinDI/assets/29864161/9ddf457b-5df9-4ef5-9453-9f9e5c9acb1b">

