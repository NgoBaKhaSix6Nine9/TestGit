package Model;

import java.util.ArrayList;

public class QLSVmodel {
	private ArrayList<SinhVien> dssinhvien;
	
	public QLSVmodel()
	{
		this.dssinhvien=new ArrayList<SinhVien>();
	}
	public QLSVmodel(ArrayList<SinhVien> dssinhvien)
	{
		this.dssinhvien=dssinhvien;
	}
	public ArrayList<SinhVien> getDssinhvien() {
		return dssinhvien;
	}
	public void setDssinhvien(ArrayList<SinhVien> dssinhvien) {
		this.dssinhvien = dssinhvien;
	}
	
	public void insertsv(SinhVien sv)
	{
		this.dssinhvien.add(sv);
	}
	public void removesv(SinhVien sv)
	{
		this.dssinhvien.remove(sv);
	}
	public void updatesv(SinhVien sv)
	{
		this.dssinhvien.remove(sv);
		this.dssinhvien.add(sv);
	}
}
