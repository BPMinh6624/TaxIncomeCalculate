/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author tuanh
 */
public class Child extends Person {

    private boolean isStudied;
    private double deduction;

    public Child() {
    }

    public Child(String name, int age, int sex, boolean isStudied) {
        super(name, age, sex);
        this.isStudied = isStudied;
    }

    public double getDeduction() {
        return deduction;
    }

    public void setDeduction(double deduction) {
        this.deduction = deduction;
    }

    public boolean isIsStudied() {
        return isStudied;
    }

    public void setIsStudied(boolean isStudied) {
        this.isStudied = isStudied;
    }
}
