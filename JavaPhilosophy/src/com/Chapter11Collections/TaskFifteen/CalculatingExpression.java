package com.Chapter11Collections.TaskFifteen;

import com.Chapter11Collections.Test.Stack.Stack;

public class CalculatingExpression {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        String s = "+U+n+c---+e+r+t---+a-+i-+n+t+y---+ -+r+u--+l+e+s---";
        char[] mc = s.toCharArray();
        for (int i = 0; i < mc.length; i++) {
            String sc = String.valueOf(mc[i]);
            if("+".equals(sc)){
                stack.push(mc[i+1]);
            }
            if("-".equals(sc)){
                System.out.print(stack.pop());
            }
        }
    }

}
