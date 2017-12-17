package com.pluralsight;

public class Main {

    /*
    https://programmingbydoing.com/

    What If Assignment #21
     */
    public static void main(String[] args) {
	// write your code here
        int people = 20;
        int cats = 30;
        int dogs = 15;

        if ( people < cats )
        {
            System.out.println( "Too many cats!  The world is doomed!" );
        }

        if ( people > cats )
        {
            System.out.println( "Not many cats!  The world is saved!" );
        }

        if ( people < dogs )
        {
            System.out.println( "The world is drooled on!" );
        }

        if ( people > dogs )
        {
            System.out.println( "The world is dry!" );
        }

        dogs += 5;

        if ( people >= dogs )
        {
            System.out.println( "People are greater than or equal to dogs." );
        }

        if ( people <= dogs )
        {
            System.out.println( "People are less than or equal to dogs." );
        }

        if ( people == dogs )
        {
            System.out.println( "People are dogs." );
        }

    }
}
