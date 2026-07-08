# 05. Modelo Del Dominio

# Entidades

## Cliente

### Propósito

Representa a la persona o empresa que solicita órdenes dentro del sistema.

### Responsabilidad

Ser el propietario de las órdenes.

### Atributos

| Atributo | Tipo | Obligatorio | Descripción | Origen |
|----------|------|-------------|-------------|--------|
| id | Long | Sí | Identificador único | Sistema |
| name | String | Sí | Nombre del cliente | Usuario |
| email | String | Sí | Correo electrónico | Usuario |
| phone | String | No | Teléfono | Usuario |
| active | Boolean | Sí | Indica si el cliente está activo | Sistema |

### Reglas relacionadas

RN-001

RN-002

RN-003

RN-004

## Orden

### Propósito

Documentar de forma ordenada una solicitud por el cliente.

### Responsabilidad

Documentar y facilitar su administración hasta ser cerrada o cancelada.

### Atributos

| Atributo | Tipo | Obligatorio | Descripción | Origen |
|----------|------|-------------|-------------|--------|
| id | Long | Sí | Identificador único | Sistema |
| customer | Customer | Sí | Identificador para el cliente | Sistema |
| status | OrderStatus | Sí | Estatus de la orden | Sistema |
| createdAt | LocalDateTime | Sí | Fecha de creación | Sistema |
| updatedAt | LocalDateTime | No | Fecha de actualización | Sistema |
| totalAmount | Calculado | NA | Cantidad total de la orden | Sistema |

### Reglas relacionadas

RN-005

RN-006

RN-007

RN-008

RN-009

## Item

### Propósito

Representar una línea de una orden que describe un producto o servicio solicitado.

### Responsabilidad

Es la razón de ser de la orden y proporciona el valor/cantidad de la orden.

### Atributos

| Atributo | Tipo | Obligatorio | Descripción | Origen |
|----------|------|-------------|-------------|--------|
| id | Long | Sí | Identificador único | Sistema |
| order | Order | Sí | Identificador para la orden | Sistema |
| productName | String | Sí | Nombre del producto | Usuario|
| quantity | int | Sí | Cantidad del producto o servicio solicitado | Usuario |
| unitPrice | BigDecimal | Sí | Precio unico del producto o servicio | Usuario |
| totalPrice | Calculado | NA | precio total de los productos o servicios | Sistema |

### Reglas relacionadas

RN-010

RN-011

RN-012

# Objetos de Valor

## Estado

Representa el estado actual de una orden.

Valores permitidos:

CREATED

PROCESSING

COMPLETED

CANCELED


| Concepto del negocio | Implementación |
| -------------------- | -------------- |
| Cliente              | Customer       |
| Orden                | Order          |
| Item                 | OrderItem      |
| Estado               | OrderStatus    |
