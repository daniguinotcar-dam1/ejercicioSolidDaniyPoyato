# Análisis y corrección SOLID — Paquete: mensajes

## 1) Principio SOLID vulnerado principalmente
**Principio (SRP / OCP / LSP / DIP):**
- OCP

## 2) Justificación con evidencias
**Clase(s) y/o método(s) donde se concentra el problema:**
- El porblema esta en la clase Mensaje.java y GeneradorTextoMensajes.java que tienen demasiado codigo y ese codigo se puede separar en otras 2 clases

**Síntomas que lo delatan (marca y explica brevemente):**
- El generador está lleno de if que preguntan por el TipoMensaje. Esto hace que cuando vayamos a poner un tipo nuevo de mensaje tendremos que añadir un if nuevo.
- Tambien la clase Mensaje.java tenia atributos que no pertenecian en si a esa clase

## 3) Inconvenientes del diseño actual
**Indica cambios futuros caros o arriesgados, partes difíciles de probar o mantener, errores fáciles de introducir si el proyecto crece...:**
- Cada vez que añadimos una funcionalidad nueva corremos el riesgo de romper las que ya funcionaban porque estamos modificando el corazon del generador.

## 4) Propuesta y aplicación de la corrección
**Describe la refactorización (qué extraes, qué conviertes en interfaz, qué separas, etc.):**
- La refactorizacion que hemos hecho es añadir 2 clases mas que heredan de mensaje y hacer la clase Mensaje.java como una clase abstracta