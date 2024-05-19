import java.util.Random;

public class Catchrate {
	private int success;
	
	Random random = new Random();
	
	public Catchrate() {
		
	}
	
	public int catchResult(int g, double catchr) {
		if (g == 1) {
			Grade1catch(catchr);
		}
		else if (g == 2) {
			Grade2catch(catchr);
		}
		else if (g == 3) {
			Grade3catch(catchr);
		}
		else if (g == 4) {
			Grade4catch(catchr);
		}
		else if (g == 5) {
			Grade5catch(catchr);
		}
		else if (g == 6) {
			Grade6catch(catchr);
		}
		
		return success;
	}
	
	private void Grade1catch(double catchr) {
		double catchchance = 70 * catchr;
		double catchsuccess = random.nextInt(100) + 1;
		if (catchchance >= catchsuccess) {
			success = 1;
		}
		else if (catchchance <= catchsuccess) {
			success = 0;
		}
	}
	
	private void Grade2catch(double catchr) {
		double catchchance = 55.75 * catchr;
		double catchsuccess = random.nextInt(100) + 1;
		if (catchchance >= catchsuccess) {
			success = 1;
		}
		else if (catchchance <= catchsuccess) {
			success = 0;
		}
	}
	
	private void Grade3catch(double catchr) {
		double catchchance = 40.5 * catchr;
		double catchsuccess = random.nextInt(100) + 1;
		if (catchchance >= catchsuccess) {
			success = 1;
		}
		else if (catchchance <= catchsuccess) {
			success = 0;
		}
	}
	
	private void Grade4catch(double catchr) {
		double catchchance = 20.25 * catchr;
		double catchsuccess = random.nextInt(100) + 1;
		if (catchchance >= catchsuccess) {
			success = 1;
		}
		else if (catchchance <= catchsuccess) {
			success = 0;
		}
	}
	
	private void Grade5catch(double catchr) {
		double catchchance = 2.64 * catchr;
		double catchsuccess = random.nextInt(100) + 1;
		if (catchchance >= catchsuccess) {
			success = 1;
		}
		else if (catchchance <= catchsuccess) {
			success = 0;
		}
	}
	
	private void Grade6catch(double catchr) {
		double catchchance = 1 * catchr;
		double catchsuccess = random.nextInt(100) + 1;
		if (catchchance >= catchsuccess) {
			success = 1;
		}
		else if (catchchance <= catchsuccess) {
			success = 0;
		}
	}

}
