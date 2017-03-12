package com.uity.model;

import java.util.List;

public class Output {
	private List<Rollcall> rcList;
	private List<Output> outputList;
	private String outputFromAlgor;

	public List<Rollcall> getRcList() {
		return rcList;
	}

	public void setRcList(List<Rollcall> rcList) {
		this.rcList = rcList;
	}

	public List<Output> getOutputList() {
		return outputList;
	}

	public void setOutputList(List<Output> outputList) {
		this.outputList = outputList;
	}

	public String getOutputFromAlgor() {
		return outputFromAlgor;
	}

	public void setOutputFromAlgor(String outputFromAlgor) {
		this.outputFromAlgor = outputFromAlgor;
	}

}
