#!/bin/bash
mvn install:install-file -Dfile=./de.hsos.richwps.wd.jar -DgroupId=de.hsos.richwps\
    -DartifactId=wd.lang -Dversion=1.0-SNAPSHOT -Dpackaging=jar
