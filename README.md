# Sceleton — Microservice Ticketing System

Microservice application for managing events, tickets and users with routing via API Gateway
---

## Structure

```
sceleton/
├── backend/
│   ├── api-gateway/           
│   ├── ticket-service/       
│   └── event-service/        
│
├── frontend/
│   └── vue-frontend/         
│
├── infrastructure/
│   ├── keycloak/             
│   └── ticket-service/db/    
│
├── compose.yml               
└── README.md
```

---

## Run

### IntelliJ

1. profile - local
   ```
   --spring.profiles.active=local
   ```
2. Run
   - `api-gateway`
   - `ticket-service`
   - `event-service`

---

### Docker

```bash
docker compose -f compose.yml up --build
```
### Test:
   - [http://localhost:8088/api/tickets/test](http://localhost:8088/api/tickets/test)
   - [http://localhost:8088/api/events/test](http://localhost:8088/api/events/test)

`sceleton` - the project is in active development
