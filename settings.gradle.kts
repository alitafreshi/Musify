pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

rootProject.name = "Musify"
include(":app")
include(":theme")
include(":components")
include(":my-songs")
include(":my-songs:presentation")
include(":artists")
include(":artists:presentation")
include("playlist")
include(":playlist:presentation")
include("favorites")
include(":favorites:presentation")
