package com.jemolee.ch1.ex4.dao.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.stereotype.Component;

import com.jemolee.ch1.ex4.dao.SequenceDao;
import com.jemolee.ch1.ex4.dto.Sequence;

@Component("SequenceDao")
public class SequenceDaoImpl implements SequenceDao {

	private final Map<String, Sequence> sequences = new HashMap<>();
	private final Map<String, AtomicInteger> values = new HashMap<>();
	
	public SequenceDaoImpl() {
		sequences.put("IT", new Sequence("IT", "30", 10000));
		values.put("IT", new AtomicInteger(10000));
	}
	
	@Override
	public Sequence getSequence(String sequenceId) {
		return sequences.get(sequenceId);
	}

	@Override
	public int getNextValue(String sequenceId) {
		AtomicInteger value = values.get(sequenceId);
		return value.getAndIncrement();
	}

}
