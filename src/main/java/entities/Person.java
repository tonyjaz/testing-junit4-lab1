package entities;

import com.google.common.base.Preconditions;
import org.apache.commons.collections4.SetUtils;

import java.math.BigDecimal;
import java.util.Set;

import static java.util.Objects.nonNull;

/**
 * Created by mtumilowicz on 2018-11-08.
 */
public class Person {
    private int id;
    private String name;
    private String surname;
    private int age;
    private BigDecimal salary;
    private Set<String> hobbies;

    public Person(int id, 
                  String name, 
                  String surname, 
                  int age, 
                  BigDecimal salary, 
                  Set<String> hobbies) {
        this.id = id;
        
        Preconditions.checkArgument(nonNull(name));
        this.name = name;
        
        Preconditions.checkArgument(nonNull(surname));
        Preconditions.checkArgument(surname.matches("[a-zA-Z]+"));
        this.surname = surname;
        
        Preconditions.checkArgument(age >= 0);
        this.age = age;
        
        Preconditions.checkArgument(nonNull(salary));
        Preconditions.checkArgument(salary.compareTo(BigDecimal.ZERO) > 0);
        this.salary = salary;
        
        this.hobbies = SetUtils.emptyIfNull(hobbies);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        Preconditions.checkArgument(nonNull(name));
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        Preconditions.checkArgument(nonNull(surname));
        Preconditions.checkArgument(surname.matches("[a-zA-Z]+"));
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        Preconditions.checkArgument(age >= 0);
        this.age = age;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        Preconditions.checkArgument(nonNull(salary));
        Preconditions.checkArgument(salary.compareTo(BigDecimal.ZERO) > 0);
        this.salary = salary;
    }

    public Set<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(Set<String> hobbies) {
        this.hobbies = SetUtils.emptyIfNull(hobbies);
    }
    
    public void addAllHobbiesTo(Person other) {
        Preconditions.checkArgument(nonNull(other));
        
        other.hobbies.addAll(this.hobbies);
    }
    
    public void addHobbie(String hobbie) {
        this.hobbies.add(hobbie);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        return id == person.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
