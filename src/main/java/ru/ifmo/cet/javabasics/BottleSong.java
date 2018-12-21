package ru.ifmo.cet.javabasics;
import java.util.HashMap;
/**
 * Нужно реализовать констурктор и метод, возвращающий слова песни про бутылки на стене.
 * <p>
 * Слова следующие:
 * <p>
 * 99 bottles of beer on the wall, 99 bottles of beer
 * Take one down, pass it around, 98 bottles of beer
 * 98 bottles of beer on the wall, 98 bottles of beer
 * Take one down, pass it around, 97 bottles of beer
 * 97 bottles of beer on the wall, 97 bottles of beer
 * Take one down, pass it around, 96 bottles of beer
 * 96 bottles of beer on the wall, 96 bottles of beer
 * Take one down, pass it around, 95 bottles of beer
 * 95 bottles of beer on the wall, 95 bottles of beer
 * ...
 * <p>
 * 3 bottles of beer on the wall, 3 bottles of beer
 * Take one down, pass it around, 2 bottles of beer
 * 2 bottles of beer on the wall, 2 bottles of beer
 * Take one down, pass it around, 1 bottles of beer
 * 1 bottle of beer on the wall, 1 bottle of beer
 * Take one down, pass it around, no more bottles of beer on the wall
 * No more bottles of beer on the wall, no more bottles of beer
 * Go to the store and buy some more, 99 bottles of beer on the wall
 * <p>
 * Дело усложняется тем, что текст песни переменный:
 * За раз может быть взято несколько бутылок.
 * Значение передается в качестве параметра конструктора
 * Нужно ограничить возможность взятия бутылок натуральным число не более 99 бутылок за раз.
 */
public class BottleSong {
    public int b;
    public int Bottles;
    private HashMap<Integer, String> word = new HashMap<>();

    public BottleSong(int b) {
    Bottles=99;
    this.b=b;
    if((b>99)||(b<1)){
        throw new IllegalArgumentException();
        }
        word.put(1, "one");
        word.put(2, "two");
        word.put(3, "three");
        word.put(4, "four");
        word.put(5, "five");
        word.put(6, "six");
        word.put(7, "seven");
        word.put(8, "eight");
        word.put(9, "nine");
        word.put(10, "ten");
        word.put(11, "eleven");
        word.put(12, "twelve");
        word.put(13, "thirteen");
        word.put(14, "fourteen");
        word.put(15, "fifteen");
        word.put(16, "sixteen");
        word.put(17, "seventeen");
        word.put(18, "eighteen");
        word.put(19, "nineteen");
        word.put(20, "twenty");
        word.put(30, "thirty");
        word.put(40, "forty");
        word.put(50, "fifty");
        word.put(60, "sixty");
        word.put(70, "seventy");
        word.put(80, "eighty");
        word.put(90, "ninety");
    }
    public String numbers(int b){
        if((b>=21)&&(b%10 != 0)){
            return (word.get((b/10)*10)+" "+word.get(b%10));
        }
        else return word.get(b);
    }
    public String getBottleSongLyrics() {
        String Lyrics="";
        for(int i=99;i>0;i=i-b){
            Lyrics+=i+" bottle";
            if(i>1) Lyrics+="s";
            Lyrics+=" of beer on the wall, ";
            Lyrics+=i+" bottle";
            if(i>1) Lyrics+="s";
            Lyrics+=" of beer.\n";
            Lyrics+="Take ";
            if((i-b)<0){
                b=i;
                Lyrics+=numbers(b);
                Lyrics+=" down and pass around, no more bottles of beer on the wall.\n";
                break;
            }
            else{
                if((i-b)==0){
                    Lyrics+=numbers(b);
                    Lyrics+=" down and pass around, no more bottle";
                    if(i-b!=1) Lyrics+="s ";
                    Lyrics+="of beer on the wall.\n";
                    break;
                }
            }
            Lyrics+=numbers(b);
            Lyrics+=" down and pass around, ";
            Lyrics+=(i-b);
            Lyrics+=" bottle";
            if(i-b!=1) Lyrics+="s";
            Lyrics+=" of beer on the wall.\n";

        }
          Lyrics+="No more bottles of beer on the wall, no more bottles of beer.\n";
          Lyrics+="Go to the store and buy some more, 99 bottles of beer on the wall.\n";

        return Lyrics;
    }
}
