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
    Y Llena todos los campos del resgistro
    Entonces puede ver un mensaje con su nombre
