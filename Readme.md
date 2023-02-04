### ChatApp (Android Application)
#### MPOP Reverse II
----
# Introduction
> This is the android based application of chatapp project. In this project, I'm using Java as primary language, and uses http apache legacy, to connect to my api (chatapp). I only use AIDE, as IDE and conpiller for this android application.

---
### build.gradle
```Gradle
apply plugin: 'com.android.application'

android {
    compileSdkVersion 30
    buildToolsVersion "30.0.3"

    defaultConfig {
        applicationId "package name here"
        minSdkVersion 19
        targetSdkVersion 29
        versionCode 1
        versionName "1.0"
    }

    buildTypes {
        release {
            minifyEnabled false
            proguardFiles getDefaultProguardFile('proguard-android-optimize.txt'), 'proguard-rules.pro'
        }
    }
	useLibrary 'org.apache.http.legacy'
}

dependencies {
    implementation fileTree(dir: "libs", include: ["*.jar"])
}
```
---
