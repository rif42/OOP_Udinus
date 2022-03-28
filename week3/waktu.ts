//rifky ariya pratama
//A11.2020.12628

class Waktu {

    constructor(
        public jam: number,
        public menit: number,
        public detik: number
    ){}

    public Waktu (jam: number, menit: number, detik: number){
        this.jam = jam;
        this.menit = menit;
        this.detik = detik;
    }

    public static main (args : string){
        const waktu_mulai = new Waktu(8, 12, 15);
        const waktu_selesai = new Waktu(12, 34, 55);
        const waktuselisih = Waktu.perbedaan(waktu_mulai, waktu_selesai);
        console.log(`Selisih Waktu : ${waktu_mulai.jam}, ${waktu_mulai.menit}, ${waktu_mulai.detik}`);
        console.log(`Selisih Waktu : ${waktu_selesai.jam}, ${waktu_selesai.menit}, ${waktu_selesai.detik}`);
        console.log(`Selisih Waktu : ${waktuselisih.jam}, ${waktuselisih.menit}, ${waktuselisih.detik}`);
    }

    public static perbedaan(waktu_mulai: Waktu, waktu_selesai: Waktu)
    {
        let waktu_selisih = new Waktu(0, 0, 0);

        // jika detik mulai lebih besar
        // konversi menit selesai ke dalam detik
        // dan tambahkan detik ke detik selesai

        if (waktu_mulai.detik > waktu_selesai.detik)
        {
            --waktu_selesai.menit;
            waktu_selesai.detik += 60;
        }

        waktu_selisih.detik = waktu_selesai.detik - waktu_mulai.detik

        // jika menit mulai lebih besar
        // konversi jam selesai ke dalam menit
        // kemudian tambahkan ke dalam menit selesai 

        if (waktu_mulai.menit > waktu_selesai.menit)
        {
            --waktu_selesai.jam;
            waktu_selesai.menit += 60;
        }

        waktu_selisih.menit = waktu_selesai.menit - waktu_mulai.menit;
        waktu_selisih.jam = waktu_selesai.jam - waktu_mulai.jam;

        return(waktu_selisih);
    }
}

Waktu.main('test');

