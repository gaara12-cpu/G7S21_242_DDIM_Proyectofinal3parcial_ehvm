plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "mx.edu.tesoem.isc.g7s21_242_ddim_proyectofinal3parcial_ehvm"
    compileSdk = 34

    defaultConfig {
        applicationId = "mx.edu.tesoem.isc.g7s21_242_ddim_proyectofinal3parcial_ehvm"
        minSdk = 27
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    // Dependencias básicas de Android
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    implementation (libs.gms.play.services.maps)
    implementation (libs.play.services.location)
    implementation (libs.volley)
    implementation (libs.gms.play.services.maps)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}
