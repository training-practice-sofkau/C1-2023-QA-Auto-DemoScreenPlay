# Demo ScreenPlay

"Cada momento de tu vida es una prueba o una celebración".

Visite la página de pruebas [https://automationexercise.com/](https://automationexercise.com/)

Seleccione un flujo de compra de automatización:

- Registrarse.
- Iniciar sesión.
- Seleccionar productos.
- Y terminar su compra.

Nota: Utilice este repositorio como base para realizar su automatización. Recuerde que un escenario de automatización 
debe ser independiente, replicable, debe terminar en una aserción y cerrar el driver.

Requisitos:

1. Gestor de dependencias Gradle.
2. Test Runner de Cucumber.
3. Patron ScreenPlay.
4. Framework Serenity BDD.
5. Versión java 1.8 o superior.

# Taller ScreenPlay

A partir del flujo automatizado de Login en la página https://automationexercise.com/ implementado durante la Master 
class, se pide realizar la automatización del flujo de registro y de compra, usando de la misma manera el patrón de 
diseño `ScreenPlay` en `Java`.

## Arquetipo de carpetas
Se usa como base lo visto en clase, sin embargo, se realizan algunas modificaciones en cuanto al manejo de nombres y 
distribución de carpetas, estas siendo mínimas para mantenerse dentro de lo que dicta el patrón.

> *Se recomienda utilizar un archivo `.gitignore` en futuras bases para proyectos.*

`.gitignore` ⏬
```.gitignore
*/.gradle
*/build/
*/!gradle/wrapper/gradle-wrapper.jar
*/!**/src/main/**/build/
*/!**/src/test/**/build/
*/.idea
*/*.iws
*/*.iml
*/*.ipr
*/out/
*/!**/src/main/**/out/
*/!**/src/test/**/out/
*/target
```

*By: Jonathan Vargas 🐢 Ococho*

<a href="https://gitmoji.dev">
  <img
    src="https://img.shields.io/badge/gitmoji-%20😜%20😍-FFDD67.svg?style=flat-square"
    alt="Gitmoji"
  />
</a>