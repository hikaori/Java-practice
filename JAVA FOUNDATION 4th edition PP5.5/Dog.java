/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textbook;

/**
 *
 * @author hiratakaori
 */
// Textbook5_5  

public class Dog {
    private String Dogname; 
    private int DogAge1;
    /**　privateのデータはget setがないとアクセス（利用）できない。*/
    
    public Dog(String Dogname1,int Dogage){
        this.Dogname = Dogname1; /**　Dogname1に直上文（）内のデータを入れているって理解でok?→ok */
        this.DogAge1 = Dogage;
    }
    
    public int calculateDogAge(){
        return this.DogAge1*7;  //『this.』なしでも同じ意味
    }
    
    public String getDogname(){
        return Dogname;
    }
    
    public void setDog_name(String setDogname) 
    {
        this.Dogname = setDogname;
    }
    public int getAge(){
        return DogAge1;
    }
    public void setDog_age(int Dogage){
        this.DogAge1 = Dogage;
    }
    
    public String toString() {
        return this.Dogname + " is a dog and " + this.DogAge1 + " years old";
    }
    
}
