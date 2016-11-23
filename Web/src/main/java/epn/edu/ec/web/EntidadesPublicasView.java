/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epn.edu.ec.web;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author ezamora
 */
@ViewScoped
@ManagedBean
public class EntidadesPublicasView implements Serializable {


    private List<String> entidadesPublicasList;
    
    @PostConstruct
    public void init() {
        entidadesPublicasList = new ArrayList<>();
        entidadesPublicasList.add("1 elemento");
    }

    public List<String> getEntidadesPublicasList() {
        return entidadesPublicasList;
    }

    public void setEntidadesPublicasList(List<String> entidadesPublicasList) {
        this.entidadesPublicasList = entidadesPublicasList;
    }
}