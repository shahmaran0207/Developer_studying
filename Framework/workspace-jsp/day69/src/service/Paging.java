package service;

public class Paging {
	private int totalBoard;
	private int boardCount = 10;
	private int reqPage;
	private int offset;
	private int totalPage;
	private int section;
	private int betgin;
	private int end;
	private int pageount=10;

	public Paging(int reqPage, int totalBoard) {
		this.reqPage = reqPage;
		this.totalBoard = totalBoard;

		offset = (reqPage - 1) * boardCount;
		
		totalPage=totalBoard/boardCount;
		totalPage+=(totalBoard % boardCount ==0)? 0:1;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	
	public int getTotalBoard() {
		return totalBoard;
	}

	public void setTotalBoard(int totalBoard) {
		this.totalBoard = totalBoard;
	}

	public int getBoardCount() {
		return boardCount;
	}

	public void setBoardCount(int boardCount) {
		this.boardCount = boardCount;
	}

	public int getReqPage() {
		return reqPage;
	}

	public void setReqPage(int reqPage) {
		this.reqPage = reqPage;
	}

	public int getOffset() {
		return offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}

	public int getSection() {
		return section;
	}

	public void setSection(int section) {
		this.section = section;
	}

	public int getBetgin() {
		return betgin;
	}

	public void setBetgin(int betgin) {
		this.betgin = betgin;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}

	public int getPageount() {
		return pageount;
	}

	public void setPageount(int pageount) {
		this.pageount = pageount;
	}

}
