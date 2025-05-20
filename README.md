# Pi-Shaped-Workshop-Aman Jha

## Core Concept Questions

### 1. Why is Docker useful in building and deploying microservices for a real-world product (like an e-commerce or banking app)?

Docker provides isolated, lightweight containers that encapsulate everything a microservice needs: code, runtime, libraries, and configurations. This ensures:
- Consistent behavior across environments (dev → staging → prod).
- Rapid deployment and rollback using versioned images.
- Simplified dependency management.
- Microservices can scale independently (e.g., payment service vs. search service in an e-commerce app).

---

### 2. What is the difference between a Docker image and a container in the context of scaling a web application?

- **Docker Image**: A blueprint or template that contains everything needed to run the application (code, libraries, config).
- **Docker Container**: A running instance of an image.

In scaling:
- You **create multiple containers** from the same image to handle more load.
- This ensures uniformity and faster boot times during auto-scaling.

---

### 3. How does Kubernetes complement Docker when running a product at scale (e.g., hundreds of containers)?

Kubernetes orchestrates containerized applications by:
- Automatically deploying, scaling, and managing container lifecycles.
- Offering features like self-healing, rolling updates, service discovery, and load balancing.
- Efficiently handling multiple containers across clusters, improving uptime and resource usage.

---

## Submission Checklist

- Dockerfile — Present inside `docker-k8s-workshop/day1/docker-demo/`
- Source code (e.g., `app.jar`, `DockerDemoApplication.java`) — Inside `docker-demo/`
- Screenshot or log of Docker image being pushed — Included in logs (see below)
- ![img.png](img.png)
- Link to Docker Hub image: [https://hub.docker.com/r/amaninreallife/docker-demo](https://hub.docker.com/r/amaninreallife/docker-demo)

**Sample Push Log:**
```text
docker push amaninreallife/docker-demo:latest
The push refers to repository [docker.io/amaninreallife/docker-demo]
e95f01abef74: Pushed 
...
0.0.1: digest: sha256:c25054333613fe68156827ef0d9991e03f6c31009aff93dd2071e31ad21162b1 size: 1786
