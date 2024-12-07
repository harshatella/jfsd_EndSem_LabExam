package com.klef.jfsd.exam.ClientDemo;
import java.util.*;
import javax.persistence.*;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
public class ClientDemo {
	    public static void main(String[] args) {
	        EntityManagerFactory emf = Persistence.createEntityManagerFactory("labexam");
	        EntityManager em = emf.createEntityManager();

	        em.getTransaction().begin();

	        
	        Car car = new Car();
	        car.setName("Sedan");
	        car.setType("Car");
	        car.setMaxSpeed(200);
	        car.setColor("Red");
	        car.setNumberOfDoors(4);
	        em.persist(car);

	        // Create Truck
	        Truck truck = new Truck();
	        truck.setName("Freightliner");
	        truck.setType("Truck");
	        truck.setMaxSpeed(120);
	        truck.setColor("Blue");+
	        truck.setLoadCapacity(10000);
	        em.persist(truck);

	        em.getTransaction().commit();
	        em.close();
	        emf.close();

	        System.out.println("Records inserted successfully!");
	    }
	}


