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
    Entonces el usuario debe ser redireccionado a la pagina principal
  @Compra
  Escenario: Compra de productos
    Y Completa los campos para el login y selecciona producto
    Entonces el usuario debe mirar un mensaje de compra exitosa

  @InicioSesión
  Escenario: Iniciar sesion
    Y completa los campos para iniciar sesion
    Entonces el usuario debe ver su nombre en la pagina principal