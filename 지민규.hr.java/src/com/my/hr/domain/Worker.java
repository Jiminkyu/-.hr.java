package com.my.hr.domain;

import java.time.LocalDate;

public class Worker {
	private String workerName;
	private int workerId;
	private LocalDate startDate;
	
	public String getWorkerName() {
		return workerName;
	}

	public void setWorkerName(String workerName) {
		this.workerName = workerName;
	}

	public int getWorkerId() {
		return workerId;
	}

	public void setWorkerId(int workerId) {
		this.workerId = workerId;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	
	public Worker(int workerId, String workerName, LocalDate startDate) {
		this.workerId = workerId;
		this.workerName = workerName;
		this.startDate = startDate;
	}
	
	@Override
	public String toString() {
		return String.format("%5d %5s %5s",
				workerId, workerName, startDate);
	}
}
