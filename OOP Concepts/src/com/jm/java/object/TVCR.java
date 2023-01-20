package com.jm.java.object;

public class TVCR extends Tv5 {
	
	VCR vcr = new VCR();		// VCR 클래스를 포함시켜서 사용
	
	void play() {
		vcr.play();				// VCR 클래스에 있는 메서드를 호출
	}
	
	void stop() {
		vcr.stop();
	}
	
	void rew() {
		vcr.rew();
	}
	
	void ff() {
		vcr.ff();
	}
}


class Tv5 {
	boolean power;
	int channel;
	
	void power() { power = !power; }
	void channelUp() { ++channel; }
	void channelDown() { --channel; }
}


class VCR {
	boolean power;
	
	void power() { power = !power; }
	void play() { /* 내용 생략 */ }
	void stop() { /* 내용 생략 */ }
	void rew()  { /* 내용 생략 */ }
	void ff()   { /* 내용 생략 */ }
}