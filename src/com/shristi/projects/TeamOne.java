package com.shristi.projects;

public class TeamOne extends Project{

	@Override
	void doTask() {
		// TODO Auto-generated method stub
		super.doTask();
		System.out.println("Project implemented using Java");
	}
	void softwaresUsed(String... tools){
		int i=0;
		for(String v:tools) {
			System.out.println(v);
		}
		
	}
	

	
}
