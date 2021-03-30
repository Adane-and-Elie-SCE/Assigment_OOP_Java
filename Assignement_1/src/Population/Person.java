package Population;

import Country.Settlement;
import Location.Location;
import Virus.IVirus;

public abstract class Person {

    private int m_age;
    private Location m_location;
    private Settlement m_settlement;


    //Ctors
    public Person(){}
    public Person(int age, Location location, Settlement settlement) {m_age = age; m_location = location; m_settlement = settlement; }
    public Person(Person other) { m_age = other.m_age; m_location = other.m_location; m_settlement = other.m_settlement;}

    //Getters
    public int get_Age() { return m_age; }
    public Location get_Location() { return m_location; }
    public Settlement get_Settlement() { return m_settlement; }

    // tostring & equals
    @Override
    public String toString() {return "Age: " + m_age + ", Location: " + m_location + ", Settlement: " + m_settlement;}
    public boolean equals(Person other) { return m_age == other.m_age && m_location.equals(other.m_location); }

    //Methods
    public abstract double contagionProbability();
    public Person contagion(IVirus virus) { return new Sick(this, virus); }



}
