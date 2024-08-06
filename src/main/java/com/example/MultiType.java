package com.example;

//TODO 
// getter setter and private variable
// change mixType to ArrayList<object> or arry of object (hashmap, custom class)
// or be a singleton class and use "this"
abstract class MultiType {
    protected int number;
    protected int[] array;
    protected int[][] matrix;
    protected String string;
    protected String[] mixType;
    protected long longg;

    public MultiType() {
    }

    public MultiType(int number) {
        this.number = number;
    }

    public MultiType(long longg) {
        this.longg = longg;
    }

    public MultiType(int[] array) {
        this.array = array;
    }

    public MultiType(int[][] matrix) {
        this.matrix = matrix;
    }

    public MultiType(String string) {
        this.string = string;
    }

    public MultiType(String[] mixType) {
        this.mixType = mixType;
    }
}
