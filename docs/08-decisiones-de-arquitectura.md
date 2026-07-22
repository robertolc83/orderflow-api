# Architecture Decision Record

# ADR-001 

## Título

La documentación del proyecto se mantendrá mediante Documentación Viva.

## Estado

Aceptada

## Contexto

El proyecto OrderFlow busca convertirse en una guía de aprendizaje para arquitectura de software.

## Decisión

La documentación estará compuesta por ocho documentos principales que evolucionarán durante toda la vida del proyecto.

No se crearán documentos adicionales para cada funcionalidad.

Cada nueva implementación actualizará únicamente los documentos afectados.

## Consecuencias

La documentación permanecerá centralizada.

Será sencilla de mantener.

Reflejará siempre el estado actual del sistema.

# ADR-002

## Título

Separación entre el lenguaje del negocio y la implementación.

## Decisión

La documentación utilizará los términos propios del negocio en español.

La implementación utilizará nombres técnicos en inglés.

## Ejemplos

| Documentación | Código      |
| ------------- | ----------- |
| Cliente       | Customer    |
| Orden         | Order       |
| Item          | OrderItem   |
| Estado        | OrderStatus |

## Justificación

La documentación debe ser comprensible para cualquier participante del proyecto, incluyendo analistas y usuarios del negocio.

El código seguirá las convenciones más comunes del desarrollo backend con Java, utilizando nombres en inglés.

# ADR-003

## Título

Los importes monetarios derivados serán calculados por el sistema.

## Decisión

Los atributos:

- totalPrice
- totalAmount

no serán capturados por el usuario.

Serán calculados automáticamente.

## Justificación

Evitar inconsistencias entre el detalle de la orden y el total.

# ADR-004

## Título

Adoptar arquitectura hexagonal ligera

## Contexto

El sistema requiere separar dominio y tecnología.

## Decisión

Usar separación Domain/Application/Infrastructure.

## Justificación

Mayor claridad, ligera complejidad inicial.