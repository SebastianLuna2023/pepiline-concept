# 🧪 Introducción a Pipelines en Programación

Este repositorio fue creado para **enseñar desde cero** qué es un **pipeline en programación**, cómo funciona y dónde se aplica

## 🧠 ¿Qué es un pipeline?

Un *pipeline* es una **serie de pasos que se ejecutan en orden**, donde la **salida de un paso es la entrada del siguiente**.

🧼 Imaginá una cinta transportadora en una fábrica: cada estación hace algo distinto con el producto hasta terminarlo.

---

## 🔎 Contenido del repo

| Carpeta | Contenido | Descripción |
|--------|-----------|-------------|
| `1-fundamentos` | Explicación y funciones encadenadas | Introducción paso a paso |
| `2-programacion-funcional` | Pipeline con funciones reutilizables | Cómo construir tu propia "tubería" de código |
| `3-pipeline-datos` | Pipeline de limpieza y análisis de datos | Un ejemplo aplicado a un archivo CSV |
| `4-ci-cd` | Automatización con GitHub Actions | Cómo se usan pipelines en proyectos reales |
| `5-extra` | Comparativas y usos reales | Diferencias entre tipos de pipelines |
| `assets` | Diagrama visual | Imagen para ayudarte a entender todo |

---


💡 Objetivo del Repo
Ayudar a una persona sin experiencia previa en pipelines a entender:

Qué es un pipeline.

Por qué se usa.

Cómo construir uno desde cero.

Cómo se ve un pipeline en la vida real (programación funcional, automatización, procesamiento de datos, CI/CD).

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
└── assets/
    └── pipeline-diagram.png


## 🛠️ Requisitos

Solo necesitás tener Python 3 instalado. No se usa nada complejo.

```bash
python --version
