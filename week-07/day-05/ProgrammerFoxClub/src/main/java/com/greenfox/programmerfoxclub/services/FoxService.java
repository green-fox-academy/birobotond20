package com.greenfox.programmerfoxclub.services;

import com.greenfox.programmerfoxclub.models.Fox;
import com.greenfox.programmerfoxclub.models.Gender;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FoxService {

    List<Fox> foxes;

    public FoxService() {
        this.foxes = new ArrayList<>();
        this.foxes.add(new Fox("Sanyi",
                Gender.MALE,
                new ArrayList<String>(){{
                    add("code in java");
                    add("sing");
                    add("love");
                }},
                "pasta",
                "pu-erh tea"
                ));
        this.foxes.add(new Fox("Sári",
                Gender.FEMALE,
                new ArrayList<String>(){{
                    add("code in python");
                    add("teach");
                    add("ride a bike");
                }},
                "pasta",
                "pu-erh tea"
        ));
    }

    public List<Fox> getFoxes(){
        return this.foxes;
    }

    public void addFox(Fox newFox){
        this.foxes.add(newFox);
    }

    public boolean isExistent(String newFox){
        for (Fox fox : this.foxes) {
            if (fox.getName().equals(newFox)){
                return true;
            }
        }
        return false;
    }
}
