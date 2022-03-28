//rifky ariya pratama
//A11.2020.12628

class Complex {
    constructor(
        public real: number,
        public imaginary: number,
    ){}

    public Complex (real: number, imaginary: number){
        this.real = real;
        this.imaginary = imaginary;
    }

    public static main (args : string){
        const complex_n1 = new Complex (2.3, 4.5);
        const complex_n2 = new Complex (3.4, 5.0);
        const op = Complex.add(complex_n1, complex_n2);

        console.log(`Sum = ${op.real}, ${op.imaginary}`);

    }

    public static add (complex_n1: Complex, complex_n2: Complex)
    {
        let complex_result = new Complex(0.0, 0.0);

        complex_result.real = complex_n1.real + complex_n2.real;
        complex_result.imaginary = complex_n1.imaginary + complex_n2.imaginary;

        return(complex_result);
    }
}

Complex.main('test');