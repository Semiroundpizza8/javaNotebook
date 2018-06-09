package com.benodisho.calcengine;

public class Main {


    public static void main(String[] args) {
        // write your code here
        MathEquation[] equations = new MathEquation[4];
        equations[0] = create(100.0, 200.0, 'a');
        equations[1] = create(120.0, 12.0, 's');
        equations[2] = create(130.0, 240.0, 'd');
        equations[3] = create(550.0, 2.0, 'm');

        for(MathEquation equation : equations) {
            equation.execute();
            System.out.print("result = ");
            System.out.println(equation.result);
        }
    }

    public static MathEquation create(double leftVal, double rightVal, char opCode) {
      MathEquation equation = new MathEquation();
      equation.leftVal = leftVal;
      equation.rightVal = rightVal;
      equation.opCode = opCode;
      return equation;
    }
}
