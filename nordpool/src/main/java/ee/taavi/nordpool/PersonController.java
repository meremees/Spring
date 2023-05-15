package ee.taavi.nordpool;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    //tegelikkuses võtame andmebaasist

    Person person1 = new Person (1L, "Taai", "Kool", "321");
    @GetMapping("get-person")
    public Person getPerson(){
        return person1;
    }

    @GetMapping("change-firstname/{firstName}")
    public Person changeFirstName(@PathVariable String firstName){
        person1.setFirstName(firstName);
        return person1;
    }
}
