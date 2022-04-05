package com;

import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) {
	 PriorityQueue<Integer> q=new PriorityQueue<>();
	 
	 for (int i=10;i>0;i--) {
		 q.add(i);
	 }
	 //Queue:(front)10 9 8 7 6 5 4  3 2 1(Rear)
	 //PriorityQueue sorts the data for us
	 //Queue: (Front) 1 2 3 4 5 6 7 8 9 10(Rear) :Sorted Queue the Actual one
	 
	 //Peeking -> Obtaining the head of Queue
	 //Polling -> Remove the head of Queue
	 
	 System.out.println("Queue Size is:"+q.size());
	 System.out.println("Head of Queu is:"+q.peek());//Head of Queue:1
	 
	 q.poll();
	 System.out.println("Queue Size is:"+q.size());
	 System.out.println("Head of Queue is:"+q.peek());

	 
	 
	}

}
