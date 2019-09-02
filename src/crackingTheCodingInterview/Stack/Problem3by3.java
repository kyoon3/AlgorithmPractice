package crackingTheCodingInterview.Stack;

import java.util.*;

public class Problem3by3 {
		public class SetOfStacks{
			int limit;
			int currentStack;
			int currentStackSize;
			List<Stack<Integer>> StackList = new ArrayList<Stack<Integer>>();
			public SetOfStacks(int limit){
				this.limit = limit;
				this.currentStack = 0;
				this.currentStackSize = 0;
				Stack<Integer> stack = new Stack<Integer>();
				StackList.add(stack);
			}
			public void push(int n){
				if(currentStackSize >= limit){
					Stack<Integer> stack = new Stack<Integer>();
					stack.add(n);
					StackList.add(stack);
					currentStackSize  =  0;
					currentStack++;
				}
				else{
					Stack<Integer> stack = StackList.get(currentStack);
					stack.add(n);
					currentStackSize ++;		
				}
			}
				public int pop(){
					Stack<Integer> stack = StackList.get(currentStack);
					int ans = stack.pop();
					if(currentStackSize != 0){
						currentStackSize--;	
					}
					else{
						if(currentStack != 0) {
						currentStack--;
						currentStackSize = limit;
						}
					}
						
				}
			}
		}

}}
