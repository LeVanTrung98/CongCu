/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myframe2;

/**
 *
 * @author Trung Le
 */
public class SinhVien {
    public String hoten,lop,masv;
    public float diemtb;
    
    public SinhVien(String masv, String hoten, String lop, float diemtb){
        this.masv=masv;
        this.hoten=hoten;
        this.lop=lop;
        this.diemtb=diemtb;
    }
    
    
    public void DoiTen(String ten){
        this.hoten=ten;
    }
    public void DoiDiem(float diem){
        this.diemtb = diem;
    }
    public void DoiLop(String lop){
        this.lop=lop;
    }
}
