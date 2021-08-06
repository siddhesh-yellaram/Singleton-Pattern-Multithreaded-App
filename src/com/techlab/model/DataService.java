package com.techlab.model;

public class DataService {
	static DataService bucket;

	public static DataService getInstance() {
		if (bucket == null) {
			bucket = new DataService();
		}
		return bucket;
	}
}
