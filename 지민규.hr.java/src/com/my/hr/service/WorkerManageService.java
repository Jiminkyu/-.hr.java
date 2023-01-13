package com.my.hr.service;

import java.time.LocalDate;

import com.my.hr.domain.Worker;

public interface WorkerManageService {
	public Worker[] getWorker();
	public void addWorker(Worker worker);
	public void fixWorker(String workername,LocalDate startDate);
	public void delWorker(Worker worker);
}
