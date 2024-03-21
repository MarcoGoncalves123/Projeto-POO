public class UtilizadorOcasional {

    private String codigo_utilizador;
    private String nome;
    private String morada;
    private String email;
    private int frequencia_cardiaca;

    //Calorias
    //Registo de atividades realizadas
    //Plano de treino

    /**Construtor por omissão*/
    public UtilizadorOcasional(){
        this.codigo_utilizador = null;
        this.nome = null;
        this.morada = null;
        this.email = null;
        this.frequencia_cardiaca = 0;
    }

    /**Construtor parametrizado*/
    public UtilizadorOcasional(String codigo_utilizador, String nome, String morada,
                               String email, int frequencia_cardiaca){
        this.codigo_utilizador = codigo_utilizador;
        this.nome = nome;
        this.morada = morada;
        this.email = email;
        this.frequencia_cardiaca = frequencia_cardiaca;
    }

    /**Construtor de cópia*/
   public UtilizadorOcasional(UtilizadorOcasional user){
       this.codigo_utilizador = user.getCodigo_utilizador();
       this.nome = user.getNome();
       this.morada = user.getMorada();
       this.email = user.getEmail();
       this.frequencia_cardiaca = user.getFrequencia_cardiaca();
   }

    /**----------------------------------------Getters----------------------------------------*/
    public String getCodigo_utilizador(){return this.codigo_utilizador;}
    public String getNome(){return this.nome;}
    public String getMorada(){return this.morada;}
    public String getEmail(){return this.email;}
    public int getFrequencia_cardiaca() {return this.frequencia_cardiaca;}

    /**----------------------------------------Setters----------------------------------------*/
    public void setCodigo_utilizador(String codigo_utilizador){this.codigo_utilizador = codigo_utilizador;}
    public void setNome(String nome){this.nome = nome;}
    public void setMorada(String morada){this.morada = morada;}
    public void setEmail(String email){this.email = email;}
    public void setFrequencia_cardiaca(int frequencia_cardiaca) {this.frequencia_cardiaca = frequencia_cardiaca;}

    /**----------------------------------------Funções Auxiliares----------------------------------------*/
    public boolean equals(Object obj) {
        if(this == obj){return true;}
        if(obj == null || obj.getClass() != this.getClass()) {return false;}
        UtilizadorOcasional user = (UtilizadorOcasional) obj;
        return (this.codigo_utilizador.equals(getCodigo_utilizador()) && this.nome.equals(user.getNome()) && this.morada.equals(user.getMorada()) &&
                this.email.equals(user.getEmail()) && this.frequencia_cardiaca == user.getFrequencia_cardiaca());
    }

  public String toString() {
       return "Código de utilizador -> "+ this.codigo_utilizador + "\nNome -> "+ this.nome + "\nMorada -> " + this.morada +
               "\nEmail ->  " + this.email + "\nFrequência cardíaca média -> " + this.frequencia_cardiaca;
    }

    public  UtilizadorOcasional clone_utilizador_ocasional(){
        return new UtilizadorOcasional(this);
    }
}
