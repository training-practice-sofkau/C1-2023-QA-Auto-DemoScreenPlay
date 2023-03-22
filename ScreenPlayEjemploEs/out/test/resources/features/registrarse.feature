#language:es
#encoding:UTF-8
#Author: Sergio Andres Balcazar Restrepo

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
    Entonces el usuario debe ser redireccionado a la pagina principal

  @InicioSesión
  Escenario: Iniciar sesion
    Y completa los campos para iniciar sesion
    Entonces el usuario debe ver su nombre en la pagina principal


  @Compra
  Escenario: Compra producto
    Y completa el formulario para iniciar sesion
    Y elige un producto para comprar
    Entonces el usuario debe recibir un mensaje de confirmacion de compra