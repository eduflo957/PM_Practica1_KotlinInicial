fun main(args: Array<String>) {
    var numeroPisos = 5
    var numeroVentanas = 3
    var numeroTorres = 3

    fun crearRascacielos(numeroPisos: Int, numeroVentanas: Int, numeroTorres: Int) {
        val techo: Int = numeroVentanas * 2
        var espacioTorres: Int = numeroVentanas * 2

        //Techo
        repeat(numeroTorres) {
            repeat(techo) {
                print("__")
            }
            repeat(espacioTorres) {
                print("  ")
            }
        }

        print("\n")

        //Pinto todo el ancho y luego todo el alto
        repeat(numeroPisos) {
            //Crear un edificio
            repeat(numeroTorres) {
                repeat(numeroVentanas) {
                    print("|__|")
                }
                repeat(espacioTorres) {
                    print("  ")
                }
            }
            print("\n")
        }

    }
    //crearRascacielos(numeroPisos, numeroVentanas, numeroTorres)

    val lista = listOf("Hola,", 2, 3, "¿", 0.1, "Qué", 1, "tal", 0.9, "?")

//Sume todos los números de la lista en una misma variable (Integers y Doubles juntos).
//Concatena todos los String un único String. Añadiendo un espacio por cada nuevo String.
    var prueba : String
    repeat(lista.size) {
        prueba = lista[it]
    }
}