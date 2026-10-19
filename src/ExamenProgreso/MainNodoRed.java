package ExamenProgreso;

public class MainNodoRed {
    public static void main() {
        NodoRed red1 = new NodoRed(1, 2, 0);
        System.out.println(red1.conectar()+ "Conexion activa.");
        System.out.println(red1.getConexionesactivas(1));
        System.out.println(red1.conectar()+ "Conexion activa.");
        System.out.println(red1.getConexionesactivas(2));
        System.out.println(red1.conectar()+ "Conexion desactivada.");
        System.out.println(red1.conectar());
    }
}
