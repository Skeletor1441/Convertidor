/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tkt;
import java.lang.Integer;
/**
 *
 * @author Lenovo
 */
public class azul {
  public String intToHex(int n)
  {
      return Integer.toHexString(n).toUpperCase();
  }
  public String intToOct(int n){
      return Integer.toOctalString(n);
  }
  public String intToBin(int n)
  {
   return Integer.toBinaryString(n);
  }
}
