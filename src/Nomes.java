public class Nomes implements Comparable<Nomes> {

    private String nome;
    private String sexo;

    public Nomes(String nomeSexo) {
        String[] partes = nomeSexo.split("-");
        this.nome = partes[0];
        this.sexo = partes[1];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return nome;
    }

    @Override
    public int compareTo(Nomes nomes) {
        return this.nome.compareTo(nomes.getNome());
    }
}
