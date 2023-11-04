package com.springinaction;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Test;

import com.springinaction.ch01.BraveKnight;
import com.springinaction.ch01.Quest;

public class BraveKnightTest {

	@Test
	public void knightShouldEmbarkOnQuest() {
		Quest mockQuest = mock(Quest.class);
		BraveKnight knight = new BraveKnight(mockQuest);
		knight.embarkOnQuest();
		verify(mockQuest, times(1)).embark();
	}
}
