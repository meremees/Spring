package ee.taavi.nordpool;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

// kõik controller tüüpi failid on need, mis suhtlevad eesrakendusega
@RestController
public class StringController {
    @GetMapping("hello")
    public String getDate(){
        return "Hello world at " + new Date();
    }

    @GetMapping("hi/{name}")
    public String getName(@PathVariable String name){
        return "Hello world at " + name;
    }
    @GetMapping("add/{first}/{second}")
    public int add(@PathVariable int first, @PathVariable int second){
        return first + second;
    }
    @GetMapping("multiply/{first}/{second}")
    public int multiply(@PathVariable int first, @PathVariable int second){
        return first * second;
    }

}
