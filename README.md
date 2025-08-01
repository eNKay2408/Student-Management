# Student Information System

A web-based system designed to manage student data for educational institutions.
This system allows administrators to easily add, update, and manage student profiles,
and add, update and manage courses and course enrollments. The system aims to
simplify the administrative tasks of educational institutions while providing academic
staff with a user-friendly interface to track student profiles

## Live Demo
  
### **Quản lý sinh viên**

- Xem danh sách sinh viên
  ![image](https://github.com/user-attachments/assets/7c49aea7-720e-4ab6-af53-9a659c9c479b)

- Thêm sinh viên
  ![image](https://github.com/user-attachments/assets/ed90c1e6-12ef-4dfa-ac2b-87a45b70ce29)

- Sửa sinh viên
  ![image](https://github.com/user-attachments/assets/d5bb1e51-0349-413b-80de-ce3f1c72055b)

- Xóa sinh viên
  ![image](https://github.com/user-attachments/assets/e86d72ae-094b-41db-bb7f-a1d892b3b318)

### **Quản lý danh mục**

- Xem danh mục
  ![image](https://github.com/user-attachments/assets/c99510ea-0bc7-41e9-9b0d-1d57f602d101)

- Thêm danh mục
  ![image](https://github.com/user-attachments/assets/093b9ecc-b48b-4692-8f01-29e04972b7e8)

- Sửa danh mục
  ![image](https://github.com/user-attachments/assets/e6878692-92eb-4137-a29c-325517982d31)

- Xóa danh mục
  ![image](https://github.com/user-attachments/assets/1e83a0f8-3ad1-4c1e-b473-ec3d5d7cb882)

### **Cấu hình trạng thái sinh viên**

- Xem/Thêm/Xóa/Sửa cấu hình trạng thái sinh viên
  ![image](https://github.com/user-attachments/assets/ecb1d2de-b217-4b4d-acb6-af4b1d9d7549)

### **Quản lý khóa học**

- Xem danh sách khóa học
  ![image](https://github.com/user-attachments/assets/32c2c675-7d9c-4e49-880e-966460b874ed)

- Thêm khóa học
  ![image](https://github.com/user-attachments/assets/8deeb14e-15cf-460a-b1ab-234ca38f3e37)

- Sửa khóa học
  ![image](https://github.com/user-attachments/assets/ed15db50-cb5e-43c0-8755-8f694ac289a5)

- Xóa khóa học
  ![image](https://github.com/user-attachments/assets/48f8724f-e7d6-4999-97ec-699ca8566bf5)

### **Quản lý học kỳ**

- Trang quản lý học kỳ
  ![image](https://github.com/user-attachments/assets/f29d8089-0f5e-4a3f-877c-d1d76692b248)

### **Quản lý lớp học**

- Trang quản lý lớp học
  ![image](https://github.com/user-attachments/assets/a8709d44-06b6-45d6-bdd5-21b234c09d53)

### **Đăng ký học phần**

- Trang đăng ký học phần
  ![image](https://github.com/user-attachments/assets/11ac6aea-9672-4c29-9865-3b8c1f3b03fe)

### **Bảng điểm sinh viên**

- Xem bảng điểm sinh viên
  ![image](https://github.com/user-attachments/assets/2ebf10f7-994c-4d9c-a3b8-efb3220dcd2b)

### **Đa ngôn ngữ**

- Tính năng đa ngôn ngữ, gồm tiếng Việt và tiếng Anh
  ![image](https://github.com/user-attachments/assets/63d92e68-cc29-4a07-8f74-990f41eacc7d)

## Key Features
- Student Management
- Category Management
- Student Status Configuration
- Course Management
- Semester Management
- Class Management
- Course Registration
- Student Transcript Management
- Multi-language Support

## Tech Stack

| Layer         | Tools / Frameworks                         |
| ------------- | ------------------------------------------ |
| Frontend      | Next.js, React, Node.js                    |
| Backend       | Java, Spring Boot, Maven                   |
| Database      | PostgreSQL, Docker                         |
| Dev Tools     | IntelliJ IDEA, Visual Studio Code, Postman |
| Others        | Swagger UI, Docker Compose, GitHub         |

## Project Structure

### 1. Client - Frontend
```bash
client/
│
├── messages/                           # i18n translations (vi.json, en.json)
│
├── src/
│   ├── app/                            # Route-based modules (Next.js App Router)
│   │   ├── class-management/           # Class management feature
│   │   │   ├── actions/                # Async actions (API integration)
│   │   │   ├── components/             # Reusable UI components
│   │   │   └── page.tsx                # Route entry point
│   │   ├── course-management/          # Similar structure for course module
│   │   ├── reference-management/       # Lookup/reference data
│   │   ├── register-class/             # Class registration feature
│   │   ├── semester-management/        # Semester CRUD operations
│   │   ├── status-rules-configuration/ # Student status rules
│   │   ├── student-management/         # CRUD & Import/Export for students
│   │   └── transcript/                 # Transcript viewer
│   │
│   ├── components/
│   │   ├── layout/                     # Shared layout components
│   │   └── ui/                         # UI helpers (e.g., LanguageSelector)
│   │
│   ├── interfaces/                     # TypeScript types for API models
│   │   ├── class/
│   │   ├── course/
│   │   ├── student/
│   │   └── shared/common.ts
│   │
│   ├── libs/
│   │   ├── api/                        # Axios wrappers per domain
│   │   ├── hooks/                      # Custom React Query hooks
│   │   ├── services/                   # Business logic layer
│   │   ├── stores/                     # Zustand stores
│   │   ├── utils/                      # Helpers & transformers
│   │   └── validators/                 # Zod schemas
│
├── README.md
├── package.json
└── next.config.ts
```

### 2. Server - Backend
```bash
server/
│
├── src/
│   ├── main/
│   │   ├── java/org/example/backend/
│   │   │   ├── controller/             # REST API controllers
│   │   │   ├── domain/                 # JPA entity definitions
│   │   │   ├── dto/                    # Request/Response DTOs
│   │   │   ├── mapper/                 # MapStruct mappers
│   │   │   ├── repository/             # Spring Data JPA interfaces
│   │   │   ├── service/                # Service layer (with import/export handling)
│   │   │   ├── config/                 # Spring configurations (CORS, Security, etc.)
│   │   │   ├── common/                 # Shared utilities (pagination, filters, etc.)
│   │   │   └── validator/              # Custom annotations + validators
│   │   └── resources/
│   │       ├── db/                     # SQL seed files
│   │       ├── config/                 # JSON/XML config for status rules
│   │       └── application.yml         # Main Spring Boot config
│
├── test/                               # JUnit test suite for service & controllers
│
├── docker-compose.yml                  # Database container for development
├── pom.xml                             # Maven dependencies and build config
└── README.md
```

## Getting Started

### 1. AI Translation Service

> See details in [LibreTranslate/README.md](https://github.com/nguyen-anh-hao/HHKT-Ex-TKPM/tree/main/LibreTranslate)

#### Prerequisites

* Python 3.8+
* `venv` (Python Virtual Environment)

#### Setup Instructions

```bash
# Step 1: Create a virtual environment
python3 -m venv venv

# Step 2: Activate the virtual environment
# On Windows:
venv\Scripts\activate
# On macOS/Linux:
source venv/bin/activate

# Step 3: Install project dependencies
pip install -e .

# Step 4: Install the Vietnamese-English translation model
python -m install_vi_en_model

# Step 5: Run the translation server
libretranslate
```

### 2. Backend Server

> See more details in [server/README.md](https://github.com/nguyen-anh-hao/HHKT-Ex-TKPM/tree/main/server)

#### Prerequisites

* Docker & Docker Compose
* Java Development Kit (JDK) 17+
* Apache Maven
* IntelliJ IDEA (or compatible IDE)

#### Setup Instructions

```bash
# Step 1: Start Docker and seed the database
docker-compose up -d

# After Docker is up and running, manually seed the database
# using the SQL files located in:
# src/main/resources/db/

# Step 2: Open the project in IntelliJ IDEA
# Run the application by executing the BackendApplication.java class
```

---

### 3. Frontend Client

> See more details in [client/README.md](https://github.com/nguyen-anh-hao/HHKT-Ex-TKPM/tree/main/client)

#### Prerequisites

* Node.js (v16+ recommended)
* Visual Studio Code (or compatible IDE)

#### Setup Instructions

```bash
# Step 1: Install project dependencies
npm install

# Step 2: Build the project
npm run build

# Step 3: Start the project
npm run start
```

> The application will be available at:
>
> * **Frontend**: [http://localhost:3000](http://localhost:3000)
> * **Backend API**: [http://localhost:9000](http://localhost:9000)

## Documentation & Resources

- **Developer Guide**: https://hhkt-tkpm.github.io/
- **Project Documentation**: https://deepwiki.com/nguyen-anh-hao/HHKT-Ex-TKPM/1-student-management-system-overview
- **Backend API (Swagger UI)**
  ![image](https://github.com/user-attachments/assets/49df6aaf-dd29-42c7-9bf0-e7f0d8b2e263)
  ![image](https://github.com/user-attachments/assets/13c6e019-9399-4186-8651-320fcc8e87ec)

- **Database**
  ![image](https://github.com/user-attachments/assets/35e25919-bb7a-4a10-a0d9-3ab5cb20ad10)

## Authors

- **Nguyễn Anh Hào** - Frontend Developer - [GitHub](https://github.com/nguyen-anh-hao)
- **Đặng Phúc Hưng** - Backend Developer - [GitHub](https://github.com/BrianTrac)
- **Nguyễn Phan Đức Khải** - Backend Developer - [GitHub](https://github.com/eNKay2408)
- **Võ Tuấn Tài** - Frontend Developer - [GitHub](https://github.com/TaiVo030104)
