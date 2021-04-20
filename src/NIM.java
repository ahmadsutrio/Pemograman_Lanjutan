
public class NIM {

    public String getNim(){
        return Nim;
    }
    private String Nim;

    String Jenjang="";
    String Tahun;
    String fakultas="";
    String prodi="";
    String NoMhs;
    /* Daftar Jenjang*/
    String S1 = "S1 (SARJANA)";
    String S2 = "S2 (MAGISTER)";
    String S3 = "S3 (DOCTOR)";
    /*Daftar Fakultas Universitas*/
    String f1 = "TARBIYAH DAN KEGURUAN";
    String f2 = "SYARIAH DAN HUKUM";
    String f3 = "USUHULUDDIN";
    String f4 = "DAKWAH DAN KOMUNIKASI";
    String f5 = "SAINS DAN TEKNOLOGI";
    String f6 = "PSIKOLOGI";
    String f7 = "EKONOMI DAN ILMU SOSIAL";
    String f8 = "PERTANIAN DAN PETERNAKAN";
    /*Daftar Prodi Di Sains Dan Teknologi*/
    String p1 = "TEKNIK INFORMATIKA";
    String p2 = "TEKNIK INDUSTRI";
    String p3 = "SYSTEM INFORMASI";
    String p4 = "MATEMATIKA";
    String p5 = "TEKNIK ELEKTRO";


    public void setNim(String Nim) {
        this.Nim = Nim;
    }
    public String getJenjang(){
        if(Nim.charAt(0)=='1'){
            return Jenjang = S1;
        }else if(Nim.charAt(0)=='2'){
            return Jenjang = S2;
        }else if(Nim.charAt(0)=='3'){
            return Jenjang = S3;
        }
        return "UNKNOWN";
    }
    public String getTahun(){
        String Tahun = Nim.substring(1,3);
        return "20"+Tahun;
    }
    public String getFakultas(){
        if(Nim.charAt(3)=='1'){
            return fakultas = f1;
        }else if(Nim.charAt(3)=='2'){
            return fakultas = f2;
        }else if(Nim.charAt(3)=='3'){
            return fakultas = f3;
        }else if(Nim.charAt(3)=='4'){
            return fakultas = f4;
        }else if(Nim.charAt(3)=='5'){
            return fakultas = f5;
        }else if(Nim.charAt(3)=='6'){
            return fakultas = f6;
        }else if(Nim.charAt(3)=='7'){
            return fakultas = f7;
        }else if(Nim.charAt(3)=='8'){
            return fakultas = f8;
        }
        return "UNKNOWN";
    }
    public String getProdi(){
        if(Nim.charAt(5)=='1'){
            return prodi = p1;
        }else if(Nim.charAt(6)=='2'){
            return prodi = p2;
        }else if(Nim.charAt(6)=='3'){
            return prodi = p3;
        }else if(Nim.charAt(6)=='4'){
            return prodi = p4;
        }else if (Nim.charAt(6)=='5'){
            return prodi = p5;
        }
        return "UNKNOWN";
    }
    public String getJenisKelamin(){
        if(Nim.charAt(6) == '1'){
            return "Laki-laki";
        }else if(Nim.charAt(6) == '2'){
            return "Perempuan";
        }
        return "UNKNOWN";
    }
    public String getNomorUrut(){
        String NoMhs = Nim.substring(7);
        return NoMhs;
    }
}
