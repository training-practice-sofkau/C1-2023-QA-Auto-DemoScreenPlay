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
  Escenario: Registro de usuario
    Y Llena todos los campos de resgistro
    Entonces el usuario inicia sesion


  @Compra
  Escenario: Comprar productos
    Y elige tres productos en su carrito de compras
    Entonces se genera una orden de compra

  @Pago
  Escenario: Realizar pago
    Y completa los campos de la tarjeta de credito
    Entonces deberia ver un mensaje que la  orden fue aceptada