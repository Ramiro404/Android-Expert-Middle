// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    id("com.google.dagger.hilt.android") version "2.56.2" apply false
    //id("com.google.dagger.hilt.android") version "2.56.2" apply false
   // id("com.google.devtools.ksp") version "1.8"
//    id("com.google.dagger.hilt.android") version "2.56" apply false
    //kotlin("android") version "2.1.10" apply false
    kotlin("kapt") version "2.1.10" apply false
    id("androidx.navigation.safeargs.kotlin") version "2.7.1" apply false
}