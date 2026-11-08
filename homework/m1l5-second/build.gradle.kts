plugins {
    kotlin("jvm")
}

dependencies{
    implementation(kotlin("stdlib-jdk8"))
    testImplementation(kotlin("test"))
}

tasks{
    build{
        doFirst {
            println("building m1l5")
        }
        doLast {
            println("build m1l5 was completed")
        }
    }
}
