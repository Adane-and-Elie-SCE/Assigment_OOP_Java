package Population;

public class Vaccinated extends Person {

    private long m_vaccinationTime;

    public Vaccinated(){}
    public Vaccinated(Person person){ super(person); }
    
    public long get_VaccinationTime() { return m_vaccinationTime; }

    @Override
    public String toString() { return super.toString() + ", vaccinationTime: " + m_vaccinationTime;}
   
    @Override
    public double contagionProbability() {
        
        long t = vaccinationTime;

        if( t < 21)
            return Math.min(1, 0.56 + 0.15* Math.sqrt(21 - t));
        else
            return Math.max(0.05, 1.05/(t - 14));
    }

    public boolean equals(Vaccinated other) { return super.equals(other) &&  m_vaccinationTime == other.m_vaccinationTime;}



    
}
