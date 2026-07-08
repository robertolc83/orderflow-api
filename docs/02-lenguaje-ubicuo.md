#  02. Lenguaje Ubicuo

## Objetivo

Definir el significado de los conceptos principales del dominio para garantizar que usuarios, analistas, desarrolladores y arquitectos utilicen el mismo lenguaje durante todo el proyecto.

## Cliente

Persona o empresa que solicita productos o servicios mediante una orden.

### Responsabilidad

Iniciar el proceso de compra.

### Relacionado con

- Orden

### Reglas asociadas

- Un cliente puede tener muchas órdenes.
- Una orden pertenece a un único cliente.

## Orden

Solicitud realizada por un cliente para adquirir uno o varios productos o servicios.

### Responsabilidad

Representar el proceso completo de una solicitud desde su creación hasta su finalización.

### Relacionado con

- Cliente
- Item
- Estado

### Reglas asociadas

- Toda orden pertenece a un cliente.
- Toda orden debe tener al menos un Item.
- Toda orden inicia con estado CREATED.

## Estado

Representa la situación actual de una orden durante su ciclo de vida.

### Valores

**CREATED**

La orden fue registrada correctamente.

**PROCESSING**

La orden está siendo atendida.

**COMPLETED**

La orden terminó exitosamente.

**CANCELED**

La orden fue cancelada.

## Item

Producto o servicio solicitado dentro de una orden.

### Responsabilidad

Representar una línea individual de una orden.

### Reglas asociadas

- Todo Item pertenece a una única orden.
- La cantidad debe ser mayor que cero.

### Nota

En la implementación del sistema este concepto será representado por la entidad `OrderItem`.

## Administrador

Usuario responsable de gestionar el ciclo de vida de las órdenes.

### Responsabilidad

Consultar, actualizar y supervisar las órdenes del sistema.


| Concepto      | Descripción                                 | Documento relacionado |
| ------------- | ------------------------------------------- | --------------------- |
| Cliente       | Persona o empresa que solicita una orden.   | Modelo del Dominio    |
| Orden         | Solicitud realizada por un cliente.         | Modelo del Dominio    |
| Item          | Producto o servicio contenido en una orden. | Modelo del Dominio    |
| Estado        | Situación actual de una orden.              | Reglas de Negocio     |
| Administrador | Usuario encargado de gestionar órdenes.     | Casos de Uso          |
