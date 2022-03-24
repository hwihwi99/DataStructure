package week3;

import java.util.Scanner;

public class Num2_StackApplication {

    public static void main(String[] args) throws Exception {

        ArrayStack arrayStack = new ArrayStack(15);

        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        char[] charsArray = input.toCharArray();

        for(int i = 0; i< charsArray.length; i++) {
            arrayStack.push(charsArray[i]);
        }

        StringBuilder stringBuilder = new StringBuilder();

        while (!arrayStack.isEmpty()) {

            char result = arrayStack.pop();

            if(result == '(')
                stringBuilder.append(')');
            else if(result == ')')
                stringBuilder.append('(');
            else
                stringBuilder.append(result);
        }

        System.out.println(stringBuilder.toString());
    }

}
