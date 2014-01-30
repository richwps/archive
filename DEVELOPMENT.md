# development

## Language Definition

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

## API

* Obtain IDE with maven-capability.
* install `de.hsos.richwps.wd.jar` to m2-repository with
`mvn install:install-file -Dfile=./de.hsos.richwps.wd.jar -DgroupId=de.hsos.richwps -DartifactId=wd.lang -Dversion=1.0-SNAPSHOT -Dpackaging=jar` or `./installM2.sh`