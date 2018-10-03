
/**
 * Write a description of class BallRunner here.
 *
 * Anna
 * Ball World
 */
public class BallRunner
{   

    public static void activityOne(){
        BallWorld ballWorld = new BallWorld(500,500);
        BallBot ballBot = new BallBot(ballWorld,new TGPoint(0,0),0,25);
        while (true){
            if (ballBot.canMoveForward(ballWorld) == true){
                ballBot.moveForward();
            }
            if (ballBot.canMoveForward(ballWorld) == false){
                ballBot.setHeading(ballBot.getHeading() + 35);
            }
        }
    }

    
    public static int findFreeBallBotIndex(BallBot[] ballBotArray){
        int returnValue = 0;
        for(int i = 0; i < ballBotArray.length; i++){
            if (ballBotArray[i] == null){

                returnValue = i;
            }
        }
        if(returnValue == 0){
            returnValue = ballBotArray.length;
        }
        return returnValue;
    }

    public static void activityTwo(){
        BallWorld ballWorld = new BallWorld(500,500);
        TGPoint entrancePoint = new TGPoint(0,0); 
        BallBot[] ballBotArray = new BallBot[10];
        BallRunner ballRunner = new BallRunner();
        while (true){
            int n = ballRunner.findFreeBallBotIndex(ballBotArray);
            if (n < ballBotArray.length){
                //if there is room in BallBot Array for an addition to BallBot
                ballBotArray[n] = new BallBot(ballWorld,entrancePoint,(Math.random()*360),25);
            }
            for(int a = 0; a < ballBotArray.length; a++){
                if(ballBotArray[a] != null){
                    if (ballBotArray[a].canMoveForward(ballWorld)){
                        ballBotArray[a].moveForward();
                    }else{
                        ballBotArray[a].setHeading(ballBotArray[a].getHeading() + 35);
                    }
                }
            }
        }
    }

    
    //find the distance between the ball about to be created and the ball made before that
    public double distanceBetweenPoints(TGPoint point1,TGPoint point2){
        double ReturnValue = 0.0;
        ReturnValue = Math.sqrt(Math.pow(point1.x-point2.x,2) + (Math.pow(point1.y-point2.y,2)));
        return ReturnValue;
    }

    //Make sure that the ball is far enough away to make a new one
    public boolean enteranceClear(BallBot[] ballBotArray, TGPoint enterancePoint){
        BallRunner ballRunner = new BallRunner();
        //boolean Return = true;
        //traverse the array
        for(int i = 0; i < ballBotArray.length; i++){
            //test if the spot's null
            if (ballBotArray[i] != null){
                //Return = false;

                //if the spot is null, check to seee if the other ball is far enough away to make a new one
                //if(Return == true){
                if (ballRunner.distanceBetweenPoints(ballBotArray[i].getPoint(),enterancePoint ) < 100){
                    return false;
                }
                //}
            }
        }
        //returns the boolean (true if the ball is far enough away, false if the ball is too close)
        return true;
    }

    public static void activityThree(){
        //Declare the world, enterance point, array length, and runner(which lets me refer to the other functions)
        BallWorld ballWorld = new BallWorld(500,500);
        TGPoint entrancePoint = new TGPoint(0,0); 
        BallBot[] ballBotArray = new BallBot[10];
        BallRunner ballRunner = new BallRunner();
        while( true){
            //if the ball is far enough away, make a new ball
            if (ballRunner.enteranceClear(ballBotArray,entrancePoint) == true){
                int n = ballRunner.findFreeBallBotIndex(ballBotArray);
                if (n < ballBotArray.length){
                    //if there is room in BallBot Array for an addition to BallBot
                    ballBotArray[n] = new BallBot(ballWorld,entrancePoint,(Math.random()*360),25);
                }
            }
            //TRAVERSE ARRAY and make the new ball move
            for(int a = 0; a < ballBotArray.length; a++){
                if(ballBotArray[a] != null){
                    if (ballBotArray[a].canMoveForward(ballWorld)){
                        ballBotArray[a].moveForward();
                    }else{
                        ballBotArray[a].setHeading(ballBotArray[a].getHeading() + 35);
                    }
                }
            }

        }
    }
    
    
    
    /**
       //find the distance between the ball about to be created and the ball made before that
    public double distanceBetweenPoints(TGPoint point1,TGPoint point2){
        double ReturnValue = 0.0;
        ReturnValue = Math.sqrt(Math.pow(point1.x-point2.x,2) + (Math.pow(point1.y-point2.y,2)));
        return ReturnValue;
    }

    //Make sure that the ball is far enough away to make a new one
    public boolean enteranceClear(BallBot[] ballBotArray, TGPoint enterancePoint){
        BallRunner ballRunner = new BallRunner();
        //boolean Return = true;
        //traverse the array
        for(int i = 0; i < ballBotArray.length; i++){
            //test if the spot's null
            if (ballBotArray[i] != null){
                //Return = false;

                //if the spot is null, check to seee if the other ball is far enough away to make a new one
                //if(Return == true){
                if (ballRunner.distanceBetweenPoints(ballBotArray[i].getPoint(),enterancePoint ) < 100){
                    return false;
                }
                //}
            }
        }
        //returns the boolean (true if the ball is far enough away, false if the ball is too close)
        return true;
    }*/

    public static void activityFour(){
        //Declare the world, enterance point, array length, and runner(which lets me refer to the other functions)
        BallWorld ballWorld = new BallWorld(500,500);
        TGPoint entrancePoint = new TGPoint(0,0); 
        BallBot[] ballBotArray = new BallBot[10];
        BallRunner ballRunner = new BallRunner();
        while( true){
            //if the ball is far enough away, make a new ball
            if (ballRunner.enteranceClear(ballBotArray,entrancePoint) == true){
                int n = ballRunner.findFreeBallBotIndex(ballBotArray);
                if (n < ballBotArray.length){
                    //if there is room in BallBot Array for an addition to BallBot
                    ballBotArray[n] = new BallBot(ballWorld,entrancePoint,(Math.random()*360),25);
                }
            }
            //TRAVERSE ARRAY and make the new ball move
            for(int a = 0; a < ballBotArray.length; a++){
                if(ballBotArray[a] != null){
                    if (ballBotArray[a].canMoveForward(ballWorld)){
                        ballBotArray[a].moveForward();
                    }else{
                        ballBotArray[a].setHeading(ballBotArray[a].getHeading() + 35);
                    }
                }
            }

        }
    }
}