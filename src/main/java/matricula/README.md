# Análisis y corrección SOLID — Paquete: matricula

## 1) Principio SOLID vulnerado principalmente
**Principio (SRP / OCP / LSP / DIP):**
- SRP

## 2) Justificación con evidencias
**Clase(s) y/o método(s) donde se concentra el problema:**
- El problema se concentra en la clase MatriculaService.java porque hace demasiadas cosas en una misma clase y lo podrias dividirlo en otras clases

**Síntomas que lo delatan (marca y explica brevemente):**
- Esta clase está haciendo demasiadas cosas a la vez: valida que el DNI sea correcto, calcula el precio final con sus descuentos, guarda la matrícula en una lista y encima imprime avisos por consola.


- Si quiero cambiar el formato del DNI o modificar cómo se aplican los descuentos tengo que tocar el mismo archivo.

## 3) Inconvenientes del diseño actual
**Indica cambios futuros caros o arriesgados, partes difíciles de probar o mantener, errores fáciles de introducir si el proyecto crece...:**
- Es un código difícil de mantener. Si el proyecto crece y decidimos que el descuento ya no es del 15% o que el DNI tiene que validarse en una base de datos real, el MatriculaService se volvería gigante y daria muchos errores.

## 4) Propuesta y aplicación de la corrección
**Describe la refactorización (qué extraes, qué conviertes en interfaz, qué separas, etc.):**
- Para corregirlo hemos creado 2 clases más una que es ValidaDni.java y otra CalculadoraPrecios.java y a estas 2 clases le hemos puesto los metodos correspondientes a cada una y poner los metodos como static.