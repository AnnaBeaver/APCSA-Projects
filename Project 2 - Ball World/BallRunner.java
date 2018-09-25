
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
    
    //public static int findFreeBallBotIndex(BallBot[] ballBotArray){
        //int freeBallBotIndex = 0;
        /*
        boolean runLoop = true;
        int i = 0;
        int returnValue = -3;
        while(runLoop == true){
            if (ballBotArray[i] == null){
                runLoop = false;
                returnValue = i;
            }
            if(i == ballBotArray.length-1){
                runLoop = false;
            }
            */
          // return 0;
    //}
    
    public static void activityTwo(){
        BallWorld ballWorld = new BallWorld(500,500);
        BallBot ballBot = new BallBot(ballWorld,new TGPoint(0,0),0,25);
        //BallWorld bw = new BallWorld(500,500);
        //TGPoint entrancePoint = new TGPoint(0,0); 
        BallBot[] ballBotArray = new BallBot[10];
        BallRunner ballRunner = new BallRunner();
        boolean GenerateBalls = true;
        int freeBallBotIndex = 0;
        //int numofBalls = 0;
        boolean runLoop = true;
        while (true){
            /*if (ballBot.canMoveForward(ballWorld) == true){
                ballBot.moveForward();
            }
            if (ballBot.canMoveForward(ballWorld) == false){
                ballBot.setHeading(ballBot.getHeading() + 35);
            }
            */
            if (freeBallBotIndex < ballBotArray.length){
               //if there is room in BallBot Array for an addition to BallBot
               BallBot ballBot2 = new BallBot(ballWorld,new TGPoint(0,0),10,25); 
            }
            if (ballBot.canMoveForward(ballWorld) == true){
                ballBot.moveForward();
            }
            if (ballBot.canMoveForward(ballWorld) == false){
                ballBot.setHeading(ballBot.getHeading() + 35);
            }
        }
    }
}


/**
 * if (GenerateBalls){
                if(numofBalls == 0){
                    
                    if (findEntranceClear (BallBotArray,new TGPoint(0,0))){
                        int bbindex = findFreeBallBoxIndex(BallBotArray);
                        
                    }
                }
            }
 */