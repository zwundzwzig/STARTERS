package college;

class StudentWorker implements Work, Student {
	
}

public class InterfaceTest extends StudentWorker implements Student, Work {

	public static void main(String[] args) {
		StudentWorker studentWorker = new StudentWorker();
		Work worker = new StudentWorker();
//		worker.work();
//		worker.lunch();
		Student student = new StudentWorker();
//		student.study();
//		student.lunch();
	}

}
