#language:es
#encoding:UTF-8
#Author: Juan Esteban Pineda Angel

Característica: Compras en pagina de pruebas
  yo como usuario de la pagina automation exercise
  quiero crear una cuenta e ingresar
  para poder comprar productos en la página


  Antecedentes:
    Dado que el usuario esta en la pagina de inicio
    Cuando navega hasta el formulario de registro

  @Registro
  Escenario: Registro de clientes
    Y Llena todos los campos
    Entonces recibe un mensaje de finalizacion del registro

  @InicioSesión
  Escenario: Iniciar sesion
    Y completa los campos para iniciar sesion
    Entonces el usuario debe ver su nombre en la pagina principal

  @RealizarCompra
  Escenario: Comprar productos
    Y ha iniciado sesion
    Y Selecciona los productos a comprar
    Entonces Recibe una confirmacion de su compra