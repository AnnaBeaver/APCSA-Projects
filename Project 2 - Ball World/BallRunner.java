
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
        //int freeBallBotIndex = 0;

        //boolean runLoop = true;
        int returnValue = 0;
        for(int i = 0; i < ballBotArray.length; i++){
                if (ballBotArray[i] == null){
    
                    returnValue = i;
                }
                
               // return returnValue;
            
        }
        if(returnValue == 0){
            returnValue = ballBotArray.length;
        }
        return returnValue;
    }

    public static void activityTwo(){
        BallWorld ballWorld = new BallWorld(500,500);
        //BallBot ballBot = new BallBot(ballWorld,new TGPoint(0,0),0,25);
        //BallWorld bw = new BallWorld(500,500);
        TGPoint entrancePoint = new TGPoint(0,0); 
        BallBot[] ballBotArray = new BallBot[3];
        BallRunner ballRunner = new BallRunner();
        //int freeBallBotIndex = 0;
        //int numofBalls = 0; 
        while (true){
            /*if (ballBot.canMoveForward(ballWorld) == true){
            ballBot.moveForward();
            }
            if (ballBot.canMoveForward(ballWorld) == false){
            ballBot.setHeading(ballBot.getHeading() + 35);
            }
             */
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
            }}
        }
    }
}}


/**
 * if (GenerateBalls){
if(numofBalls == 0){

if (findEntranceClear (BallBotArray,new TGPoint(0,0))){
int bbindex = findFreeBallBoxIndex(BallBotArray);

}
}
}
 */