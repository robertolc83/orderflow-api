# 04. Casos de Uso

## Información del documento

**Proyecto:** OrderFlow

**Repositorio:** orderflow-api

**Versión:** 1.0

**Estado:** 🟡 Borrador

**Autor:** Roberto López

**Última actualización:** 03/07/2026

---

# Objetivo

Definir las interacciones entre los actores del sistema y las funcionalidades principales proporcionadas por OrderFlow.

Los casos de uso representan el comportamiento esperado del sistema desde la perspectiva del negocio.

---

# Actores

## Cliente

Persona o empresa que solicita órdenes.

## Administrador

Persona responsable de gestionar las órdenes dentro del sistema.

---

# CU-001 Crear Orden

## Actor principal

Cliente

## Objetivo

Crear una nueva orden asociada a un cliente.

## Precondiciones

- El cliente debe existir.
- La información de la orden debe cumplir las reglas de negocio.

## Flujo principal

1. El cliente solicita crear una orden.
2. El sistema valida la información recibida.
3. El sistema valida que el cliente existe.
4. El sistema registra los Items asociados.
5. El sistema crea la orden.
6. El sistema asigna el estado inicial CREATED.
7. El sistema calcula los valores derivados.
8. El sistema almacena la orden.
9. El sistema devuelve la orden creada.

## Flujos alternos

### FA-001 Cliente inexistente

El sistema rechaza la operación.

### FA-002 Orden sin Items

El sistema rechaza la creación porque una orden debe contener al menos un Item.

### FA-003 Cantidad inválida

El sistema rechaza Items con cantidad menor o igual a cero.