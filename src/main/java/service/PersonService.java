package service;

import com.google.common.base.Preconditions;
import entities.Person;

import static java.util.Objects.nonNull;

/**
 * Created by mtumilowicz on 2018-11-08.
 */
public class PersonService {
    public void addAllHobbiesFromFirstToSecond(Person first, Person second) {
        Preconditions.checkArgument(nonNull(first));
        Preconditions.checkArgument(nonNull(second));
        
        
    }
}
