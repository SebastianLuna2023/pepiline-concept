# Pipeline Spring Boot + JPA

## ⚙️ Tecnologías usadas

- Java 17
- Spring Boot 3
- Spring Data JPA
- H2 Database (en memoria)
- Lombok

---

## 📂 Estructura

- `model/` → Entidades JPA (`User`).
- `repository/` → Acceso a datos.
- `pipeline/` → Implementación genérica del patrón.
- `pipeline/steps/` → Etapas del pipeline (ej: validación, normalización).
- `service/` → Lógica de negocio (ejecuta el pipeline y guarda el resultado).

---

## ▶️ Ejemplo de uso

El pipeline de `UserService` aplica 2 pasos antes de guardar:

1. **NormalizeNameStep** → Pasa el nombre a mayúsculas.  
2. **ValidateEmailStep** → Verifica que el email sea válido.  

```java
User u = new User(null, "  Juan Perez  ", "juan@mail.com");
userService.createUser(u);
```

Resultado guardado en DB:
```text
NAME: "JUAN PEREZ"
EMAIL: "juan@mail.com"
```

---

## 🚀 Ejecutar el proyecto

```bash
./mvnw spring-boot:run
```

La app levanta en [http://localhost:8080](http://localhost:8080).

La base de datos H2 está en:  
[http://localhost:8080/h2-console](http://localhost:8080/h2-console)  
(JDBC URL: `jdbc:h2:mem:testdb`)

---

## ✅ Conclusión

Este ejemplo muestra cómo armar un **pipeline modular y extensible** en Spring Boot + JPA.  
Puedes agregar más *steps* fácilmente y reutilizarlos en otros flujos.
