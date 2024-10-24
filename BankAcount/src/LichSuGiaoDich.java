import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LichSuGiaoDich {
	 // Lấy thời gian hiện tại dưới dạng chuỗi
    public static String getCurrentDateTime() {
        // Định dạng ngày giờ đúng
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDateTime now = LocalDateTime.now();
        return now.format(formatter);  // Trả về chuỗi ngày giờ hiện tại
    }
    public String type;
    public long tien;
    private String currentMoney; //tien + VND
    public String ngayGio;
    public int  thangdo;
	public LichSuGiaoDich(String type, long tien) {
		// TODO Auto-generated constructor stub
		this.type = type;
		this.tien = tien;
		this.currentMoney = this.tien+" "+"VND";
		this.ngayGio = LichSuGiaoDich.getCurrentDateTime();
		String arg = this.ngayGio;
		String[] argo = arg.split("-");
		this.thangdo = Integer.parseInt(argo[1]);
		
	}

}
