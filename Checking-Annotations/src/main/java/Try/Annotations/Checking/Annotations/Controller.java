package Try.Annotations.Checking.Annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {
    @Autowired
    Service service;

    @PostMapping("add/{name}")
    public String addMovie(@PathVariable("name") String name){
        return service.addMovie(name);
    }
    @GetMapping("get")
    public String getMovie(@RequestParam("Q") String name){
        return service.getMovie(name);
    }

    @PutMapping("update/{name}={newName}")
    public String updateMovie(@PathVariable("name") String name,@PathVariable("newName") String newName)
    {
        return service.updateMovie(name,newName);
    }
    @DeleteMapping("delete/")
    public String deleteMovie(@RequestBody String name){
        return service.deleteMovie(name);
    }

    @DeleteMapping("clearAll/")
    public String clearAll(){
        return service.clearAll();
    }
}
