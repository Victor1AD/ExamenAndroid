Feature: Examen Automatizacion Android

  @test1
  Scenario Outline: Validando productos
    Given estoy en la aplicación de SauceLabs
    And valido que carguen correctamente los productos en la galería
    When agrego <UNIDADES> del siguiente producto "<PRODUCTO>"
    Then valido el carrito de compra actualice correctamente

    Examples:
      | PRODUCTO                  | UNIDADES |
      | Sauce Labs Backpack       | 1        |
      | Sauce Labs Bolt - T-Shirt | 1        |
      | Sauce Labs Fleece Jacket  | 2        |

