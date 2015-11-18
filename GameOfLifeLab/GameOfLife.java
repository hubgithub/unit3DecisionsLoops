import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Grid;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Location;
import info.gridworld.grid.AbstractGrid;
import java.util.ArrayList;


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
    private final int ROWS = 50;
    private final int COLS = 50;
    
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
    public void populateGame()
    {
        // constants for the location of the three cells initially alive

        // the grid of Actors that maintains the state of the game
        //  (alive cells contains actors; dead cells do not)
        Grid<Actor> grid = world.getGrid();
        
        // create and add rocks (a type of Actor) to the three intial locations
        //***********ROW 21****************
        Rock rock21_20 = new Rock();
        Location loc21_20 = new Location(21,20);
        grid.put(loc21_20,rock21_20);
        
        Rock rock21_21 = new Rock();
        Location loc21_21 = new Location(21,21);
        grid.put(loc21_21,rock21_21);
        
        Rock rock21_22 = new Rock();
        Location loc21_22 = new Location(21,22);
        grid.put(loc21_22,rock21_22);
        
        Rock rock21_23 = new Rock();
        Location loc21_23 = new Location(21,23);
        grid.put(loc21_23,rock21_23);
        
        Rock rock21_24 = new Rock();
        Location loc21_24 = new Location(21,24);
        grid.put(loc21_24,rock21_24);
        
        Rock rock21_25 = new Rock();
        Location loc21_25 = new Location(21,25);
        grid.put(loc21_25,rock21_25);
        
        Rock rock21_26 = new Rock();
        Location loc21_26 = new Location(21,26);
        grid.put(loc21_26,rock21_26);
        
        Rock rock21_27 = new Rock();
        Location loc21_27 = new Location(21,27);
        grid.put(loc21_27,rock21_27);
       
        Rock rock21_28 = new Rock();
        Location loc21_28 = new Location(21,28);
        grid.put(loc21_28,rock21_28);
        
        Rock rock21_29 = new Rock();
        Location loc21_29 = new Location(21,29);
        grid.put(loc21_29,rock21_29);
        
        //***********Row 23*********
        Rock rock3_2 = new Rock();
        Location loc3_2 = new Location(23, 22);
        grid.put(loc3_2, rock3_2);
        
        Rock rock3_3 = new Rock();
        Location loc3_3 = new Location(23, 23);
        grid.put(loc3_3, rock3_3);
        
        Rock rock3_4 = new Rock();
        Location loc3_4 = new Location(23, 24);
        grid.put(loc3_4, rock3_4);
        
        Rock rock3_5 = new Rock();
        Location loc3_5 = new Location(23, 25);
        grid.put(loc3_5, rock3_5);
        
        Rock rock3_6 = new Rock();
        Location loc3_6 = new Location(23, 26);
        grid.put(loc3_6, rock3_6);
        
        Rock rock3_7 = new Rock();
        Location loc3_7 = new Location(23, 27);
        grid.put(loc3_7, rock3_7);
        
        
        //*******************ROW 24*******************************
        Rock rock4_2 = new Rock();
        Location loc4_2 = new Location(24, 22);
        grid.put(loc4_2, rock4_2);
        
        Rock rock4_3 = new Rock();
        Location loc4_3 = new Location(24, 23);
        grid.put(loc4_3, rock4_3);
        
        Rock rock4_6 = new Rock();
        Location loc4_6 = new Location(24, 26);
        grid.put(loc4_6, rock4_6);
        
        Rock rock4_7 = new Rock();
        Location loc4_7 = new Location(24, 27);
        grid.put(loc4_7, rock4_7);
        //**********************COL 19********************
        Rock rock21_19 = new Rock();
        Location loc21_19 = new Location(21,19);
        grid.put(loc21_19,rock21_19);
        
        Rock rock22_19 = new Rock();
        Location loc22_19 = new Location(22,19);
        grid.put(loc22_19,rock22_19);
        
        Rock rock23_19 = new Rock();
        Location loc23_19 = new Location(23,19);
        grid.put(loc23_19,rock23_19);
        
        Rock rock24_19 = new Rock();
        Location loc24_19 = new Location(24,19);
        grid.put(loc24_19,rock24_19);
        
        Rock rock25_19 = new Rock();
        Location loc25_19 = new Location(25,19);
        grid.put(loc25_19,rock25_19);
        
        Rock rock26_19 = new Rock();
        Location loc26_19 = new Location(26,19);
        grid.put(loc26_19,rock26_19);
        
        Rock rock27_19 = new Rock();
        Location loc27_19 = new Location(27,19);
        grid.put(loc27_19,rock27_19);
        
        Rock rock28_19 = new Rock();
        Location loc28_19 = new Location(28,19);
        grid.put(loc28_19,rock28_19);
        
        Rock rock29_19 = new Rock();
        Location loc29_19 = new Location(29,19);
        grid.put(loc29_19,rock29_19);
        
        //*********************COL 30***************
        
        Rock rock21_30 = new Rock();
        Location loc21_30 = new Location(21,30);
        grid.put(loc21_30,rock21_30);
        
        Rock rock22_30 = new Rock();
        Location loc22_30 = new Location(22,30);
        grid.put(loc22_30,rock22_30);
        
        Rock rock23_30 = new Rock();
        Location loc23_30 = new Location(23,30);
        grid.put(loc23_30,rock23_30);
        
        Rock rock24_30 = new Rock();
        Location loc24_30 = new Location(24,30);
        grid.put(loc24_30,rock24_30);
        
        Rock rock25_30 = new Rock();
        Location loc25_30 = new Location(25,30);
        grid.put(loc25_30,rock25_30);
        
        Rock rock26_30 = new Rock();
        Location loc26_30 = new Location(26,30);
        grid.put(loc26_30,rock26_30);
        
        Rock rock27_30 = new Rock();
        Location loc27_30 = new Location(27,30);
        grid.put(loc27_30,rock27_30);
        
        Rock rock28_30 = new Rock();
        Location loc28_30 = new Location(28,30);
        grid.put(loc28_30,rock28_30);
        
        Rock rock29_30 = new Rock();
        Location loc29_30 = new Location(29,30);
        grid.put(loc29_30,rock29_30);
        
        
        
        //*****************ROW 25************************************
        Rock rock5_1 = new Rock();
        Location loc5_1 = new Location(25, 21);
        grid.put(loc5_1, rock5_1);
        
        Rock rock5_8 = new Rock();
        Location loc5_8 = new Location(25, 28);
        grid.put(loc5_8, rock5_1);
        
        
        //******************ROW 26*********************************
        
        Rock rock6_2 = new Rock();
        Location loc6_2 = new Location(26, 22);
        grid.put(loc6_2, rock6_2);
        
        Rock rock6_3 = new Rock();
        Location loc6_3 = new Location(26, 23);
        grid.put(loc6_3, rock6_3);
        
        Rock rock6_6 = new Rock();
        Location loc6_6 = new Location(26, 26);
        grid.put(loc6_6, rock6_6);
        
        Rock rock6_7 = new Rock();
        Location loc6_7 = new Location(26, 27);
        grid.put(loc6_7, rock6_7);
        
        //************************ROW 27***************************
        Rock rock7_2 = new Rock();
        Location loc7_2 = new Location(27, 22);
        grid.put(loc7_2, rock7_2);
        
        
        Rock rock7_3 = new Rock();
        Location loc7_3 = new Location(27, 23);
        grid.put(loc7_3, rock7_3);
        
        Rock rock7_4 = new Rock();
        Location loc7_4 = new Location(27, 24);
        grid.put(loc7_4, rock7_4);
        
        Rock rock7_5 = new Rock();
        Location loc7_5 = new Location(27, 25);
        grid.put(loc7_5, rock7_5);
        
        Rock rock7_6 = new Rock();
        Location loc7_6 = new Location(27, 26);
        grid.put(loc7_6, rock7_6);
        
        Rock rock7_7 = new Rock();
        Location loc7_7 = new Location(27, 27);
        grid.put(loc7_7, rock7_7);
        
        //*****************ROW 30*******************
        
        Rock rock30_20 = new Rock();
        Location loc30_20 = new Location(30,20);
        grid.put(loc30_20,rock30_20);
        
        Rock rock30_21 = new Rock();
        Location loc30_21 = new Location(30,21);
        grid.put(loc30_21,rock30_21);
        
        Rock rock30_22 = new Rock();
        Location loc30_22 = new Location(30,22);
        grid.put(loc30_22,rock30_22);
        
        Rock rock30_23 = new Rock();
        Location loc30_23 = new Location(30,23);
        grid.put(loc30_23,rock30_23);
        
        Rock rock30_24 = new Rock();
        Location loc30_24 = new Location(30,24);
        grid.put(loc30_24,rock30_24);
        
        Rock rock30_25 = new Rock();
        Location loc30_25 = new Location(30,25);
        grid.put(loc30_25,rock30_25);
        
        Rock rock30_26 = new Rock();
        Location loc30_26 = new Location(30,26);
        grid.put(loc30_26,rock30_26);
        
        Rock rock30_27 = new Rock();
        Location loc30_27 = new Location(30,27);
        grid.put(loc30_27,rock30_27);
       
        Rock rock30_28 = new Rock();
        Location loc30_28 = new Location(30,28);
        grid.put(loc30_28,rock30_28);
        
        Rock rock30_29 = new Rock();
        Location loc30_29 = new Location(30,29);
        grid.put(loc30_29,rock30_29);
        
        
        
    }

    /**
     * Generates the next generation based on the rules of the Game of Life and updates the grid
     * associated with the world
     *
     * @pre     the game has been initialized
     * @post    the world has been populated with a new grid containing the next generation
     * 
     */
    public void createNextGeneration()
    {
        /** You will need to read the documentation for the World, Grid, and Location classes
         *      in order to implement the Game of Life algorithm and leverage the GridWorld framework.
         */
        
        // create the grid, of the specified size, that contains Actors
        Grid<Actor> grid = world.getGrid();
        BoundedGrid<Actor> newGrid = new BoundedGrid<Actor>(this.ROWS, this.COLS);
        
        world.setGrid(newGrid);
        
        for (int row = 0; row < ROWS - 1; row++)
        {
            for (int col = 0; col < COLS - 1; col++)
            {
                Location loc = new Location(row, col);
                ArrayList num = grid.getOccupiedAdjacentLocations(loc);
                if ((num.size() < 2) && (grid.get(loc) != null))
                {
                    newGrid.remove(loc);
                }
                else if ((num.size() < 4) && (grid.get(loc) != null))
                {
                    Rock rock = new Rock();
                    newGrid.put(loc, rock);
                }
                else if ((num.size() > 3) && (grid.get(loc) != null))
                {
                    newGrid.remove(loc);
                }
                else if ((num.size() == 3) && (grid.get(loc) == null))
                {
                    Rock rock = new Rock();
                    newGrid.put(loc, rock);
                }
                
                world.show();
            }
        }
        
        
        
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
    public static void main(String[] args)throws InterruptedException
    {
        GameOfLife game = new GameOfLife();
        for(int i = 0;i < 101;i++)
        {
            game.createNextGeneration();
            if(i == 44)
            {
                System.out.println("This robot is cool, So as the maker of the grid I will let him last longer!!");
                Thread.sleep(4700);
                
            }
            Thread.sleep(300);
        }
    }

}
