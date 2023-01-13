package com.my.hr.test;

import java.time.LocalDate;

import com.my.hr.dao.WorkerDao;
import com.my.hr.dao.WorkerDaoImpl;
import com.my.hr.domain.Worker;

public class WorkerDaoTest {
	public static void main(String[] args) {
		Worker worker1 = new Worker(1,"가",LocalDate.of(2023,5,20));
		Worker worker2 = new Worker(2,"나",LocalDate.of(2023,6,15));
		Worker worker3 = new Worker(3,"다",LocalDate.of(2023,6,15));
		
		Worker[] workers = new Worker[3];
		WorkerDao workerDao = new WorkerDaoImpl(workers);
		
		workerDao.insertWorker(worker1);
		workerDao.insertWorker(worker2);
		workerDao.insertWorker(worker3);
		
		workers = workerDao.selectWorkers();
	
		for(Worker worker: workers) System.out.println(worker);
	}
}
