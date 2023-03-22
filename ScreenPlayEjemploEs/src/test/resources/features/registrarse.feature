#language:es
#encoding:UTF-8
#Author: Juan Esteban Pineda Angel

Característica: Compras en pagina de pruebas
  yo como usuario de la pagina automation exercise
  quiero crear una cuenta e ingresar
  para poder comprar productos en la página

  Antecedentes:
    Dado que el usuario esta en la pagina de inicio
    Cuando navega hasta la el formulario de registro

  @Registro
  Escenario: Registro de clientes
    Y Llena todos los campos
    Entonces recibe un mensaje de confirmacion

  @InicioSesión
  Escenario: Iniciar sesion
    Y completa los campos para iniciar sesion
    Entonces el usuario debe ver su nombre en la pagina principal

  @Compras
  Escenario: Compra de productos
    Y inicia sesion y navega para comprar un producto
    Entonces recibe un mensaje de confirmacion de compra

