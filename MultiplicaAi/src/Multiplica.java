public class Multiplica {
    private int x;
    private String table = "";

    public Multiplica() {
    }

    public Multiplica(int x) {
        this.x = x;
        this.table = "Tabela de multiplicação por " + x + "\n";
        createTable();
    }

    public void createTable() {
        for (int i = 1; i < 11; i++) {
            table += x + " x " + i + " = " + x * i + "\n";
        }
    }

    public String getTable() {
        return this.table;
    }
}
