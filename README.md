# Documentación del Proyecto: Sistema Gestor de Tareas
ALUMNO: JUNIOR ALEJANDRO CHAPOÑAN MORILLAS
## 1. Gestión de Usuarios
- **Registro:** Implementado en `AuthController` y `UserService`. Se utiliza `BCryptPasswordEncoder` para cifrar las contraseñas antes de guardarlas.
- **Inicio de Sesión:** Manejado por Spring Security y un controlador personalizado que genera un token **JWT**.
- **Seguridad JWT:** El token se almacena en una **Cookie HttpOnly** para protegerlo contra ataques XSS y se envía en cada petición para autenticar al usuario.

## 2. Operaciones CRUD
- **Entidad Task:** Contiene título, descripción, fecha de vencimiento y prioridad.
- **Controlador TaskController:** Implementa las operaciones de creación, lectura, actualización y eliminación.
- **Persistencia:** Se utiliza **Spring Data JPA** con una base de datos H2 (en memoria) para facilitar las pruebas, pero es fácilmente migrarle a MySQL o PostgreSQL.

## 3. Seguridad
- **Spring Security:** Configurado para proteger todas las rutas excepto login y registro.
- **JWT:** Implementado desde cero con `jjwt`. Incluye un `JwtTokenProvider` para generar/validar tokens y un `JwtAuthenticationFilter` para procesarlos.
- **Roles:** Cada usuario registrado recibe por defecto el rol `ROLE_USER`.

## 4. Interfaz de Usuario
- **Thymeleaf:** Motor de plantillas utilizado para renderizar las vistas dinámicamente desde el servidor.
- **Bootstrap 5:** Utilizado para garantizar que la aplicación sea **responsiva** y tenga un diseño moderno y limpio.

## 5. Despliegue
- **Producción:** Se recomienda el uso de Docker para empaquetar la aplicación.
- **Configuración:** Es necesario cambiar la base de datos H2 por una persistente (como MySQL) en el archivo `application.properties` de producción.
