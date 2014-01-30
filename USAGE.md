# usage

* install `de.hsos.richwps.wd.jar` to m2-repository with 
    `mvn install:install-file -Dfile=./de.hsos.richwps.wd.jar -DgroupId=de.hsos.richwps -DartifactId=wd.lang -Dversion=1.0-SNAPSHOT -Dpackaging=jar` or `./installM2.sh`
* `cd worksequenceapi && mvn clean install`
* reference the library in your maven-project:

`   <dependency>
    <groupId>de.hsos.richwps</groupId>
    <artifactId>wd.worksequenceapi</artifactId>
    <version>1.0-SNAPSHOT</version>
    </dependency>`

* reading scripts
	* Instantiate `de.hsos.richwps.wd.Reader`
	* `load` a wd-script.
	* `inspect` the script.
	* `get` WorksequenceDescription
* creating wd-scripts
 	* `TODO`