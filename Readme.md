# Apuntes Spring Framework

## Anotaciones sobre las propias clases Distintos Estereotipos:

- @Component: Indica que una clase es un componente de Spring. Se puede aplicar a cualquier clase.
- @Repository: Indica que una clase es un DAO (Data Access Object). Se utiliza para encapsular el acceso a la base de datos.
- @Service: Indica que una clase es un servicio. Se utiliza para encapsular la lógica de negocio.
- @Controller: Indica que una clase es un controlador. Se utiliza para manejar peticiones HTTP.
- @RestController: Indica que una clase es un controlador REST. Se utiliza para manejar peticiones HTTP y devolver objetos JSON.

## Inyección de dependencias

Consiste en utilizar clases abstractas o interfaces para definir las dependencias entre los distintos componentes de una aplicación. Spring se encarga de inyectar las dependencias en los componentes que las necesitan.

## Tipos de inyección de beans

- Inyección por constructor: Se inyectan las dependencias a través del constructor de la clase.
- Inyección por setter: Se inyectan las dependencias a través de los métodos setter de la clase.
- Inyección por campo: Se inyectan las dependencias a través de los campos de la clase.

