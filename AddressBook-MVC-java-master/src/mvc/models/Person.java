/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.models;

/**
 *
 * @author Admin
 */
public class Person {
    private String name;
    private String mob;
    private String email;
    private String Status1;
    private String city;
    
    
   /* public User(){
        x=0;
    }
    
    public User(int x){
        this.x=x;
    }
    
    public void incX(){
        x++;
    }
    
    public void decX(){
        x--;
    }
    public int getX(){
        return x;
    }*/
    public String getName(){
        return this.name; 
   }
    
    public String getMob(){
        return this.mob; 
   }
    
    public String getEmail(){
        return this.email; 
   }
    public String getStatus(){
        return this.Status1; 
   }
    public String getCity(){
        return this.city; 
   }
    
    public void setData(String name, String mob,String email,String status,String city){
        this.name = name;
        this.mob = mob;
        this.email = email;
        this.Status1 = status;
        this.city = city;
    }
    
 

}
