# Day 3: Aman Jha - Networking in Kubernetes & Service Discovery

## Tasks Completed

1. **Created Services**  
   - **ClusterIP Service:** Exposes the app internally within the cluster on port 80, targeting app container port 8080.  
   - **NodePort Service:** Exposes the app on a node’s IP at port 30080, routing to container port 8080. This allows external access via `<NodeIP>:30080`.

2. **Exposed and Tested Access**  
   Both services were applied and tested. ClusterIP allows communication within the cluster, NodePort enables external access on the Minikube node.

3. **Created Ingress Resource**                                                                         
   Configured an Ingress with a path-based rule `/myapp` to route traffic to the ClusterIP service.  
   - Utilized annotation to rewrite incoming request URLs so backend receives the correct path.

---

## URL Paths and Expected Responses

| URL Path              | Service Type        | Expected Response                         |
|-----------------------|---------------------|-------------------------------------------|
| `http://<NodeIP>:30080` | NodePort            | Access to app landing or root endpoint    |
| `http://<MinikubeIP>/myapp`  | Ingress (path-based) | Routes to app, handles requests correctly |
| `http://<MinikubeIP>/myapp/hello`  | api endpoint | Routes to the api endpoint |

---

## Core Concepts

### 1. How would you expose an internal microservice (e.g., user-auth) differently than a public-facing frontend in a Kubernetes-based product?
Internal microservices like user-auth should be exposed using **ClusterIP** or private networking, restricting access only inside the cluster for security and internal communication.  
Public-facing frontends require exposure via **NodePort, LoadBalancer**, or **Ingress** to allow external user access.

### 2. Why might a product use Ingress instead of directly exposing each microservice via LoadBalancer?
Ingress consolidates access by routing multiple services through a single external IP and domain, reducing cost and complexity. It also enables path or host-based routing, SSL termination, and centralized traffic management, unlike exposing each microservice with separate LoadBalancer services.

---

## Screenshots

1. **Endpoint via Ingress** - `http://<MinikubeIP>/myapp/hello`

![alt text](Screenshots/image.png)

2. **Expose the app on Browser via Nodeport** - `http://<NodeIP>:30080`

![alt text](Screenshots/image1.png)