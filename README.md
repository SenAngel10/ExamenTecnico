# Examen Técnico - Brayan Angel Anaya Castillo

## Requisitos
- Java 21
- Node.js
- pnpm

## Cómo correr el proyecto

### Backend
```bash
cd backend
./mvnw spring-boot:run
```
Corre en `http://localhost:8080`

### Frontend
```bash
cd frontend/frontend
pnpm install
pnpm run dev
```
Corre en `http://localhost:5173`
UI VISUAL DE TODOS LOS ENDPOINTS
http://localhost:8080/swagger-ui.html 

YAML OPENAPI
http://localhost:8080/v3/api-docs.yaml

### Endpoints disponibles
- `GET /estudiantes` — listado de estudiantes
- `GET /usuarios` — listado de usuarios
- `POST /usuarios` — crear usuario
- `PUT /usuarios/{id}` — actualizar usuario
- `DELETE /usuarios/{id}` — eliminar usuario
- `http://localhost:8080/swagger-ui.html` — documentación API
