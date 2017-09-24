package com.hsj.dmeo;

import java.math.BigDecimal;

/**
 * 两个double值比较
 * @Description:TODO
 * @author:hsj qq:2356899074
 * @time:2017年9月24日 下午5:16:26
 */
public class doubleValueCompare {
    public static void main(String[] args) {
		
      		BigDecimal b1 = BigDecimal.valueOf(1.258);
      		
      		BigDecimal b2 = BigDecimal.valueOf(9.17);
      		if(b1.compareTo(b2) == 0){
      			System.out.println("1.258 == 9.17");
      		}
      		
      		BigDecimal b3 = BigDecimal.valueOf(1.2580);
      		if(b1.compareTo(b3) == 0){
      			System.out.println("1.258 == 1.2580");
      		} 
      		
      		BigDecimal b4 = BigDecimal.valueOf(1.258);
      		if(b1.compareTo(b4) == 0){
      			System.out.println("1.258 == 1.258");
      		}
      		
      		BigDecimal b5 = BigDecimal.valueOf(1.25801);
      		if(b1.compareTo(b5) == 0){
      			System.out.println("1.258 == 1.25801");
      		}
	}
}
