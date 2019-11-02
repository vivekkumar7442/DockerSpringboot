package com.configure.app.appconfig.bean;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * this class is used to generate race report
 * @author vivek
 *
 */
public class RaceReport {

	
	/**
	 * this method is used to print race details such as Racer details,Average time,Best lap
	 * @author vivek
	 * @param raceData
	 */
	public void printRaceReport(List<RaceData> raceData) {
		System.out.print("--------------------\n");

		String winner = getWinner(raceData);

		raceData.stream().forEach(r -> {
			System.out.print("Racer" + (r.getRacer().equals(winner) ? " (winner)" : "") + ": " + r.getRacer() + "\n");
			System.out.print("Average time: " + getAverageTime(r.getLapsTime()) + "m\n");
			System.out.print("Best lap: " + getBestLapTime(r.getLapsTime()) + "m\n");
			System.out.print("       -----         \n");

		});
	}
	
	/**
	 * used to get the winner name
	 * 
	 * @author vivek
	 * @param raceData
	 * @return winner name
	 */
	private String getWinner(List<RaceData> raceData) {
		Map<String, Integer> map = new HashMap<>();

		raceData.stream().forEach(race -> {
			map.put(race.getRacer(), race.getLapsTime().stream().mapToInt(time -> time.intValue()).sum());

		});
		return Collections.min(map.entrySet(), Comparator.comparing(Entry::getValue)).getKey();

	}

	/**
	 * used to get the average time
	 * 
	 * @author vivek
	 * @param lapsTime
	 * @return average time
	 */
	private Double getAverageTime(List<Integer> lapsTime) {

		return (Double) lapsTime.stream().mapToDouble(time -> time).average().getAsDouble();
	}

	/**
	 * used to get the best lap time
	 * 
	 * @author vivek
	 * @param lapsTime
	 * @return best lap time
	 */
	private Integer getBestLapTime(List<Integer> lapsTime) {
		return (Integer) lapsTime.stream().mapToInt(time -> time).min().getAsInt();

	}


}
