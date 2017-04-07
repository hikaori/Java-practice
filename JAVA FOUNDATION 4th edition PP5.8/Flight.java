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

//text5_8

public class Flight {
    private String flight_name,flight_origin,flight_destination;
    private int flight_number;
    
    // constraction
    public Flight(String flight_name,String flight_origin,String flight_destination, int flight_number){
        this.flight_name = flight_name;
        this.flight_origin = flight_origin;
        this.flight_destination = flight_destination;
        this.flight_number = flight_number;
    }
    
    // get
    public String getFlight_name(){
        return this.flight_name;
    }
    public String getFlight_origin(){
        return this.flight_origin;
    }
    public String getFlight_destination(){
        return this.flight_destination;
    }
    public int getFlight_number(){
        return this.flight_number;
    }
    
    // set
    public void setgetFlight_name(String flight_name){
        this.flight_name = flight_name;
    }
    public void setgetFlight_origin(String flight_origin){
        this.flight_origin = flight_origin;
    }
    public void setgetFlight_destination(String flight_destination){
        this.flight_destination = flight_destination;
    }
    public void setFlight_number(int flight_number){
        this.flight_number = flight_number;
    }
    
    // toString: returns a string representation
    public String toString(){
        return flight_name + " " + flight_number + " -- From : " + flight_origin + ", To: " + flight_destination;
    
    }
    
}
