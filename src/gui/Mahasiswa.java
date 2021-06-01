package gui;

public class Mahasiswa {
    private String nama;
    private String nim;
    private String getJenisKelamin;
    private String getJenjang;
    private String getTahun;
    private String getFakultas;
    private String getProdi;
    private String getNomorUrut;

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


    public Mahasiswa() {
    }

    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {

        this.nama = nama;
    }

    public String getNim() {

        return nim;
    }

    public void setNim(String nim) {

        this.nim = nim;
    }

    public String getJenjang(){
        if(nim.charAt(0)=='1'){
            return Jenjang = S1;
        }else if(nim.charAt(0)=='2'){
            return Jenjang = S2;
        }else if(nim.charAt(0)=='3'){
            return Jenjang = S3;
        }
        return "UNKNOWN";
    }
    public void setGetJenjang(){

        this.getJenjang = getJenjang;
    }

    public String getTahun(){
        Tahun = nim.substring(1,3);
        return "20"+Tahun;
    }
    public void setGetTahun(){

        this.getTahun = getTahun;
    }

    public String getFakultas(){
        if(nim.charAt(3)=='1'){
            return fakultas = f1;
        }else if(nim.charAt(3)=='2'){
            return fakultas = f2;
        }else if(nim.charAt(3)=='3'){
            return fakultas = f3;
        }else if(nim.charAt(3)=='4'){
            return fakultas = f4;
        }else if(nim.charAt(3)=='5'){
            return fakultas = f5;
        }else if(nim.charAt(3)=='6'){
            return fakultas = f6;
        }else if(nim.charAt(3)=='7'){
            return fakultas = f7;
        }else if(nim.charAt(3)=='8'){
            return fakultas = f8;
        }
        return "UNKNOWN";
    }
    public void setGetFakultas(String getFakultas) {

        this.getFakultas = getFakultas;
    }
    public String getProdi(){
        if(nim.charAt(5)=='1'){
            return prodi = p1;
        }else if(nim.charAt(6)=='2'){
            return prodi = p2;
        }else if(nim.charAt(6)=='3'){
            return prodi = p3;
        }else if(nim.charAt(6)=='4'){
            return prodi = p4;
        }else if (nim.charAt(6)=='5'){
            return prodi = p5;
        }
        return "UNKNOWN";
    }
    public void setGetProdi(String getProdi) {

        this.getProdi = getProdi;
    }
    public String getJenisKelamin(){
        if(nim.charAt(6) == '1'){
            return "Laki-laki";
        }else if(nim.charAt(6) == '2'){
            return "Perempuan";
        }
        return "UNKNOWN";
    }
    public void setGetJenisKelamin(String getJenisKelamin) {
        this.getJenisKelamin = getJenisKelamin;
    }
    public String getNomorUrut() {
        NoMhs = nim.substring(7);
        return NoMhs;
    }

    public void setGetNomorUrut(String getNomorUrut) {
        this.getNomorUrut = getNomorUrut;
    }

    @Override
    public String toString() {
        return "Mahasiswa";

    }
}






