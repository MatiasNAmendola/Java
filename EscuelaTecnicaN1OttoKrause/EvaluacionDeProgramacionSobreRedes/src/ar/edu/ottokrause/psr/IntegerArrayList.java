package ar.edu.ottokrause.psr;

public class IntegerArrayList {
    private int list[];

    public IntegerArrayList(int[] list) {
        this.list = list;
    }

    public IntegerArrayList() {
        this.list = new int[]{16, 24, 34, 48};
    }

    public int[] getList() {
        return list;
    }

    public void setList(int[] list) {
        this.list = list;
    }

    public int size() {
        return this.list.length;
    }

    public int get(int index) { // index corresponde a la posicion en donde se encuentra el valor.
        return this.list[index];
    }

    public void set(int index, int value) {
        this.list[index] = value;
    }

    public int ocurrences(int value) {
        int ocur = 0;

        for (int i = 0; i < this.size(); i++) {
            if (this.get(i) == value) {
                ocur++;
            }
        }

        return ocur;
    }
}
