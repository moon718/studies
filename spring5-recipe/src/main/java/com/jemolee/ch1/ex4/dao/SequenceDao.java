package com.jemolee.ch1.ex4.dao;

import com.jemolee.ch1.ex4.dto.Sequence;

public interface SequenceDao {
	public Sequence getSequence(String sequenceId);
	
	public int getNextValue (String sequenceId);
}
