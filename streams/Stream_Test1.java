package capgemini.streams;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

import org.omg.Messaging.SyncScopeHelper;

import capgemini_JAVA.Array;

public class Stream_Test1 {
	public static void main(String[] args) {
		
		//generate int array of 10
		int[] a=new int[10];
		
		//fill it with random numbers between 0-100
		// a[]={1,25,56,32,98,14,58,87,67,8};
		for(int index=0;index<a.length;index++){
		 a[index]=(int)(Math.random()*100);
		}
		
		//print it
		 for(int index=0;index<a.length;index++){
		System.out.println(a[index]);
		
		}
		
		 System.out.println("Consumer in action...");
		IntConsumer consumer=System.out::print;
		for(int index=0;index<a.length;index++){
			 consumer.accept(a[index]);
			}
		
	}

}
