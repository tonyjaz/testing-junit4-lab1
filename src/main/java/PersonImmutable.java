import com.google.common.collect.ImmutableList;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by mtumilowicz on 2018-11-08.
 */
public class PersonImmutable {
    private final int id;
    private final String name;
    private final String surname;
    private final int age;
    private final BigDecimal salary;
    private final ImmutableList<String> hobbies;

    private PersonImmutable(int id, 
                    String name, 
                    String surname, 
                    int age, 
                    BigDecimal salary,
                    ImmutableList<String> hobbies) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.hobbies = hobbies;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public ImmutableList<String> getHobbies() {
        return hobbies;
    }

    class Builder {
        private int id;
        private String name;
        private String surname;
        private int age;
        private BigDecimal salary;
        private ImmutableList<String> hobbies;

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder surname(String surname) {
            this.surname = surname;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder salary(BigDecimal salary) {
            this.salary = salary;
            return this;
        }

        public Builder hobbies(List<String> hobbies) {
            this.hobbies = ImmutableList.copyOf(hobbies);
            return this;
        }

        public PersonImmutable build() {
            return new PersonImmutable(id, name, surname, age, salary, hobbies);
        }
    }
}
