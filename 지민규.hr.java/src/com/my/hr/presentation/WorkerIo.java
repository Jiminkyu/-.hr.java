package com.my.hr.presentation;

import com.my.hr.service.WorkerManageService;

public class WorkerIo {
	private WorkerManageService workerManageService;
	
	public WorkerIo(WorkerManageService workerManageService) {
		this.workerManageService = workerManageService;
	}
	
	public void check() {
		Console.info("1.목록, 2.추가, 3.수정, 4.삭제, 0.종료");
		
	}
}
