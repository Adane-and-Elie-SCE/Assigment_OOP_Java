package Location;

public class Point {

    private int m_x;
    private int m_y;

    //Ctors
    public Point() {}
    public Point(int x, int y) { this.m_x = x; this.m_y = y; }
    public Point(Point other) { this.m_y = other.m_x; this.m_x = other.m_y;}
    
    //Getters
    public int getX(){return m_x;}
    public int getY(){return m_y;}
    
    // tostring & equals
    @Override
    public String toString() { return "(" + m_x + "," + m_y + ")"; }
    public boolean equals(Point other) { return m_x == other.m_x && m_y == other.m_y; }
    

}
