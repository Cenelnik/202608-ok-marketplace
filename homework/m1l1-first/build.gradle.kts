plugins {
    kotlin("jvm")
}

dependencies{
    implementation(kotlin("stdlib-jdk8"))
    testImplementation(kotlin("test"))
}


tasks.test {
    useJUnitPlatform()
}
tasks{
    build{
        doFirst {
            println("building m1l1")
        }
        doLast {
            println("build m1l1 was completed")
        }
    }
}