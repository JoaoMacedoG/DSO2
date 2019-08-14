package entities;

import entities.Usuario;
import entities.Vagas;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-05-22T21:05:10")
@StaticMetamodel(Curriculo.class)
public class Curriculo_ { 

    public static volatile SingularAttribute<Curriculo, Integer> codCurriculo;
    public static volatile SingularAttribute<Curriculo, String> area;
    public static volatile ListAttribute<Curriculo, Vagas> vagasList;
    public static volatile SingularAttribute<Curriculo, Usuario> idusuarioc;
    public static volatile SingularAttribute<Curriculo, String> formacao;
    public static volatile SingularAttribute<Curriculo, String> experiencia;
    public static volatile SingularAttribute<Curriculo, String> nome;
    public static volatile SingularAttribute<Curriculo, String> empresa;

}