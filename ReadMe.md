# Welcome to Pagination!
We use it to display list of data. And this list in some cases can be huge, in-fact so huge. Consider any OTT application, you see a list of movies or media files; and this list may contain thousands of items



# Dependencies

 #used dependencies
 for text sizes
 //size library  
implementation 'com.intuit.sdp:sdp-android:1.0.6'  
implementation 'com.intuit.ssp:ssp-android:1.0.6'  

kotlin Coroutines  
// Coroutines  
implementation 'org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.1'  
implementation 'org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.1'  
implementation 'androidx.navigation:navigation-fragment-ktx:2.4.2'  
implementation 'androidx.navigation:navigation-ui-ktx:2.4.2'  


// Architectural Components  
implementation "androidx.lifecycle:lifecycle-viewmodel-ktx:2.4.1"  
implementation "androidx.lifecycle:lifecycle-runtime-ktx:2.4.1"  
implementation "androidx.lifecycle:lifecycle-livedata-ktx:2.4.1"  
implementation "androidx.activity:activity-ktx:1.4.0"  
implementation "androidx.fragment:fragment-ktx:1.4.1"  


//Retrofit  
implementation "com.squareup.retrofit2:retrofit:2.9.0"  
implementation "com.squareup.retrofit2:converter-gson:2.9.0"  
implementation "com.squareup.okhttp3:logging-interceptor:4.9.3"  
implementation "com.google.code.gson:gson:2.9.0"  


//Hilt  
implementation "com.google.dagger:hilt-android:2.39.1"  
implementation 'com.google.firebase:firebase-database:20.0.5'  
implementation 'com.google.firebase:firebase-messaging:23.0.5'  
kapt "com.google.dagger:hilt-android-compiler:2.39.1"  
implementation "androidx.hilt:hilt-lifecycle-viewmodel:1.0.0-alpha03"  
kapt "androidx.hilt:hilt-compiler:1.0.0"  

//coil image library  
implementation("io.coil-kt:coil:2.1.0")  

// Android Jetpack Paging 3.0  
implementation "androidx.paging:paging-runtime:3.2.0-alpha01"


# view binding 
buildFeatures {  
  viewBinding true  
  dataBinding true  
} 

# plugins
plugins {  
  id 'com.android.application'  
  id 'org.jetbrains.kotlin.android'  
  id 'kotlin-kapt'  
  id 'androidx.navigation.safeargs'  
}  

# build.gradle

buildscript {  
  
  dependencies {  
  classpath 'com.google.dagger:hilt-android-gradle-plugin:2.40.1'  
  classpath("androidx.navigation:navigation-safe-args-gradle-plugin:2.4.2")  
  }  
} 
 
<img width="190"  src="https://github.com/Mr-Sarath/My_Pagination/blob/master/sample%20pictures/Screenshot_20220621_143637.jpg"><br>
