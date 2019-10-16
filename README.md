# evOWLuator Android Launcher

*evOWLuator Android Launcher* is a Android application used by evOWLuator to launch reasoning task on Android devices.
Developed by [SisInf Lab][swot] at the [Polytechnic University of Bari][poliba].

### Building

Android Launcher can be built with [Gradle][gradle] (version 5.6.2 or later). Android SDK version
28 is required.

#### Instructions

1. Copy `local.properties.example` to `local.properties`;
2. Change `sdk_dir` to reference the local android sdk installation;
3. Generate gradle wrapper:

``` 
$ gradle wrapper
``` 

4. Build APK:

``` 
$ ./gradlew assembleRelease
``` 

Generated APK is located in `app/build/outputs/apk/release/`

### Copyright and License

Copyright (c) 2019 [SisInf Lab][swot], [Polytechnic University of Bari][poliba]

evOWLuator Android Launcher is distributed under the [Eclipse Public License, Version 2.0][epl2].

[epl2]: https://www.eclipse.org/legal/epl-2.0
[gradle]: https://gradle.org
[poliba]: http://www.poliba.it
[swot]: http://sisinflab.poliba.it/swottools
