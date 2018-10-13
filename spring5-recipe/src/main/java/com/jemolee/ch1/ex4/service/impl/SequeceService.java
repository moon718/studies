package com.jemolee.ch1.ex4.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jemolee.ch1.ex4.dao.SequenceDao;
import com.jemolee.ch1.ex4.dto.Sequence;

@Service
public class SequeceService {
	private final SequenceDao sequnceDao;
	
	@Autowired
	public SequeceService(SequenceDao sequenceDao) {
		this.sequnceDao = sequenceDao;
	}
	
	public String generate(String sequenceId) {
		Sequence sequence = sequnceDao.getSequence(sequenceId);
		int value = sequnceDao.getNextValue(sequenceId);
		
		return sequence.getPrefix() + value + sequence.getSuffix();
	}
}
