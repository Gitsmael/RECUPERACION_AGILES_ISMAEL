<!--
Este documento está hecho para que el estudiante pueda indicar lo que considere
oportuno. Usa el formato [Markdown](https://www.markdownguide.org/cheat-sheet/)
-->
# Recuperación de ágiles

## UT3. Modificaciones realizadas

<!-- Indica aquí las modificaciones que hayas realizado, ejemplo: -->

### Ordenación de los botones

<!-- Puedes borrar este ejemplo, todo el apartado -->

He ordenado la creación de elementos en la pantalla principal. Modificando el
constructor de la clase Main.

El objetivo de este cambio es ordenar los botones de una manera similar a como
otras aplicaciones de calculadoras tienen los botones colocados. Además, el
orden de creación es acorde a dónde se encuentran los botones en la pantalla,
siguiendo un orden de izquierda a derecha y de arriba a abajo.

## UT4. Ejecución de herramientas

<!-- Indica aquí cómo has ejecutado las herramientas y cuál ha sido la salida,
ejemplo: -->

### Testing

<!-- Puedes borrar este ejemplo, todo el apartado -->

#### Prerrequisitos

Se debe tener NodeJS instalado y haber descargado e instalado las dependencias,
que se hace mediante el siguiente comando, suponiendo que se encuentra en la
carpeta raíz del repositorio:

```
npm i
```

#### Ejecución

EN LA EJECUCIÓN DEL CHECKSTYLE ME HA DADO ESTO
Downloaded from central: https://repo.maven.apache.org/maven2/net/sf/saxon/Saxon-HE/10.6/Saxon-HE-10.6.jar (5.8 MB at 10 MB/s)
Warning:  File encoding has not been set, using platform encoding UTF-8, i.e. build is platform dependent!
[INFO] There are 138 errors reported by Checkstyle 9.3 with sun_checks.xml ruleset.
Error:  src/main/java/com/ismael/calculator/modelo/CalculatorModel.java:[1] (misc) NewlineAtEndOfFile: File does not end with a newline.
Error:  src/main/java/com/ismael/calculator/modelo/CalculatorModel.java:[1] (javadoc) JavadocPackage: Missing package-info.java file.
Error:  src/main/java/com/ismael/calculator/modelo/CalculatorModel.java:[4,5] (javadoc) JavadocVariable: Missing a Javadoc comment.
Error:  src/main/java/com/ismael/calculator/modelo/CalculatorModel.java:[5,5] (javadoc) JavadocVariable: Missing a Javadoc comment.
Error:  src/main/java/com/ismael/calculator/modelo/CalculatorModel.java:[6,5] (javadoc) JavadocVariable: Missing a Javadoc comment.
Error:  src/main/java/com/ismael/calculator/modelo/CalculatorModel.java:[7,5] (javadoc) JavadocVariable: Missing a Javadoc comment.
Error:  src/main/java/com/ismael/calculator/modelo/CalculatorModel.java:[9,5] (design) DesignForExtension: Class 'CalculatorModel' looks like designed for extension (can be subclassed), but the method 'getCurrent' does not have javadoc that explains how to do that safely. If class is not designed for extension consider making the class 'CalculatorModel' final or making the method 'getCurrent' static/final/abstract/empty, or adding allowed annotation for the method.
Error:  src/main/java/com/ismael/calculator/modelo/CalculatorModel.java:[9,5] (javadoc) MissingJavadocMethod: Missing a Javadoc comment.
Error:  src/main/java/com/ismael/calculator/modelo/CalculatorModel.java:[13,5] (design) DesignForExtension: Class 'CalculatorModel' looks like designed for extension (can be subclassed), but the method 'resetCurrent' does not have javadoc that explains how to do that safely. If class is not designed for extension consider making the class 'CalculatorModel' final or making the method 'resetCurrent' static/final/abstract/empty, or adding allowed annotation for the method.
Error:  src/main/java/com/ismael/calculator/modelo/CalculatorModel.java:[13,5] (javadoc) MissingJavadocMethod: Missing a Javadoc comment.
Error:  src/main/java/com/ismael/calculator/modelo/CalculatorModel.java:[19,5] (design) DesignForExtension: Class 'CalculatorModel' looks like designed for extension (can be subclassed), but the method 'addDigit' does not have javadoc that explains how to do that safely. If class is not designed for extension consider making the class 'CalculatorModel' final or making the method 'addDigit' static/final/abstract/empty, or adding allowed annotation for the method.
Error:  src/main/java/com/ismael/calculator/modelo/CalculatorModel.java:[19,5] (javadoc) MissingJavadocMethod: Missing a Javadoc comment.
Error:  src/main/java/com/ismael/calculator/modelo/CalculatorModel.java:[19,26] (misc) FinalParameters: Parameter digit should be final.
Error:  src/main/java/com/ismael/calculator/modelo/CalculatorModel.java:[21,33] (coding) MagicNumber: '10' is a magic number.
Error:  src/main/java/com/ismael/calculator/modelo/CalculatorModel.java:[22,32] (coding) MagicNumber: '10' is a magic number.
Error:  src/main/java/com/ismael/calculator/modelo/CalculatorModel.java:[23,41] (coding) MagicNumber: '10' is a magic number.
Error:  src/main/java/com/ismael/calculator/modelo/CalculatorModel.java:[28,5] (design) DesignForExtension: Class 'CalculatorModel' looks like designed for extension (can be subclassed), but the method 'addDot' does not have javadoc that explains how to do that safely. If class is not designed for extension consider making the class 'CalculatorModel' final or making the method 'addDot' static/final/abstract/empty, or adding allowed annotation for the method.
Error:  src/main/java/com/ismael/calculator/modelo/CalculatorModel.java:[28,5] (javadoc) MissingJavadocMethod: Missing a Javadoc comment.
Error:  src/main/java/com/ismael/calculator/modelo/CalculatorModel.java:[29,9] (blocks) NeedBraces: 'if' construct must use '{}'s.
Error:  src/main/java/com/ismael/calculator/modelo/CalculatorModel.java:[32,5] (design) DesignForExtension: Class 'CalculatorModel' looks like designed for extension (can be subclassed), but the method 'setOperationSum' does not have javadoc that explains how to do that safely. If class is not designed for extension consider making the class 'CalculatorModel' final or making the method 'setOperationSum' static/final/abstract/empty, or adding allowed annotation for the method.
Error:  src/main/java/com/ismael/calculator/modelo/CalculatorModel.java:[32,5] (javadoc) MissingJavadocMethod: Missing a Javadoc comment.
Error:  src/main/java/com/ismael/calculator/modelo/CalculatorModel.java:[33,9] (blocks) NeedBraces: 'if' construct must use '{}'s.
Error:  src/main/java/com/ismael/calculator/modelo/CalculatorModel.java:[34,14] (blocks) NeedBraces: 'if' construct must use '{}'s.
Error:  src/main/java/com/ismael/calculator/modelo/CalculatorModel.java:[35,9] (blocks) NeedBraces: 'else' construct must use '{}'s.
Error:  src/main/java/com/ismael/calculator/modelo/CalculatorModel.java:[42,5] (design) DesignForExtension: Class 'CalculatorModel' looks like designed for extension (can be subclassed), but the method 'setOperationExp' does not have javadoc that explains how to do that safely. If class is not designed for extension consider making the class 'CalculatorModel' final or making the method 'setOperationExp' static/final/abstract/empty, or adding allowed annotation for the method.
Error:  src/main/java/com/ismael/calculator/modelo/CalculatorModel.java:[42,5] (javadoc) MissingJavadocMethod: Missing a Javadoc comment.
Error:  src/main/java/com/ismael/calculator/modelo/CalculatorModel.java:[43,9] (blocks) NeedBraces: 'if' construct must use '{}'s.
Error:  src/main/java/com/ismael/calculator/modelo/CalculatorModel.java:[44,14] (blocks) NeedBraces: 'if' construct must use '{}'s.
Error:  src/main/java/com/ismael/calculator/modelo/CalculatorModel.java:[45,9] (blocks) NeedBraces: 'else' construct must use '{}'s.
Error:  src/main/java/com/ismael/calculator/modelo/CalculatorModel.java:[52,5] (design) DesignForExtension: Class 'CalculatorModel' looks like designed for extension (can be subclassed), but the method 'calculateResult' does not have javadoc that explains how to do that safely. If class is not designed for extension consider making the class 'CalculatorModel' final or making the method 'calculateResult' static/final/abstract/empty, or adding allowed annotation for the method.
Error:  src/main/java/com/ismael/calculator/modelo/CalculatorModel.java:[52,5] (javadoc) MissingJavadocMethod: Missing a Javadoc comment.
Error:  src/main/java/com/ismael/calculator/modelo/CalculatorModel.java:[53,9] (blocks) NeedBraces: 'if' construct must use '{}'s.
Error:  src/main/java/com/ismael/calculator/modelo/CalculatorModel.java:[54,14] (blocks) NeedBraces: 'if' construct must use '{}'s.
Error:  src/main/java/com/ismael/calculator/modelo/CalculatorModel.java:[59,5] (design) DesignForExtension: Class 'CalculatorModel' looks like designed for extension (can be subclassed), but the method 'calculateCircumference' does not have javadoc that explains how to do that safely. If class is not designed for extension consider making the class 'CalculatorModel' final or making the method 'calculateCircumference' static/final/abstract/empty, or adding allowed annotation for the method.
Error:  src/main/java/com/ismael/calculator/modelo/CalculatorModel.java:[59,5] (javadoc) MissingJavadocMethod: Missing a Javadoc comment.
Error:  src/main/java/com/ismael/calculator/modelo/CalculatorModel.java:[65,5] (design) DesignForExtension: Class 'CalculatorModel' looks like designed for extension (can be subclassed), but the method 'calculateFactorial' does not have javadoc that explains how to do that safely. If class is not designed for extension consider making the class 'CalculatorModel' final or making the method 'calculateFactorial' static/final/abstract/empty, or adding allowed annotation for the method.
Error:  src/main/java/com/ismael/calculator/modelo/CalculatorModel.java:[65,5] (javadoc) MissingJavadocMethod: Missing a Javadoc comment.
Error:  src/main/java/com/ismael/calculator/modelo/CalculatorModel.java:[66,9] (blocks) NeedBraces: 'if' construct must use '{}'s.
Error:  src/main/java/com/ismael/calculator/modelo/CalculatorModel.java:[67,9] (blocks) NeedBraces: 'if' construct must use '{}'s.
Error:  src/main/java/com/ismael/calculator/modelo/CalculatorModel.java:[69,9] (blocks) NeedBraces: 'for' construct must use '{}'s.
Error:  src/main/java/com/ismael/calculator/modelo/CalculatorModel.java:[75,5] (design) DesignForExtension: Class 'CalculatorModel' looks like designed for extension (can be subclassed), but the method 'getDisplay' does not have javadoc that explains how to do that safely. If class is not designed for extension consider making the class 'CalculatorModel' final or making the method 'getDisplay' static/final/abstract/empty, or adding allowed annotation for the method.
Error:  src/main/java/com/ismael/calculator/modelo/CalculatorModel.java:[75,5] (javadoc) MissingJavadocMethod: Missing a Javadoc comment.
Error:  src/main/java/com/ismael/calculator/modelo/CalculatorModel.java:[76] (sizes) LineLength: Line is longer than 80 characters (found 89).
Error:  src/main/java/com/ismael/calculator/modelo/CalculatorModel.java:[79,24] (misc) FinalParameters: Parameter b should be final.
Error:  src/main/java/com/ismael/calculator/modelo/CalculatorModel.java:[79,34] (misc) FinalParameters: Parameter e should be final.
Error:  src/main/java/com/ismael/calculator/modelo/CalculatorModel.java:[80,9] (blocks) NeedBraces: 'if' construct must use '{}'s.
Error:  src/main/java/com/ismael/calculator/modelo/CalculatorModel.java:[81,9] (blocks) NeedBraces: 'if' construct must use '{}'s.
Error:  src/main/java/com/ismael/calculator/modelo/CalculatorModel.java:[83,9] (blocks) NeedBraces: 'for' construct must use '{}'s.
Error:  src/main/java/com/ismael/calculator/main/Main.java:[1] (misc) NewlineAtEndOfFile: File does not end with a newline.
Error:  src/main/java/com/ismael/calculator/main/Main.java:[1] (javadoc) JavadocPackage: Missing package-info.java file.
Error:  src/main/java/com/ismael/calculator/main/Main.java:[7,1] (design) HideUtilityClassConstructor: Utility classes should not have a public or default constructor.
Error:  src/main/java/com/ismael/calculator/main/Main.java:[8,5] (javadoc) MissingJavadocMethod: Missing a Javadoc comment.
Error:  src/main/java/com/ismael/calculator/main/Main.java:[8,29] (misc) FinalParameters: Parameter args should be final.
Error:  src/main/java/com/ismael/calculator/controlador/CalculatorController.java:[1] (misc) NewlineAtEndOfFile: File does not end with a newline.
Error:  src/main/java/com/ismael/calculator/controlador/CalculatorController.java:[1] (javadoc) JavadocPackage: Missing package-info.java file.
Error:  src/main/java/com/ismael/calculator/controlador/CalculatorController.java:[3,8] (imports) UnusedImports: Unused import - java.awt.event.ActionEvent.
Error:  src/main/java/com/ismael/calculator/controlador/CalculatorController.java:[4,8] (imports) UnusedImports: Unused import - java.awt.event.ActionListener.
Error:  src/main/java/com/ismael/calculator/controlador/CalculatorController.java:[10,5] (javadoc) JavadocVariable: Missing a Javadoc comment.
Error:  src/main/java/com/ismael/calculator/controlador/CalculatorController.java:[11,5] (javadoc) JavadocVariable: Missing a Javadoc comment.
Error:  src/main/java/com/ismael/calculator/controlador/CalculatorController.java:[13,5] (javadoc) MissingJavadocMethod: Missing a Javadoc comment.
Error:  src/main/java/com/ismael/calculator/controlador/CalculatorController.java:[13,33] (misc) FinalParameters: Parameter model should be final.
Error:  src/main/java/com/ismael/calculator/controlador/CalculatorController.java:[13,49] (coding) HiddenField: 'model' hides a field.
Error:  src/main/java/com/ismael/calculator/controlador/CalculatorController.java:[13,56] (misc) FinalParameters: Parameter view should be final.
Error:  src/main/java/com/ismael/calculator/controlador/CalculatorController.java:[13,71] (coding) HiddenField: 'view' hides a field.
Error:  src/main/java/com/ismael/calculator/controlador/CalculatorController.java:[21,30] (coding) MagicNumber: '9' is a magic number.
Error:  src/main/java/com/ismael/calculator/vista/CalculatorView.java:[1] (misc) NewlineAtEndOfFile: File does not end with a newline.
Error:  src/main/java/com/ismael/calculator/vista/CalculatorView.java:[1] (regexp) RegexpSingleline: Line has trailing spaces.
Error:  src/main/java/com/ismael/calculator/vista/CalculatorView.java:[1] (javadoc) JavadocPackage: Missing package-info.java file.
Error:  src/main/java/com/ismael/calculator/vista/CalculatorView.java:[1,47] (whitespace) FileTabCharacter: File contains tab characters (this is the first instance).
Error:  src/main/java/com/ismael/calculator/vista/CalculatorView.java:[2,19] (imports) AvoidStarImport: Using the '.*' form of import should be avoided - javax.swing.*.
Error:  src/main/java/com/ismael/calculator/vista/CalculatorView.java:[3,16] (imports) AvoidStarImport: Using the '.*' form of import should be avoided - java.awt.*.
Error:  src/main/java/com/ismael/calculator/vista/CalculatorView.java:[6,5] (javadoc) JavadocVariable: Missing a Javadoc comment.
Error:  src/main/java/com/ismael/calculator/vista/CalculatorView.java:[6,19] (design) VisibilityModifier: Variable 'display' must be private and have accessor methods.
Error:  src/main/java/com/ismael/calculator/vista/CalculatorView.java:[7,5] (javadoc) JavadocVariable: Missing a Javadoc comment.
Error:  src/main/java/com/ismael/calculator/vista/CalculatorView.java:[7,22] (design) VisibilityModifier: Variable 'numButtons' must be private and have accessor methods.
Error:  src/main/java/com/ismael/calculator/vista/CalculatorView.java:[7,47] (coding) MagicNumber: '10' is a magic number.
Error:  src/main/java/com/ismael/calculator/vista/CalculatorView.java:[8] (sizes) LineLength: Line is longer than 80 characters (found 98).
Error:  src/main/java/com/ismael/calculator/vista/CalculatorView.java:[8,5] (coding) MultipleVariableDeclarations: Each variable declaration must be in its own statement.
Error:  src/main/java/com/ismael/calculator/vista/CalculatorView.java:[8,5] (javadoc) JavadocVariable: Missing a Javadoc comment.
Error:  src/main/java/com/ismael/calculator/vista/CalculatorView.java:[8,20] (design) VisibilityModifier: Variable 'sumButton' must be private and have accessor methods.
Error:  src/main/java/com/ismael/calculator/vista/CalculatorView.java:[8,31] (design) VisibilityModifier: Variable 'equalsButton' must be private and have accessor methods.
Error:  src/main/java/com/ismael/calculator/vista/CalculatorView.java:[8,45] (design) VisibilityModifier: Variable 'cButton' must be private and have accessor methods.
Error:  src/main/java/com/ismael/calculator/vista/CalculatorView.java:[8,54] (design) VisibilityModifier: Variable 'dotButton' must be private and have accessor methods.
Error:  src/main/java/com/ismael/calculator/vista/CalculatorView.java:[8,65] (design) VisibilityModifier: Variable 'circButton' must be private and have accessor methods.
Error:  src/main/java/com/ismael/calculator/vista/CalculatorView.java:[8,77] (design) VisibilityModifier: Variable 'factButton' must be private and have accessor methods.
Error:  src/main/java/com/ismael/calculator/vista/CalculatorView.java:[8,89] (design) VisibilityModifier: Variable 'expButton' must be private and have accessor methods.
Error:  src/main/java/com/ismael/calculator/vista/CalculatorView.java:[10,5] (javadoc) MissingJavadocMethod: Missing a Javadoc comment.
Error:  src/main/java/com/ismael/calculator/vista/CalculatorView.java:[13,19] (coding) MagicNumber: '100' is a magic number.
Error:  src/main/java/com/ismael/calculator/vista/CalculatorView.java:[13,24] (coding) MagicNumber: '100' is a magic number.
Error:  src/main/java/com/ismael/calculator/vista/CalculatorView.java:[13,29] (coding) MagicNumber: '400' is a magic number.
Error:  src/main/java/com/ismael/calculator/vista/CalculatorView.java:[13,34] (coding) MagicNumber: '600' is a magic number.
Error:  src/main/java/com/ismael/calculator/vista/CalculatorView.java:[20,27] (coding) MagicNumber: '50' is a magic number.
Error:  src/main/java/com/ismael/calculator/vista/CalculatorView.java:[20,31] (coding) MagicNumber: '20' is a magic number.
Error:  src/main/java/com/ismael/calculator/vista/CalculatorView.java:[20,35] (coding) MagicNumber: '300' is a magic number.
Error:  src/main/java/com/ismael/calculator/vista/CalculatorView.java:[20,40] (coding) MagicNumber: '50' is a magic number.
Error:  src/main/java/com/ismael/calculator/vista/CalculatorView.java:[23,9] (coding) MultipleVariableDeclarations: Each variable declaration must be in its own statement.
Error:  src/main/java/com/ismael/calculator/vista/CalculatorView.java:[23,17] (coding) MagicNumber: '50' is a magic number.
Error:  src/main/java/com/ismael/calculator/vista/CalculatorView.java:[23,25] (coding) MagicNumber: '100' is a magic number.
Error:  src/main/java/com/ismael/calculator/vista/CalculatorView.java:[24,30] (coding) MagicNumber: '9' is a magic number.
Error:  src/main/java/com/ismael/calculator/vista/CalculatorView.java:[26,43] (coding) MagicNumber: '60' is a magic number.
Error:  src/main/java/com/ismael/calculator/vista/CalculatorView.java:[26,47] (coding) MagicNumber: '60' is a magic number.
Error:  src/main/java/com/ismael/calculator/vista/CalculatorView.java:[28,18] (coding) MagicNumber: '70' is a magic number.
Error:  src/main/java/com/ismael/calculator/vista/CalculatorView.java:[29,21] (coding) MagicNumber: '3' is a magic number.
Error:  src/main/java/com/ismael/calculator/vista/CalculatorView.java:[29,29] (blocks) LeftCurly: '{' at column 29 should have line break after.
Error:  src/main/java/com/ismael/calculator/vista/CalculatorView.java:[29,35] (coding) MagicNumber: '50' is a magic number.
Error:  src/main/java/com/ismael/calculator/vista/CalculatorView.java:[29,44] (coding) MagicNumber: '70' is a magic number.
Error:  src/main/java/com/ismael/calculator/vista/CalculatorView.java:[33,33] (coding) MagicNumber: '50' is a magic number.
Error:  src/main/java/com/ismael/calculator/vista/CalculatorView.java:[33,37] (coding) MagicNumber: '310' is a magic number.
Error:  src/main/java/com/ismael/calculator/vista/CalculatorView.java:[33,42] (coding) MagicNumber: '60' is a magic number.
Error:  src/main/java/com/ismael/calculator/vista/CalculatorView.java:[33,46] (coding) MagicNumber: '60' is a magic number.
Error:  src/main/java/com/ismael/calculator/vista/CalculatorView.java:[37,29] (coding) MagicNumber: '120' is a magic number.
Error:  src/main/java/com/ismael/calculator/vista/CalculatorView.java:[37,34] (coding) MagicNumber: '310' is a magic number.
Error:  src/main/java/com/ismael/calculator/vista/CalculatorView.java:[37,39] (coding) MagicNumber: '60' is a magic number.
Error:  src/main/java/com/ismael/calculator/vista/CalculatorView.java:[37,43] (coding) MagicNumber: '60' is a magic number.
Error:  src/main/java/com/ismael/calculator/vista/CalculatorView.java:[41,32] (coding) MagicNumber: '190' is a magic number.
Error:  src/main/java/com/ismael/calculator/vista/CalculatorView.java:[41,37] (coding) MagicNumber: '310' is a magic number.
Error:  src/main/java/com/ismael/calculator/vista/CalculatorView.java:[41,42] (coding) MagicNumber: '60' is a magic number.
Error:  src/main/java/com/ismael/calculator/vista/CalculatorView.java:[41,46] (coding) MagicNumber: '60' is a magic number.
Error:  src/main/java/com/ismael/calculator/vista/CalculatorView.java:[45,27] (coding) MagicNumber: '260' is a magic number.
Error:  src/main/java/com/ismael/calculator/vista/CalculatorView.java:[45,32] (coding) MagicNumber: '310' is a magic number.
Error:  src/main/java/com/ismael/calculator/vista/CalculatorView.java:[45,37] (coding) MagicNumber: '60' is a magic number.
Error:  src/main/java/com/ismael/calculator/vista/CalculatorView.java:[45,41] (coding) MagicNumber: '60' is a magic number.
Error:  src/main/java/com/ismael/calculator/vista/CalculatorView.java:[49,29] (coding) MagicNumber: '50' is a magic number.
Error:  src/main/java/com/ismael/calculator/vista/CalculatorView.java:[49,33] (coding) MagicNumber: '380' is a magic number.
Error:  src/main/java/com/ismael/calculator/vista/CalculatorView.java:[49,38] (coding) MagicNumber: '60' is a magic number.
Error:  src/main/java/com/ismael/calculator/vista/CalculatorView.java:[49,42] (coding) MagicNumber: '60' is a magic number.
Error:  src/main/java/com/ismael/calculator/vista/CalculatorView.java:[53,30] (coding) MagicNumber: '120' is a magic number.
Error:  src/main/java/com/ismael/calculator/vista/CalculatorView.java:[53,35] (coding) MagicNumber: '380' is a magic number.
Error:  src/main/java/com/ismael/calculator/vista/CalculatorView.java:[53,40] (coding) MagicNumber: '60' is a magic number.
Error:  src/main/java/com/ismael/calculator/vista/CalculatorView.java:[53,44] (coding) MagicNumber: '60' is a magic number.
Error:  src/main/java/com/ismael/calculator/vista/CalculatorView.java:[57,30] (coding) MagicNumber: '190' is a magic number.
Error:  src/main/java/com/ismael/calculator/vista/CalculatorView.java:[57,35] (coding) MagicNumber: '380' is a magic number.
Error:  src/main/java/com/ismael/calculator/vista/CalculatorView.java:[57,40] (coding) MagicNumber: '60' is a magic number.
Error:  src/main/java/com/ismael/calculator/vista/CalculatorView.java:[57,44] (coding) MagicNumber: '60' is a magic number.
Error:  src/main/java/com/ismael/calculator/vista/CalculatorView.java:[61,29] (coding) MagicNumber: '260' is a magic number.
Error:  src/main/java/com/ismael/calculator/vista/CalculatorView.java:[61,34] (coding) MagicNumber: '380' is a magic number.
Error:  src/main/java/com/ismael/calculator/vista/CalculatorView.java:[61,39] (coding) MagicNumber: '60' is a magic number.
Error:  src/main/java/com/ismael/calculator/vista/CalculatorView.java:[61,43] (coding) MagicNumber: '60' is a magic number.
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  9.241 s
[INFO] Finished at: 2026-03-04T10:01:56Z
[INFO] ------------------------------------------------------------------------
Error:  Failed to execute goal org.apache.maven.plugins:maven-checkstyle-plugin:3.6.0:check (default-cli) on project AGILES_RECU: You have 138 Checkstyle violations. -> [Help 1]
Error:  
Error:  To see the full stack trace of the errors, re-run Maven with the -e switch.
Error:  Re-run Maven using the -X switch to enable full debug logging.
Error:  
Error:  For more information about the errors and possible solutions, please read the following articles:
Error:  [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
Error: Process completed with exit code 1.

```
npm run test
```

#### Salida

La ejecución debe dar el siguiente resultado:

```
> test
> jest

FAIL ./sum.test.js
  ✕ adds 1 + 2 to equal 3 (4 ms)

  ● adds 1 + 2 to equal 3

    expect(received).toBe(expected) // Object.is equality

    Expected: 3
    Received: 4

      2 |
      3 | test('adds 1 + 2 to equal 3', () => {
    > 4 |   expect(sum(1, 2)).toBe(3);
        |                     ^
      5 | });
      6 |

      at Object.toBe (sum.test.js:4:21)

Test Suites: 1 failed, 1 total
Tests:       1 failed, 1 total
Snapshots:   0 total
Time:        0.378 s
Ran all test suites.
Error: Process completed with exit code 1.
```
