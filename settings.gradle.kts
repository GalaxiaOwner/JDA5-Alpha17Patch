rootProject.name = "JDA"

dependencyResolutionManagement {
    versionCatalogs {
        create("libs") {
            library("tink",                  "com.google.crypto.tink",   "tink"                ).version("1.14.1")
        }
    }
}
