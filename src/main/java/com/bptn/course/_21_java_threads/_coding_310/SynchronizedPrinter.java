package com.bptn.course._21_java_threads._coding_310;

public class SynchronizedPrinter {

	void printNumbers() {

		// Lock the object
		synchronized (this) {
		System.out.println("Inside of the synchronized block.");
			for (int i = 0; i < 5; i++) {
				System.out.println(i + 1);
				try {
					Thread.sleep(500);
				} catch (Exception ex) {
					System.out.println(ex.getMessage());
				}
			}
		}

	}
}
