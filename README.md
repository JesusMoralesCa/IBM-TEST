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


## Base de datos

Asegúrate de tener MySQL instalado y en funcionamiento.
Crea una base de datos llamada proveedores_db.
Importa el script.sql el cual está en la carpeta situada en la raiz del proyecto "script.sql"

## Configuración de la base de datos en application.properties

En el archivo src/main/resources/application.properties, configura la conexión a tu base de datos MySQL:

spring.datasource.url=jdbc:mysql://localhost:3306/proveedores_db    
spring.datasource.username=user    
spring.datasource.password=user    
spring.jpa.hibernate.ddl-auto=update    

Asegúrate de reemplazar user y user con las credenciales de tu base de datos MySQL.

## Ejecución del Proyecto

1. Clona el repositorio:

    git clone https://github.com/JesusMoralesCa/IBM-TEST.git

2. Situate en la raiz del proyecto y construyelo:
    
    ./mvnw clean install -DskipTests

3. Ejecuta la aplicación: (Asegurate de haber configurado bien la base de datos y que esta funcionando)

    ./mvnw spring-boot:run

La API estará disponible en http://localhost:8080.


**Si prefieres ejecutarlo con el IDE ve a src\main\java\com\jesusmorales\PruebaIBM y abre PruebaIbmApplication.java. Dale al boton de "Play" y se ejecutará.**




## Pruebas Unitarias

Este proyecto incluye pruebas unitarias utilizando JUnit 5 para asegurar el correcto funcionamiento de los métodos. Puedes ejecutarlas con Maven:

    ./mvnw test

**Si prefieres ejecutarlo con el IDE ve a src\test\java\com\jesusmorales\PruebaIBM\ProveedorTest y abre ProveedorServiceTest.java. Dale al boton de "Play" y se ejecutaran las pruebas.**








