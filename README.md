# testing-junit4-lab1
Junit4 basics training exercises.

# manual
1. Open class `Person`
1. Ctrl + Shift + T
1. Create New Test -> OK -> OK
1. In `PersonTest` class:
    * create methods `setAgeTest`
    * put `@Test` annotation over it
    * create object Person
    * person.setAge(10)
    * verify if person.getAge() is 10
        ```
        @Test
        public void setAgeTest() {
        // given
            Person person = new Person();
            
        // when    
            person.setAge(10);
            
        // then
            assertThat(person.getAge(), is(10));
        }    
        ```
        imports:
        ```
        import static org.hamcrest.CoreMatchers.is;
        import static org.junit.Assert.*;
        ```
    * **Verifying exceptions**:
        ```
        @Test(expected = IllegalArgumentException.class)
        public void setAgeTest() {
        // given
            Person person = new Person();
            
        // when
            person.setAge(-4);
        }    
        ```

# tasks
1. Test class `entities.Person`
    * constructor - OK
    * constructor - exceptions (parameter validation)
    * setters + getters - OK
    * setters - exceptions (parameter validation)
    * addAllHobbiesTo - no common hobbies
    * addAllHobbiesTo - some common hobbies
    * addHobby - add already existing
    * addHobby - add new
1. Test class `entities.PersonImmutable`
    * constructor - OK
    * constructor - exceptions (parameter validation)
    * check if hobbies set is immutable (try to add something)
    * check equals contract
    * check hashcode contract
1. Test class `service.PersonImmutableService`
    * checkIfAnyHasGivenName - OK
    * checkIfAnyHasGivenName - exception (parameter validation)
    * findAllOlderThanGivenAge - OK
    
# To read
* **Java**
    * **Packages**: https://docs.oracle.com/javase/tutorial/java/package/packages.html
    * **Access modifiers**: http://tutorials.jenkov.com/java/access-modifiers.html
    * **Final keyword**: https://en.wikipedia.org/wiki/Final_(Java)
    * **Primitive Data Types**: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
    * **Wrapper classes**: https://www.baeldung.com/java-wrapper-classes
    * **References**: http://www.informit.com/articles/article.aspx?p=174371&seqNum=4
    * **Immutable**: https://docs.oracle.com/javase/tutorial/essential/concurrency/immutable.html
    * **JavaBeans**: https://en.wikipedia.org/wiki/JavaBeans
    * **Set**: https://www.geeksforgeeks.org/set-in-java/
    * **List**: https://docs.oracle.com/javase/8/docs/api/java/util/List.html
    * **Equals contract**: https://docs.oracle.com/javase/7/docs/api/java/lang/Object.html#equals(java.lang.Object)
    * **Hashcode contract**: https://docs.oracle.com/javase/7/docs/api/java/lang/Object.html#hashCode()
    * **Exceptions, Errors**: https://www.geeksforgeeks.org/exceptions-in-java/