
    fun main(){

        val discoPrincipal = Disco(null,"Este Equipo",null)

        val discoA  = Disco(discoPrincipal,"Disco (C:)",discoPrincipal)
        val discoB  = Disco(discoPrincipal,"Disco(A:)",discoPrincipal)
        val discoC  = Disco(discoPrincipal,"Disco (B:)",discoPrincipal)
        val discoD  = Disco(discoC,"UNLAM",discoPrincipal)

        val carpetaA = Carpeta(discoA,"Archivos de programa " ,  { it->it.lowercase() } )
        val carpetaC = Carpeta(discoA,"User " ,  { it->it.lowercase() } )
        val carpetaB = Carpeta(discoA,"Windows" ,  { it->it.uppercase() } )



        val subCarpeta = Carpeta(discoD,"Adios" ,{ it->it.lowercase()})


        discoA.agregar(carpetaA)
        discoA.agregar(carpetaC)
        discoB.agregar(carpetaB)
        discoD.agregar(subCarpeta)
        discoC.agregar(discoD)

        discoPrincipal.agregar(discoA)
        discoPrincipal.agregar(discoB)
        discoPrincipal.agregar(discoC)


        discoPrincipal.mostrar()
    }






