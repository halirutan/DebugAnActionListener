plugins {
  id("org.jetbrains.intellij") version "0.4.9"
  java
}

group = "halirutan"
version = "1.0-SNAPSHOT"

repositories {
  mavenCentral()
}

sourceSets {
    main {
        java.srcDir("src")
        resources.srcDir("resources")
    }
}

// See https://github.com/JetBrains/gradle-intellij-plugin/
intellij {
  version = "2019.2"
}
configure<JavaPluginConvention> {
  sourceCompatibility = JavaVersion.VERSION_1_8
}
tasks.getByName<org.jetbrains.intellij.tasks.PatchPluginXmlTask>("patchPluginXml") {
  changeNotes("""
      Add change notes here.<br>
      <em>most HTML tags may be used</em>""")
}