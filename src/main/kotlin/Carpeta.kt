class Carpeta(val carpetaAnterior: Disco, val texto:String, val accion:(String) -> String) :seleccion {

    override fun mostrar() {
        println(accion(texto))
    }

    override fun atras() {
        carpetaAnterior.mostrar()
    }

    override fun mostrarNombre(): String {
        return texto
    }
}