public class temps {
    private int heure ;
    private int minute ;
    private int seconde ;
    public temps (int heure ){
        this.heure=heure;
    }

    public temps (int heure , int minute ){
        this.heure=heure;
        this.minute=minute;
    }
    public temps (int heure , int minute , int seconde ){
        this.heure=heure;
        this.minute=minute;
        this.seconde=seconde;
    }

    public temps() {
    }
    public void affiche(){
        System.out.println("Il est "+heure+" heures "+minute+" minutes "+seconde+" secondes ");
    }
}