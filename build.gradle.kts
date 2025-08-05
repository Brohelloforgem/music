plugins {
    kotlin("jvm") version "1.9.22"
    kotlin("plugin.serialization") version "1.9.22"
    application
    id("com.github.johnrengelman.shadow") version "8.1.1"
}

dependencies {
    // Discord Bot Framework
    implementation("me.jakejmattson:DiscordKt:0.24.0")
    implementation("dev.kord:kord-core:0.12.0")
    
    // Music Player
    implementation("dev.arbjerg:lavaplayer:2
