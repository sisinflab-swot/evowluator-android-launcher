buildscript {
    repositories {
        google()
        jcenter()
        
    }
    dependencies {
        classpath("com.android.tools.build:gradle:3.5.1")
    }
}

allprojects {
    repositories {
        google()
        jcenter()
    }
}

tasks{
    val clean by registering(Delete::class){
        delete(rootProject.buildDir)
    }
}

tasks.wrapper {
    gradleVersion = "5.6.2"
}
