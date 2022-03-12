package encapsulation.inside;

public class Company {
	/*
	 * deu khai báo là non-static vì có nhiều công ty khác nhau
	 * nên nó có giá trị khác nhau.
	 */
	// ma so tax ai cung co the biet
		public String id;
		// ten cong ty ai cung co the biet
		public String name;
		//thong tin bao hiem thi ca nhan vien và cong ty deu biet
		protected String insurance;
		// quy luong chi co cong ty biet
		private long fund;

}
