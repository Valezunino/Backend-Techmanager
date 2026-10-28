# TechManager - Trabajo Práctico

## ¿De qué trata el proyecto?

TechManager es un sistema que desarrollamos para gestionar productos tecnológicos, controlar el stock y administrar usuarios.

La idea del trabajo fue hacer un backend con Java y Spring Boot, conectado a una base de datos PostgreSQL. El sistema permite registrar productos, organizarlos por marcas y categorías y manejar usuarios con distintos roles.

## Tecnologías que usamos

- Java
- Spring Boot
- PostgreSQL
- Spring Data JPA / Hibernate
- Spring Security y JWT
- Maven
- Git y GitHub

## ¿Qué se puede hacer?

**Productos**
- Agregar y consultar productos.
- Modificar sus datos y eliminarlos.
- Registrar precios de compra, venta y stock.

**Marcas y categorías**
- Agregar, consultar, modificar y eliminar marcas y categorías.

**Usuarios y roles**
- Administrar usuarios y roles.
- Iniciar sesión.
- Proteger las API usando JWT.

## Base de datos

Usamos PostgreSQL con cinco tablas principales: `productos`, `marcas`, `categorias`, `usuarios` y `roles`.

Los productos están relacionados con las marcas y las categorías. Los usuarios están relacionados con los roles.

Dejamos los scripts SQL en otro repositorio para tener mejor organizado el trabajo:

[Repositorio de la base de datos](https://github.com/Alexiscataldo/Base-de-datos-Techmanager)

## Cómo nos dividimos el trabajo

**Valentín Zunino**

Me encargué de la parte de productos, marcas y categorías: entidades, repositorios, servicios y controladores para las operaciones CRUD. También trabajé en las tablas SQL de esos módulos.

**Alexis Cataldo**

Se encargó de usuarios, roles y autenticación: clases para administrar usuarios, iniciar sesión y trabajar con JWT. También hizo las tablas SQL de usuarios y roles y la configuración general del proyecto.

Cada uno subió su parte a su propia rama de GitHub y después unimos los cambios a `main` mediante Pull Requests. Así queda el historial de lo que hizo cada uno.

## Cómo ejecutar el backend

Para probar el proyecto necesitamos Java, PostgreSQL y Maven (el repositorio incluye el wrapper de Maven).

1. Crear una base de datos PostgreSQL llamada `techmanager_db`.
2. Ejecutar los archivos `01_productos_inventario.sql` y `02_usuarios_roles.sql` del repositorio SQL.
3. Configurar las variables de entorno para la conexión: `DB_URL`, `DB_USERNAME`, `DB_PASSWORD` y `JWT_SECRET`. La clave JWT debe ser segura y estar codificada en Base64. No subir contraseñas ni claves reales a GitHub.
4. Desde la carpeta del backend, iniciar la aplicación:

```bash
bash mvnw spring-boot:run
```

El backend se ejecuta normalmente en `http://localhost:8080`.

## Algunas API del proyecto

- `/auth/bootstrap-status`, `/auth/bootstrap` y `/auth/login`: autenticación.
- `/usuarios` y `/roles`: administración de usuarios y roles.
- `/productos`, `/marcas` y `/categorias`: gestión de inventario.

Para usar las rutas protegidas hay que iniciar sesión y enviar el token JWT.

## Pruebas que hicimos

Durante el trabajo fuimos comprobando que el proyecto compile con Maven, que Spring Boot arranque, que se conecte a PostgreSQL y que las tablas y sus relaciones estén creadas.

También probamos el login y las operaciones CRUD de los módulos.

## Integrantes

- Valentín Zunino
- Alexis Cataldo

Proyecto realizado como trabajo práctico para la facultad.
