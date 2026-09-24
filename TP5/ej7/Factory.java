public class Factory { // NO DAR BOLA ES CUALQUIER COSA ESTE FACTORY
    public static Personaje crearPersonaje(String tipo, String nombre) {
        switch (tipo.toLowerCase()) {
            case "mago": return new Mago(nombre);
            case "elfo": return new Elfo(nombre);
            case "hechicera": return new Hechicera(nombre);
            case "dragon": return new Dragon(nombre);
            case "guerrero": return new Guerrero(nombre);
            default: throw new IllegalArgumentException("Clase de personaje no válida: " + tipo);
        }
    }
}

