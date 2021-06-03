package TheoryDA;

import java.util.*;
public class InputQuestion {
public static void main(String[] args){
Scanner sc = new Scanner(System.in); while(true) {
try{
int n = sc.nextInt(); if(n < 0)
throw new NegativeException("Input cannot be negative"); else if(n >= 0 && n < 25)
throw new RangeException("Input cannot be in the range of 0 to 25"); else
System.out.println("The input is : " + n); } catch(NegativeException e){
System.out.println(e); } catch(RangeException e){ System.out.println(e);
} catch(Exception e){ System.out.println(e);
 
} }
} }
class NegativeException extends Exception{ NegativeException(String s){
super(s); }
}
class RangeException extends Exception{
RangeException(String s){ super(s);
} }