# 03. Reglas de Negocio

## Información del documento

**Proyecto:** OrderFlow

**Repositorio:** orderflow-api

**Versión:** 1.0

**Estado:** 🟢 Aprobado

**Autor:** Roberto López

**Última actualización:** 01/07/2026

---

## Objetivo

Definir las reglas de negocio que gobiernan el comportamiento del sistema OrderFlow.

Estas reglas son independientes de la tecnología utilizada y representan las políticas del negocio.

---

## Reglas de negocio

## Cliente

### RN-001

#### Todo cliente debe tener un nombre.

### RN-002

#### Todo cliente debe tener un correo electrónico válido.

### RN-003

#### Un cliente puede tener cero o muchas órdenes.

### RN-004

#### No se podrá eliminar un cliente que tenga órdenes activas.

## Orden

### RN-005

#### Toda orden pertenece a un único cliente.

### RN-006

#### Toda orden debe contener al menos un Item.

### RN-007

#### Toda orden inicia en estado CREATED.

### RN-008

#### La fecha de creación es asignada por el sistema.

### RN-009

#### Una orden solo puede cambiar a estados válidos según su ciclo de vida.

## Item

### RN-010

#### Todo Item pertenece a una única orden.

### RN-011

#### La cantidad debe ser mayor que cero.

### RN-012

#### El precio unitario debe ser mayor o igual a cero.