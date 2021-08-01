import java.util.Date;

public class Stalls {
	private int stallID;
	private int stallName;
	private Date operationDate;

	public Stalls(int stallID, int stallName, Date operationDate) {
		this.stallID = stallID;
		this.stallName = stallName;
		this.operationDate = operationDate;
	}

	public int getStallID() {
		return stallID;
	}

	public void setStallID(int stallID) {
		this.stallID = stallID;
	}

	public int getStallName() {
		return stallName;
	}

	public void setStallName(int stallName) {
		this.stallName = stallName;
	}

	public Date getOperationDate() {
		return operationDate;
	}

	public void setOperationDate(Date operationDate) {
		this.operationDate = operationDate;
	}
	
	
	
	
}


