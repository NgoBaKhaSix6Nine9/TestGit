package Model;

import java.sql.Date;

public class SinhVien {
	private int masinhvien;
	private String tensinhvien;
	private Tinh quequan;
	private Date ngaysinh;
	private boolean gioitinh;
	private float diemmon1,diemmon2,diemmon3;
	public SinhVien() {
			
	}
	public SinhVien(int masinhvien, String tensinhvien, Tinh quequan, Date ngaysinh, boolean gioitinh, float diemmon1,
			float diemmon2, float diemmon3) {
		
		this.masinhvien = masinhvien;
		this.tensinhvien = tensinhvien;
		this.quequan = quequan;
		this.ngaysinh = ngaysinh;
		this.gioitinh = gioitinh;
		this.diemmon1 = diemmon1;
		this.diemmon2 = diemmon2;
		this.diemmon3 = diemmon3;
	}
	public int getMasinhvien() {
		return masinhvien;
	}
	public void setMasinhvien(int masinhvien) {
		this.masinhvien = masinhvien;
	}
	public String getTensinhvien() {
		return tensinhvien;
	}
	public void setTensinhvien(String tensinhvien) {
		this.tensinhvien = tensinhvien;
	}
	public Tinh getQuequan() {
		return quequan;
	}
	public void setQuequan(Tinh quequan) {
		this.quequan = quequan;
	}
	public Date getNgaysinh() {
		return ngaysinh;
	}
	public void setNgaysinh(Date ngaysinh) {
		this.ngaysinh = ngaysinh;
	}
	public boolean isGioitinh() {
		return gioitinh;
	}
	public void setGioitinh(boolean gioitinh) {
		this.gioitinh = gioitinh;
	}
	public float getDiemmon1() {
		return diemmon1;
	}
	public void setDiemmon1(float diemmon1) {
		this.diemmon1 = diemmon1;
	}
	public float getDiemmon2() {
		return diemmon2;
	}
	public void setDiemmon2(float diemmon2) {
		this.diemmon2 = diemmon2;
	}
	public float getDiemmon3() {
		return diemmon3;
	}
	public void setDiemmon3(float diemmon3) {
		this.diemmon3 = diemmon3;
	}
	
	
}
