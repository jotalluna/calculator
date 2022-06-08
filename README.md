# Calculator

## Introducción

Este documento es la explicación de la prueba de concepto para Iteriam.

Todo el código del proyecto completo se encuentra en este [GitHub repository](https://github.com/jotalluna/calculator/).

## Sumario

<!-- TOC -->

- [Proyecto Calculator](#calculator)
    - [Introducción](#introducción)
    - [Sumario](#sumario)
    - [Estructura del Proyecto](#estructura-del-proyecto)
	- [Dependencias-utilizadas](#dependencias-utilizadas)
	- [Las-funcionalidades-implementadas-y-alcance-del-servicio](#las-funcionalidades-implementadas-y-alcance-del-servicio)
	- [Los-procedimientos-de-compilación-y-ejecución ](#los-procedimientos-de-compilación-y-ejecución )
	- [Open-API](#open-api)
    

<!-- /TOC -->

## Estructura del Programa

La estructura final del proyecto es:

```
.
├── HELP.md
├── README.md
├── mvnw
├── mvnw.cmd
├── pom.xml
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── iteriam
│   │   │           └── calculator
│   │   │               ├── CalculatorApplication.java
│   │   │               ├── configuration
│   │   │               │   └── ApplicationConfig.java
│   │   │               ├── controllers
│   │   │               │   ├── CalculatorController.java
│   │   │               │   └── ExceptionController.java
│   │   │               ├── dto
│   │   │               │   ├── DataOperators.java
│   │   │               │   ├── DataOperatorsSubtract.java
│   │   │               │   ├── DataOperatorsSum.java
│   │   │               │   └── Result.java
│   │   │               ├── exceptions
│   │   │               ├── response
│   │   │               │   └── Response.java
│   │   │               └── service
│   │   │                   ├── CalculatorService.java
│   │   │                   ├── impl
│   │   │                   │   └── CalculatorServiceImpl.java
│   │   │                   └── util
│   │   │                       └── TracerOwnerImpl.java
│   │   └── resources
│   │       ├── application.properties
│   │       ├── static
│   │       └── templates
│   └── test
│       └── java
│           └── com
│               └── iteriam
│                   └── calculator
│                       └── CalculatorApplicationTests.java
└── target
    ├── classes
    │   ├── META-INF
    │   │   ├── MANIFEST.MF
    │   │   └── maven
    │   │       └── com.iteriam
    │   │           └── calculator
    │   │               ├── pom.properties
    │   │               └── pom.xml
    │   ├── application.properties
    │   └── com
    │       └── iteriam
    │           └── calculator
    │               ├── CalculatorApplication.class
    │               ├── configuration
    │               │   └── ApplicationConfig.class
    │               ├── controllers
    │               │   ├── CalculatorController.class
    │               │   └── ExceptionController.class
    │               ├── dto
    │               │   ├── DataOperators.class
    │               │   ├── DataOperatorsSubtract.class
    │               │   ├── DataOperatorsSum.class
    │               │   ├── Result$ResultBuilder.class
    │               │   └── Result.class
    │               ├── exceptions
    │               ├── response
    │               │   ├── Response$Error.class
    │               │   ├── Response$ResponseBuilder.class
    │               │   └── Response.class
    │               └── service
    │                   ├── CalculatorService.class
    │                   ├── impl
    │                   │   └── CalculatorServiceImpl.class
    │                   └── util
    │                       └── TracerOwnerImpl.class
    └── test-classes
        └── com
            └── iteriam
                └── calculator
                    └── CalculatorApplicationTests.class
```

## Dependencias utilizadas

Construido con [Maven](https://maven.apache.org/) - Manejador de dependencias

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-devtools</artifactId>
			<scope>runtime</scope>
			<optional>true</optional>
		</dependency>
		<dependency>
			<groupId>org.projectlombok</groupId>
			<artifactId>lombok</artifactId>
			<optional>true</optional>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>
		<!-- mvn install:install-file -Dfile=c:\Users\josel.luna\tracer-1.0.0.jar 
		-DgroupId=io.corp.calculator -DartifactId=tracer -Dversion=1.0.0 
		-Dpackaging=jar-->		
		<dependency>
			  <groupId>io.corp.calculator</groupId>
			  <artifactId>tracer</artifactId>
			  <version>1.0.0</version>
		 </dependency>	
		 <dependency>
		    <groupId>org.springdoc</groupId>
		    <artifactId>springdoc-openapi-ui</artifactId>
		    <version>1.6.4</version>
		</dependency>


## Las funcionalidades implementadas y alcance del servicio 
Se ha implementado una calculadora con dos funciones: sumar y restar, dichas funciones tienen sólo dos operandos.
Para hacer la aplicación más escalable se ha usado una clase abstracta, de forma que escalar la funcionalidad todo lo que deseemos,
simplemente heredando de dicha clase abstracta y sobreescribiendo el método con la nueva operación.

## Los procedimientos de compilación y ejecución 
1- Para generar el jar correspondiente ejecutamos la siguiente instrucción Maven en el directorio del proyecto:mvn install
2- En la carpeta target se generará un archivo que podremos ejecutar, dicho archivo lleva embebido un Tomcat.
3- para lanzarlo podemos situarnos en la ruta del archivo y ejecutar la instrucción:java -jar [nombre jar]

## Open API
Para acceder a la documentación del APIRest usaremos la siguiente URL:
	- http://localhost:8080/swagger-ui/index.html
	
## Ejemplos de llamadas de la API 
	
	1- http://localhost:8080/calculadora
	2- On Body Request:
		{
		  "datoA": 10,
		  "datoB": 20,
		  "type": "sum"
		}


