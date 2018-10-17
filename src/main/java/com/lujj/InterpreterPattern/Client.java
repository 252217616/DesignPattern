package com.lujj.InterpreterPattern;

import com.lujj.InterpreterPattern.service.Calculator;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 解释器模式
 */
public class Client {

    public static void main(String[] args) {
        String expStr = "a+b+c-d";
        //赋值
        HashMap<String,Integer> var = getValue(expStr);
        Calculator calculator = new Calculator(expStr);
        System.out.println("结果为："+calculator.run(var));
    }

    private static HashMap<String, Integer> getValue(String expStr) {
//        Scanner scanner = new Scanner(System.in);
        HashMap<String ,Integer> map = new HashMap<String,Integer>();
        for(char c:expStr.toCharArray()){
            if(c!='+' && c!='-'){
//                System.out.println("请输入"+c+"的值！");
//                String in = scanner.nextLine();
                String in = "7";
                map.put(String.valueOf(c),Integer.valueOf(in));
            }
        }

        return map;
    }

}
