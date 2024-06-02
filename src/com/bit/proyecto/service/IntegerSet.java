package com.bit.proyecto.service;

public class IntegerSet {
    public static final int MAX_SIZE = 100;
    private boolean[] set;

    // Constructor sin argumentos para inicializar el conjunto vacío
    public IntegerSet() {
        set = new boolean[MAX_SIZE];
    }

    // Método de unión
    public static IntegerSet union(IntegerSet set1, IntegerSet set2) {
        IntegerSet resultSet = new IntegerSet();
        for (int i = 0; i < MAX_SIZE; i++) {
            resultSet.set[i] = set1.set[i] || set2.set[i];
        }
        return resultSet;
    }

    // Método de intersección
    public static IntegerSet intersection(IntegerSet set1, IntegerSet set2) {
        IntegerSet resultSet = new IntegerSet();
        for (int i = 0; i < MAX_SIZE; i++) {
            resultSet.set[i] = set1.set[i] && set2.set[i];
        }
        return resultSet;
    }

    // Método InsertsElement
    public void insertElement(int k) {
        if (k >= 0 && k < MAX_SIZE) {
            set[k] = true;
        } else {
            throw new IllegalArgumentException("El número debe estar en el rango de 0 a 100");
        }
    }

    // Método deleteElement
    public void deleteElement(int m) {
        if (m >= 0 && m < MAX_SIZE) {
            set[m] = false;
        } else {
            throw new IllegalArgumentException("El número debe estar en el rango de 0 a 100");
        }
    }

    // Método toSetString
    public String toSetString() {
        StringBuilder result = new StringBuilder();
        boolean isEmpty = true;

        for (int i = 0; i < MAX_SIZE; i++) {
            if (set[i]) {
                result.append(i).append(":");
                isEmpty = false;
            }
        }

        return isEmpty ? "-" : result.toString().trim();
    }

    // Método equalTo
    public boolean equalTo(IntegerSet otherSet) {
        for (int i = 0; i < MAX_SIZE; i++) {
            if (this.set[i] != otherSet.set[i]) {
                return false;
            }
        }
        return true;
    }

    public boolean[] getSet() {
        return set;
    }

    public void setSet(boolean[] set) {
        this.set = set;
    }
}
