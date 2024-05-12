package org.data;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Deserialization {
public static void main(String[] args) throws IOException{
	 File f=new File("C:\\Users\\aruna\\OneDrive\\Desktop\\DeserialJSON\\src\\test\\resources\\SAMPLE2.json");
	    ObjectMapper objectMapper=new ObjectMapper();
	    ArrayList<Topping> a2=new ArrayList<Topping>();
	    Topping topping=new Topping("5001", "None");
	    Topping topping1=new Topping("5002", "Glazed");
	    Topping topping2=new Topping("5003", "Sugar");
	    Topping topping3=new Topping("5004", "Powdered Sugar");
	    Topping topping4=new Topping("5005", "Chocolate with Sprinkles");
	    a2.add(topping);
	    a2.add(topping1);
	    a2.add(topping2);
	    a2.add(topping3);
	    a2.add(topping4);
	    Batter batter=new Batter("1001", "Regular");
	    Batter batter1=new Batter("1002", "Chocolate");
	    Batter batter2=new Batter("1003", "Blueberry");
	    Batter batter3=new Batter("1004", "Devil's Food");
	    ArrayList<Batter> a1=new ArrayList<Batter>();
	    a1.add(batter);
	    a1.add(batter1);
	    a1.add(batter2);
	    a1.add(batter3);
	    Batters batters=new Batters(a1);
	    Root1 root1=new Root1("0001", "donut", "Cake", 0.55, batters, a2);
	    objectMapper.writeValue(f, root1);
	    	System.out.println("Deserialization");
	    	System.out.println("Executed Successfully");
	    }
}

