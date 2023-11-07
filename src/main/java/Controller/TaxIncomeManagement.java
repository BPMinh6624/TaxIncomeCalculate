/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.User;
import Repository.TaxIncomeRepository;

/**
 *
 * @author tuanh
 */
public class TaxIncomeManagement {
    TaxIncomeRepository repo;
    User user;
    
    public TaxIncomeManagement(){
        repo = new TaxIncomeRepository();
        user = new User();
    }
    
    public void run(){
        repo.taxIncome(user);
    }
}
