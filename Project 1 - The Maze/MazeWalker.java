
public class MazeWalker
{

    // Instance Variables
    public static void run(){
        Maze maze = new Maze(2);
        MazeWalker mazeWalker = new MazeWalker();
        mazeWalker.walkMaze(maze, maze.getMazeBot());    
     }

    public void signalSuccess(){
    }

    public void signalError(){
    }
    //Constructor
    public MazeWalker(){

    }

    public void walkMaze(Maze maze, MazeBot mazeBot){
        while(mazeBot.didNotReachGoal()){
            if(mazeBot.canMoveForward() == true){
                mazeBot.moveForward();
              
            if(mazeBot.canMoveForward() == false){
                mazeBot.turnLeft();
                if (mazeBot.canMoveForward()== false){
                    mazeBot.turnLeft();
                    mazeBot.turnLeft();
                }
            }
        }
    }
    }
}


