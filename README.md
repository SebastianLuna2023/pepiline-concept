# 🧪 Introducción a Pipelines en Programación

Bienvenido a este repositorio diseñado para **explicar desde cero** qué es un *pipeline* en programación: cómo funciona, para qué sirve y cómo podés implementarlo en distintos contextos, paso a paso y con ejemplos simples.

---

## 🧠 ¿Qué es un pipeline?

Un **pipeline** es una **serie de pasos conectados**, donde la **salida de un paso se convierte en la entrada del siguiente**.

> 🧼 Imaginá una cinta transportadora en una fábrica: cada estación realiza una tarea sobre el producto hasta obtener el resultado final.  
> Así funcionan los pipelines en programación: transforman datos paso a paso.

---

## 📦 Estructura del repositorio

Este proyecto está organizado por niveles de complejidad, desde conceptos básicos hasta ejemplos más avanzados.

| Carpeta                       | Contenido                             | Descripción                                                                 |
|-------------------------------|---------------------------------------|-----------------------------------------------------------------------------|
| `1-fundamentos/`             | Introducción con funciones simples     | Explica el concepto básico con ejemplos paso a paso.                        |
| `2-programacion-funcional/`  | Pipeline funcional                     | Cómo componer funciones encadenadas al estilo *functional programming*.     |
| `3-pipeline-datos/`          | Procesamiento de datos                 | Limpieza, transformación y análisis de datos de un archivo CSV.             |
| `4-ci-cd/`                   | Automatización (CI/CD) con GitHub      | Un pipeline de integración continua real con GitHub Actions.                |
| `5-extra/`                   | Comparaciones y casos reales           | Diferencias entre tipos de pipelines y ejemplos en la vida real.            |
| `6-pipeline-jpa/`            | Pipeline con Spring Boot + JPA         | Ejemplo de pipeline en un proyecto real con Java, Spring Boot y JPA.        |

---

## 📁 Estructura de carpetas

```bash
pipeline-concept/
├── README.md
├── .gitignore
├── 1-fundamentos/
│   ├── explicacion.md
│   └── funciones-encadenadas.py
├── 2-programacion-funcional/
│   └── pipeline-funcional.py
├── 3-pipeline-datos/
│   ├── ejemplo-basico.py
│   └── datos.csv
├── 4-ci-cd/
│   └── .github/
│       └── workflows/
│           └── pipeline-ci.yml
├── 5-extra/
│   └── comparativa.txt
└── 6-pipeline-jpa/
    ├── pom.xml
    ├── README.md
    └── src/
        └── main/java/com/example/pipeline/...
