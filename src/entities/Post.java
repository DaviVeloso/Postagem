package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
    private Date Momento;
    private String tilulo;
    private String comentario;
    private Integer Like;

   private List<Comentarios> Comentarios = new ArrayList<>();

   public Post (){

   }

    public Post(Date momento, String tilulo, String comentario, Integer like) {
        Momento = momento;
        this.tilulo = tilulo;
        this.comentario = comentario;
        Like = like;
    }

    public Date getMomento() {
        return Momento;
    }

    public void setMomento(Date momento) {
        Momento = momento;
    }

    public String getTilulo() {
        return tilulo;
    }

    public void setTilulo(String tilulo) {
        this.tilulo = tilulo;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Integer getLike() {
        return Like;
    }

    public void setLike(Integer like) {
        Like = like;
    }

    public List<entities.Comentarios> getComentarios() {
        return Comentarios;
    }

    public void addComent(Comentarios comentarios){
        Comentarios.add(comentarios);
    }

    public void RemuvComent(Comentarios comentarios){
        Comentarios.remove(comentarios);
    }
}
