package com.company;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

//MyTask 19 first
public class Main {
    public static void main(String[] args) {
        String s = "abec";
        String result = "";
        int i = 0;
        while (i < s.length()){
            char c = s.charAt(i);
            if(c=='a' ||c=='e' ||c=='i' ||c=='o' ||c=='u') {
                result = result + c;
                i++;
            }else{
                result = result + c + c;
                i++;
            }
        }
        System.out.println(result);
    }
    }
//MyTask 19 second
/*public class Main {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("abecf");
        StringBuffer result = new StringBuffer("");
        int i = 0;
        int j=0;
        while (i < str.length()){
            char c = str.charAt(i);
            if(c=='a' ||c=='e' ||c=='i' ||c=='o' ||c=='u') {
                result.insert(j,c);
               // result = result + c;
                i++;
                j++;
            }
            else {
                 result.insert(j, c);
                 result.insert(j, c);
                //result = result + c + c;
                i++;
                j+=2;
            }
        }
        System.out.println(result);
    }
    }*/

//Task2
/*public class Main {
    public static void main(String[] args) {
        String str = "hh ododk kk i";
        int z=0;
        char []c=str.toCharArray();
        for (int i = 0; i <c.length ; i++) {
            z++;
            if(c[i]==' ' && z==3){
                System.out.print(c[i-2]);
                System.out.println(c[i-1]);
                z=0;
            }
            if(c[i]==' '){
                z=0;
            }
        }

    }
}*/
//Task3
/*public class Main {
    public static void main(String[] args) {
        String str = "Hello World,my friends!Best friend.";
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ' ' || str.charAt(i) == ',' ||str.charAt(i) == '.' ||str.charAt(i) == '!' ||str.charAt(i) == '?'){
                count++;
            }
    }
        System.out.println(count);
    }}*/
//Task4
/*public class Main {
    public static void shortAndLongWord(String str) {
        String shortw = "", longw = "";
        int s = str.length();
        String words[] = str.split(" ");
        for(String word:words) {
            if(word.length()<longw.length())
                shortw = word;
            if(word.length()>shortw.length())
                longw = word;

        }
        System.out.println("Long Word : "+longw);
        System.out.println("Short Word : "+shortw);
    }

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.printf("Input text:");
        String str = scr.nextLine();
        str += " ";
        shortAndLongWord(str);
    }
}*/
//Task5
/*public class Main {
    public static void main(String[] args) {
        String str = "hello friends";
        String result = new StringBuilder(str).reverse().toString();
        result = result.replaceAll("(.)(?=.*\\1)", "");
        result = new StringBuilder(result).reverse().toString();
        System.out.println(result);
    }
    }*/
//Task6
/*public class Main {
    public static void main(String[] args) {
        String str=")(}{}[][[]()";
        char [] c= str.toCharArray();
        int a=0;int a2=0;
        int b=0;int b2=0;
        int d=0;int d2=0;
        boolean z=false;
        for (int i = 0; i < c.length; i++) {
            if(c[i]== '('){
                a++;
            }
            if(c[i]==')'){
                if(a>0){
                    a2++;
                    a--;
                }
            }
            if(c[i]== '{'){
                b++;
            }
            if(c[i]=='}'){
                if(b>0){
                    b2++;
                    b--;
                }
            }
            if(c[i]== '['){
                d++;
            }
            if(c[i]==']'){
                if(d>0){
                    d2++;
                    d--;
                }
            }
        }
        System.out.println("Количество правильно расставленых скобок () равно: "+a2);
        System.out.println("Количество правильно расставленых скобок {} равно: "+b2);
        System.out.println("Количество правильно расставленых скобок [] равно: "+d2);
    }
    }*/
//Task7
/*public class Main {
    public static void main(String[] args) {
        String str = "Hello+My---Friend**";
        int q = 0, w = 0, e = 0;
        for (char a : str.toCharArray()) {
            if (a == '+') q++;
            if (a == '-') w++;
            if (a == '*') e++;
        }
        str = str.replaceAll("[+-]", "");
        str = str.replaceAll("[*]", "");
        System.out.println("Кол-во + : " + q);
        System.out.println("Кол-во - : " + w);
        System.out.println("Кол-во * : " + e);
        System.out.println(str);
    }
}*/
//Task11
/*public class Main {
    public static void main(String[] args) {
        String str="I am a student!";
        int a=0;
        for (char b : str.toCharArray()) {
            if (b == 'a') a++;
    }
        System.out.println("Repeat: "+a);
    }}*/
//Task22
/*public class Main {
    public static void main(String[] args) {
        String str="Hello, 123";
        int a=0,b=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ' '){
                a++;
            }
            if(str.charAt(i) == ','||str.charAt(i) == '.'){
                b++;
            }
        }
        long c = str.codePoints().filter(Character::isDigit).count();
        long d = str.chars().filter(Character::isLetter).count();

        System.out.println("Кол-во пробелов: "+a);
        System.out.println("Кол-во знаков препинания: "+b);
        System.out.println("Кол-во цифр: "+c);
        System.out.println("Кол-во букв: "+d);
    }}*/
//Task23
/*public class Main {
    public static void main(String[] args) {
        String str="Hello 1 friend and 2 friend!";
        str = str.replaceAll("[1234567890]", "");
        System.out.println(str);
    }
    }*/