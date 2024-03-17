<h1>
    <img src="./docs/pattern-lock.png" width="35" height="35">
    DESIGN PATTERN: SINGLETON
</h1>

This repository is dedicated to exploring and analyzing the Singleton design pattern, a creational design pattern widely used in software engineering.

<h2>
    <img src="./docs/project-icon.png" width="25" height="25">
    About project
</h2>

<p>For the design pattern case study, a project created in Java was used, which replicates an example of a database connection class.</p>

<p>In this context, there are 2 components. The DbConnector class(SINGLETON), which interfaces with the external driver, and the system's repository class, which defines which query is executed.<p>

<h2>
    <img src="./docs/flow-chart.png" width="25" height="25">
    Class diagram
</h2>

<p align="center">
 <img src="./docs/d-class-singleton.png" >
</p>

# Project structure

```
- 📁 src
  - 📁 main
    - 📁 java
      - 📁 com
        - 📁 example
        - 📁 entities
          - 📄 User.java
        - 📁 repository
          - 📄 UserRepository.js
        - 📁 utils
          - 📁 database
            - 📄 DbConnector.java
            - 📄 DbConnectorImpl.java
        - 📁 resources
  - 📁 test
    - 📁 java
      - 📁 repository
          - 📄 UserRepositoryTest.java
      - 📁 utils
        - 📁 database
          - 📄 DbConnectoImplTest.java

```
