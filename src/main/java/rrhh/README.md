# Análisis y corrección SOLID — Paquete: rrhh

## 1) Principio SOLID vulnerado principalmente
**Principio (SRP / OCP / LSP / DIP):**
DIP (Dependency Inversion Principle)
## 2) Justificación con evidencias
**Clase(s) y/o método(s) donde se concentra el problema:**
- La clase AltaEmpleado dependia de las clases GeneradorContraseña y EmpleadoRepositorio.

**Síntomas que lo delatan (marca y explica brevemente):**
-Que se tenia que declarar las dos clases dento de AltaEmpleado

## 3) Inconvenientes del diseño actual
**Indica cambios futuros caros o arriesgados, partes difíciles de probar o mantener, errores fáciles de introducir si el proyecto crece...:**
-Que si cambias GeneradorContraseña o EmpleadoRepositorio habtia que cambiar AltaEmpleado tambien

## 4) Propuesta y aplicación de la corrección
**Describe la refactorización (qué extraes, qué conviertes en interfaz, qué separas, etc.):**
-He transformado EmpleadoRepositorio y GeneradorContraseñas a interfaces y he llamado a esas interfaces desde
la clase AltaEmpleado.