package proyecto_mascota;
 
public class Estilos {
 
    // Reset
    public static final String RESET       = "\u001B[0m";
 
    // Estilos de texto
    public static final String NEGRITA     = "\u001B[1m";
    public static final String TENUE       = "\u001B[2m";
    public static final String SUBRAYADO   = "\u001B[4m";
 
    // Colores de texto
    public static final String ROJO        = "\u001B[31m";
    public static final String VERDE       = "\u001B[32m";
    public static final String AMARILLO    = "\u001B[33m";
    public static final String AZUL        = "\u001B[34m";
    public static final String MAGENTA     = "\u001B[35m";
    public static final String CIAN        = "\u001B[36m";
 
    // Colores brillantes
    public static final String ROJO_B      = "\u001B[91m";
    public static final String VERDE_B     = "\u001B[92m";
    public static final String AMARILLO_B  = "\u001B[93m";
    public static final String AZUL_B      = "\u001B[94m";
    public static final String MAGENTA_B   = "\u001B[95m";
    public static final String CIAN_B      = "\u001B[96m";
    public static final String BLANCO_B    = "\u001B[97m";
 
    // Separadores ASCII simples
    public static final String LINEA_DOBLE    = MAGENTA + "============================================" + RESET;
    public static final String LINEA_DOBLE_FIN= MAGENTA + "============================================" + RESET;
    public static final String LINEA_SIMPLE   = CIAN    + "--------------------------------------------" + RESET;
    public static final String LINEA_PUNTEADA = TENUE   + ". . . . . . . . . . . . . . . . . . . . . ." + RESET;
 
    // Prefijos para mensajes (sin caracteres especiales)
    public static final String OK       = VERDE_B   + " [OK] " + RESET;
    public static final String INFO     = CIAN_B    + " [>>] " + RESET;
    public static final String PREGUNTA = AMARILLO_B+ " [?]  " + RESET;
    public static final String ERROR    = ROJO_B    + " [!!] " + RESET;
 
    // Centrar texto dentro de la caja (44 chars)
    public static String centrar(String texto) {
        // Eliminar codigos ANSI para calcular longitud real
        String limpio = texto.replaceAll("\u001B\\[[;\\d]*m", "");
        int ancho = 44;
        int espacios = (ancho - limpio.length()) / 2;
        if (espacios < 0) espacios = 0;
        String pad = " ".repeat(espacios);
        return MAGENTA + "=" + RESET + pad + texto + pad + MAGENTA + "=" + RESET;
    }
}
 