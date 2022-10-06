package com.miit.basics;
	
	 class worker{
		void worker_salary(){
			System.out.println(15);
		}
	}
	 class supervisor extends worker{
		void supervisor_salary(){
			System.out.println(20);
		}
	}
	 class HR extends supervisor{
		void hr_salary(){
			System.out.println(28);
		}
	}
	 class Manager extends HR{
		void manager_salary(){
			System.out.println(40);
		}
	}

public class MultiLevelInheritance{
	public static void main(String args[]){

		Manager sal = new Manager();
		sal.worker_salary();
		sal.supervisor_salary();
		sal.hr_salary();
		sal.manager_salary();

	}
}
