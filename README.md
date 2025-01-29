# IBM-TEST
## Proveedor API

Este proyecto implementa una API REST en Spring Boot para consultar los proveedores de un cliente desde una base de datos MySQL.

### Prerrequisitos
1. **Java 17**
2. **Maven**
3. **MySQL**
4. **IntelliJ IDEA**  (se recomienda este IDE, con soporte de Lombok)


### Dependencias
1. **Spring Web** Para crear el servicio REST.
2. **Lombok** Para generar automáticamente código repetitivo como getters, setters, constructores, etc.
3. **Spring Data JPA** Para gestionar la persistencia de datos con la base de datos MySQL.
4. **MySQL Driver** Controlador JDBC para conectar Spring Boot con MySQL.
5. **Spring Boot Starter Test** Para las pruebas unitarias utilizando JUnit 5.


## Configuración
## Instalación de Lombok en IntelliJ IDEA
1. Instalar el plugin Lombok en IntelliJ IDEA:

    Ve a File -> Settings -> Plugins.
    Busca Lombok e instala el plugin.
    Reinicia IntelliJ IDEA para aplicar los cambios.
   
2. Activar anotaciones en IntelliJ IDEA:

    Asegúrate de que la opción "Enable annotation processing" esté activada:
    Ve a File -> Settings -> Build, Execution, Deployment -> Compiler -> Annotation Processors.
    Marca la opción Enable annotation processing.
