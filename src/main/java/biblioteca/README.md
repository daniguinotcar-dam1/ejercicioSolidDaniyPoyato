# Análisis y corrección SOLID — Paquete: biblioteca

## 1) Principio SOLID vulnerado principalmente
**Principio (SRP / OCP / LSP / DIP):**  
LSP (Liskov Substitution Principle)
## 2) Justificación con evidencias
**Clase(s) y/o método(s) donde se concentra el problema:**
- Al poder prestarse todos los libros se tiene que poner en los libros referencia que esta asignado a una sala que no existe.

**Síntomas que lo delatan (marca y explica brevemente):**
-La Jerarquia esta mal hecha porque hay clases que no se pueden prestar.

## 3) Inconvenientes del diseño actual
**Indica cambios futuros caros o arriesgados, partes difíciles de probar o mantener, errores fáciles de introducir si el proyecto crece...:**
-Si se hace un codigo y se hace una clase sala o algo que utilice el String SALA habria que cambiar otra vez el libro prestado

## 4) Propuesta y aplicación de la corrección
**Describe la refactorización (qué extraes, qué conviertes en interfaz, qué separas, etc.):**
-Para solucionarlo lo que habria que hacer sería crear dos interfaces una para poder prestarse
y otra que no permita prestar y dentro de la biblioteca que solo se puedan prestar las clases
que tengan de interfaz de prestable.