public class TestarAnimais {
    public static void main(String[] args) {
        Peixe tubarao = new Peixe("barbatanas e caudas", 0, 300, "cinzento", "mar", 15);
        Mamifero camelo = new Mamifero("Leite", "Camelo", 4, 150, "amarelo", "terra", 2);
        Mamifero ursocanada = new Mamifero("mel", "Urso Canadá", 4, 180, "Vermelho", "Terra", 05);
    }
    System.out.println("TUBARÃO");
    System.out.println(tubarao.getAmbientes);
    System.out.println(tubarao.getCaracteristica);
    System.out.println(tubarao.getNumero_de_patas);
    System.out.println(tubarao.getVelocidade_media);
    System.out.println(tubarao.getCor);
    System.out.println(tubarao.getNome);
    System.out.println(tubarao.getComprimento);

    System.out.println("CAMELO");
    System.out.println(camelo.getAmbientes);
    System.out.println(camelo.getAlimento);
    System.out.println(camelo.getNumero_de_patas);
    System.out.println(camelo.getVelocidade_media);
    System.out.println(camelo.getCor);
    System.out.println(camelo.getNome);
    System.out.println(camelo.getComprimento);

    System.out.println("URSOCANADA");
    System.out.println(camelo.getAmbientes);
    System.out.println(camelo.getAlimento);
    System.out.println(camelo.getNumero_de_patas);
    System.out.println(camelo.getVelocidade_media);
    System.out.println(camelo.getCor);
    System.out.println(camelo.getNome);
    System.out.println(camelo.getComprimento);
    
}
