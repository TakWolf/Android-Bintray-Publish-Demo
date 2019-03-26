# Android - Bintray Publish Demo #

[![Build Status](https://travis-ci.org/TakWolf/Android-Bintray-Publish-Demo.svg?branch=master)](https://travis-ci.org/TakWolf/Android-Bintray-Publish-Demo)
[![Bintray](https://api.bintray.com/packages/takwolf/maven/Android-Bintray-Publish-Demo/images/download.svg)](https://bintray.com/takwolf/maven/Android-Bintray-Publish-Demo/_latestVersion)

Scripts fork from [https://github.com/nuuneoi/JCenter](https://github.com/nuuneoi/JCenter)

## Usage ##

``` gradle
buildscript {
    repositories {
        google()
        jcenter()
    }
    dependencies {
        ......
        classpath 'com.github.dcendents:android-maven-gradle-plugin:2.1'
        classpath 'com.jfrog.bintray.gradle:gradle-bintray-plugin:1.8.4'
        ......
    }
}
```

``` gradle
......
ext {
    bintrayRepo = 'maven'
    bintrayName = 'MyRepository'

    siteUrl = 'https://github.com/TakWolf/MyRepository'
    gitUrl = 'https://github.com/TakWolf/MyRepository.git'

    groupId = 'com.takwolf'
    artifactId = 'myrepository'

    libraryName = 'My Repository'
    libraryVersion = '0.0.1'
    libraryDescription = 'This is my repository.'

    developerId = 'TakWolf'
    developerName = 'TakWolf'
    developerEmail = 'takwolf@foxmail.com'

    licenseName = 'The Apache Software License, Version 2.0'
    licenseUrl = 'http://www.apache.org/licenses/LICENSE-2.0.txt'
    allLicenses = ["Apache-2.0"]
}
......
apply from: 'https://raw.githubusercontent.com/TakWolf/Android-Bintray-Publish-Demo/master/script/install.gradle'
apply from: 'https://raw.githubusercontent.com/TakWolf/Android-Bintray-Publish-Demo/master/script/bintray.gradle'
```

config

```
// environment variables

BINTRAY_USER=takwolf
BINTRAY_KEY=xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx

// or local.properties

bintray.user=takwolf
bintray.key=xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
```

run

```
gradle bintrayUpload
```

## Dependencies ##

[Gradle Android Maven plugin](https://github.com/dcendents/android-maven-gradle-plugin)

[Gradle Bintray Plugin](https://github.com/bintray/gradle-bintray-plugin)

## Author ##

TakWolf

[takwolf@foxmail.com](mailto:takwolf@foxmail.com)

[http://takwolf.com](http://takwolf.com)

## License ##

```
Copyright 2017 TakWolf

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
