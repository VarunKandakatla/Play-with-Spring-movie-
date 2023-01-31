package Try.Annotations.Checking.Annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Set;

@org.springframework.stereotype.Service
public class Service {
    @Autowired
    Repository repo;
    //adding movie
    public ResponseEntity addMovie(String name){

        if(repo.db.contains(name)){
            return new ResponseEntity<>("Already in List "+name, HttpStatus.ALREADY_REPORTED);
        }

        repo.db.add(name);
        return new ResponseEntity<>("Successfully Added "+name,HttpStatus.ACCEPTED);
    }

    //get movie
    public ResponseEntity getMovie(String name){
        if(repo.db.contains(name)){
            return new ResponseEntity<>("Here is your movie: "+name,HttpStatus.ALREADY_REPORTED);
        }

        return new ResponseEntity<>("Sorry! Not Found!"+name,HttpStatus.NO_CONTENT);
    }

    //update
    public ResponseEntity updateMovie(String name,String newName){
        if(repo.db.contains(name)){
            repo.db.remove(name);
            repo.db.add(newName);

            return new ResponseEntity<>("Successfully Updated! "+newName,HttpStatus.ACCEPTED);
        }

        return new ResponseEntity<>("Entered name not found to update! Try again",HttpStatus.BAD_REQUEST);
    }

    public String deleteMovie(String name){
        if(repo.db.contains(name)){
            repo.db.remove(name);
            return "Successfully Deleted! "+name;
        }

        return "Not found the name that to be Deleted!";
    }

    public String clearAll(){
        if(repo.db.size()==0){
            return "Already Empty list";
        }
        repo.db.clear();
        return "Successfully Cleared All";
    }

    public Set getList(){
        return repo.db;
    }
}
