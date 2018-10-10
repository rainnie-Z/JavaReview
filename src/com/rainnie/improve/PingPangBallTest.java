package com.rainnie.improve;

public class PingPangBallTest {
	public static void main(String[] args) {
		for(char i ='x';i<='z';i++){
		    for(char j ='x';j<='z';j++){
		        if(i!=j) 
		            for(char k = 'x';k<='z';k++){
		                if(i!=k&&j!=k) 
		                    if(i!='x'&&k!='x'&&k!='z') 
		                        System.out.println("a和"+i+"\n"+"b和"+j+"\n"+"c和"+k+"\n");
		            }
		    }
		}
	}
}
