
     class Disco(val discoAnterior:Disco?, val nombreDisco:String, val discoPrincipal: Disco?):seleccion {
        val carpeta  = mutableListOf<seleccion>()


        fun volverAlMenuPrincpal(){
            if(discoPrincipal == null) {
                mostrar()
            }else{
                discoPrincipal.mostrar()
            }
        }

        fun chekeo(I: Int){
            try {
                carpeta[I].mostrar()
            }catch (e:Exception){
                println("Opcion Incorrecta")
                mostrar()
            }

        }

        override fun mostrar() {

            println( "${ mostrarNombre() } : ")

            carpeta.forEach { carpeta -> println( "    ${this.carpeta.indexOf(carpeta)} --  ${carpeta.mostrarNombre()} "  )
            }


            println("    ${carpeta.size}  --   Retroceder" )
            println("    ${carpeta.size+1}  --  volver al menu principal " )



            println("ELEGIR POR FAVOR..")
            seleccionarOpcion()



        }

        override fun atras() {

            if(discoAnterior!=null){
                discoAnterior.mostrar()
            }else{
                mostrar()
            }

        }

        override fun mostrarNombre():String {
            return nombreDisco
        }


        fun agregar(agregado:seleccion){
            if(!carpeta.contains(agregado)){
                carpeta.add(agregado)
            }
        }

        private fun seleccionarOpcion(){
            val numero  = readLine()?.toInt()

            if(numero!=null){
                when(numero){
                    carpeta.size -> atras()
                    carpeta.size+1 -> volverAlMenuPrincpal()
                    else -> chekeo(numero)
                }


            } else{
                println("OPCION INCORRECTA")
                mostrar()

            }

        }

    }
