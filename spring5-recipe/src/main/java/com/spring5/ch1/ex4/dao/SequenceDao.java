package com.spring5.ch1.ex4.dao;

import com.spring5.ch1.ex4.dto.Sequence;

public interface SequenceDao {
	public Sequence getSequence(String sequenceId);
	
	public int getNextValue (String sequenceId);
}
