Markdown
# Orders Backend API

Este proyecto es un backend robusto construido con **Spring Boot** enfocado en la gestión de órdenes de compra y clientes. 
El ecosistema está completamente contenedorizado para el desarrollo local, asegurando un entorno consistente y fácil de desplegar.

## 🚀 Tecnologías Principales
* **Java 17**
* **Spring Boot 4.1** (Spring Web, Spring Data JPA, Jakarta Validation)
* **PostgreSQL 16**
* **Lombok**
* **Docker & Docker Compose**

* ## 🛠️ Requisitos Previos
Antes de arrancar la aplicación, asegúrate de tener instalado lo siguiente en tu entorno de desarrollo (WSL2 / Linux / Mac / Windows):
1.  [Docker Desktop](https://www.docker.com/products/docker-desktop/) (con soporte para WSL2 si estás en Windows).
2.  [Java Development Kit (JDK)](https://oracle.com/java/technologies/downloads/) instalado y configurado.
3.  [Postman](https://www.postman.com/) o cualquier cliente HTTP para probar los endpoints.

---

## 🏁 Instrucciones para Arrancar el Proyecto

Sigue estos sencillos pasos para levantar la base de datos y la aplicación en tu máquina local:

### 1. Clonar el repositorio
Si acabas de descargar el proyecto, abre tu terminal y navega a la carpeta raíz:
```bash
cd orders-backend

docker compose up -d

Nota: Esto creará automáticamente la base de datos orders_db y expondrá el puerto 5432.
