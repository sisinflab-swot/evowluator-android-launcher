# evOWLuator Android Launcher

*evOWLuator Android Launcher* is a helper Android app used by the [evOWLuator][evowluator]
framework to launch reasoning tasks on Android devices, developed by [SisInf Lab][swot]
at the [Polytechnic University of Bari][poliba].

### Building

Android Launcher can be built with [Gradle][gradle] (version 5.6.2 or later).
It requires Android SDK version 28.

#### Instructions

1. Copy `local.properties.example` to `local.properties`;
1. Edit the `sdk.dir` property in `local.properties` to the local Android SDK installation path;
1. Generate the Gradle wrapper: `$ cd <project directory> && gradle wrapper`
1. Build the APK: `$ ./gradlew assembleRelease`

### Copyright and License

Copyright (c) 2019 [SisInf Lab][swot], [Polytechnic University of Bari][poliba]

evOWLuator Android Launcher is distributed under the [Eclipse Public License, Version 2.0][epl2].

[epl2]: https://www.eclipse.org/legal/epl-2.0
[evowluator]: http://swot.sisinflab.poliba.it/evowluator
[gradle]: https://gradle.org
[poliba]: http://www.poliba.it
[swot]: http://swot.sisinflab.poliba.it
