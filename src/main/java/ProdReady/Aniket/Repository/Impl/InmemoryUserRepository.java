package ProdReady.Aniket.Repository.Impl;

import ProdReady.Aniket.Repository.UserRepository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class InmemoryUserRepository implements UserRepository {
    Map<String,String>map;
    public InmemoryUserRepository(){
        this.map=new HashMap<>();
    }
}
