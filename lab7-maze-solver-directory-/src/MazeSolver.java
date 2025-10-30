import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MazeSolver {

    private char[][] maze;
    private int possibleSteps ;

    public MazeSolver(char[][] maze) {
        this.maze = maze;
        this.possibleSteps = 0;
    }

    /**
     * Prints the current state of the maze.
     */
    public void printMaze() {
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {
                System.out.print(maze[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("--------------------");
    }

    /**
     * Public wrapper method to start the maze-solving process.
     * It should find the starting 'S' position and initiate the recursive search.
     * @return true if a path is found, false otherwise.
     */
    public boolean solve() {
        // TODO: Find the starting row and column of 'S'
        int startRow = -1;
        int startCol = -1;
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {
                if (maze[i][j] == 'S') {
                    startRow = i;
                    startCol = j;
                    break;
                }

                
            }
        }
        // additional codes
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {
                if (maze[i][j] == ' ') {
                    possibleSteps++;
                }
            }
        }

        if (startRow != -1) {
            return solve(startRow, startCol, new ArrayList<>());
        }
        return false;
    }

    /**
     * The core recursive method to solve the maze.
     * @param row The current row position.
     * @param col The current column position.
     * @return true if this position leads to a solution, false otherwise.
     */
    private boolean solve(int row, int col, /**addition */ List<List<Integer>> paths) {
        // TODO: Implement the recursive logic with backtracking here.

        // 1. Base Case (Stopping Conditions)
        // Check if out of bounds, a wall, or already visited.
        // Check if the current cell is the finish ('F').

        // 2. Recursive Step
        // Mark the current cell as part of the path.
        // Try moving North, East, South, West.
        // If any direction returns true, then you've found a path, return true.

        // 3. Backtracking
        // If no direction works, un-mark the cell and return false.

        // check possible position to move around the Object;

        List<List<Integer>> movements = new ArrayList<>();

        // prevent out of bounce
        if (row-1 >= 0)
            movements.add(new ArrayList<>(List.of(row-1, col)));
        if (col-1 >= 0)
            movements.add(new ArrayList<>(List.of(row, col-1)));
        if (row+1 <= maze.length - 1)
            movements.add(new ArrayList<>(List.of(row+1, col)));
        if (col+1 <= maze[0].length - 1)
            movements.add(new ArrayList<>(List.of(row, col+1)));

        // System.out.println("==============================");
        // System.out.println("current: " + row + " " + col);
        // remove invalid movementss like the wall #, paths -;
       
        movements.removeIf(movement -> !(maze[movement.get(0)][movement.get(1)] == ' ' || maze[movement.get(0)][movement.get(1)] == 'F'));
       
        // System.out.println("possible: "+movements);
        // System.out.println("paths: "+ paths);

        for (List<Integer> move : movements) {
            if (maze[move.get(0)][move.get(1)] == 'F') {
                maze[row][col] = '-';
                maze[move.get(0)][move.get(1)] = '@';
                return true;
            }
        }
        
        
        if (movements.size() > 0){
            Random r = new Random();
    
            int indexPos = r.nextInt(movements.size()); // 0 - movements.size() - 1
    
            List<Integer> nextMove = movements.get(indexPos);
            int newRow = nextMove.get(0);
            int newCol = nextMove.get(1);
            maze[newRow][newCol] = 'S';
            maze[row][col] = '-';

            // add last path
            paths.addLast(new ArrayList<>(List.of(row, col)));
            // continue finding way to 'F'
            return solve(newRow, newCol, paths);
        } 
        // reached dead end
        else {
            // Get back last path
            int newRow = paths.getLast().get(0);
            int newCol = paths.getLast().get(1);
            // remove last path
            paths.removeLast();

            maze[newRow][newCol] = 'S';
            // Fill '*' to the current location maze in order to prevent going back to that spot
            maze[row][col] = '*';
            possibleSteps--;
            if (possibleSteps == 0) {
                // no more possible steps -> No solution found
                return false;
            } 
            // continue finding way to 'F'
            return solve(newRow, newCol, paths);
        }

    }

    public static void main(String[] args) {
        char[][] mazeToSolve = {
            {'#', '#', '#', '#', '#', '#', '#'},
            {'#', 'S', ' ', '#', ' ', ' ', '#'},
            {'#', ' ', ' ', '#', ' ', '#', '#'},
            {'#', ' ', '#', ' ', ' ', ' ', '#'},
            {'#', ' ', ' ', ' ', '#', 'F', '#'},
            {'#', '#', '#', '#', '#', '#', '#'}
        };

        MazeSolver solver = new MazeSolver(mazeToSolve);

        System.out.println("Original Maze:");
        solver.printMaze();

        if (solver.solve()) {
            System.out.println("Solution Found:");
        } else {
            System.out.println("No Solution Found:");
        }
        solver.printMaze();

        // Test in another maze

        char[][] anotherMazeToSolve = {
            {'#', '#', ' ', '#', ' ', ' ', '#'},
            {'#', 'S', ' ', '#', ' ', ' ', ' '},
            {'#', ' ', ' ', '#', ' ', '#', '#'},
            {' ', ' ', '#', ' ', ' ', ' ', ' '},
            {'#', ' ', '#', ' ', ' ', ' ', '#'},
            {' ', ' ', '#', ' ', '#', ' ', ' '},
            {'#', ' ', ' ', ' ', ' ', ' ', '#'},
            {' ', ' ', ' ', ' ', '#', 'F', '#'},
            {'#', '#', ' ', ' ', '#', '#', '#'}
        };

        MazeSolver anotherSolver = new MazeSolver(anotherMazeToSolve);

        System.out.println("Original Maze:");
        anotherSolver.printMaze();

        if (anotherSolver.solve()) {
            System.out.println("Solution Found:");
        } else {
            System.out.println("No Solution Found:");
        }
        anotherSolver.printMaze();
    }
}
