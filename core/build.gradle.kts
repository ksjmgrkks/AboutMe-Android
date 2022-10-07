plugins {
    id("com.android.library")
    kotlin("android")
}

android {
    namespace = "com.aboutme.core"
}

dependencies {
    implementation(ThirdPartyDependencies.timber)

    // Android Core
    implementation(AndroidXDependencies.coreKtx)
    implementation(AndroidXDependencies.appCompat)
    implementation(AndroidXDependencies.coroutines)
}
