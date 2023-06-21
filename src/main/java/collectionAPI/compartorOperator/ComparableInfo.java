package collectionAPI.compartorOperator;

import java.util.ArrayList;
import java.util.Collections;

class Movie implements Comparable<Movie> {
    private String name;
    private int year;

    public Movie(String nm, int yr) {
        this.name = nm;
        this.year = yr;
    }

    public int compareTo(Movie m) {
        return this.year - m.year;
    }

    public String getName() { return name; }
    public int getYear()	 { return year; }
}

public class ComparableInfo{
    public static void main(String[] args) {
        ArrayList<Movie> list = new ArrayList<Movie>();
        list.add(new Movie("Force", 2015));
        list.add(new Movie("Star", 1977));
        list.add(new Movie("Empire", 1980));
        list.add(new Movie("Return", 1983));

        Collections.sort(list);

        for (Movie m: list) {
            System.out.println(m.getName() + " " +  " " + m.getYear());
        }
    }
}
