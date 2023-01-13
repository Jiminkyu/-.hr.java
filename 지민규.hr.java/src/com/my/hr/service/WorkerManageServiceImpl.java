package com.my.hr.service;

import java.time.LocalDate;

import com.my.hr.dao.WorkerDao;
import com.my.hr.domain.Worker;

public class WorkerManageServiceImpl implements WorkerManageService {
	private WorkerDao workerDao;
	private Worker worker;
	
	public WorkerManageServiceImpl(WorkerDao workerDao) {
		this.workerDao = workerDao;
	}
	
	@Override
	public Worker[] getWorker() {
		return workerDao.selectWorkers();
	}
	
	@Override
	public void addWorker(Worker worker) {
		workerDao.insertWorker(worker);
	}
	
	@Override
	public void fixWorker(String workerName, LocalDate startDate) {
		workerDao.updateWorker(workerName, startDate);
	}
	
	@Override
	public void delWorker(Worker worker) {
		workerDao.deleteWorker(worker);
	}
}
