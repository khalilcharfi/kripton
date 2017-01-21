## Kripton android library (runtime dependency)
[![download](https://api.bintray.com/packages/xcesco/kripton/kripton-android-library/images/download.svg)](https://bintray.com/xcesco/kripton/kripton-android-library/_latestVersion)
[![maven central](https://maven-badges.herokuapp.com/maven-central/com.abubusoft/kripton/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.abubusoft/kripton)
[![method count](https://img.shields.io/badge/Methods and size-1786 | 260 KB-e91e63.svg)](http://www.methodscount.com/?lib=com.abubusoft%3Akripton-android-library%3A1.3.0)


## Kripton annotation processor library (compile-time dependency)
[ ![Download](https://api.bintray.com/packages/xcesco/kripton/kripton-processor/images/download.svg) ](https://bintray.com/xcesco/kripton/kripton-processor/_latestVersion)
[![maven central](https://maven-badges.herokuapp.com/maven-central/com.abubusoft/kripton/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.abubusoft/kripton)
[![build status](https://img.shields.io/travis/xcesco/kripton.svg?style=flat-square)](https://travis-ci.org/xcesco/kripton)
[![test coverage](https://img.shields.io/codecov/c/github/xcesco/kripton/master.svg?style=flat-square)](https://codecov.io/gh/xcesco/kripton?branch=master)

# Kripton 
Java library provides a simple and uniform way to manage persistence of Java classes in different flavours. Supported persistence format are:

* SQLite database (Android platform)
* Shared preference (Android platform)
* REST service (Java and Android platform), throws [Retrofit library](http://square.github.io/retrofit/) integration
* JSON format (Java and Android platform)
* XML format (Java and Android platform)
* CBOR format (Java and Android platform)
* (Java) properties format (Java and Android platform)
* YAML format (Java and Android platform)

To get max performance and avoid boilerplate-code, Kripton use the power of annotation processor. With the power of annotation processor is possible to create code to persist a java class, simply with an annotation. There are many other libraries that do this, but Kripton allows to persists java object in different ways with an unique set of annotation and mechanisms.

See [wiki](https://github.com/xcesco/kripton/wiki) for more informations.


# Usage
You can use Kritpon Annotation Processor and Kripton Library via maven

```xml
<dependencies>
  ...    
  <dependency>
    <groupId>com.abubusoft</groupId>
    <artifactId>kripton</artifactId>
    <version>1.5.0</version>
  </dependency>
  ...
</dependencies>
...		
<build>
  <pluginManagement>
  <plugins>
    <plugin>
      <groupId>org.apache.maven.plugins</groupId>
	  <artifactId>maven-compiler-plugin</artifactId>
      <version>3.6.0</version>
	  <configuration>
	    <source>1.7</source>
		<target>1.7</target>
		<annotationProcessorPaths>
		  <path>
		    <groupId>com.abubusoft</groupId>
		    <artifactId>kripton-processor</artifactId>
		    <version>1.5.0</version>
		</path>
	    </annotationProcessorPaths>
	  </configuration>
    </plugin>
  </plugins>
  </pluginManagement>
</build>
```

or via gradle

```
// annotation processor
apt "com.abubusoft:kripton-processor:${kriptonVersion}"

// https://mvnrepository.com/artifact/com.abubusoft/kripton
compile "com.abubusoft:kripton-android-library:1.5.0"
```

Snapshots of the development version are available in [Sonatype's snapshots repository](https://oss.sonatype.org/content/repositories/snapshots/com/abubusoft/).

Kritpon requires at minimum Java 7 or Android 2.3.

# Build
To build entire library collections just download repository and launch from base directory 

```
mvn clean install -Prelease
```

# Supported platforms
There are two platform: the android environment and generic Java environment. For each platform there is a version of library. Android platform already include a json library and xml parser library. Java JDK does not include a json library and have different xml parser libraries.

# License

```
Copyright 2015 Francesco Benincasa.

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
