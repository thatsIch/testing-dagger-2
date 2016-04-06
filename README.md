# Introduction

Dagger 2 is probably the first reflection-free dependency injection framework in the Java world.
Through the usage of annotation processing it generates the required package-private friend classes
and generates the dependency injection helper as we would write them by hand. 

This should improves the constructor and method call speed by a large margin.

Thie project show-cases the usage of Dagger 2 in a toy project in combination with other leading technolgies like Gradle and IntelliJ.

This can prove to be useful for other searching for a pure, working Java development without Android 
(since most examples out there use Dagger 2 in an Android environment)

# Used Technologies

## Dagger 2

[Dagger 2](https://github.com/google/dagger) is a fast dependency injector for Android and **Java**.

Useful links to Dagger 2:

* https://github.com/google/dagger
* http://google.github.io/dagger/users-guide

## Gradle

[Gradle](http://gradle.org/) is a build automation system build upon the concepts of Apache Ant and Apache Maven 
and introduces a Groovy-based domain-specific language (DSL) instead of the XML form used by Apache Maven of declaring the project configuration.

## IntelliJ

IntelliJ IDEA is a Java integrated development environment (IDE) for developing computer software by JetBrains.

### Usage with IntelliJ
[Dagger 2](https://github.com/google/dagger) uses annotation processing to generate its modules.
In IntelliJ this option is disabled by default. 

You can enable it in the settings:

> Build, Execution, Deployment > Compiler > Annotation-Processors > Enable annotation processing (has to be checked)
> Build, Execution, Deployment > Compiler > Annotation-Processors > Store generated sources relative to: Module content root (has to be selected)

Another possibility is to let it stay in the build folder and change the build script to that. 
Advantage is that `./gradlew clean` would also enable regenerating those sources quite easily.
