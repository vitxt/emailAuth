# Email Authentication API 🔐

A robust backend service built with Spring Boot that handles secure email authentication. It utilizes a layered architecture and integrates Redis caching to efficiently manage and verify temporary authentication codes.

## 🚀 Features
* **Layered Architecture:** Clean separation of concerns using Models, DTOs, Services, and Repositories.
* **Email Verification:** Sends automated authentication codes to users.
* **Redis Caching:** Temporarily stores auth codes in Redis with a Time-To-Live (TTL) for fast, secure, and state-independent verification.
* **Database Integration:** Uses Spring Data JPA to manage persistent user data.

## 🛠️ Tech Stack
* **Language:** ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
* **Framework:** ![Spring Boot](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
* **Database & Caching:** Spring Data JPA, Redis

## ⚙️ Setup & Installation

1. **Prerequisites:** Ensure you have Java 17+ and a running instance of Redis.
2. **Clone the repo:**
   ```bash
   git clone [https://github.com/vitxt/emailAuth.git](https://github.com/vitxt/emailAuth.git)
