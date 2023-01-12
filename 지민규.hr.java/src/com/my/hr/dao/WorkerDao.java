package com.my.hr.dao;

import java.time.LocalDate;

import com.my.hr.domain.Worker;

public interface WorkerDao {
	public Worker[] selectWorkers();
	public void insertWorker(Worker worker);
	public void updateWorker(String workerName, LocalDate startDate);
	public void deleteWorker(Worker worker);
}
