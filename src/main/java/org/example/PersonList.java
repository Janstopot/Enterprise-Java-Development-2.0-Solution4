package org.example;

import java.util.ArrayList;
import java.util.List;

public class PersonList {

    private List<Person> listOfPersons;



    public PersonList() {
        this.listOfPersons = new ArrayList<>();
    }

    public Person findByName(String name){
        /*
        String[] nameSplit = name.split(" ");
        if(nameSplit.length != 2) {
            throw new IllegalArgumentException("El nombre debe tener dos palabras");
        }
        */
        if(name.split(" ").length !=2) throw new IllegalArgumentException("El nombre debe tener dos palabras");
        for(Person p : listOfPersons){
            if(p.getName().equals(name)) return p;
        }

        throw new IllegalArgumentException("El nombre no aparece en la lista");
    }





    public List<Person> getListOfPersons() {
        return listOfPersons;
    }

    public void setListOfPersons(Person person) {
        this.listOfPersons.add(person);
    }
}
