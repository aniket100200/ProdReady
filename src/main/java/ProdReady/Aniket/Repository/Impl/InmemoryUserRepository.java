package ProdReady.Aniket.Repository.Impl;

import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Repository;

@Repository
public class InmemoryUserRepository  {
    Map<String,String>map;
    public InmemoryUserRepository(){
        this.map=new HashMap<>();
    }
}
