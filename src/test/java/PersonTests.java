import org.example.Person;
import org.example.PersonList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTests {

    Person person1;
    PersonList list;

    @BeforeEach
    void setObjects(){
        person1 = new Person(1, "Pepito Palotes", 4, "Streamer");
        list = new PersonList();
        list.setListOfPersons(person1);
    }

    ///////// EJ1

    @Test
    @DisplayName("Comprobar que la edad no puede ser menos que 0")
    void check_age_below_0(){

        assertThrows(IllegalArgumentException.class, ()-> person1.setAge(-1));
        assertThrows(IllegalArgumentException.class, ()-> new Person(1, "Pepito Palotes", -4, "Streamer"));
    }


    ////////// EJ2

    @Test
    @DisplayName("Comprobar que el nombre está correcatamente formateado")
    void check_name_format(){
        assertThrows(IllegalArgumentException.class, ()-> list.findByName("Pepito"));
    }

    @Test
    @DisplayName("El nombre SI esta en la lista")
    void name_is_in_list(){
        assertEquals(person1.getName(), list.findByName("Pepito Palotes").getName());
    }

    @Test
    @DisplayName("El nombre NO esta en la lista")
    void name_is_not_in_list(){
        assertThrows(IllegalArgumentException.class, ()-> list.findByName("asd asda"));
    }

    //////// Ej 3

    @Test
    @DisplayName("Comprobar que el id es diferente")
    void check_id(){
        assertEquals(2, Person.clone(person1).getId());
    }

    @Test
    @DisplayName("Comprobar que el clon es correcto")
    void cheack_clone(){
        Person clone = Person.clone(person1);
        assertTrue(person1.equals(clone));
    }


}
