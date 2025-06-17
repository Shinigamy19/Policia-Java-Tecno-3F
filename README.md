# Sistema de Administración de Escuadrones Policiales y Armas

Este proyecto en Java simula un sistema para gestionar escuadrones policiales, los oficiales que los componen y las armas que tienen asignadas. Fue diseñado como parte de un trabajo final para Tecno 3F.

## 📋 Características

- Gestión de **escuadrones** con nombre, comisaría, policías y armas.
- Administración de **policías**, incluyendo nombre, legajo y arma asignada.
- Soporte para **armas cortas** y **armas largas**, con atributos y métodos específicos para cada tipo.
- Comparación de armas largas por nivel operativo.
- Verificación de estado y condiciones del armamento.
- Reportes organizados por zona con detalles de personal y equipamiento.

## 🧩 Tecnologías usadas

- Lenguaje: **Java SE**
- Paradigma: **Programación Orientada a Objetos**
- Herramientas: `javac` y consola o cualquier IDE como **IntelliJ IDEA** o **Eclipse**

## 📂 Estructura del proyecto

```
├── Main.java              # Clase principal del programa
├── Arma.java              # Clase abstracta para armas
├── ArmaCorta.java         # Subclase para armas cortas
├── ArmaLarga.java         # Subclase para armas largas
├── EstadoArma.java        # Enum para el estado de las armas
├── Policia.java           # Clase que representa a un policía
└── Escuadron.java         # Clase que representa un escuadrón
```

## 🔍 Ejemplo de uso

Al ejecutar el programa se muestra por consola:

- La información detallada de cada escuadrón
- Los policías y sus armas asignadas
- Comparación de armas largas por nivel
- Identificación de armas que están en condiciones de uso

## 🧪 Casos de prueba implementados

- Asignación correcta de policías a escuadrones
- Armas validadas por estado y calibre
- Pistolas como la **B&T USW-A1** que pueden disparar a más de **200m**
- Comparaciones entre armas largas (por nivel operativo)

## ✏️ Autor

**Eros Douglas Benítez Dos Santos**  
📍 Proyecto Final de Java  
📅 Año: 2025

---

## ✅ Posibles Mejoras futuras

- Persistencia en archivo o base de datos (por ejemplo, JSON o SQLite)
- Interfaz gráfica con JavaFX o Swing
- Exportación de informes en PDF o CSV

---

## 🛠️ Cómo ejecutar

1. Cloná el repositorio:

2. Compilá y ejecutá:
```bash
javac Main.java
java Main
```

> Asegurate de tener JDK instalado.

---

## 📜 Informacion:

Inspiración de los Personajes

Los policías del sistema están inspirados en personajes icónicos del cine:

| Personaje | Película / Saga | Año | Actor/Actriz | Descripción |
|-----------|------------------|-----|--------------|-------------|
| **Harry Callahan** | *Dirty Harry* | 1971 | Clint Eastwood | Inspector del SFPD que utiliza métodos poco ortodoxos para atrapar criminales. |
| **John McClane** | *Die Hard* (*Duro de Matar*) | 1988 | Bruce Willis | Policía de Nueva York que frustra ataques terroristas en solitario. |
| **Tom Ludlow** | *Street Kings* | 2008 | Keanu Reeves | Detective del LAPD atrapado en una red de corrupción y venganza. |
| **Max Rockatansky** | *Mad Max* | 1979–2015 | Mel Gibson / Tom Hardy | Exoficial que sobrevive en un mundo postapocalíptico salvaje. |
| **Alex Murphy** | *RoboCop* | 1987 | Peter Weller | Oficial convertido en cyborg por una corporación privada. |
| **Gracie Hart** | *Miss Congeniality* | 2000 | Sandra Bullock | Agente del FBI infiltrada en un concurso de belleza. |
| **Alice Abernathy** | *Resident Evil* | 2002–2016 | Milla Jovovich | Exagente que combate zombis en un mundo distópico. |
| **Evelyn Salt** | *Salt* | 2010 | Angelina Jolie | Espía acusada de traición, lucha para limpiar su nombre. |
| **John Kimble** | *Kindergarten Cop* | 1990 | Arnold Schwarzenegger | Policía encubierto como maestro de niños. |
| **Kevin Brown** | *Men in Black* | 1997 | Tommy Lee Jones | Agente “K” que trabaja en una agencia que regula alienígenas. |


---

Informacion de las armas: https://www.armas.es/wikiarmas/armas-de-fuego

Info para los escuadrones:
https://www.fao.org/4/x5622s/x5622s02.htm
