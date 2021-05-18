package com.serenitydojo.calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Calculator {

    public static String VALID_OPERATORS = "[*+-]";//No division! The exercise doesn't ask for it, and we won't be handling precedence so will exclude it.

    public int evaluate(String expression)  {

        int result = 0;
        try {

            expression = expression.replaceAll("\\s+", "");
            // Return empty string for an empty expression.
            if (expression == "" || expression == null) { return 0; }

            // Return only a single number if only a single number is submitted
            List<String> expressionOperators = new ArrayList<String>(Arrays.asList(expression.split("[0-9]+")));

            if (expressionOperators.size() == 0) { return Integer.parseInt(expression); }

            // Remove the leading empty element if we have a list of operands.
            if (expressionOperators.size() > 1 && expressionOperators.get(0) == "") { expressionOperators.remove(0); }
            // Throw an exception if an invalid operator is passed
            for (String entry : expressionOperators) {
                if (!entry.matches(VALID_OPERATORS)){
                    throw new IllegalMathsOperatorException("Illegal operator "+entry+".");
                }
            }

            String[] expressionValues = expression.replaceAll(VALID_OPERATORS, " ").split("\\s");
            result = Integer.parseInt(expressionValues[0]);
            for (int i = 0; i < expressionOperators.size() ; i++ ) { // Remember we have a 'blank' first element in the operators array
                switch (expressionOperators.get(i)) {
                    case "+":
                        result = result + Integer.parseInt(expressionValues[i+1]);
                        break;
                    case "-":
                        result = result - Integer.parseInt(expressionValues[i+1]);
                        break;
                    case "*":
                        result = result * Integer.parseInt(expressionValues[i+1]);
                        break;
                    default:
                }
            }
            return result;

        } catch (Exception e) {
            throw new IllegalMathsOperatorException("Illegal operation",e);
        }
    }
}
