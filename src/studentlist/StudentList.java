/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentlist;

/**
 *
 * @author lenovo
 */
public class StudentList {

    /**
     * @param args the command line arguments
     */
    private String name;
    private int number;
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getNumber(){
        return number;
    }
    public void setNumber(int number){
        this.number=number;
    }
    public static void main(String[] args) {
      System.out.println("its a student list");        
// TODO code application logic here
    }
    
}
