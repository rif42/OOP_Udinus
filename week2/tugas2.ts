//how to run typescript
//download and install nodejs
//npm install -g typescript
//npm install -g ts-node
//open vscode, install code runner extension
//click the play button on top right corner

//RifkyAriyaPratama - A11.2020.12628

class Sepeda {

    constructor(
        public jumlahRoda: number,
        public jenis: string,
        public merk: string){
            console.log("sepeda berjenis " + jenis + " bermerek " + merk + " memiliki jumlah roda " + jumlahRoda)
    }

    public gear : number = 5;

    ngerem() {
        console.log("sepeda direm");
    }
}

class AksiSepeda {
    public static main (args : string){
        const sepedaBayi = new Sepeda(3, "Sepeda Bayi", "Wimcycle");
        const gearSepeda : number = sepedaBayi.gear;
        console.log("jumlah gear " + gearSepeda);
        sepedaBayi.ngerem();
    }
}

class Lampu {

    constructor(
        public warna: string,
        public jenis: string,
        public state: boolean,){
            console.log(`lampu berwarna ${warna} berjenis ${jenis} sekarang sedang ${state ? "menyala" : "mati"}`)}

    nyalakanLampu(){
        if (this.state = false){
            this.state = true;
            console.log(`${this.jenis} dinyalakan`);
        } else {
            console.log(`${this.jenis} sudah menyala`);
        }
    }

    matikanLampu(){
        if (this.state = true){
            this.state = false
            console.log(`${this.jenis} dimatikan`);
        } else {
            console.log(`${this.jenis} sudah mati`);
        }
    }
}

AksiSepeda.main('test');
const lampubaru = new Lampu("merah", "lampu tidur", false);
lampubaru.nyalakanLampu();
lampubaru.matikanLampu();