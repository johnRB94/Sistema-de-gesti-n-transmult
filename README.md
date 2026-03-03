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

🟢 **Sprint 3 – Integración y Entrega Continua (Finalizado)**  
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
- ### Configurar herramienta de gestión de proyectos:
Estos dos archivos son idénticos: ambos muestran un Tablero Kanban con cuatro columnas de estado (POR HACER, EN PROCESO, HECHO, APROBADO), utilizado para organizar tareas en un proyecto de desarrollo de software.
La estructura es clara y refleja el flujo de trabajo típico en metodologías ágiles o de gestión visual:
•	POR HACER: Incluye tareas pendientes como crear el repositorio Git, definir la estructura de ramas y configurar archivos base.
•	EN PROCESO: Muestra tareas en ejecución, con porcentajes de progreso indicados (ej: 25% en estructura inicial del proyecto).
•	HECHO: Tareas ya completadas, como la reunión inicial y la asignación de roles.
•	APROBADO: Aún vacía, indicando que no hay entregables revisados y aceptados formalmente.
Se nota que el equipo está en fase inicial del proyecto (configuración de repositorio, entorno y estructura), con responsabilidades asignadas claramente (Líder Técnico, DevOps, Product Owner, etc.).
Los dos archivos parecen ser copias del mismo tablero, posiblemente enviadas en momentos distintos o como respaldo.

  
- ### Crear backlog del producto:
  Para el BackLog tenemos como principios establecidos los roles y habilidades que tiene cada miembro del equipo.
  Entrada - Proceso - Salida - Mejoras Futuras

- ### Definir sprints y milestones:
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

* **📋 Sprint 1: Control de Versiones  (closed)**
    * *Infraestructura de colaboración, estrategia de ramas y base del repositorio.*
* **📋 Sprint 2: Gestión Ágil  (closed)**
    * *Documentación de Historias de Usuario (HU), Backlog y tablero Kanban.*
* **📋 Sprint 3: Integración Continua (open)**
    * *Configuración de Pipeline CI/CD y automatización de pruebas unitarias.*
* **📋 Sprint 4: Despliegue y Entrega (open)**
    * *Contenedorización con Docker y validación final en entorno de producción.*
  
- ### Configurar tablero Kanban o Scrum:
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

  
- ### Gestionar incidencias:
La gestión de incidencias del proyecto se llevó a cabo utilizando la funcionalidad **GitHub Issues** como herramienta central de control y seguimiento.  
Las incidencias fueron registradas de manera estructurada, incluyendo descripción detallada del problema, pasos para su reproducción, resultado esperado, resultado actual, nivel de prioridad y sprint correspondiente.  
Este enfoque permitió una trazabilidad clara de los errores detectados durante el desarrollo, así como una adecuada asignación de responsabilidades y control del estado de cada incidencia dentro del **Sprint 2 – Gestión Ágil y Seguimiento**.
  
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

- ### Documentar retrospectivas:
Al cierre del **Sprint 2**, el equipo realizó una retrospectiva con el objetivo de evaluar el desempeño del sprint y la dinámica de trabajo colaborativo.  
La retrospectiva fue documentada en el repositorio GitHub mediante un archivo en formato **Markdown**, donde se registraron los aspectos positivos del sprint, las dificultades encontradas durante el desarrollo y las oportunidades de mejora identificadas.  
Esta documentación permitió establecer acciones concretas para optimizar los procesos de planificación, comunicación y ejecución en los sprints posteriores, promoviendo la mejora continua del proyecto.
  
- ### Definir roles y responsabilidades:

  Lo que viene hacer Los Roles y Responsabilidades del equipo nos planteamos bien como debemos de actuar y interactuar con el BackLog ya que gracias al organizador de Proyectos que tenemos podemos agruparnos y
  asignarnos cada tarea y tacharlo como realizado.
  
- ### Mantener trazabilidad historias–tareas:
  
🔗Para garantizar que cada desarrollo técnico responda a una necesidad del negocio, implementamos un modelo de trazabilidad total utilizando las herramientas de gestión de GitHub Projects e Issues. Cada tarea técnica se vincula directamente a una Historia de Usuario (HU), permitiendo un seguimiento en tiempo real del progreso.



🛠️ Implementación de la Trazabilidad📋

* GitHub Project Board: Utilizamos un tablero Kanban automatizado para visualizar el flujo de trabajo (Todo, In Progress, Done). Actualmente, el Sprint 1 y 2 cuenta con 30 historias de usuario completadas al 100%.✅
  
* Gestión de Issues: Cada requerimiento se documentó como un Issue con etiquetas personalizadas (Prox trabajo, Buen trabajo, documentación) para clasificar prioridades y tipos de tarea.✅

* Control de Incidencias: Se implementó un registro de incidencias (bugs) vinculados a las tareas de validación, asegurando que cada error encontrado sea corregido antes del cierre del sprint.✅

* Vinculación con Pull Requests: Cada actualización del código (Update README, Definir sprints, etc.) se realiza mediante Pull Requests aprobados que hacen referencia a los issues correspondientes.✅

---

### Sprint 3 – Integración y Entrega Continua

Durante este sprint se implementaron prácticas orientadas a la automatización del proceso de construcción del proyecto y a la preparación del sistema para entornos de Integración Continua. 

El objetivo principal fue garantizar que el sistema pueda compilarse de manera automática, reproducible y controlada, asegurando la correcta gestión de dependencias y la portabilidad del entorno de desarrollo.

Se fortaleció la estructura técnica del proyecto mediante herramientas que permiten mejorar la calidad del software y facilitar futuras integraciones con pipelines automatizados.


#### ✅ Actividades realizadas

- **Configurar pipeline de integración continua:**
  
## ⚙️ Integración y Despliegue Continuo (CI/CD) - TRANSMULT

Para asegurar la estabilidad y calidad del **Sistema de Gestión de Inventarios de TRANSMULT**, el proyecto cuenta con un pipeline automatizado configurado mediante **GitHub Actions**. Este flujo de trabajo garantiza que cada nueva funcionalidad o corrección se valide antes de integrarse al entorno principal.

**Arquitectura del Pipeline:**

- **1. Integración Continua (CI):**
  - **Activación (Trigger):** El pipeline se ejecuta automáticamente ante cada *Push* o *Pull Request* dirigido a la rama `main`.
  - **Validación (Build):** Se levanta el entorno, se instalan las dependencias necesarias y se compila el código del proyecto.
  - **Pruebas (Testing):** Se ejecutan validaciones para asegurar que los módulos críticos (como el registro de carga, actualización de inventarios y gestión operativa) sigan funcionando correctamente y no se introduzcan errores.

- **2. Despliegue Continuo (CD):**
  - Si el código supera con éxito la fase de construcción y pruebas, se generan los artefactos correspondientes.
  - Posteriormente, los cambios se despliegan de forma automatizada en el servidor, permitiendo entregar mejoras de software a la empresa TRANSMULT de manera ágil y segura.
  
- **Automatizar compilación del proyecto:**
Cada vez que se integran nuevos cambios al repositorio, el pipeline descarga las dependencias y compila el código fuente de forma automática. Esto garantiza que el sistema esté libre de errores de sintaxis o problemas de dependencias, asegurando que siempre se genere una versión funcional (build) lista para ser desplegada, eliminando el clásico problema de "en mi máquina sí funciona".
  
- **Ejecutar pruebas automáticas:**
  Cuando ejecutes esta prueba, obtendrás una salida como esta en tu consola o en el reporte de CI/CD:
  Iniciando sesión en Transmult...
✅ Login exitoso
Buscando viaje CL-001...
✅ Viaje cargado correctamente
Intentando asignar tráiler TRA-123 (capacidad 25,000 kg)...
Guardando cambios en el viaje...
✅ ¡PRUEBA EXITOSA! El sistema rechazó correctamente el tráiler por sobrepeso.
   Mensaje mostrado: El tráiler TRA-123 excede su capacidad máxima (25,000 kg) para este viaje (30,000 kg).
Cerrando navegador...
- **Configurar análisis de calidad:**
  El análisis de calidad debe ser automático y formar parte de tu pipeline de integración continua. El objetivo es que cada vez que un desarrollador haga un cambio, el código sea analizado y, si no cumple con los estándares, se bloquee la fusión (pull request) o el despliegue.
  Cada Pull Request hacia la rama main ejecutará un análisis completo de SonarQube.

Quality Gate: SonarQube tiene un "Quality Gate" o "Puerta de Calidad" . Si el nuevo código introduce vulnerabilidades, baja la cobertura de pruebas por debajo de un umbral (ej. 80%) o aumenta la deuda técnica, el análisis fallará.

Bloqueo Automático: Si el análisis falla, GitHub puede (si lo configuras así) bloquear la fusión del Pull Request. Esto evita que código de baja calidad llegue a producción.
  
- **Gestionar dependencias:**
El proyecto utiliza **Apache Maven** como herramienta de gestión de dependencias.  
Todas las librerías externas necesarias para el funcionamiento del sistema se encuentran declaradas en el archivo `pom.xml`.

Maven permite:

- Descarga automática de dependencias desde repositorios oficiales.
- Control de versiones de librerías.
- Construcción reproducible del proyecto.
- Integración con herramientas de Integración Continua (CI/CD).
- Organización estructurada del ciclo de vida del proyecto.

### Tecnologías y dependencias principales

![Java](https://img.shields.io/badge/Java-21-blue)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.5.3-brightgreen)
![Maven](https://img.shields.io/badge/Maven-3.9.10-red)
![MySQL](https://img.shields.io/badge/MySQL-Database-orange)
![Thymeleaf](https://img.shields.io/badge/Thymeleaf-Template%20Engine-green)
![Spring Security](https://img.shields.io/badge/Spring%20Security-Authentication-success)

El proyecto está construido con:

- **Spring Boot 3.5.3**
- **Spring Data JPA** (Persistencia de datos)
- **Spring Security** (Autenticación y autorización)
- **Thymeleaf** (Motor de plantillas HTML)
- **Spring Validation** (Validación de datos)
- **MySQL Connector** (Conexión a base de datos)
- **Lombok** (Reducción de código repetitivo)
- **Apache POI** (Generación de archivos Excel)
- **Spring Boot Starter Test** (Pruebas unitarias)

### Configuración técnica del proyecto

- Java 21
- Maven 3.9.10
- Empaquetado mediante Spring Boot Maven Plugin

### Verificación de compilación

Para verificar que las dependencias están correctamente gestionadas, se ejecuta:

Windows: mvnw.cmd clean install

Resultado esperado: BUILD SUCCESS

Esto confirma que todas las dependencias se descargan correctamente y el proyecto compila sin errores.


- **Configurar Maven Wrapper:**
El proyecto incluye **Maven Wrapper** (`mvnw` y `mvnw.cmd`), lo que permite ejecutar el sistema sin necesidad de instalar Maven manualmente en el equipo.

### ¿Qué es Maven Wrapper?

Maven Wrapper es un mecanismo que:

- Garantiza el uso de una versión específica de Maven.
- Permite ejecutar el proyecto sin instalar Maven globalmente.
- Facilita la ejecución en entornos de Integración Continua (CI).
- Mejora la portabilidad del proyecto.

### Archivos incluidos

El proyecto contiene los siguientes archivos:

- `mvnw`
- `mvnw.cmd`
- Carpeta `.mvn/`
- Archivo `pom.xml`

### Verificación del funcionamiento

Desde la carpeta del módulo del proyecto se ejecuta:

Windows: mvnw.cmd -v

Salida obtenida:
- Apache Maven 3.9.10
- Java 21
- Sistema operativo Windows 10

Esto confirma que el Maven Wrapper está correctamente configurado y operativo.


### Importancia en CI/CD

![GitHub Actions](https://img.shields.io/badge/GitHub%20Actions-Active-blue)

El uso de Maven Wrapper permite que plataformas como GitHub Actions puedan compilar el proyecto automáticamente sin requerir configuración adicional del entorno.

  
- **Publicar artefactos del build:**
Durante el Sprint 3 se configuró la publicación automática del artefacto generado en cada ejecución exitosa del pipeline de Integración Continua.

El workflow ejecuta el comando mvn clean verify, el cual compila el proyecto, ejecuta las pruebas unitarias y genera el archivo ejecutable .jar dentro del directorio target/.

Una vez completada la compilación sin errores, el archivo generado es almacenado como artefacto del workflow mediante la acción actions/upload-artifact. El artefacto queda disponible para su descarga desde la sección Actions del repositorio.

Esta configuración permite:

Garantizar que el build proviene de una ejecución validada.

Asegurar la trazabilidad entre versión del código y archivo generado.

Facilitar futuras etapas de despliegue automatizado.

Evitar inconsistencias entre entornos de desarrollo.

Con ello, cada ejecución exitosa del pipeline produce una versión reproducible y verificable del sistema TRASMULT.

  
- **Configurar control de fallos en CI:**
El pipeline fue configurado bajo el principio de detención automática ante errores (fail-fast), garantizando que cualquier fallo durante la compilación o ejecución de pruebas interrumpa el proceso de integración.

El control de fallos se implementa mediante:

Ejecución del comando mvn clean verify.

Validación automática de pruebas unitarias.

Dependencia secuencial entre los pasos del workflow.

Ausencia de configuraciones que permitan continuar ante errores.

Si ocurre un error de compilación o una prueba falla:

El job cambia automáticamente a estado Failed.

El pipeline se detiene.

No se genera ni publica el artefacto.

Se evita la integración de código defectuoso en la rama principal.

Esta configuración fortalece la calidad del software y asegura que únicamente versiones estables sean integradas al proyecto.



  
- **Documentar resultados del pipeline:**

  Tenemos 3 3n conjunto al pipeline que nosotros podemos ejecutar y interactuar dando asi variantes como activacion, validacion y pruebas. Podemos documentar estas pruebas
  dentro de la ejecucion del Backend que es la base de nuestro proyecto.
  
  - Activacion
  - Validacion
  - Pruebas
  
- **Integrar badges de estado:**

  Los Badges de estado son asignaciones que nosotros le damos como badges de estado, asi mismo conectado con el pipeline tenemos una conexion en cuando se ejecute el
  programa podemos ver como el badge tiene una animacion conjunta al pipeline que cuando el programa  se ejecute sin problemas este en Verde sino se pondria Rojo.

---

## Sprint 4 – Contenedores y Despliegue

- **Crear Dockerfile:**  
En el Sprint 4 se implementó la contenerización de la aplicación mediante la creación de un archivo `Dockerfile` ubicado en la raíz del proyecto.

El objetivo del Dockerfile es construir una imagen Docker que incluya el entorno de ejecución Java 21 y el archivo JAR generado por Maven, permitiendo que la aplicación pueda ejecutarse en cualquier entorno que tenga Docker instalado.

### 📄 Ubicación

El archivo `Dockerfile` se encuentra en la raíz del proyecto, al mismo nivel que el `pom.xml`.

### 📦 Contenido del Dockerfile

dockerfile
FROM eclipse-temurin:21-jdk

WORKDIR /app

COPY target/inventario-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","app.jar"]


- **Configurar docker-compose:**  
markdown
## 🔹 Configurar docker-compose

Para orquestar la aplicación junto con la base de datos MySQL, se creó el archivo `docker-compose.yml` en la raíz del proyecto.

Este archivo permite ejecutar ambos servicios (aplicación y base de datos) de manera conjunta, automatizando el despliegue y asegurando la correcta comunicación entre contenedores.

### 📄 Ubicación

El archivo `docker-compose.yml` se encuentra en la raíz del proyecto.

### 📦 Contenido del docker-compose.yml

yaml
version: '3.8'

services:

  mysql:
    image: mysql:8.0
    container_name: mysql_transmult
    restart: always
    environment:
      MYSQL_ROOT_PASSWORD: Fabricio.2002
      MYSQL_DATABASE: transmult_base
    ports:
      - "3306:3306"
    volumes:
      - mysql_data:/var/lib/mysql

  app:
    build: .
    container_name: app_transmult
    restart: always
    depends_on:
      - mysql
    ports:
      - "8080:8080"
    environment:
      SPRING_DATASOURCE_URL: jdbc:mysql://mysql:3306/transmult_base?useSSL=false&serverTimezone=UTC
      SPRING_DATASOURCE_USERNAME: root
      SPRING_DATASOURCE_PASSWORD: Fabricio.2002

volumes:
  mysql_data:



- **Gestionar variables de entorno:**
  
 Usar variables de entorno en Docker es la mejor manera de gestionar la configuración de aplicaciones en diversos entornos de forma segura. Esto garantiza que su aplicación se comporte como se espera, tanto en escenarios de desarrollo como de implementación, al seguir las mejores prácticas y con herramientas como Docker Compose. Con el ejemplo de Node.js proporcionado, ahora cuenta con una base sólida para empezar a integrar variables de entorno en sus propias aplicaciones Dockerizadas.

- **Construir imágenes de la aplicación:**

  Principalmente aqui se deriva muchas cosas para que el proyecto o sistema se desenvuelva correctamente en cualquiern entorno ya sea externo o interno, esto nos ayuda a que si a nosotros nos funciona el proyecto tambien a nuestros colaboradores les deberia funcionar el proyecto en si. Para esto construimos imagenes o sea es un proceso el cual lleva que se ejecute en cualquier entorno.

- **Desplegar la aplicación:**  

  
- **Configurar puertos y servicios:**  
 🧪 Calidad y Pruebas Automáticas
Transmult cuenta con un sistema integral de calidad y pruebas automáticas para garantizar la confiabilidad del sistema de gestión de tráilers.

🔍 Estrategia de Calidad
Componente	Propósito	Herramienta
Pruebas Unitarias	Validar funciones individuales -	JUnit / PyTest
Pruebas de Integración	Verificar comunicación entre módulos -	Selenium / Cypress
Pruebas E2E	Validar flujos críticos de negocio	- Selenium WebDriver
Análisis Estático	Medir calidad y seguridad del código	- SonarQube

✅ Caso de Prueba Crítico
Validación de sobrepeso en tráilers
Escenario: Evitar que un tráiler con capacidad de 25,000 kg sea asignado a un viaje de 30,000 kg.
Resultado esperado: El sistema rechaza la asignación y muestra mensaje de error.

🔄 Integración Continua
Cada Pull Request ejecuta automáticamente:

Pruebas automáticas (sobrepeso, facturación, trazabilidad)

Análisis de calidad con SonarQube (cobertura >80%, cero vulnerabilidades críticas)

📈 Métricas de Calidad
Cobertura de código: Mínimo 80% en código nuevo

Deuda técnica: <5% del esfuerzo total

Duplicación: <3% en código nuevo

Vulnerabilidades: Cero con rating crítico/alto


- **Validar ejecución del sistema:**  


- **Documentar despliegue:**  
## 🚀 Despliegue y Ejecución del Módulo de Inventario

El siguiente documento detalla el proceso técnico para el despliegue del módulo backend de inventario, correspondiente al Sistema de Información Integral para la Gestión Operativa de la Empresa TRANSMULT-MALABRIGO E.I.R.L. 

Hemos optado por una arquitectura basada en contenedores utilizando **Docker**. Esto nos permite aislar el entorno de desarrollo, estandarizar las dependencias y asegurar que la aplicación funcione de manera idéntica en cualquier máquina o servidor, eliminando los clásicos problemas de compatibilidad de versiones.

### 📋 1. Requisitos Previos
Antes de iniciar el proceso de despliegue, el servidor o equipo local debe contar con las siguientes herramientas instaladas y configuradas:
* **Docker Desktop / Docker Engine:** Para la creación de las imágenes y la orquestación del contenedor.
* **Git:** Para el control de versiones y la extracción del código fuente.

---

### 🛠️ 2. Fases del Despliegue

#### Fase A: Obtención del Código Fuente (Clonación)
El primer paso consiste en descargar la última versión estable del código a la máquina local. A través de la terminal, clonamos el repositorio oficial y nos ubicamos en el directorio específico donde reside el módulo de inventario:

```bash
git clone [https://github.com/johnRB94/Sistema-de-gesti-n-transmult.git](https://github.com/johnRB94/Sistema-de-gesti-n-transmult.git)
cd Sistema-de-gesti-n-transmult/Transmult_Proyecto_Final/inventario

- **Preparar versión final:**  


- **Cerrar incidencias y documentación:**  

---

## 👨‍💻 Autores

* **Del Castillo Hoyos, Fabricio Sebastian**
* **Moron Tejeda, Diego Sebastian**
* **Sencio De La Cruz, Franco David**
* **Dick Daniel´s Miranda Silva**
* **John Luis Ramos Bautista**

---

📌 *Este repositorio forma parte de un proyecto académico y tiene fines educativos.*


Prueba CI
