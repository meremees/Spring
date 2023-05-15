package ee.taavi.nordpool;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class PersonListController {
    Person person1 = new Person (1L, "Taai", "Kool", "321");
    Person person2 = new Person (2L, "Taai", "Kool", "21");
    Person person3 = new Person (3L, "Taai", "Kool", "1");
    List<Person> persons = new ArrayList<>(Arrays.asList(person1, person2, person3));

    @GetMapping("persons")
    public List<Person> getPersons(){
        return persons;
    }
    //?id=4&firstName=Mart
    @GetMapping("add-person")
    public List<Person> addPerson(@RequestParam Long id,
                                  @RequestParam String firstName,
                                  @RequestParam String lastName,
                                  @RequestParam String phoneNumber){

        Person person = new Person(id, firstName, lastName, phoneNumber);
        persons.add(person);
        return persons;
    }
    @GetMapping("delete-person/{index}") // @DeleteMapping
    public List<Person> deletePerson(@PathVariable int index){
        persons.remove(index);
        return persons;
    }
}
