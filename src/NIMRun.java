import java.util.Scanner;
public class NIMRun {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("===========Assalamualaikum Wr Wb========");
        System.out.println("=================WELCOME================");
        System.out.println("===============PROGRAM NIM==============");
        System.out.print("\nINPUT NIM =");
        String Nim = input.nextLine();
        NIM objNim = new NIM();
        objNim.setNim(Nim);
        System.out.println("Dari NIM Anda kami mengetahui bahwa :");
        System.out.println("Jenjang Pendidikan = "+objNim.getJenjang());
        System.out.println("Tahun Masuk        = "+objNim.getTahun());
        System.out.println("Fakultas           = "+objNim.getFakultas());
        System.out.println("Jurusan            = "+objNim.getProdi());
        System.out.println("Jenis kelamin      = "+objNim.getJenisKelamin());
        System.out.println("Nomor Urut         = "+objNim.getNomorUrut());


    }

}