import SpaceSmasher_FunctionalAPI.*;
import static SpaceSmasher_FunctionalAPI.KeysEnum.*;
import static SpaceSmasher_FunctionalAPI.PaddleAndBallStatesEnum.*;

/* TODO 9 - Synchronize the state of the ball based on the state of the paddle using
 * the switch structure rather than a multi-way if/else statement.
 *
 * Outcomes: A Switch statement. 
 * 
 * Functions to define:
 *          public void paddleAndBallStateSynchronization();    //define this function to work on moving paddles in response to user input
 * 
 * Functions to call:
 *          PaddleAndBallStatesEnum paddleGetState();           //returns the state of the paddle as an enumerated value
 *          void ballSetState(PaddleAndBallStatesEnum state);   //sets the state of the ball according to the input provided
 *  
 * Useful Paddle and Ball states: 
 *         enum PaddleAndBallStatesEnum {NORMAL,FIRE,ICE}
 */

public class TODO9 extends SpaceSmasherFunctionalAPI {

    public void paddleAndBallStateSynchronization()
    {
        switch(paddleGetState())
        {
            case FIRE:
                ballSetState(FIRE);
                break;
            case ICE:
                ballSetState(ICE);
                break;
            default:
                ballSetState(NORMAL);
                break;                
        }
    }    
}

