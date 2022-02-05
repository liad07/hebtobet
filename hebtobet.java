package com.company;
import java.util.Scanner;

public class hebtobet {
public static String trimpro(String str){
    int y=0;
    str=str.replaceAll(" ","");
    return str;
}
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
int y=0,z=0;
char b;
b='ב';
        String str,str2 = "";
        char ch;
        System.out.println("enter a sentence ");
str=reader.nextLine();
str=trimpro(str);
for (int i=0;i<str.length();i++){
ch=str.charAt(i);

str2+=ch;
str2+=b;
z=str.length();
z-=1;
if (i==z){
    y=str2.lastIndexOf("ב");
//    y-=1;
    str2=str2.substring(0,y);
}
    }
        System.out.println(str2);

    }
}
