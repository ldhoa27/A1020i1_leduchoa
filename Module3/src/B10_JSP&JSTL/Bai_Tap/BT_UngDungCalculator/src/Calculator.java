public class Calculator {
    public static float calculate(float first, float second, String operator){
        switch (operator){
            case "+":
                return  first + second;
            case "-":
                return first - second;
            case "*":
                return  first * second;
            case "/":
                if(second != 0)
                    return  first / second;
                else
                    throw new RuntimeException("Can't divide by zero");
            default:
                throw new RuntimeException("Invalid operation");
        }

    }

}
