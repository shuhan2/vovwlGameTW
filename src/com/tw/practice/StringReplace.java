package com.tw.practice;
import java.lang.String;
public class StringReplace {

    public String Replace(String string) {

        int num = 0, count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (math(string.charAt(i))) {
                num++;
                count++;
                while (i < string.length()-1 && math(string.charAt(i + 1))) {
                    num++;
                    i++;
                }
            }
        }
        if(num*1.0/string.length()>0.3){
            int size = string.length()+count*5-num;
            char[] ch=new char[size];
            int temp1=string.length()-1,temp2=size-1;
            while(temp1>=0&&temp2>=0){
                if(math(string.charAt(temp1))){
                    ch[temp2--]='y';
                    ch[temp2--]='m';
                    ch[temp2--]='m';
                    ch[temp2--]='o';
                    ch[temp2--]='m';
                    temp1--;
                    while(temp1>=0&&math(string.charAt(temp1))){
                        temp1--;
                    }
                }else{
                    ch[temp2--]=string.charAt(temp1--);
                }
            }
            string=new String(ch);
        }
        return string;
    }


    public  boolean math(char c){
        c=Character.toLowerCase(c);
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
            return true;
        }
        return false;
    }
}
