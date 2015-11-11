import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Grid;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Location;

/**
 * Game of Life starter code. Demonstrates how to create and populate the game using the GridWorld framework.
 * Also demonstrates how to provide accessor methods to make the class testable by unit tests.
 * 
 * @author @gcschmit
 * @version 18 July 2014
 */
public class GameOfLife
{
    // the world comprised of the grid that displays the graphics for the game
    private ActorWorld world;
    
    // the game board will have 5 rows and 5 columns
    private final int ROWS = 11;
    private final int COLS = 10;
    
    /**
     * Default constructor for objects of class GameOfLife
     * 
     * @post    the game will be initialized and populated with the initial state of cells
     * 
     */
    public GameOfLife()
    {
        // create the grid, of the specified size, that contains Actors
        BoundedGrid<Actor> grid = new BoundedGrid<Actor>(ROWS, COLS);
        
        // create a world based on the grid
        world = new ActorWorld(grid);
        
        // populate the game
        populateGame();
        
        // display the newly constructed and populated world
        world.show();
        
    }
    
    /**
     * Creates the actors and inserts them into their initial starting positions in the grid
     *
     * @pre     the grid has been created
     * @post    all actors that comprise the initial state of the game have been added to the grid
     * 
     */
    private void populateGame()
    {
        // constants for the location of the three cells initially alive
        final int X1 = 5, Y1 = 1;

        // the grid of Actors that maintains the state of the game
        //  (alive cells contains actors; dead cells do not)
        Grid<Actor> grid = world.getGrid();
        
        // create and add rocks (a type of Actor) to the three intial locations
        Rock rock3_2 = new Rock();
        Location loc3_2 = new Location(3, 2);
        grid.put(loc3_2, rock3_2);
        
        Rock rock3_3 = new Rock();
        Location loc3_3 = new Location(3, 3);
        grid.put(loc3_3, rock3_3);
        
        Rock rock3_4 = new Rock();
        Location loc3_4 = new Location(3, 4);
        grid.put(loc3_4, rock3_4);
        
        Rock rock3_5 = new Rock();
        Location loc3_5 = new Location(3, 5);
        grid.put(loc3_5, rock3_5);
        
        Rock rock3_6 = new Rock();
        Location loc3_6 = new Location(3, 6);
        grid.put(loc3_6, rock3_6);
        
        Rock rock3_7 = new Rock();
        Location loc3_7 = new Location(3, 7);
        grid.put(loc3_7, rock3_7);
        
        
        //*******************ROW 4*******************************
        Rock rock4_2 = new Rock();
        Location loc4_2 = new Location(4, 2);
        grid.put(loc4_2, rock4_2);
        
        Rock rock4_3 = new Rock();
        Location loc4_3 = new Location(4, 3);
        grid.put(loc4_3, rock4_3);
        
        Rock rock4_6 = new Rock();
        Location loc4_6 = new Location(4, 6);
        grid.put(loc4_6, rock4_6);
        
        Rock rock4_7 = new Rock();
        Location loc4_7 = new Location(4, 7);
        grid.put(loc4_7, rock4_7);
        //*****************ROW 5************************************
        
        Rock rock5_1 = new Rock();
        Location loc5_1 = new Location(5, 1);
        grid.put(loc5_1, rock5_1);
        
        Rock rock5_8 = new Rock();
        Location loc5_8 = new Location(5, 8);
        grid.put(loc5_8, rock5_1);
        
        
        //******************ROW 6*********************************
        
        Rock rock6_2 = new Rock();
        Location loc6_2 = new Location(6, 2);
        grid.put(loc6_2, rock6_2);
        
        Rock rock6_3 = new Rock();
        Location loc6_3 = new Location(6, 3);
        grid.put(loc6_3, rock6_3);
        
        Rock rock6_6 = new Rock();
        Location loc6_6 = new Location(6, 6);
        grid.put(loc6_6, rock6_6);
        
        Rock rock6_7 = new Rock();
        Location loc6_7 = new Location(6, 7);
        grid.put(loc6_7, rock6_7);
        
        //************************ROW 7***************************
        Rock rock7_2 = new Rock();
        Location loc7_2 = new Location(7, 2);
        grid.put(loc7_2, rock7_2);
        
        
        Rock rock7_3 = new Rock();
        Location loc7_3 = new Location(7, 3);
        grid.put(loc7_3, rock7_3);
        
        Rock rock7_4 = new Rock();
        Location loc7_4 = new Location(7, 4);
        grid.put(loc7_4, rock7_4);
        
        Rock rock7_5 = new Rock();
        Location loc7_5 = new Location(7, 5);
        grid.put(loc7_5, rock7_5);
        
        Rock rock7_6 = new Rock();
        Location loc7_6 = new Location(7, 6);
        grid.put(loc7_6, rock7_6);
        
        Rock rock7_7 = new Rock();
        Location loc7_7 = new Location(7, 7);
        grid.put(loc7_7, rock7_7);
        
        
        
        
    }

    /**
     * Generates the next generation based on the rules of the Game of Life and updates the grid
     * associated with the world
     *
     * @pre     the game has been initialized
     * @post    the world has been populated with a new grid containing the next generation
     * 
     */
    private void createNextGeneration()
    {
        /** You will need to read the documentation for the World, Grid, and Location classes
         *      in order to implement the Game of Life algorithm and leverage the GridWorld framework.
         */
        
        // create the grid, of the specified size, that contains Actors
        Grid<Actor> grid = world.getGrid();
        
        // insert magic here...
        
    }
    
    /**
     * Returns the actor at the specified row and column. Intended to be used for unit testing.
     *
     * @param   row the row (zero-based index) of the actor to return
     * @param   col the column (zero-based index) of the actor to return
     * @pre     the grid has been created
     * @return  the actor at the specified row and column
     */
    public Actor getActor(int row, int col)
    {
        Location loc = new Location(row, col);
        Actor actor = world.getGrid().get(loc);
        return actor;
    }

    /**
     * Returns the number of rows in the game board
     *
     * @return    the number of rows in the game board
     */
    public int getNumRows()
    {
        return ROWS;
    }
    
    /**
     * Returns the number of columns in the game board
     *
     * @return    the number of columns in the game board
     */
    public int getNumCols()
    {
        return COLS;
    }
    
    
    /**
     * Creates an instance of this class. Provides convenient execution.
     *
     */
    public static void main(String[] args)
    {
        GameOfLife game = new GameOfLife();
    }

}
