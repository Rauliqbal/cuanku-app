# 💰 Cuanku

**Cuanku** adalah aplikasi manajemen keuangan pribadi berbasis Android yang dirancang dengan pendekatan **offline-first**. Aplikasi ini membantu pengguna mencatat pemasukan, pengeluaran, transfer antar akun, mengelola kategori dan akun, serta melihat ringkasan kondisi keuangan tanpa bergantung pada koneksi internet.

Project ini dibangun menggunakan **Kotlin** dan **Jetpack Compose**, dengan **Room Database** sebagai penyimpanan data lokal.

> **Cuanku — Kelola Keuanganmu, Sepenuhnya di Tanganmu.**

---

## ✨ Features

### 💳 Account Management

* Membuat akun keuangan
* Mengubah akun
* Menghapus akun
* Melihat saldo setiap akun
* Mendukung berbagai jenis akun

### 💸 Transaction Management

* Mencatat pengeluaran
* Mencatat pemasukan
* Transfer antar akun
* Edit transaksi
* Hapus transaksi
* Riwayat transaksi

### 🏷️ Category Management

* Membuat kategori
* Mengubah kategori
* Menghapus kategori
* Icon kategori
* Statistik berdasarkan kategori

### 📊 Dashboard & Reports

* Total saldo
* Total pemasukan
* Total pengeluaran
* Transaksi terbaru
* Ringkasan bulanan
* Breakdown pengeluaran
* Perbandingan pemasukan dan pengeluaran
* Chart keuangan

### 🔒 Security

* PIN
* Biometric authentication
* Secure storage
* Database encryption

### 💾 Offline & Data

* Offline-first
* Local database
* Export data ke JSON
* Import data dari JSON
* Backup database
* Restore data

### ☁️ Optional Cloud Sync

Pada tahap selanjutnya, Cuanku dapat dikembangkan dengan backend:

* Spring Boot REST API
* Authentication
* Cloud synchronization
* Conflict resolution

---

# 🛠️ Tech Stack

| Technology           | Purpose                   |
| -------------------- | ------------------------- |
| Kotlin               | Programming language      |
| Jetpack Compose      | UI framework              |
| Material 3           | Design system             |
| Navigation Compose   | Screen navigation         |
| Room                 | Local database            |
| DataStore            | Local preferences         |
| Coroutines           | Asynchronous programming  |
| Flow / StateFlow     | Reactive state management |
| ViewModel            | UI state management       |
| Repository Pattern   | Data abstraction          |
| Use Case             | Business logic            |
| Kotlin Serialization | JSON serialization        |
| Android Biometric    | Biometric authentication  |

### Future

| Technology  | Purpose                     |
| ----------- | --------------------------- |
| Spring Boot | Backend API                 |
| PostgreSQL  | Cloud database              |
| JWT         | Authentication              |
| REST API    | Client-server communication |
| Sync Engine | Data synchronization        |

---

# 🏗️ Architecture

Cuanku menggunakan pendekatan **Clean Architecture + MVVM**.

```text
┌─────────────────────────────┐
│          UI Layer           │
│       Jetpack Compose       │
│                             │
│   Screen → ViewModel        │
└──────────────┬──────────────┘
               │
               ▼
┌─────────────────────────────┐
│        Domain Layer         │
│                             │
│   Use Cases                 │
│   Domain Models             │
│   Repository Interfaces     │
└──────────────┬──────────────┘
               │
               ▼
┌─────────────────────────────┐
│         Data Layer          │
│                             │
│   Repository Implementation │
│   Room DAO                  │
│   Room Database             │
│   DataStore                 │
└──────────────┬──────────────┘
               │
               ▼
┌─────────────────────────────┐
│       Local Storage         │
│                             │
│       Room Database         │
└─────────────────────────────┘
```

### Data Flow

```text
User
  │
  ▼
Compose UI
  │
  ▼
ViewModel
  │
  ▼
Use Case
  │
  ▼
Repository
  │
  ▼
Room DAO
  │
  ▼
SQLite Database
```

---

# 📁 Project Structure

Struktur package yang direncanakan:

```text
app/
└── src/
    └── main/
        ├── java/com/cuanku/
        │
        │   ├── data/
        │   │   ├── local/
        │   │   │   ├── dao/
        │   │   │   ├── entity/
        │   │   │   └── database/
        │   │   │
        │   │   └── repository/
        │   │
        │   ├── domain/
        │   │   ├── model/
        │   │   ├── repository/
        │   │   └── usecase/
        │   │
        │   ├── presentation/
        │   │   ├── navigation/
        │   │   ├── screen/
        │   │   │   ├── dashboard/
        │   │   │   ├── account/
        │   │   │   ├── transaction/
        │   │   │   ├── category/
        │   │   │   └── report/
        │   │   │
        │   │   ├── component/
        │   │   └── theme/
        │   │
        │   ├── di/
        │   │
        │   └── CuankuApplication.kt
        │
        └── res/
            ├── drawable/
            ├── mipmap/
            └── values/
```

Struktur tersebut dapat berkembang seiring bertambahnya fitur.

---

# 🚀 Getting Started

## Requirements

Pastikan environment sudah tersedia:

* Windows 10/11
* Android Studio
* JDK yang kompatibel dengan versi Android Gradle Plugin project
* Android SDK
* Android Emulator atau Android Device
* Git

Untuk project ini, development dilakukan menggunakan **Kotlin + Jetpack Compose**.

---

# 📥 Setup Project

## 1. Clone Repository

Clone repository Cuanku:

```bash
git clone <repository-url>
```

Masuk ke folder project:

```bash
cd cuanku
```

Jika repository belum menggunakan Git, project dapat langsung dibuka dari Android Studio.

---

## 2. Open Project dengan Android Studio

Buka:

```text
Android Studio
        ↓
Open
        ↓
Pilih folder project Cuanku
```

Contoh:

```text
C:\Users\<username>\AndroidStudioProjects\Cuanku
```

Android Studio akan melakukan proses:

* Gradle sync
* Download dependencies
* Indexing project
* Kotlin compilation

Tunggu sampai proses **Gradle Sync** selesai.

---

# 📱 3. Setup Android Emulator

Buka:

```text
Android Studio
    → Device Manager
```

Kemudian:

```text
Create Device
```

Pilih device Android, misalnya:

```text
Pixel 7
```

Kemudian pilih Android SDK / system image yang tersedia.

Contoh:

```text
Android 15
API 35
```

Setelah emulator dibuat, jalankan emulator tersebut.

---

# ▶️ 4. Run Application

Pastikan emulator sudah berjalan.

Di Android Studio pilih:

```text
Run → Run 'app'
```

atau tekan:

```text
Shift + F10
```

Jika konfigurasi berhasil, aplikasi **Cuanku** akan berjalan pada emulator.

---

# 🧪 5. Debug Application

Untuk menjalankan aplikasi dalam mode debug:

```text
Run → Debug 'app'
```

atau:

```text
Shift + F9
```

Debug mode memungkinkan kita menggunakan:

* Breakpoint
* Debugger
* Logcat
* Variable inspection
* Step over
* Step into

---

# 🧰 Useful Commands

Jika menggunakan terminal Android Studio:

### Build project

```bash
./gradlew build
```

Windows:

```bash
gradlew.bat build
```

### Build debug APK

```bash
./gradlew assembleDebug
```

Windows:

```bash
gradlew.bat assembleDebug
```

### Run unit test

```bash
./gradlew test
```

### Clean project

```bash
./gradlew clean
```

### Clean dan build

```bash
./gradlew clean build
```

---

# 🗺️ Development Roadmap

## PHASE 0 — Environment

```text
├── Task 0.1  Android Studio
├── Task 0.2  Kotlin + Compose
└── Task 0.3  Debug Emulator                  ✅
```

## PHASE 1 — Project Foundation

```text
├── Task 1.1  Struktur package
├── Task 1.2  Theme & Material 3
├── Task 1.3  Navigation
├── Task 1.4  App state
└── Task 1.5  Basic screen
```

## PHASE 2 — Database

```text
├── Task 2.1  Room setup
├── Task 2.2  Account Entity
├── Task 2.3  Category Entity
├── Task 2.4  Transaction Entity
├── Task 2.5  DAO
└── Task 2.6  Database migration
```

## PHASE 3 — Architecture

```text
├── Task 3.1  Domain model
├── Task 3.2  Repository
├── Task 3.3  Use Case
├── Task 3.4  ViewModel
└── Task 3.5  StateFlow
```

## PHASE 4 — Account

```text
├── Task 4.1  Account list
├── Task 4.2  Add account
├── Task 4.3  Edit account
├── Task 4.4  Delete account
└── Task 4.5  Balance calculation
```

## PHASE 5 — Transaction

```text
├── Task 5.1  Transaction model
├── Task 5.2  Expense
├── Task 5.3  Income
├── Task 5.4  Transfer
├── Task 5.5  Edit
└── Task 5.6  Delete
```

## PHASE 6 — Dashboard

```text
├── Task 6.1  Total balance
├── Task 6.2  Income
├── Task 6.3  Expense
├── Task 6.4  Recent transactions
└── Task 6.5  Monthly summary
```

## PHASE 7 — Category

```text
├── Task 7.1  Category CRUD
├── Task 7.2  Icons
└── Task 7.3  Category statistics
```

## PHASE 8 — Reports

```text
├── Task 8.1  Monthly report
├── Task 8.2  Expense breakdown
├── Task 8.3  Income vs expense
└── Task 8.4  Charts
```

## PHASE 9 — Offline & Data

```text
├── Task 9.1  DataStore
├── Task 9.2  Export JSON
├── Task 9.3  Import JSON
├── Task 9.4  Backup
└── Task 9.5  Database encryption
```

## PHASE 10 — Security

```text
├── Task 10.1 PIN
├── Task 10.2 Biometric
└── Task 10.3 Secure storage
```

## PHASE 11 — Optional Cloud

```text
├── Task 11.1 Spring Boot API
├── Task 11.2 Authentication
├── Task 11.3 Sync engine
└── Task 11.4 Conflict resolution
```

---

# 🎯 Project Goals

Cuanku dikembangkan dengan beberapa tujuan utama:

1. Membuat pencatatan keuangan menjadi sederhana.
2. Menyimpan data secara lokal sehingga aplikasi tetap dapat digunakan tanpa internet.
3. Memisahkan business logic dari UI.
4. Menerapkan arsitektur aplikasi Android modern.
5. Menyediakan sistem backup dan restore data.
6. Menjaga keamanan data keuangan pengguna.
7. Menyediakan fondasi untuk cloud synchronization di masa depan.

---

# 🔐 Offline-First Philosophy

Cuanku menggunakan pendekatan:

```text
                    ┌──────────────┐
                    │     User     │
                    └──────┬───────┘
                           │
                           ▼
                    ┌──────────────┐
                    │  Compose UI  │
                    └──────┬───────┘
                           │
                           ▼
                    ┌──────────────┐
                    │   ViewModel  │
                    └──────┬───────┘
                           │
                           ▼
                    ┌──────────────┐
                    │ Repository   │
                    └──────┬───────┘
                           │
                           ▼
                    ┌──────────────┐
                    │     Room     │
                    │   Database   │
                    └──────────────┘
```

**Local database menjadi sumber data utama aplikasi.**

Internet tidak menjadi requirement untuk operasi dasar seperti:

* membuat transaksi
* mengedit transaksi
* menghapus transaksi
* melihat saldo
* melihat laporan
* mengelola akun
* mengelola kategori

Cloud synchronization merupakan fitur **opsional** pada fase berikutnya.

---

# 📌 Current Status

```text
PHASE 0 — Environment
████████████████████ 100%

PHASE 1 — Project Foundation
░░░░░░░░░░░░░░░░░░░░   0%

PHASE 2 — Database
░░░░░░░░░░░░░░░░░░░░   0%

PHASE 3 — Architecture
░░░░░░░░░░░░░░░░░░░░   0%

PHASE 4 — Account
░░░░░░░░░░░░░░░░░░░░   0%

PHASE 5 — Transaction
░░░░░░░░░░░░░░░░░░░░   0%

PHASE 6 — Dashboard
░░░░░░░░░░░░░░░░░░░░   0%

PHASE 7 — Category
░░░░░░░░░░░░░░░░░░░░   0%

PHASE 8 — Reports
░░░░░░░░░░░░░░░░░░░░   0%

PHASE 9 — Offline & Data
░░░░░░░░░░░░░░░░░░░░   0%

PHASE 10 — Security
░░░░░░░░░░░░░░░░░░░░   0%

PHASE 11 — Optional Cloud
░░░░░░░░░░░░░░░░░░░░   0%
```

---

# 👨‍💻 Development

Project dikembangkan menggunakan:

```text
Kotlin
Jetpack Compose
Material 3
Room
Coroutines
Flow / StateFlow
MVVM
Clean Architecture
```

Development dilakukan secara bertahap berdasarkan roadmap agar setiap bagian aplikasi dapat diuji sebelum masuk ke tahap berikutnya.

---

# 📄 License

License project dapat ditentukan sesuai kebutuhan ketika project mulai dipublikasikan.
