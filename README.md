# RetroDroid

RetroDroid is a personal fork of [Lemuroid](https://github.com/Swordfish90/Lemuroid)
(based on release 1.17.0), licensed under GPL-3.0 like the original.

## Differences from upstream

- Saves, save states and state previews are stored in `/sdcard/LemuroidData/`,
  in per-core subfolders (e.g. `saves/mgba/`, `states/snes9x/`), instead of
  `/Android/data/<package>/files`.
- Requires the "All files access" permission (`MANAGE_EXTERNAL_STORAGE`).
- Package ID is `com.ioncelciuc.retrodroid`, so it installs alongside the original Lemuroid.

## Building

Requires JDK 17 and the Android SDK.

    git clone --recursive https://github.com/ioncelciuc/Lemuroid.git
    cd Lemuroid
    ./gradlew installFreeDynamicDebug

Release builds expect a keystore at `release.jks` in the repo root
(alias, store password and key password are set in `lemuroid-app/build.gradle.kts`).
Generate your own; do not commit it.