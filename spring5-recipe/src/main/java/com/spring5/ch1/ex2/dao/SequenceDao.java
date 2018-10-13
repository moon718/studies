package com.spring5.ch1.ex2.dao;

import com.spring5.ch1.ex2.Sequence;

public interface SequenceDao {
	public Sequence getSequence(String sequenceId);
	
	public int getNextValue (String sequenceId);
}
