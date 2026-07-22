# 07. Arquitectura del Sistema

## Información del documento

**Proyecto:** OrderFlow

**Repositorio:** orderflow-api

**Versión:** 1.0

**Estado:** 🟡 Borrador

**Autor:** Roberto López

**Última actualización:** 13/07/2026


---

# Objetivo

Definir la arquitectura base del sistema OrderFlow,
estableciendo la separación de responsabilidades entre
las diferentes capas de la aplicación.


# Estilo arquitectónico

OrderFlow utilizará una arquitectura basada en principios
de Arquitectura Hexagonal (Ports and Adapters).

El objetivo principal es mantener el dominio del negocio
independiente de detalles técnicos como frameworks,
bases de datos o interfaces externas.

Controller → Use Case → Port → Adapter → Database

# Capas principales


## Domain Layer

Responsabilidad:

Contener las reglas del negocio y los modelos principales.

Incluye:

- Customer
- Order
- OrderItem
- OrderStatus


## Application Layer

Responsabilidad:

Coordinar los casos de uso del sistema.

Ejemplos:

- Crear orden
- Consultar órdenes


## Infrastructure Layer

Responsabilidad:

Contener implementaciones técnicas.

Incluye:

- Controllers REST
- Persistencia JPA
- Configuración externa


# Principios arquitectónicos


## Separación de responsabilidades

Cada componente debe tener una única responsabilidad.


## Independencia del dominio

El dominio no debe depender de frameworks externos.


## Bajo acoplamiento

Los componentes deben comunicarse mediante contratos.

# Organización de paquetes

├── domain
│
│   ├── model
│   │
│   ├── Customer.java
│   ├── Order.java
│   ├── OrderItem.java
│   └── OrderStatus.java
│
│
├── application
│
│   ├── usecase
│   │
│   ├── CreateOrderUseCase.java
│   └── CreateCustomerUseCase.java
│
│
├── infrastructure
│
│   ├── controller
│   │
│   ├── persistence
│   │
│   └── config
