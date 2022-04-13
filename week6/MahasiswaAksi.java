package week6;

public class MahasiswaAksi {
    public static void main (String[] args){
        Mahasiswa Budi = new Mahasiswa("A11.2011.00123", "Budi", 3.5, 24, "1999-02-27");
        System.out.println("NIM: " + Budi.nim);
        System.out.println("Nama: " + Budi.nama);
        System.out.println("IPK: " + Budi.ipk);
        System.out.println("SKS: " + Budi.sks);
        System.out.println("Tagihan: Rp." + Budi.getTagihanSks());
        System.out.println("Tanggal Lahir: " + Budi.tglLahir);
        System.out.println("Program Studi: " + Budi.getProgdi("A11"));
        System.out.println("Mahasiswa Semester: " + Budi.getMhsSemester());
        System.out.println("IPK Status: " + Budi.ipkStatus());
        System.out.println("Tahun Masuk: " + Budi.getTahun());
        System.out.println("Umur: " + Budi.getUmur());
    }
}
