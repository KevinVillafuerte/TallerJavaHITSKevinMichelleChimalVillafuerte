package Genericos;

import java.util.ArrayList;
import java.util.List;

public class ServicioGenerico<T extends Identificable<ID>, ID> {
    private List<T> datos = new ArrayList<>();

    /* public ServicioGenerico() {
        datos = new ArrayList<>();
    } */

   /* Buscar elemento por ID */
    public T buscarPorId(ID id){
        for (T elemento : datos) {
            if (elemento.getId().equals(id)) {
                return elemento;
            }            
        }
        return null;
    }
    
    /* Guardar elemento sin duplicarse*/
    public void guardar(T elemento){
        if (buscarPorId(elemento.getId()) != null) {
            System.out.println("Ya existe el elemento con ID: " + elemento.getId());
        }else{
            datos.add(elemento); //agregar elemento a la lista
            System.out.println("Guardado con exito...!!!" + elemento);
        }
    }

    /* Listar todos los Elementos */
    public List<T> listar(){
        return datos;
    }


    /* Actualizar un elemento de datos de acuerdo al ID */
    public boolean actualizar(ID id, T nuevoElemento){
        for(int i = 0; i < datos.size() ; i++){
            if (datos.get(i).getId().equals(id)) { // get(i)obtiene el valor del elemento en la pocision i
                datos.set(i, nuevoElemento);
                System.out.println("Actualizado ID " + id + "con : " + nuevoElemento);
                return true;
            }
        }
        System.out.println("No se encontro el ID " + id + " para actualizar ");
        return false;
    }

    /* Eliminar un elemento con ID */
    public boolean eliminar(ID id){
        for(int i = 0; i < datos.size() ; i++){
            if (datos.get(i).getId().equals(id)) {
                datos.remove(i);
                System.out.println("Eliminado ID: " + id);
                return true;
            }
        }
        System.out.println("No se pudo eliminar, no se encontro el ID " + id);
        return false;
    }
}
