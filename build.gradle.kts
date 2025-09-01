import org.jetbrains.compose.desktop.application.dsl.TargetFormat

plugins {
    kotlin("jvm") version "1.9.10"
    id("org.jetbrains.compose") version "1.6.1"
}

group = "br.com.silasdev"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    google()
}

dependencies {
    // Note, if you develop a library, you should use compose.desktop.common.
    // compose.desktop.currentOs should be used in launcher-sourceSet
    // (in a separate module for demo project and in testMain).
    // With compose.desktop.common you will also lose @Preview functionality
    implementation(compose.desktop.currentOs)
}

compose.desktop {
    application {
        mainClass = "MainKt"

        nativeDistributions {
            targetFormats(TargetFormat.Msi)
            packageName = "Pedido Namoro"
            packageVersion = "1.0.0"
            description = "App do pedido de namoro"
            copyright = "© 2025 SilasDev"


            windows {
                menu = true
                upgradeUuid = "123e4567-e89b-12d3-a456-426614174000"
                iconFile.set(project.file("src/main/resources/icons/ic.ico")) // ícone Windows
                vendor = "SilasDev"
                shortcut = true
                menuGroup = "Pedido Namoro" // pasta do Menu Iniciar
                perUserInstall = false       // instala para todos os usuários


            }



        }
    }
}
