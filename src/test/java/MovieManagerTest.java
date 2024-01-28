import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MovieManagerTest {

    @Test
    public void AddZeroMovies(){
        MovieManager manager = new MovieManager();
        String[] actual = manager.findAll();
        String[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void AddOneMovie(){
        MovieManager manager = new MovieManager();
        manager.addMovie("Film 1");

        String[] actual = manager.findAll();
        String[] expected = {"Film 1"};

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void AddSomeMovies(){
        MovieManager manager = new MovieManager();
        manager.addMovie("Film 1");
        manager.addMovie("Film 2");
        manager.addMovie("Film 3");

        String[] actual = manager.findAll();
        String[] expected = {"Film 1", "Film 2", "Film 3"};

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void FindZeroMovies(){
        MovieManager manager = new MovieManager();
        String[] actual = manager.findLast();
        String[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void FindOneMovie(){
        MovieManager manager = new MovieManager();
        manager.addMovie("Film 1");

        String[] actual = manager.findLast();
        String[] expected = {"Film 1"};

        Assertions.assertArrayEquals(expected, actual);
    }

}