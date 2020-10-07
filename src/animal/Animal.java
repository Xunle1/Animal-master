package animal;

/**
 * Filename: Animal.java
 * 动物属性: 种类，性别， 年龄。
 * @author: Xunle
 * @date: 2020/10/07
 */
public class Animal {
    private String species;
    private char gender;
    private int age;

    public Animal() {}

    public Animal(String species, char gender, int age) {
        this.species = species;
        this.gender = gender;
        this.age = age;
    }


    @Override
    public String toString() {
        return "Animal{" +
                "species='" + species + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }

    public boolean equals(String species){
        return this.species.equals(species)?true:false;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setGender(char sexual) {
        this.gender = sexual;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecies() {
        return species;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }



}
