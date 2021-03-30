package Location;

public class Location {

    private Point m_position;
    private Size m_size;

    //Ctors
    public Location(){}
    public Location(Point point, Size size) { m_position = new Point(point); m_size = new Size(size); }
    public Location(Location other) { m_position = new Point(other.m_position); m_size = new Size(other.m_size);}

    //Geters
    public Point get_Point(){ return m_position;}
    public Size get_Size(){return m_size;}

    // to string & equals
    @Override
    public String toString() { return "Position: " + m_position + ", Size: " + m_size; }
    public boolean equals(Location other) {return this.m_position.equals(other.m_position) && this.m_size.equals(other.m_size);}
    

}
