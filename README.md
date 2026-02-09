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

#### ✅ Actividades realizadas

- **Configuración del repositorio Git con una estructura profesional:**  
  Se creó el repositorio del proyecto en GitHub, organizando los archivos y carpetas de forma clara y coherente, facilitando la comprensión del código y el mantenimiento del sistema.

- **Definición de la estrategia de ramas y convención de commits:**  
  Se estableció una estrategia de ramas que permitió separar el desarrollo de nuevas funcionalidades de la versión principal del proyecto. Asimismo, se definió una convención de commits clara y descriptiva para mantener un historial de cambios comprensible.

- **Configurar protección de ramas principales:**  
  Se configuró la protección de la rama principal para evitar cambios directos no controlados, asegurando que todas las modificaciones pasen por un proceso de revisión antes de integrarse al proyecto.

- **Implementar Pull Requests obligatorios:**  
  Se estableció el uso obligatorio de Pull Requests como mecanismo para integrar cambios, promoviendo la revisión del código y mejorando la calidad del desarrollo colaborativo.

- **Gestionar conflictos de fusión:**  
  Se identificaron y resolvieron conflictos de fusión derivados del trabajo simultáneo del equipo, aplicando buenas prácticas para mantener la integridad del código.

- **Configurar plantillas de Issues y Pull Requests:**  
  Se crearon plantillas para Issues y Pull Requests, estandarizando la forma de reportar incidencias y proponer cambios, lo que facilitó la comunicación y el seguimiento del trabajo.

- **Documentar flujo de trabajo colaborativo:**  
  Se documentó el flujo de trabajo del equipo, describiendo el proceso desde la creación de ramas hasta la aprobación e integración de cambios, asegurando que todos los integrantes sigan las mismas pautas.

- **Gestionar versionado y releases:**  
  Se aplicó un esquema de versionado para identificar los avances del proyecto, permitiendo un mejor control de las entregas y cambios realizados durante el desarrollo.

- **Configurar repositorio remoto en la nube:**  
  El proyecto fue centralizado en un repositorio remoto en GitHub, permitiendo el acceso compartido, la sincronización del código y el trabajo colaborativo en la nube.

- **Documentar evidencias de colaboración:**  
  Se generaron evidencias del trabajo colaborativo a través de commits, Pull Requests y registros de actividad en GitHub, demostrando la participación activa de los integrantes del equipo.

---

### 🚀 Sprint 2 – Gestión Ágil y Seguimiento

En este sprint se trabajó en la organización y seguimiento del proyecto aplicando prácticas ágiles, permitiendo una mejor planificación y control del desarrollo.

**Actividades realizadas:**
- Configurar herramienta de gestión de proyectos:
Estos dos archivos son idénticos: ambos muestran un Tablero Kanban con cuatro columnas de estado (POR HACER, EN PROCESO, HECHO, APROBADO), utilizado para organizar tareas en un proyecto de desarrollo de software.
La estructura es clara y refleja el flujo de trabajo típico en metodologías ágiles o de gestión visual:
•	POR HACER: Incluye tareas pendientes como crear el repositorio Git, definir la estructura de ramas y configurar archivos base.
•	EN PROCESO: Muestra tareas en ejecución, con porcentajes de progreso indicados (ej: 25% en estructura inicial del proyecto).
•	HECHO: Tareas ya completadas, como la reunión inicial y la asignación de roles.
•	APROBADO: Aún vacía, indicando que no hay entregables revisados y aceptados formalmente.
Se nota que el equipo está en fase inicial del proyecto (configuración de repositorio, entorno y estructura), con responsabilidades asignadas claramente (Líder Técnico, DevOps, Product Owner, etc.).
Los dos archivos parecen ser copias del mismo tablero, posiblemente enviadas en momentos distintos o como respaldo.

  
- Crear backlog del producto:

  
- Definir sprints y milestones:
Se establecieron hitos temporales vinculados a los entregables del ciclo académico para asegurar el cumplimiento de los objetivos en las fechas previstas.
Milestone,Fecha de Entrega,Estado,Descripción

### **Planificación de Sprints y Milestones**

| Milestone | Fecha de Entrega | Estado | Descripción |
| :--- | :--- | :--- | :--- |
| **Gestionar versionado y releases** | 28 de enero, 2026 | ✅ Finalizado | Configuración de base, GitFlow y primera versión estable. |
| **Definir sprints y milestones** | 05 de febrero, 2026 | ✅ Finalizado | Planificación ágil, creación de Issues y organización del Project Board. |
| **Validar ejecución del sistema** | 06 de marzo, 2026 | 🔵 En curso | Pruebas finales, despliegue y cierre del proyecto. |

## 🔄 Organización de Sprints

El desarrollo se ha estructurado en unidades de tiempo orientadas a entregables incrementales, asegurando la calidad en cada fase:

* **🚀 Sprint 1: Control de Versiones  (closed)**
    * *Infraestructura de colaboración, estrategia de ramas y base del repositorio.*
* **📋 Sprint 2: Gestión Ágil  (closed)**
    * *Documentación de Historias de Usuario (HU), Backlog y tablero Kanban.*
* **🛠️ Sprint 3: Integración Continua (open)**
    * *Configuración de Pipeline CI/CD y automatización de pruebas unitarias.*
* **🐳 Sprint 4: Despliegue y Entrega (open)**
    * *Contenedorización con Docker y validación final en entorno de producción.*
  
- Configurar tablero Kanban o Scrum:
Tablero de historias de usuario organizado en un entorno de gestión ágil (posiblemente Trello o Jira), clasificado por prioridad (Alta, Media, Baja) y con un enfoque en funcionalidades para un sistema de gestión de inventario, especialmente desde el rol de Administrador.
Estructura principal:
•	Columnas de flujo: Entrada → Proceso → Salida → Mejoras Futuras (metodología visual de proceso).
•	Historias de usuario agrupadas por prioridad, con énfasis en:
o	Alta: Validación de campos, exportación de reportes, historial de cambios, alertas de stock bajo.
o	Media: Ordenamiento de productos, reporte de inventario general.
o	Baja: Persistencia de datos, control de acceso por sesión.
Observaciones:
•	El sistema parece estar en fase de definición de requisitos.
•	Hay claros indicios de duplicidad (ej: “Visualización del stock bajo” aparece en Alta y Media).
•	Se menciona explícitamente Jira al final, lo que sugiere que este tablero podría ser una planificación previa a su implementación en dicha herramienta.
•	Las “Mejoras Futuras” incluyen funcionalidades avanzadas como sistema multi-almacén.
Ambos archivos son claramente la misma captura de pantalla o vista de tablero, posiblemente compartida en diferentes momentos o contextos.

  
- Gestionar incidencias:

  
- ### Priorización de Historias de Usuario:

| ID | Historia de Usuario | Rol | Prioridad | Justificación |
|----|--------------------|-----|-----------|---------------|
| HU-01 | Iniciar sesión con usuario y contraseña | Administrador | Alta | Es indispensable para acceder al sistema de forma segura |
| HU-18 | Restringir acceso a páginas sin autenticación | Sistema | Alta | Garantiza la seguridad y evita accesos no autorizados |
| HU-10 | Control de acceso según rol | Administrador | Alta | Define qué funcionalidades puede usar cada tipo de usuario |
| HU-03 | Cerrar sesión | Usuario autenticado | Alta | Protege la información y el acceso al sistema |
| HU-17 | Mantener datos al recargar la página | Administrador | Alta | Evita la pérdida de información registrada |
| HU-04 | Registrar nuevos productos | Almacenero | Alta | Funcionalidad base para la gestión del inventario |
| HU-07 | Registrar entradas de productos | Almacenero | Alta | Permite actualizar el stock cuando ingresa mercadería |
| HU-08 | Registrar salidas de productos | Almacenero | Alta | Refleja correctamente las entregas y movimientos |
| HU-05 | Visualizar lista de productos | Supervisor | Media | Permite supervisar el inventario disponible |
| HU-09 | Visualizar historial de entradas y salidas | Supervisor | Media | Facilita el control y seguimiento de movimientos |
| HU-11 | Editar datos de un producto | Almacenero | Media | Permite corregir errores en el inventario |
| HU-12 | Eliminar productos | Administrador | Media | Ayuda a mantener el inventario ordenado |
| HU-06 | Buscar productos por código | Usuario autenticado | Media | Mejora la rapidez de acceso a la información |
| HU-15 | Identificar productos con stock bajo | Supervisor | Media | Apoya la toma de decisiones de reposición |
| HU-19 | Visualizar reporte general del inventario | Supervisor | Media | Proporciona una visión global del stock |
| HU-02 | Ver nombre del usuario en la página principal | Usuario autenticado | Baja | Funcionalidad informativa, no crítica |
| HU-13 | Validar campos obligatorios | Usuario autenticado | Baja | Mejora la calidad de datos pero no es funcionalidad base |
| HU-14 | Mostrar mensajes de confirmación | Usuario autenticado | Baja | Mejora la experiencia de usuario |
| HU-16 | Ordenar productos por código | Usuario autenticado | Baja | Facilita la revisión visual del inventario |
| HU-20 | Diseño adaptable a distintos dispositivos | Usuario autenticado | Baja | Mejora la usabilidad, pero no afecta la lógica principal |
 
- ### Registrar métricas del proyecto:

### Métricas del Proyecto – Sprint 1

- Total de historias de usuario: 10
- Historias completadas: 10
- Historias en progreso: 0
- Commits realizados: 19
- Issues creados: 2
- Issues cerrados: 2
- Pull Requests realizados: 1

### Métricas del Proyecto – Sprint 2

- Total de historias de usuario: 10
- Historias completadas: 10
- Historias en progreso: 0
- Commits realizados: 14
- Issues creados: 41
- Issues cerrados: 22
- Pull Requests realizados: 15


**Interpretación:**  
Las métricas evidencian un avance constante del proyecto, con la mayoría de historias principales completadas y una actividad continua en el repositorio mediante commits, issues y pull requests.

- Documentar retrospectivas:

  
- Definir roles y responsabilidades:

  
- Mantener trazabilidad historias–tareas:


---

### 🔜 Próximos Sprints

- **Sprint 3:**Integración y Entrega Continua.
- **Sprint 4:** Contenedores y Despliegue.

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
