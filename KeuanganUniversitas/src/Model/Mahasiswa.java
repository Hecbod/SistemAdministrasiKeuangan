package Model;

public class Mahasiswa {
    private String idMahasiswa;
    private String idFakultas;
    private String namaMahasiswa;
    private String password;

    public Mahasiswa(String idMahasiswa, String idFakultas, String namaMahasiswa, String password) {
        this.idMahasiswa = idMahasiswa;
        this.idFakultas = idFakultas;
        this.namaMahasiswa = namaMahasiswa;
        this.password = password;
    }

    public String getIdMahasiswa() {
        return idMahasiswa;
    }

    public void setIdMahasiswa(String idMahasiswa) {
        this.idMahasiswa = idMahasiswa;
    }

    public String getIdFakultas() {
        return idFakultas;
    }

    public void setIdFakultas(String idFakultas) {
        this.idFakultas = idFakultas;
    }

    public String getNamaMahasiswa() {
        return namaMahasiswa;
    }

    public void setNamaMahasiswa(String namaMahasiswa) {
        this.namaMahasiswa = namaMahasiswa;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }    
}
