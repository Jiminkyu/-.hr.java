package com.my.hr.dao;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.my.hr.dao.map.LaborerMap;
import com.my.hr.domain.Laborer;
import com.my.hr.domain.NoneException;

import config.Configuration;

public class LaborerDaoImpl implements LaborerDao {
	private List<Laborer> laborers;
	private int laborerIdSeq;
	private LaborerMap laborerMap; 
	
	public LaborerDaoImpl() {
		this.laborerMap = Configuration.getMapper(LaborerMap.class);
	}
	
	@Override
	public List<Laborer> selectLaborers(){
		return laborerMap.selectLaborers();
	}
	private Laborer selectLaborer(int laborerId) {
		List<Laborer> list = laborers.stream()
				.filter(laborer -> laborer.laborerId() == laborerId)
				.collect(Collectors.toList());
		
		Laborer laborer = null;
		if(list.size() != 0) laborer = list.get(0);
		
		return laborer;
	}
	
	@Override
	public void insertLaborer(String laborerName, LocalDate hireDate) {
		laborers.add(new Laborer(laborerIdSeq++, laborerName, hireDate));
	}
	
	@Override
	public void updateLaborer(Laborer laborer) {
		this.deleteLaborer(laborer.laborerId());
		laborers.add(laborer);
		laborers.sort(Comparator.comparing(Laborer::laborerId));
	}
	//업무관점에선 laborerId가 키이다.기술적인관점은
//	인덱스이다. 업무적인관점의 키를 중심으로 코딩해야 좋은코드이다.
	@Override
	public void deleteLaborer(int laborerId) throws NoneException {
		Laborer laborer = selectLaborer(laborerId);
		if(laborer != null) laborers.remove(laborer);
		else throw new NoneException("해당 노동자가 없습니다.");
	}
}
