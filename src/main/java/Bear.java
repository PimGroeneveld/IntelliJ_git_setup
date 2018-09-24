public class Bear {
    private String name;
    private int age;
    private double weight;

    public Bear(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    // use command - n to select getters or setters to be set up by the IDE

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public boolean isReadyToHibernate(){
        return this.weight >= 80;  // works because returns a boolean anyway, so no need to write return true/false
    }
}

// Two types used in Java:

// Primitive
    // int, double (decimals, better than float),
    // short (small integers),
    // long (big integers),
    // char (single character, use single ' '),
    // float (decimal),
    // boolean (true/false),
    // byte(very small numbers)

// Reference
    // Cat / Bear (object that were dealing with)
    // String -> capitalized because it is a reference type, more options than an average int. You can also use Integer over int to get same functionality as String


// Don't actually delete files, use safe delete (in refactor)

// J ava
// A pplication
// R esource