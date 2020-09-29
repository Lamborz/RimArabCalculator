package com.company;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {
    public static void main(String[] args) throws IOException {
        
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            while(true){
            String line = reader.readLine();
            char[] chars = line.toCharArray();
            ConvertNumbers rimNums = new ConvertNumbers();
            String rimFirst;
            String rimSecond;
            int result;
            int arabFirst;
            int arabSecond;

            for (int i = 0; i < chars.length; i++) {

                if (line.matches(".*\\d+.*")) {

                    if (chars[i] == '-') {
                        arabFirst = Integer.parseInt(line.substring(0, i));
                        arabSecond = Integer.parseInt(line.substring(i + 1, line.length()));
                        result = arabFirst - arabSecond;
                        System.out.println(result);
                        break;
                    }
                    if (chars[i] == '*') {
                        arabFirst = Integer.parseInt(line.substring(0, i));
                        arabSecond = Integer.parseInt(line.substring(i + 1, line.length()));
                        result = arabFirst * arabSecond;
                        System.out.println(result);
                        break;
                    }
                    if (chars[i] == '/') {
                        arabFirst = Integer.parseInt(line.substring(0, i));
                        arabSecond = Integer.parseInt(line.substring(i + 1, line.length()));
                        result = arabFirst / arabSecond;
                        System.out.println(result);
                        break;
                    } else if (chars[i] == '+') {
                        arabFirst = Integer.parseInt(line.substring(0, i));
                        arabSecond = Integer.parseInt(line.substring(i + 1, line.length()));
                        result = arabFirst + arabSecond;
                        System.out.println(result);
                        break;
                    }
                    if (chars[i] == '-') {
                        arabFirst = Integer.parseInt(line.substring(0, i));
                        arabSecond = Integer.parseInt(line.substring(i + 1, line.length()));
                        result = arabFirst - arabSecond;
                        System.out.println(result);
                        break;
                    }
                    if (chars[i] == '*') {
                        arabFirst = Integer.parseInt(line.substring(0, i));
                        arabSecond = Integer.parseInt(line.substring(i + 1, line.length()));
                        result = arabFirst * arabSecond;
                        System.out.println(result);
                        break;
                    }
                    if (chars[i] == '/') {
                        arabFirst = Integer.parseInt(line.substring(0, i));
                        arabSecond = Integer.parseInt(line.substring(i + 1, line.length()));
                        result = arabFirst / arabSecond;
                        System.out.println(result);
                        break;
                    }
                }
                if(chars[i]=='+'){
                    rimFirst = line.substring(0,i);
                    rimSecond = line.substring(i+1,line.length());
                    arabFirst = rimNums.convertRimToArab(rimFirst);
                    arabSecond = rimNums.convertRimToArab(rimSecond);
                    result = arabFirst+ arabSecond;
                    String res = rimNums.convertArabToRim(result);
                    System.out.println(res);
                    break;
                }
                if(chars[i]=='-'){
                    rimFirst = line.substring(0,i);
                    rimSecond = line.substring(i+1,line.length());
                    arabFirst = rimNums.convertRimToArab(rimFirst);
                    arabSecond = rimNums.convertRimToArab(rimSecond);
                    result = arabFirst- arabSecond;
                    String res = rimNums.convertArabToRim(result);
                    System.out.println(res);
                    break;
                }
                if(chars[i]=='*'){
                    rimFirst = line.substring(0,i);
                    rimSecond = line.substring(i+1,line.length());
                    arabFirst = rimNums.convertRimToArab(rimFirst);
                    arabSecond = rimNums.convertRimToArab(rimSecond);
                    result = arabFirst* arabSecond;
                    String res = rimNums.convertArabToRim(result);
                    System.out.println(res);
                    break;
                }
                if(chars[i]=='/'){
                    rimFirst = line.substring(0,i);
                    rimSecond = line.substring(i+1,line.length());
                    arabFirst = rimNums.convertRimToArab(rimFirst);
                    arabSecond = rimNums.convertRimToArab(rimSecond);
                    result = arabFirst/ arabSecond;
                    String res = rimNums.convertArabToRim(result);
                    System.out.println(res);
                    break;
                }
            }
            }
    }
}
