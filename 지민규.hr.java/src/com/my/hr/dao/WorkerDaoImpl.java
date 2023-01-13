package com.my.hr.dao;

import java.time.LocalDate;
import com.my.hr.domain.Worker;

public class WorkerDaoImpl implements WorkerDao {
	private int cusor;
	private Worker[] workers;
	
	
	public WorkerDaoImpl(Worker[] workers) {
		this.workers = workers;
	}
	@Override
	public Worker[] selectWorkers() {
		return this.workers;
	}
	
	@Override
	public void insertWorker(Worker worker) {
		this.workers[cusor++] = worker;
	}
	
	@Override
	public void updateWorker(String workerName, LocalDate startDate) {
		this.workers[cusor++].setWorkerName(workerName);
		this.workers[cusor++].setStartDate(startDate);
	}
	
	@Override
	public void deleteWorker(Worker worker) {
		this.workers[cusor++] = null;
	}
}
