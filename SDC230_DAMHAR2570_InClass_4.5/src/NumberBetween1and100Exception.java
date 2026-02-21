/**********************************************************************
 * Name: Damien Harmon
 * Date: February 20, 2026
 * Assignment: SDC230 In-Class Assignment: Exceptions Practice
 *Description: SDC230 Object-Oriented Programming using Java
 ************************************************************************/
public class NumberBetween1and100Exception extends Exception {
    public NumberBetween1and100Exception(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
