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

## 🖼️ Cómo se ve
<img alt="Zona Sur" src="previews\zona_sur.png" width="500" />
<img alt="Zona Oeste" src="previews\zona_oeste.png" width="500" />
<img alt="Zona Norte" src="previews\zona_norte.png" width="500" />
<img alt="Comparacion" src="previews\comparacion.png" width="500" />

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

---

<h3 align="center">Mis redes sociales:</h3>
<p align="center">
<a href="https://www.youtube.com/c/shinigamy19" target="_blank" rel="noopener"><img align="center" src="https://raw.githubusercontent.com/rahuldkjain/github-profile-readme-generator/master/src/images/icons/Social/youtube.svg" alt="shinigamy19" height="35" width="35" title="Mi canal de Youtube" /></a>
<a href="https://twitch.tv/shinigamy_19" target="_blank" rel="noopener"><img align="center" src="https://img.icons8.com/external-justicon-flat-justicon/64/external-twitch-social-media-justicon-flat-justicon.png" alt="px9fcpbp3T" height="30" width="30" title="Mi canal de Twitch"/></a>
<a href="https://kick.com/shinigamy19" target="_blank" rel="noopener"><img align="center" src="https://img.freepik.com/premium-vector/kick-logo-vector-download-kick-streaming-icon-logo-vector-eps_691560-10814.jpg" alt="px9fcpbp3T" height="30" width="30" title="Mi canal de Kick"/></a>
<a href="https://discord.gg/px9fcpbp3T" target="_blank" rel="noopener"><img align="center" src="https://www.notebookcheck.org/fileadmin/Notebooks/News/_nc3/discord.jpeg" alt="Mi Server de Discord" title="Mi Server de Discord" height="30" width="30" style="border-radius: 4px 4px 4px 4px"  /></a>
<a href="https://instagram.com/shinigamy19_art" target="_blank" rel="noopener"><img align="center" src="https://upload.wikimedia.org/wikipedia/commons/thumb/e/e7/Instagram_logo_2016.svg/2048px-Instagram_logo_2016.svg.png" alt="shinigamy19_art" title="Mi instagram de Artista" height="30" width="30" /></a>
<a href="https://instagram.com/shinigamy19" target="_blank" rel="noopener"><img align="center" src="https://upload.wikimedia.org/wikipedia/commons/thumb/e/e7/Instagram_logo_2016.svg/2048px-Instagram_logo_2016.svg.png" title="Mi Intagram Personal" alt="shinigamy19" height="30" width="30" /></a>
<a href="https://www.tiktok.com/@shinigamy_19" target="_blank" rel="noopener"><img align="center" src="https://cdn4.iconfinder.com/data/icons/logos-brands-in-colors/2500/tiktok-icon-white-512.png" alt="shinigamy19" title="Mi Tiktok" height="30" width="30" style="border-radius: 4px 4px 4px 4px" /></a>
<a href="https://linkedin.com/in/eros-benitez" target="_blank" rel="noopener"><img align="center" src="https://upload.wikimedia.org/wikipedia/commons/thumb/c/ca/LinkedIn_logo_initials.png/640px-LinkedIn_logo_initials.png" alt="eros-benitez" title="Mi LinkedIn" height="30" width="30" style="border-radius: 4px 4px 4px 4px" /></a>
<a href="https://www.behance.net/shinigamy19" target="_blank" rel="noopener"><img align="center" src="https://raw.githubusercontent.com/rahuldkjain/github-profile-readme-generator/master/src/images/icons/Social/behance.svg" alt="shinigamy19" title="Mi Behance" height="30" width="30" /></a>
<a href="https://shinigamy19.itch.io/" target="_blank" rel="noopener"><img align="center" src="https://static.itch.io/images/app-icon.svg" alt="shinigamy19" title="Mi perfil de Itch" height="30" width="30" style="border-radius: 4px 4px 4px 4px" /></a>
<a href="https://fb.com/shinigamy19" target="_blank" rel="noopener"><img align="center" src="https://raw.githubusercontent.com/rahuldkjain/github-profile-readme-generator/master/src/images/icons/Social/facebook.svg" alt="shinigamy19" title="Mi facebook" height="30" width="30" /></a>
<a href="mailto:erosbenitezd@gmail.com" target="_blank" rel="noopener"><img align="center" src="https://upload.wikimedia.org/wikipedia/commons/thumb/8/8c/Gmail_Icon_%282013-2020%29.svg/2560px-Gmail_Icon_%282013-2020%29.svg.png" alt="shinigamy19" title="Mi Mail" height="30" width="35" /></a>

<div>
<h3 align="center">Donaciones:</h3>
<p align="center">
<a href="https://ceneka.net/mp/d/shinigamy19" target="_blank" rel="noopener"><img align="center" src="https://github.com/Shinigamy19/repo-svg-iconos/blob/main/Logos/Mercado%20Pago.png?raw=true" alt="shinigamy19" height="35" width="35" title="Donaciones Por Mercado Pago" /></a>
<a href="https://www.paypal.me/shinigamy19" target="_blank" rel="noopener"><img align="center" src="https://upload.wikimedia.org/wikipedia/commons/a/a4/Paypal_2014_logo.png" alt="px9fcpbp3T" height="30" width="30" title="Donaciones Por PayPal"/></a>
<a href="https://www.patreon.com/shinigamy19" target="_blank" rel="noopener"><img align="center" src="https://github.com/Shinigamy19/repo-svg-iconos/blob/main/Logos/Patreon.png" alt="px9fcpbp3T" height="30" width="30" title="Donaciones Por Patreon"/></a>

</p>
<p align="center">
<a href='https://cafecito.app/shinigamy19' rel='noopener' target='_blank'><img srcset='https://cdn.cafecito.app/imgs/buttons/button_6.png 1x, https://cdn.cafecito.app/imgs/buttons/button_6_2x.png 2x, https://cdn.cafecito.app/imgs/buttons/button_6_3.75x.png 3.75x' src='https://cdn.cafecito.app/imgs/buttons/button_6.png' alt='Invitame un café en cafecito.app' title="Donaciones Por Cafecito"/></a></p>
</div>
