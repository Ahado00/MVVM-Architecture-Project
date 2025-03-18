# Registration Form (MVVM Architecture)
## Create a Registration Form with MVVM Architecture
This project implements a simple registration system with Sign-In and Sign-Up screens using Jetpack Compose for the UI, MVVM architecture, and the SOLID principles. The app allows users to sign in and sign up by entering their credentials, while following the Single Responsibility Principle (SRP) and clean code practices for better maintainability.

## Features
### Sign-In Screen:

- Email and password fields
- Form validation for empty fields
- Navigation to Sign-Up screen if user doesn't have an account


### Sign-Up Screen:

- Name, email, password, and confirm password fields
- Form validation for empty fields, email format, and matching passwords
-Navigation to Sign-In screen after successful registration


### Navigation:

- Seamless navigation between Sign-In and Sign-Up screens


### MVVM Architecture:

- ViewModel for each screen handling business logic
- StateFlow for observing data changes and form validation
- Separation of concerns for better code structure


## Technologies Used

- Jetpack Compose: For building the UI in a declarative way.
- MVVM (Model-View-ViewModel): For clean separation of concerns.
- StateFlow: For managing UI-related data in a reactive manner.
- SOLID Principles: Ensuring the system is maintainable and scalable.
