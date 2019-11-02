package com.configure.app.appconfig.bean;

import java.util.Arrays;


public class Main {

	public static void main(String[] args) {
		
		/*
		the code below must print
		--------------------
		Racer: Alan
		Average time: 10m
		Best lap: 9m
		       -----
		Racer (winner): Dan
		Average time: 8m
		Best lap: 7m
		       -----
		Racer: Joe
		Average time: 11m
		Best lap: 11m
		--------------------
		*/
		new RaceReport().printRaceReport(Arrays.asList(new RaceData("Alan", Arrays.asList(10, 11, 9, 13)),
				new RaceData("Dan", Arrays.asList(8, 7, 9, 10)), new RaceData("Joe", Arrays.asList(11, 11, 11, 11))));
	}

}
