package Ejercicio4;

public class MeterDatos {

    public static void meterDatos(String[] parte, Alumno datosAlumno) {
        String nombre = parte[0];
        datosAlumno.setNombre(nombre);
        String apellido1 = parte[1];
        datosAlumno.setApellido1(apellido1);
        String apellido2 = parte[2];
        datosAlumno.setApellido2(apellido2);
        String nota1 = parte[3];
        datosAlumno.setMarcas(nota1);
        String nota2 = parte[4];
        datosAlumno.setProgramacion(nota2);
        String nota3 = parte[5];
        datosAlumno.setEntornos(nota3);
        String nota4 = parte[6];
        datosAlumno.setBase(nota4);
        String nota5 = parte[7];
        datosAlumno.setSistemas(nota5);
        String nota6 = parte[8];
        datosAlumno.setFol(nota6);
    }
}
