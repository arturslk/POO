public class Animal {
    private String nome;
    private float comprimento;
    private int nmrdepatas;
    private String cor;
    private String ambiente;
    private float vlcmedia;

    public Animal(String nome, int comprimento, int nmrdepatas, String cor, String ambiente, float vlcmedia) {
        this.nome = nome;
        this.comprimento = comprimento;
        this.nmrdepatas = nmrdepatas;
        this.cor = cor;
        this.ambiente = ambiente;
        this.vlcmedia = vlcmedia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    public int getNmrdepatas() {
        return nmrdepatas;
    }

    public void setNmrdepatas(int nmrdepatas) {
        this.nmrdepatas = nmrdepatas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public float getVlcmedia() {
        return vlcmedia;
    }

    public void setVlcmedia(float vlcmedia) {
        this.vlcmedia = vlcmedia;
    }
}
