***Version:*** Draft

***Build:***  [![Build Status](https://travis-ci.org/dalcacer/richwps-wd.png)](https://travis-ci.org/dalcacer/richwps-wd)

# richwps-wd

XText-based toolchain for processing the RichWPS Work Sequence Description (WSD) Language.
This library is part of the BMBF research project RichWPS.

This library works as tool for reading and generating WSDs. It is not intended to be a runtime environment that executes a given Work Sequence.

* see [language](Language.md) for 
* see roadmap (below) 

## usage

* install `de.hsos.richwps.wd.jar` to m2-repository with 
    `mvn install:install-file -Dfile=./de.hsos.richwps.wd.jar -DgroupId=de.hsos.richwps -DartifactId=wd.lang -Dversion=1.0-SNAPSHOT -Dpackaging=jar` or `./installM2.sh`
* `cd worksequenceapi && mvn clean install`
* reference the library in your maven-project:

`   <dependency>
    <groupId>de.hsos.richwps</groupId>
    <artifactId>wd.worksequenceapi</artifactId>
    <version>1.0-SNAPSHOT</version>
    </dependency>`

* reading wsd-scripts
	* Instantiate `de.hsos.richwps.wd.Reader`
	* `load` a wd-script.
	* `inspect` the script.
	* `get` WorksequenceDescription
* creating wd-scripts
 	* `TODO`

## development

### Language

* Obtain [XText Standalone](http://www.eclipse.org/Xtext/download.html)

***Importing The Project***

* `Import` -> `General` -> `Existing Projects into Workspace` 
  * `Select Root Directory` languagedefinition e.g. `/~/repositories/richwps-wd/languagedefinition`
  * `Finish`

***Exporting The Library***

This procedure is based on [stackoverflow question](http://stackoverflow.com/questions/7840685/is-it-possible-to-use-xtext-without-eclipse/7854545#7854545) and especially [Sebastian Zarnekow's](http://zarnekow.blogspot.de/2010/06/how-to-deploy-xtext-standalone.html) article.

* Select `de.hsos.richwps.wd`-project
* `Export` -> `Java` -> `Runnable Jar file`
	* Select `Copy required libraries into a sub-folder next to the generated JAR.`
* `Finish`

### Work Sequence 


* Obtain IDE with maven-capability.
* install `de.hsos.richwps.wd.jar` to m2-repository with
`mvn install:install-file -Dfile=./de.hsos.richwps.wd.jar -DgroupId=de.hsos.richwps -DartifactId=wd.lang -Dversion=1.0-SNAPSHOT -Dpackaging=jar` or `./installM2.sh`

#### Docs

* `mvn cobertura:cobertura site:site`

## intended roadmap

### v1

 **Reader**

 * support for basic language elements
 	* rudimentary variable (assingment) support
 	* local and remote bindings
 	* execute statements
 * reader for sequential work sequencees

 **Write**

 * rudimentary variable (assingment) support
 	* local and remote bindings
 	* execute statements

### v2

 * more sophisticated variable support (assingments of native datatypes).
 * control structures.
 * support for datasources as variables.

### v3

 * parallel worksequence detection (`optimisation`)

## License

Not, yet.
