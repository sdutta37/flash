package Corona;

public class University {


		String s;
		public void Check(String s) throws CoronaException{
			this.s=s;
			if(s=="p") {
				throw new CoronaException();
			}
			else {
				System.out.println("write exam");
			}
		}
	}


