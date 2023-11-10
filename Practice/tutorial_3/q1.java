public class q1 {

    public static void main (String [] args) {
        
        enum Level {North, South, West, East}
        Level dir1,dir2,dir3,dir4;
        dir1 = Level.North;
        dir2 = Level.South;
        dir3 = Level.West;
        dir4 = Level.East;
        System.out.println("Direction 1: " + dir1 + "\nDirection 2: " + dir2 + "\nDirection 3: " + dir3 + "\nDirection 4: " + dir4);
        System.out.println("Ordinal for direction 1 is: " + dir1.ordinal() + "\nOrdinal for direction 2 is: " + dir2.ordinal() + "\nOrdinal of direction 3 is: " + dir3.ordinal() + "\nOrdinal of direction 4 is: " + dir4.ordinal() );

    }
} 