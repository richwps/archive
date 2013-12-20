***Sprache:*** DE

***Version:*** 1-SNAPSHOT

# Worksequence Description

Die Worksequence Description dient der Beschreibung von Arbeitsabläufen auf Basis der Input und Outputparametern eines Web Processing Services.


## Sprachelemente

* `//` : Einzeiliger Kommentar
* References : Verweise auf Laufzeitobjekte: Input-, Outputparameter und Variablen
* Assignments: Zuweisungen: von Outputparametern und Variablen.
* bindings : Vergabe eines eindeutigen Kürzels für ein Prozessbinding.
* execute Statements : Ausführen eines Prozesses anhand des eindeutigen Kürzels.
* Variablen, Datentypen und Konstanten:
        Datentypen: Datentypen, die durch References, Assignments und Executes unterstützt werde müssen.
        Umgang mit konstanten Informationen.
* Kontrollstrukturen: `TODO`

### References

Jedes referenzierbare Laufzeitobjekt verfügt über einen eindeutigen Identifier. Die Identifier der In- und Outputs basieren auf der XML Prozessbeschreibung. Variablen können “on-the-fly” benannt werden.

* Inputs wps-compliant inputs. `in.$wps-input-identifier$`
* Outputs wps-compliant outputs: `out.$wps-output-identifier$` 
* Variables `var.$unique-identifier$`

Inputparameter werden einmalig bei der Instanziierung einer Worksequence belegt und können zur Laufzeit nicht verändert werden.

### Assignments

Zuweisungen zur Laufzeit können sich auf Variablen oder Output-Parametern beziehen. Sie werden mit dem Zuweisungsoperator `=` durchgeführt.

`out.$wps-output-identifer$ = var.$unique-identifer$`

### Bindings

Bindings sind eine Assoziation eines lokalen oder entfernen Prozesses zu einem variablen, eindeutigem Kürzel. Es es wird zwischen lokalen und entfernten Bindings durch optionale Sprachelemente unterschieden. Ein Bindung stellt die Grundlage für eine nachfolgende Execute-Anweisung dar. Die in einem Binding enthaltenen Informationen stellen das Mindestmaß dar um zur Laufzeit eine technische Beschreibung (ProcessDescription) für einen entfernten oder lokalen Prozess zu erhalten.

    bind
    process $wps-compliant-process-identifier$
    to $org/name$

Ein entferntes Binding enhält zusätzlich eine Quadrupel an Informationen über den Ausführungsort (Protokoll, Host, Port, Pfad zum WPS Endpunkt).

    bind
    process $http/https$, $port$, $path$, $wps-compliant-process-identifier$
    to $org/name$

### Execute Statement

Die vorläufge Syntax eines Executeaufrufs hat die folgende Form:

    execute $org/name$
    with
    $runtimereference{in/var}$ as wps-input-identifier-targetprocess
    . . .
    $runtimereference{in/var}$ as wps-input-identifier-targetprocess
    store
    wps-output-identifier-targetprocess as $runtimereference{out/var}$
    . . .
    wps-output-identifier-targetprocess as $runtimereference{out/var}$

### Variablen, Datentypen und Konstanten

`TODO`


### Kontrollstrukturen

`TODO`