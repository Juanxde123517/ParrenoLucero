package ExamenProgreso;

public class NodoRed {
    private int identificador;
    private int capacidadmaxima;
    private int conexionesactivas;
    public static int contadorNodos;
 //recordad el contador de nodos creados correctamente
    public NodoRed(int identificador, int capacidadmaxima, int conexionesactivas ){
        if (identificador > 0){
            this.identificador = identificador;
        }
        if (capacidadmaxima > 0){
            this.capacidadmaxima = capacidadmaxima;
        }
        if (conexionesactivas > 0 && conexionesactivas < capacidadmaxima){
            this.conexionesactivas = conexionesactivas;
        }
    }
    public static int contadorNodos(){
        return contadorNodos++;
    }
    public int getIdentificador(int identificador){
        return identificador;
    }
    public int getCapacidadmaxima(int capacidadmaxima){
        return capacidadmaxima;
    }
    public int getConexionesactivas(int conexionesactivas){
        return conexionesactivas;
    }
    public boolean conectar(){
        if (conexionesactivas < capacidadmaxima){
            conexionesactivas++;
            return true;
        }else {
            System.out.println("Conexiones activas han alcanzado su máxima capacidad");
            return false;
        }
    }

    public boolean desconectar(){
        if (conexionesactivas > 1){
            conexionesactivas--;
            System.out.println(conexionesactivas);
            return true;
        }else {
            return false;
        }
    }

    public int consultaContador(){
        System.out.println("El número de nodos creados correctamente son:");
        return contadorNodos();
    }

}
