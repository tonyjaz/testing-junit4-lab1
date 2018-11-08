package service;

import com.google.common.base.Preconditions;
import entities.PersonImmutable;
import org.apache.commons.collections4.ListUtils;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static entities.PersonImmutable.*;
import static java.util.Objects.nonNull;

/**
 * Created by mtumilowicz on 2018-11-08.
 */
public class PersonImmutableService {
    
    public boolean checkIfAnyHasGivenName(List<PersonImmutable> persons, String name) {
        Preconditions.checkArgument(nonNull(name));
        
        return ListUtils.emptyIfNull(persons).stream()
                .map(PersonImmutable::getName)
                .anyMatch(Predicate.isEqual(name));
    }

    public List<PersonImmutable> findAllOlderThanGivenAge(List<PersonImmutable> persons, int age) {
        return ListUtils.emptyIfNull(persons).stream()
                .filter(olderThan(age))
                .collect(Collectors.toList());
    }
    
    
}
