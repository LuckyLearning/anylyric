// 依赖与插件的版本集中在 gradle/libs.versions.toml（Version Catalog）。
// Gradle 会自动把该文件注册成名为 `libs` 的目录，无需在这里 versionCatalogs { create("libs") }。

pluginManagement {
    repositories {
        google()
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

// 独立仓库：AnyLyric 已与 WindTone 完全切割，本仓库只含这一个应用。
rootProject.name = "AnyLyric"
include(":anylyric")
