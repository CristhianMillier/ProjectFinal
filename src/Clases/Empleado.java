package Clases;

public class Empleado {
    private int cod_emp;
    private String nomb_emp;
    private String apell_emp;
    private int dni_emp;
    private int telef_emp;
    private String direc_emp;
    private String sexo_emp;
    private String horario_emp;
    private String cargo_emp;
    private String usuario;
    private String contraseña;

    public Empleado() {
    }

    public Empleado(String nomb_emp, String apell_emp, int dni_emp, int telef_emp, String direc_emp, String sexo_emp, String horario_emp, String cargo_emp, String usuario, String contraseña) {
        this.nomb_emp = nomb_emp;
        this.apell_emp = apell_emp;
        this.dni_emp = dni_emp;
        this.telef_emp = telef_emp;
        this.direc_emp = direc_emp;
        this.sexo_emp = sexo_emp;
        this.horario_emp = horario_emp;
        this.cargo_emp = cargo_emp;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }
   
    public int getCod_emp() {
        return cod_emp;
    }

    public void setCod_emp(int cod_emp) {
        this.cod_emp = cod_emp;
    }

    public String getNomb_emp() {
        return nomb_emp;
    }

    public void setNomb_emp(String nomb_emp) {
        this.nomb_emp = nomb_emp;
    }

    public String getApell_emp() {
        return apell_emp;
    }

    public void setApell_emp(String apell_emp) {
        this.apell_emp = apell_emp;
    }

    public int getDni_emp() {
        return dni_emp;
    }

    public void setDni_emp(int dni_emp) {
        this.dni_emp = dni_emp;
    }

    public int getTelef_emp() {
        return telef_emp;
    }

    public void setTelef_emp(int telef_emp) {
        this.telef_emp = telef_emp;
    }

    public String getDirec_emp() {
        return direc_emp;
    }

    public void setDirec_emp(String direc_emp) {
        this.direc_emp = direc_emp;
    }

    public String getSexo_emp() {
        return sexo_emp;
    }

    public void setSexo_emp(String sexo_emp) {
        this.sexo_emp = sexo_emp;
    }

    public String getHorario_emp() {
        return horario_emp;
    }

    public void setHorario_emp(String horario_emp) {
        this.horario_emp = horario_emp;
    }

    public String getCargo_emp() {
        return cargo_emp;
    }

    public void setCargo_emp(String cargo_emp) {
        this.cargo_emp = cargo_emp;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
}
