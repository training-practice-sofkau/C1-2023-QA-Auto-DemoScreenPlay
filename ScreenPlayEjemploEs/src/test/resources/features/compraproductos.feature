#language:es
#encoding:UTF-8
#Author: Juan David Cardona Velasquez

Característica: Compras en pagina de pruebas Automation
  yo como usuario de la pagina automation exercise
  quiero empezar a comprar productos

  Antecedentes:
    Dado que estoy loggeado en la pagina

  @Compra
  Escenario: Compra de 2 productos distintos
    Cuando Agrego los productos al carrito
    Y procedo a pagar los productos del carrito
    Entonces Deberia ver un mensaje indicando la compra exitosa

#  @InicioSesión
#  Escenario: Iniciar sesion
#    Y completa los campos para iniciar sesion
#    Entonces el usuario debe ver su nombre en la pagina principal