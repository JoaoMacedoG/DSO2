package entities;

import entities.Curriculo;
import entities.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-05-22T21:05:10")
@StaticMetamodel(Vagas.class)
public class Vagas_ { 

    public static volatile SingularAttribute<Vagas, Integer> codVagas;
    public static volatile SingularAttribute<Vagas, String> localTrab;
    public static volatile SingularAttribute<Vagas, String> area;
    public static volatile SingularAttribute<Vagas, Curriculo> codCurriculo;
    public static volatile SingularAttribute<Vagas, String> requisitos;
    public static volatile SingularAttribute<Vagas, String> horario;
    public static volatile SingularAttribute<Vagas, Integer> salario;
    public static volatile SingularAttribute<Vagas, Usuario> idUsuario;
    public static volatile SingularAttribute<Vagas, String> empresa;

}