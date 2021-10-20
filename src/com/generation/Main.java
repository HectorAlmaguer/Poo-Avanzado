package com.generation;

import com.generation.banco.CuentaBancaria;
import com.generation.paquete2.Animal;

public class Main {
    public static int numerador = 10 ;
    public static int denominador = 0;
    public static float division;

    public static void main(String[] args) {
	   /* Persona persona = new Persona();
	    persona.nombre = "Hector";
	    persona.edad = 27;
	    persona.saludar();

	    Animal animal = new Animal();
		animal.nombre = "Iguana";
		animal.saludar();

	    */
		/*
		CuentaBancaria cuenta = new CuentaBancaria();
		cuenta.setNombre("Hector Almaguer");
		cuenta.setClave("ABC-1234");
		cuenta.setSaldo(-5000);
		System.out.println(cuenta.getNombre());
		cuenta.mostrarSaldo();

		 */

        /*
        Persona person= new Persona("Santiago", 33, "102045455");
        System.out.println( "Name: "+ person.getName());
        System.out.println( "Age: "+ person.getAge());
        System.out.println( "Id: " +  person.getId());

         */
        System.out.println("Antes de hacer la division");
        try{
        division=numerador / denominador;
        } catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("Despues de la division");

	}
}
