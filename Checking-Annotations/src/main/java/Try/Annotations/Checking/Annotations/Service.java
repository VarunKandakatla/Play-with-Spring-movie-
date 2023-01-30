package Try.Annotations.Checking.Annotations;

import org.springframework.beans.factory.annotation.Autowired;
@org.springframework.stereotype.Service
public class Service {
    @Autowired
    Repository repo;
    //adding movie
    public String addMovie(String name){

        if(repo.db.contains(name)){
            return "Already in List "+name;
        }

        repo.db.add(name);
        return "Successfully Added "+name;
    }

    //get movie
    public String getMovie(String name){
        if(repo.db.contains(name)){
            return "Here is your movie: "+name;
        }

        return "Sorry! Not Found!"+name;
    }

    //update
    public String updateMovie(String name,String newName){
        if(repo.db.contains(name)){
            repo.db.remove(name);
            repo.db.add(newName);

            return "Successfully Updated! "+newName;
        }

        return "Entered name not found to update! Try again";
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
}
