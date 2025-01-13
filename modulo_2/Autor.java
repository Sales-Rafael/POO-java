public class Autor extends Pessoa {
    private String nacionalidade;
    private Livro[] obrasPublicadas;
    private int contadorObras;

    public Autor(String nome, String nacionalidade) {
        super(nome);
        this.nacionalidade = nacionalidade;
        this.obrasPublicadas = new Livro[20]; 
        this.contadorObras = 0;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public Livro[] getObrasPublicadas() {
        return obrasPublicadas;
    }

    public void adicionarObra(Livro livro) {
        if (contadorObras < obrasPublicadas.length) {
            this.obrasPublicadas[contadorObras] = livro;
            contadorObras++;
        } else {
            System.out.println("Limite de obras publicadas alcançado.");
        }
    }

    public Livro[] getObrasPublicadasPorGenero(String genero) {
        Livro[] obrasPorGenero = new Livro[contadorObras];
        int index = 0;
        for (int i = 0; i < contadorObras; i++) {
            if (obrasPublicadas[i].getGenero().equalsIgnoreCase(genero)) {
                obrasPorGenero[index] = obrasPublicadas[i];
                index++;
            }
        }
        return obrasPorGenero;
    }
}