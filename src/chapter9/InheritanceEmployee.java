package chapter9;

public class InheritanceEmployee extends InheritancePerson {

    private int eeNumber;
    private String title;

    /*
    Si queremos llamar otro constructor que no sea el default se le tiene
    que especificar con super y el argumento con el que le quiero llamar.
     */
    public InheritanceEmployee(){
        super(41);
        System.out.println("Hello from child");
    }

    /*
    Cuando cambiamos el comportamiento de un metodo pero en relacion son los mismos
    en padre suma.. en hijo multiplica.. se usa el adornador override, no es
    requerido.. pero se recomienda.
     */
    @Override
    public int decirEdad(){
        int valor = 10;
        return valor + 2;
    }

    /*
    Cuando hacemos overload es cuando en padre la funcion con el mismo nombre hace algo
    y en la hija hace otra cosa... son la misma funcion pero se les llama con los argumentos
    dependiendo la funcion

     */

    public void cambiarEdad(String edad){
        System.out.println("edad 2");
    }

    public int getEeNumber() {
        return eeNumber;
    }

    public void setEeNumber(int eeNumber) {
        this.eeNumber = eeNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
