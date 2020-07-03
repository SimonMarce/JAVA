/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trab;

/**
 *
 * @author
 */
public class AlocaRegistro {

    private String Nome;
    private String Email;
    private String TopicoAjuda;
    private String Descricao;
    private static String Tnome;
    private static String Temail;
    private static String Ttopico;
    private static String Tdescricao;

    /**
     * @return the Nome
     */
    public String getNome() {
        return Nome;
    }

    /**
     * @param Nome the Nome to set
     */
    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    /**
     * @return the Email
     */
    public String getEmail() {
        return Email;
    }

    /**
     * @param Email the Email to set
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * @return the TopicoAjuda
     */
    public String getTopicoAjuda() {
        return TopicoAjuda;
    }

    /**
     * @param TopicoAjuda the TopicoAjuda to set
     */
    public void setTopicoAjuda(String TopicoAjuda) {
        this.TopicoAjuda = TopicoAjuda;
    }

    /**
     * @return the Descricao
     */
    public String getDescricao() {
        return Descricao;
    }

    /**
     * @param Descricao the Descricao to set
     */
    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public void ValRegistro(String nome, String email, String topico, String chamado) {
        this.Tnome = nome;
        this.Temail = email;
        this.Ttopico = topico;
        this.Tdescricao = chamado;
    }

    public String getTnome() {
        return Tnome;
    }

    public String getTemail() {
        return Temail;
    }

    public String getTtopico() {
        return Ttopico;
    }

    public String getTdescricao() {
        return Tdescricao;
    }

}
