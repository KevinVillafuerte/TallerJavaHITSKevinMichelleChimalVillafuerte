package clases;

public enum OrderPriority {
    LOW(1),
    MEDIUM(2),
    HIGH(3);

    /* Atributo que indica el nivel numérico de prioridad */
    private final int level;

    /* Constructor que recibe el nivel */
    OrderPriority(int level) {
        this.level = level;
    }

    /* Método para obtener el nivel de prioridad */
    public int getLevel() {
        return level;
    }
}
