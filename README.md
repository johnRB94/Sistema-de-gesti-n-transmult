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

🟢 **Sprint 1 – Control de Versiones y Colaboración (Finalizado)**  
En este sprint se configuró el repositorio Git con una estructura profesional, definiendo la estrategia de ramas, la convención de commits y la protección de las ramas principales.  
Además, se implementaron Pull Requests obligatorios, plantillas de Issues y se documentó el flujo de trabajo colaborativo, incluyendo el versionado y las evidencias de colaboración.

---

🟢 **Sprint 2 – Gestión Ágil y Seguimiento (Finalizado)**  
Durante este sprint se organizó la gestión ágil del proyecto, creando el backlog del producto, definiendo sprints y milestones, y configurando un tablero Kanban para el seguimiento del trabajo.  
Asimismo, se priorizaron las historias de usuario, se registraron métricas del proyecto y se documentaron retrospectivas, manteniendo la trazabilidad entre historias y tareas.

---

🟡 **Sprint 3 – Integración y Entrega Continua (Próximamente)**  
Este sprint estará orientado a la configuración del pipeline de integración continua, automatizando la compilación del proyecto, la ejecución de pruebas y el análisis de calidad del código.  
También se documentarán los resultados del pipeline y se integrarán indicadores de estado del proyecto.

---

🔵 **Sprint 4 – Contenedores y Despliegue (Próximamente)**  
En el sprint final se realizará la contenerización y el despliegue de la aplicación, mediante la creación de imágenes Docker, configuración de servicios y validación de la ejecución del sistema.  
Finalmente, se preparará la versión final del proyecto, cerrando incidencias y completando la documentación correspondiente.

---

## 📊 Seguimiento y Documentación de Avances por Sprint

El desarrollo del sistema **TRASMULT** se gestiona bajo un enfoque ágil, estructurado en sprints.  
En esta sección se documentan los avances, actividades realizadas y evidencias correspondientes a cada sprint del proyecto.

---

### 🚀 Sprint 1 – Control de Versiones y Colaboración

Durante este sprint se establecieron las bases del trabajo colaborativo y el control de versiones del proyecto, permitiendo una correcta organización del código y la colaboración del equipo mediante GitHub.

**Actividades realizadas:**
- Configuración del repositorio Git con una estructura profesional.
- Definición de la estrategia de ramas y convención de commits.
- Configuración de protección de la rama principal.
- Implementación del uso obligatorio de Pull Requests.
- Gestión de conflictos de fusión durante el trabajo colaborativo.
- Configuración de plantillas para Issues y Pull Requests.
- Documentación del flujo de trabajo colaborativo.
- Gestión de versionado del proyecto.
- Configuración del repositorio remoto en la nube (GitHub).
- Registro de evidencias de colaboración mediante commits y Pull Requests.

**Estado:** 🟢 Completado

---

### 🚀 Sprint 2 – Gestión Ágil y Seguimiento

En este sprint se trabajó en la organización y seguimiento del proyecto aplicando prácticas ágiles, permitiendo una mejor planificación y control del desarrollo.

**Actividades realizadas:**
- Configuración de la herramienta de gestión del proyecto en GitHub.
- Creación del backlog del producto basado en historias de usuario.
- Definición de sprints y milestones del proyecto.
- Configuración de un tablero Kanban para el seguimiento de tareas.
- Gestión y seguimiento de incidencias mediante Issues.
- Priorización de historias de usuario según valor, urgencia y complejidad.
- Registro de métricas del proyecto (commits, issues, progreso por sprint).
- Documentación de retrospectivas del sprint.
- Definición de roles y responsabilidades del equipo.
- Mantenimiento de la trazabilidad entre historias de usuario y tareas.

**Estado:** 🟡 En desarrollo

---

### 🔜 Próximos Sprints

- **Sprint 3:** Implementación y mejora de funcionalidades del sistema.
- **Sprint 4:** Optimización, pruebas finales y documentación del proyecto.

Estos sprints serán documentados progresivamente conforme avance el desarrollo del proyecto.

---


## 👨‍💻 Autores

* **Del Castillo Hoyos, Fabricio Sebastian**
* **Moron Tejeda, Diego Sebastian**
* **Sencio De La Cruz, Franco David**
* **Dick Daniel´s Miranda Silva**
* **John Luis Ramos Bautista**

---

📌 *Este repositorio forma parte de un proyecto académico y tiene fines educativos.*
