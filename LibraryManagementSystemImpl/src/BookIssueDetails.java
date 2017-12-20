import java.util.Date;

public class BookIssueDetails {

	private int bookNumber;
	private String name;
	private int totalBookAllowed = 2;
	private int noOfBookIssued = 0;
	private Date issueDate;
	private Date returnDate;

	public BookIssueDetails(int bookNumber, String name, int n, Date issueDate) {
		this.bookNumber = bookNumber;
		this.name = name;
		this.noOfBookIssued = n;
		this.issueDate = issueDate;

	}

	public BookIssueDetails() {
		// TODO Auto-generated constructor stub
	}

	public int getBookNumber() {
		return bookNumber;
	}

	public void setBookNumber(int bookNumber) {
		this.bookNumber = bookNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTotalBookAllowed() {
		return totalBookAllowed;
	}

	public void setTotalBookAllowed(int totalBookAllowed) {
		this.totalBookAllowed = totalBookAllowed;
	}

	public int getNoOfBookIssued() {
		return noOfBookIssued;
	}

	public void setNoOfBookIssued(int noOfBookIssued) {
		this.noOfBookIssued = noOfBookIssued;
	}

	public Date getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}

	public Date getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

}
