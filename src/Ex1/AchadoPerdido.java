package Ex1;

import javax.swing.*;

public class AchadoPerdido implements Publicacao {
    private String titulo, descricao, foto, tipo, local_achado, data_hora, status;


    public AchadoPerdido(String titulo, String descricao, String tipo, String status) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.tipo = tipo;
        this.status = status;
    }

    public void completarDados(String foto, String local_achado, String data_hora) {
        this.foto = foto;
        this.local_achado = local_achado;
        this.data_hora = data_hora;

    }

    @Override
    public String buscarTitulo(String titulo) {
        return " Titulo: "+getTitulo()+" Descrição: "+getDescricao()+" Local Achado: "+getLocal_achado();
    }

    @Override
    public void visualizarDetalhes() {
        JOptionPane.showMessageDialog(null,("-Titulo: "+getTitulo()+" -Foto: "+getFoto()+" -Local Achado: "+getLocal_achado()+" -Tipo: "+getTipo()+" -Status: "+getStatus()));
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getLocal_achado() {
        return local_achado;
    }

    public void setLocal_achado(String local_achado) {
        this.local_achado = local_achado;
    }

    public String getData_hora() {
        return data_hora;
    }

    public void setData_hora(String data_hora) {
        this.data_hora = data_hora;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
