package subject;

import observer.Observador;
import java.util.ArrayList;
import java.util.List;

public class OfertasCursos {
    private List<Observador> observadores;
    private List<String> cursos;

    public OfertasCursos() {
        this.observadores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }

    public void agregarObservador(Observador o) {
        observadores.add(o);
    }

    public void eliminarObservador(Observador o) {
        observadores.remove(o);
    }

    private void notificarObservadores(String mensaje) {
        for (Observador o : observadores) {
            o.actualizar(mensaje);
        }
    }

    public void agregarCurso(String curso) {
        cursos.add(curso);
        notificarObservadores("Nuevo curso agregado: " + curso);
    }

    public void actualizarCurso(String cursoAnterior, String cursoNuevo) {
        int index = cursos.indexOf(cursoAnterior);
        if (index != -1) {
            cursos.set(index, cursoNuevo);
            notificarObservadores("Curso actualizado: " + cursoAnterior + " → " + cursoNuevo);
        } else {
            System.out.println("Curso no encontrado.");
        }
    }

    public void eliminarCurso(String curso) {
        if (cursos.remove(curso)) {
            notificarObservadores("Curso eliminado: " + curso);
        } else {
            System.out.println("Curso no encontrado.");
        }
    }

    public List<String> getCursos() {
        return cursos;
    }
}
