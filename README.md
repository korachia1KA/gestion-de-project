# 🚀 GestionProjet - Plateforme de Gestion de Projets

Une application web complète de gestion de projets développée avec **Spring Boot** et **Angular**, offrant une solution moderne et robuste pour la planification, l'exécution et le suivi de projets d'équipe.

## 📋 Table des matières

- [🎯 Vue d'ensemble](#-vue-densemble)
- [✨ Fonctionnalités principales](#-fonctionnalités-principales)
- [🏗️ Architecture technique](#️-architecture-technique)
- [🛠️ Technologies utilisées](#️-technologies-utilisées)
- [📦 Installation et configuration](#-installation-et-configuration)
- [🔐 Sécurité et authentification](#-sécurité-et-authentification)
- [📊 Fonctionnalités avancées](#-fonctionnalités-avancées)
- [🎨 Interface utilisateur](#-interface-utilisateur)
- [📱 API REST](#-api-rest)
- [🧪 Tests](#-tests)
- [📈 Monitoring et logs](#-monitoring-et-logs)
- [🤝 Contribution](#-contribution)

## 🎯 Vue d'ensemble

**GestionProjet** est une plateforme complète de gestion de projets qui permet aux équipes de collaborer efficacement sur des projets complexes. L'application offre une interface intuitive pour la planification, l'assignation de tâches, le suivi de progression et la communication entre les membres de l'équipe.

### 🎯 Objectifs du projet

- **Centralisation** : Un seul endroit pour gérer tous les aspects d'un projet
- **Collaboration** : Faciliter le travail d'équipe avec des outils de communication intégrés
- **Transparence** : Suivi en temps réel de l'avancement des projets
- **Productivité** : Automatisation des processus et notifications intelligentes
- **Scalabilité** : Architecture modulaire permettant l'évolution de l'application

## ✨ Fonctionnalités principales

### 👥 Gestion des utilisateurs et rôles
- **Système d'authentification** avec JWT
- **Gestion des rôles** : Directeur, Chef de projet, Membre d'équipe
- **Profils utilisateurs** avec statistiques de projets
- **Changement de mot de passe** sécurisé

### 📊 Gestion des projets
- **Création et modification** de projets avec métadonnées complètes
- **Attribution de chefs de projet** avec gestion des permissions
- **Catégorisation** par priorité et type
- **Gestion du budget** et des échéances
- **Statuts de projet** : En cours, Terminé, En pause, Annulé

### ✅ Gestion des tâches
- **Création et assignation** de tâches aux membres d'équipe
- **Suivi de progression** avec pourcentages d'avancement
- **Gestion des priorités** et estimations temporelles
- **Tâches prédécesseurs** pour les dépendances
- **Tags et catégorisation** des tâches
- **Statuts détaillés** : À faire, En cours, En révision, Terminé

### 🔔 Système de notifications
- **Notifications en temps réel** pour les événements importants
- **Notifications par email** pour les mises à jour critiques
- **Historique des notifications** par utilisateur
- **Marquage comme lu** et gestion des préférences

### 📈 Suivi et reporting
- **Logs d'activité** détaillés pour les projets et tâches
- **Historique des modifications** avec traçabilité complète
- **Statistiques utilisateur** avec nombre de projets
- **Dashboard** avec vue d'ensemble des projets

### 🔐 Gestion des affectations
- **Affectation de tâches** aux membres d'équipe
- **Gestion des permissions** basée sur les rôles
- **Vue personnalisée** des tâches assignées
- **Contrôle d'accès** granulaire

## 🏗️ Architecture technique

### Backend (Spring Boot)
```
backend/
├── src/main/java/com/example/gestionprojet/
│   ├── business/           # Couche métier
│   │   ├── service/        # Interfaces des services
│   │   └── impl/          # Implémentations des services
│   ├── config/            # Configuration Spring Security
│   ├── constant/          # Constantes de sécurité
│   ├── dao/              # Couche d'accès aux données
│   │   ├── model/        # Entités JPA
│   │   └── repository/   # Repositories Spring Data
│   ├── exception/        # Gestion des exceptions
│   └── web/             # Couche web
│       ├── controller/   # Contrôleurs REST
│       └── dto/         # Objets de transfert de données
```

### Frontend (Angular)
```
frontend/src/app/
├── components/           # Composants Angular
│   ├── dashboard/       # Tableau de bord principal
│   ├── create-project/  # Création de projets
│   ├── create-tache/    # Création de tâches
│   ├── my-tasks/        # Mes tâches
│   ├── task-dashboard/  # Dashboard des tâches
│   ├── login/          # Authentification
│   └── sidebar/        # Navigation latérale
├── services/           # Services Angular
├── shared/            # Modèles et utilitaires partagés
├── core/             # Guards et intercepteurs
└── config/           # Configuration API
```

## 🛠️ Technologies utilisées

### Backend
- **Java 17** - Langage de programmation principal
- **Spring Boot 3.5.0** - Framework de développement
- **Spring Security** - Sécurité et authentification
- **Spring Data JPA** - Persistance des données
- **MySQL 8** - Base de données relationnelle
- **JWT** - Authentification par tokens
- **Lombok** - Réduction du code boilerplate
- **Spring Mail** - Envoi d'emails
- **Maven** - Gestion des dépendances

### Frontend
- **Angular 16** - Framework frontend
- **TypeScript** - Langage de programmation
- **Tailwind CSS** - Framework CSS utilitaire
- **RxJS** - Programmation réactive
- **Angular Router** - Navigation
- **Angular Forms** - Gestion des formulaires

### Outils de développement
- **Git** - Contrôle de version
- **Maven** - Build et gestion des dépendances
- **npm** - Gestion des packages Node.js
- **PostCSS** - Traitement CSS
- **Karma/Jasmine** - Tests unitaires

## 📦 Installation et configuration

### Prérequis
- Java 17 ou supérieur
- Node.js 16 ou supérieur
- MySQL 8.0 ou supérieur
- Maven 3.6+
- Angular CLI

### Configuration de la base de données
```sql
CREATE DATABASE gestionprojet_db;
CREATE USER 'gestionprojet_user'@'localhost' IDENTIFIED BY 'votre_mot_de_passe';
GRANT ALL PRIVILEGES ON gestionprojet_db.* TO 'gestionprojet_user'@'localhost';
FLUSH PRIVILEGES;
```

### Configuration backend
1. **Cloner le repository**
   ```bash
   git clone <repository-url>
   cd GestionProjet/backend
   ```

2. **Configurer la base de données**
   ```properties
   # application.properties
   spring.datasource.url=jdbc:mysql://localhost:3306/gestionprojet_db
   spring.datasource.username=gestionprojet_user
   spring.datasource.password=votre_mot_de_passe
   ```

3. **Lancer l'application**
   ```bash
   mvn spring-boot:run
   ```

### Configuration frontend
1. **Installer les dépendances**
   ```bash
   cd ../frontend
   npm install
   ```

2. **Lancer l'application**
   ```bash
   ng serve
   ```

3. **Accéder à l'application**
   ```
   http://localhost:4200
   ```

## 🔐 Sécurité et authentification

### JWT (JSON Web Tokens)
- **Tokens d'authentification** avec expiration de 24h
- **Refresh tokens** pour maintenir la session
- **Validation automatique** des tokens sur chaque requête

### Gestion des rôles
- **DIRECTEUR** : Accès complet à tous les projets
- **CHEF_PROJET** : Gestion des projets assignés
- **MEMBRE_EQUIPE** : Accès aux tâches assignées

### Sécurité des endpoints
- **Authentification requise** pour tous les endpoints sensibles
- **Autorisation basée sur les rôles** avec `@PreAuthorize`
- **Validation des données** avec Bean Validation
- **Gestion des CORS** pour la sécurité cross-origin

## 📊 Fonctionnalités avancées

### Système de logs
- **Logs de projet** : Suivi des modifications de projets
- **Logs de tâches** : Historique des changements de tâches
- **Traçabilité complète** des actions utilisateur

### Notifications intelligentes
- **Notifications en temps réel** via WebSocket
- **Emails automatiques** pour les événements importants
- **Préférences de notification** par utilisateur

### Gestion des erreurs
- **Gestion globale des exceptions** avec `GlobalExceptionHandler`
- **Messages d'erreur personnalisés** et informatifs
- **Logs d'erreur** pour le debugging

## 🎨 Interface utilisateur

### Design moderne
- **Interface responsive** adaptée à tous les écrans
- **Design Material** avec Tailwind CSS
- **Navigation intuitive** avec sidebar
- **Thème sombre/clair** (prévu)

### Composants réutilisables
- **Formulaires dynamiques** avec validation
- **Tableaux interactifs** avec tri et filtrage
- **Modales et popups** pour les actions rapides
- **Indicateurs de progression** visuels

### Expérience utilisateur
- **Feedback visuel** pour toutes les actions
- **Chargement progressif** des données
- **Gestion des états** de chargement et d'erreur
- **Navigation fluide** entre les pages

## 📱 API REST

### Endpoints principaux

#### Authentification
```
POST /api/auth/register     # Inscription utilisateur
POST /api/auth/login        # Connexion
POST /api/auth/change-password # Changement de mot de passe
```

#### Projets
```
GET    /api/projets/{id}           # Détails d'un projet
POST   /api/projets/add           # Créer un projet
PUT    /api/projets/{id}          # Modifier un projet
PUT    /api/projets/{id}/chef     # Changer le chef de projet
```

#### Tâches
```
GET    /api/projets/{id}/taches           # Tâches d'un projet
POST   /api/projets/{id}/taches          # Créer une tâche
PUT    /api/taches/{id}                  # Modifier une tâche
PUT    /api/taches/{id}/statut           # Changer le statut
PUT    /api/taches/{id}/progression      # Mettre à jour la progression
```

#### Affectations
```
POST   /api/taches/{id}/affectations     # Affecter une tâche
GET    /api/taches/mes-taches           # Mes tâches assignées
```

#### Notifications
```
GET    /api/notifications/mes-notifications # Mes notifications
```

#### Utilisateurs
```
GET    /api/users/with-project-count     # Utilisateurs avec statistiques
```

### Format des réponses
```json
{
  "success": true,
  "data": { ... },
  "message": "Opération réussie",
  "timestamp": "2024-01-15T10:30:00Z"
}
```

## 🧪 Tests

### Tests backend
- **Tests unitaires** avec JUnit 5
- **Tests d'intégration** avec Spring Boot Test
- **Tests de sécurité** pour les endpoints
- **Couverture de code** avec JaCoCo

### Tests frontend
- **Tests unitaires** avec Jasmine/Karma
- **Tests d'intégration** avec Angular Testing
- **Tests E2E** avec Protractor (prévu)

### Exécution des tests
```bash
# Backend
cd backend
mvn test

# Frontend
cd frontend
ng test
```

## 📈 Monitoring et logs

### Logs applicatifs
- **Logs structurés** avec niveaux (INFO, WARN, ERROR)
- **Corrélation des requêtes** avec trace IDs
- **Performance monitoring** des endpoints

### Métriques
- **Temps de réponse** des API
- **Taux d'erreur** par endpoint
- **Utilisation des ressources** système

## 🤝 Contribution

### Standards de code
- **Conventions de nommage** Java et TypeScript
- **Documentation** des méthodes publiques
- **Tests unitaires** pour les nouvelles fonctionnalités
- **Code review** obligatoire

### Processus de développement
1. **Fork** du repository
2. **Création d'une branche** feature
3. **Développement** avec tests
4. **Pull Request** avec description détaillée
5. **Code review** et validation
6. **Merge** dans la branche principale

## 📄 Licence

Ce projet est sous licence MIT. Voir le fichier `LICENSE` pour plus de détails.

## 👨‍💻 Auteur

**Abdelghafour Korachi**

---

## 🚀 Démarrage rapide

1. **Cloner le projet**
   ```bash
   git clone <repository-url>
   cd GestionProjet
   ```

2. **Lancer le backend**
   ```bash
   cd backend
   mvn spring-boot:run
   ```

3. **Lancer le frontend**
   ```bash
   cd frontend
   npm install
   ng serve
   ```

4. **Accéder à l'application**
   ```
   Frontend: http://localhost:4200
   Backend:  http://localhost:8082
   ```

---

**GestionProjet** - Une solution complète pour la gestion de projets d'équipe moderne et efficace ! 🎯
