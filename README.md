# 🚚 Sistema de Gestión de Inventarios – **TRASMULT**

---

## 📌 Descripción del Proyecto

El proyecto **TRASMULT** es un sistema web de gestión de inventarios desarrollado como parte del curso **Herramientas de Desarrollo** de la **Universidad Tecnológica del Perú (UTP)**, correspondiente al **Ciclo Verano 2026**.

El sistema permite controlar productos, registrar entradas y salidas, y gestionar el acceso de usuarios según roles definidos, brindando soporte a los procesos operativos de una empresa de transporte y logística.

---

## 🏫 Contexto Académico

* **Curso:** Herramientas de Desarrollo
* **Universidad:** Universidad Tecnológica del Perú (UTP)
* **Ciclo:** Verano 2026
* **Caso de negocio:** Sistema Innovador de Soporte Operacional

Este proyecto se desarrolla bajo un **enfoque ágil**, organizado en **cuatro sprints**, utilizando control de versiones y colaboración mediante **GitHub**.

---

## 🎯 Objetivo del Proyecto

Diseñar e implementar un sistema web que permita la gestión eficiente del inventario de la empresa **TRASMULT**, facilitando:

* El control de productos
* La supervisión del stock
* El registro de movimientos
* La aplicación de buenas prácticas de desarrollo y herramientas modernas

---

## 📦 Alcance

El sistema contempla las siguientes funcionalidades:

* 🔐 Inicio y cierre de sesión de usuarios
* 📦 Gestión de productos (registro, edición y eliminación)
* 🔄 Registro de entradas y salidas de inventario
* 📊 Visualización de stock y movimientos
* 👥 Control de acceso según roles
* 💾 Persistencia de datos mediante almacenamiento local

---

## 👥 Roles de Usuario

El sistema está orientado a los siguientes usuarios finales:

* **Administrador**

  * Gestión total del sistema y control de usuarios

* **Almacenero**

  * Registro de productos y movimientos de inventario

* **Supervisor**

  * Visualización y supervisión del inventario y reportes

---

## 🛠️ Tecnologías Utilizadas

* 🧩 HTML5
* 🎨 CSS3
* ⚙️ JavaScript
* 📐 Bootstrap
* 🌱 Git
* ☁️ GitHub

---

## 📁 Estructura del Repositorio

```text
Sistema-de-gestion-transmult/
│
├── Transmult_Proyecto_Final/
│ └── inventario/
│ ├── src/
│ │ ├── main/
│ │ │ ├── java/com/transmult/inventario/
│ │ │ │ ├── Config/
│ │ │ │ │ ├── DataLoader.java
│ │ │ │ │ ├── SecurityConfig.java
│ │ │ │ │ └── UsuarioDetailsService.java
│ │ │ │ ├── Controller/
│ │ │ │ │ ├── InicioController.java
│ │ │ │ │ ├── LoginController.java
│ │ │ │ │ ├── MovimientoController.java
│ │ │ │ │ ├── ProductoController.java
│ │ │ │ │ └── ReporteController.java
│ │ │ │ ├── Model/
│ │ │ │ │ ├── Movimiento.java
│ │ │ │ │ ├── Producto.java
│ │ │ │ │ └── Usuario.java
│ │ │ │ ├── Repository/
│ │ │ │ │ ├── MovimientoRepository.java
│ │ │ │ │ ├── ProductoRepository.java
│ │ │ │ │ └── UsuarioRepository.java
│ │ │ │ ├── Service/
│ │ │ │ │ ├── MovimientoService.java
│ │ │ │ │ ├── ProductoService.java
│ │ │ │ │ └── UsuarioService.java
│ │ │ │ └── InventarioApplication.java
│ │ │ └── resources/
│ │ │ ├── static/
│ │ │ │ ├── CSS/
│ │ │ │ │ ├── inicio.css
│ │ │ │ │ ├── login.css
│ │ │ │ │ ├── movimiento.css
│ │ │ │ │ ├── producto.css
│ │ │ │ │ ├── reporte.css
│ │ │ │ │ └── style.css
│ │ │ │ ├── JS/
│ │ │ │ │ ├── producto.js
│ │ │ │ │ ├── registroSalidaEntrada.js
│ │ │ │ │ └── reporte.js
│ │ │ │ └── img/
│ │ │ │ ├── PRODUCTO.png
│ │ │ │ └── trasmult.png
│ │ │ ├── templates/
│ │ │ │ ├── inicio.html
│ │ │ │ ├── login.html
│ │ │ │ ├── movimientos.html
│ │ │ │ ├── productos.html
│ │ │ │ └── reportes.html
│ │ │ └── application.properties
│ │ └── test/
│ │ └── java/com/transmult/inventario/
│ │ └── InventarioApplicationTests.java
│ ├── pom.xml
│ ├── mvnw
│ ├── mvnw.cmd
│ └── HELP.md
│
├── README.md
```

---

## 🚀 Metodología de Trabajo

El desarrollo del proyecto se realiza utilizando una **metodología ágil basada en sprints**.
Cada sprint incluye **historias de usuario** y **tareas técnicas**, las cuales se gestionan y evidencian mediante **GitHub** (commits, branches, issues y pull requests).

---

## 📊 Estado del Proyecto

🟢 **Sprint 1:** En desarrollo

El proyecto se encuentra en fase inicial, con la configuración del repositorio y la definición de las primeras historias de usuario.

---
🟢 **Sprint 2:** Gestión Ágil y Seguimiento
- Configurar herramienta de gestión de proyectos.

- Crear backlog del producto.

- Definir sprints y milestones.
📅Planificación y Control de Hitos (Milestones)
En esta fase del proyecto, se ha establecido la estructura temporal y los puntos de control críticos para garantizar el éxito del sistema de gestión Transmult. La planificación se divide en ciclos de trabajo iterativos y metas estratégicas alcanzables.
1. Definición de Sprints
Se han configurado cuatro Sprints principales para organizar el desarrollo incremental del software:

Sprint 1: Control de Versiones y Colaboración (Finalizado): Establecimiento del repositorio y flujo de trabajo inicial.

Sprint 2: Gestión Ágil y Seguimiento (En progreso): Implementación del tablero Kanban y monitoreo de tareas activas.

Sprint 3: Integración y Entrega Continua: Automatización de pruebas y despliegue.

Sprint 4: Contenedores y Despliegue: Finalización del producto y puesta en producción mediante contenedores.
2. Estado de los Milestones (Hitos)
A la fecha, se ha logrado el cumplimiento total de los siguientes hitos de planificación:
Hito,Estado,Progreso,Fecha Límite
Definir sprints y milestones,    ✅ Completado,100%, "5 de febrero, 2026"
Gestionar versionado y releases, ✅ Completado,100%, "28 de enero, 2026"

- Configurar tablero Kanban o Scrum.

- Gestionar incidencias.

- Priorizar historias de usuario.

- Registrar métricas del proyecto.

- Documentar retrospectivas.

- Definir roles y responsabilidades.

- Mantener trazabilidad historias–tareas.

## 👨‍💻 Autores

* **Del Castillo Hoyos, Fabricio Sebastian**
* **Moron Tejeda, Diego Sebastian**
* **Sencio De La Cruz, Franco David**
* **Dick Daniel´s Miranda Silva**
* **John Luis Ramos Bautista**

---

📌 *Este repositorio forma parte de un proyecto académico y tiene fines educativos.*
