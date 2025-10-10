plugins {
    kotlin("jvm") version "2.2.20"
    id("antlr")
    // Add the application plugin to create an executable JAR
    id("application")
}

group = "org.opency.pseudocode"
version = "1.0-SNAPSHOT"

// Specify the main class for the executable JAR
application {
    mainClass.set("MainKt")
}

// Make the 'run' task interactive
tasks.named<JavaExec>("run") {
    standardInput = System.`in`
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    antlr("org.antlr:antlr4:4.13.2")
    implementation("org.antlr:antlr4-runtime:4.13.2")
}

// Configure the ANTLR grammar generation task
tasks.generateGrammarSource {
    arguments = arguments + listOf("-visitor", "-listener", "-package", "org.opency.pseudocode.grammar")
    // Set the output directory
    outputDirectory = file("src/main/gen/org/opency/pseudocode/grammar")
}

// Add the generated source files to the "main" source set.
sourceSets {
    named("main") {
        // Tell the source set to include the generated code directory
        java.srcDir("src/main/gen")
    }
}

// Explicitly tell the Kotlin compiler to run after the ANTLR task
tasks.named("compileKotlin") {
    dependsOn(tasks.named("generateGrammarSource"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(17)
}
