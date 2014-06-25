AE Upgrade
=========================

This is a mod that lets you convert old AE1 world to AE2 worlds by converting parts and items.

How this works.

1. Download [appeng-rv14-upgrade.jar](https://github.com/AlgorithmX2/AEUpgrade/raw/master/upgrade-mc16/appeng-rv14-upgrade.jar) from this repo, this is a special build of AE1 that adds names to the item in the world data.
2. Back up your world.
3. Replace your current rv14/rv13 mod with the rv14 upgrade.jar, then open and save your world.
4. Setup your 1.7 instance and install a bulid of AE Upgrade, and AE2
5. Move your world from your 1.6 to you 1.7 instance.
6. Launch your world, and disassemble or/and enjoy your converted items.

Please note, you must load your AE1 world on 1.6 with the special build without this step your AE1 items will not pair up with AE Upgrades Names and will simply vanish.

### Download Builds
Builds are automtaically done at drone.io [click here](https://drone.io/github.com/AlgorithmX2/AEUpgrade/files): [![Build Status](https://drone.io/github.com/AlgorithmX2/AEUpgrade/status.png)](https://drone.io/github.com/AlgorithmX2/AEUpgrade/latest)

Contributing to the Effort
=========================

### Pull Requests
If you wish to submit a pull request to fix an issue or improve this conversion, feel free.

### Reporting issues
If you encounter an issue with the conversion lt me know hopefully there will be a way to improve or fix it.

### Compiling and packaging AE Upgrade
1. Clone this repo into a new folder.
2. Use Gradle to setup work space.
 * gradlew setupDecompWorkspace
 * gradlew eclipse
3. Optional: Make Changes
4. gradlew build
 * binaries will be output into build/lib/
