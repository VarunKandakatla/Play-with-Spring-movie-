package Try.Annotations.Checking.Annotations;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
@org.springframework.stereotype.Repository
public class Repository {

    HashSet<String> db;
    Repository(){
        db=new HashSet<>();
    }
}
