# 06. Diagrama de Clases

## Información del documento

**Proyecto:** OrderFlow

**Repositorio:** orderflow-api

**Versión:** 1.0

**Estado:** 🟡 Borrador

**Autor:** Roberto López

**Última actualización:** 02/07/2026

---

## Objetivo

Representar gráficamente las entidades del dominio y las relaciones existentes entre ellas.

El objetivo del diagrama es facilitar la comprensión del modelo del dominio antes de su implementación.

## Relación Cliente - Orden

### Descripción

Un Cliente puede realizar una o varias Órdenes.

Cada Orden pertenece exclusivamente a un Cliente.

### Tipo de relación

Asociación

### Cardinalidad

Customer (1) -------- (*) Order

### Justificación

Una Orden no puede existir sin un Cliente.

Sin embargo, un Cliente puede existir aunque todavía no tenga Órdenes.

## Relación Orden - Item

### Descripción

Una Orden está compuesta por uno o varios Items.

Cada Item pertenece exclusivamente a una Orden.

### Tipo de relación

Composición

### Cardinalidad

Order (1) -------- (*) OrderItem

### Justificación

Un Item no tiene sentido fuera de una Orden.

Si una Orden desaparece, sus Items también desaparecen.

## Relación Orden - Estado

### Descripción

Toda Orden posee un Estado que representa la etapa actual de su ciclo de vida.

### Tipo de relación

Objeto de Valor

### Cardinalidad

Order (1) -------- (1) OrderStatus
