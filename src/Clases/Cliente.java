package Clases;

public class Cliente {
    private int cod_clie;
    private String nomb_cliet;
    private String apell_cliet;
    private String telef_cliet;
    private String dni_cliet;
    private String sexo_cliet;
    private String direc_cliet;

    public Cliente(String nomb_cliet, String apell_cliet, String telef_cliet, String dni_cliet, String sexo_cliet, String direc_cliet) {
        this.nomb_cliet = nomb_cliet;
        this.apell_cliet = apell_cliet;
        this.telef_cliet = telef_cliet;
        this.dni_cliet = dni_cliet;
        this.sexo_cliet = sexo_cliet;
        this.direc_cliet = direc_cliet;
    }

    public Cliente() {
    }

    public int getCod_clie() {
        return cod_clie;
    }

    public void setCod_clie(int cod_clie) {
        this.cod_clie = cod_clie;
    }

    public String getNomb_cliet() {
        return nomb_cliet;
    }

    public void setNomb_cliet(String nomb_cliet) {
        this.nomb_cliet = nomb_cliet;
    }

    public String getApell_cliet() {
        return apell_cliet;
    }

    public void setApell_cliet(String apell_cliet) {
        this.apell_cliet = apell_cliet;
    }

    public String getTelef_cliet() {
        return telef_cliet;
    }

    public void setTelef_cliet(String telef_cliet) {
        this.telef_cliet = telef_cliet;
    }

    public String getDni_cliet() {
        return dni_cliet;
    }

    public void setDni_cliet(String dni_cliet) {
        this.dni_cliet = dni_cliet;
    }

    public String getSexo_cliet() {
        return sexo_cliet;
    }

    public void setSexo_cliet(String sexo_cliet) {
        this.sexo_cliet = sexo_cliet;
    }

    public String getDirec_cliet() {
        return direc_cliet;
    }

    public void setDirec_cliet(String direc_cliet) {
        this.direc_cliet = direc_cliet;
    }

    @Override
    public String toString() {
        return this.nomb_cliet + " " + this.apell_cliet;
    }
    
}
