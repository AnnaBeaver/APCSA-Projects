/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 */
public class Magpie2
{
    /**
     * greeting
     */
    public String getGreeting()
    {
        return "Hello, how are you?";
    }

    /**
     * Gives a response to a user statement
     */
    public String getResponse(String statement)
    {
        String response = "";
        statement = statement.toLowerCase();
        statement = statement.trim();
        if(statement == ""){
            response = "Please tell me something";
        }
        else{
            if (statement.indexOf("no") >= 0)
            {
                response = "Why so negative?";
            }
            else if (statement.indexOf("mother") >= 0
            || statement.indexOf("father") >= 0
            || statement.indexOf("sister") >= 0
            || statement.indexOf("brother") >= 0)
            {
                response = "Tell me more about your family.";
            }
            else if (statement.indexOf("pet") >= 0
            || statement.indexOf("dog") >= 0
            || statement.indexOf("cat") >= 0
            || statement.indexOf("fish") >= 0)
            {
                response = "Tell me more about your pets.";
            }
            else if (statement.indexOf("ettlin") >= 0
            || statement.indexOf("malloy") >= 0
            || statement.indexOf("buckowski") >= 0
            || statement.indexOf("shannon") >= 0)
            {
                response = "They sound nice!";
            }
            else
            {
                response = getRandomResponse();
            }
        }
        return response;
    }

    /**
     * Pick a default response to use if nothing else fits.
     * @return a non-committal string
     */
    private String getRandomResponse()
    {
        final int NUMBER_OF_RESPONSES = 6;
        double r = Math.random();
        int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
        String response = "";

        if (whichResponse == 0)
        {
            response = "Interesting, tell me more.";
        }
        else if (whichResponse == 1)
        {
            response = "Hmmm.";
        }
        else if (whichResponse == 2)
        {
            response = "Do you really think so?";
        }
        else if (whichResponse == 3)
        {
            response = "You don't say.";
        }
        else if (whichResponse == 4)
        {
            response = "That sounds cool.";
        }
        else if (whichResponse == 5)
        {
            response = "nice.";
        }

        return response;
    }
}
