/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author David
 */
public class Client {
    private String name;
    private String NID;

    public Client() {
    }

    public Client(String name, String NID) {
        this.name = name;
        this.NID = NID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNID() {
        return NID;
    }

    public void setNID(String NID) {
        this.NID = NID;
    }

    @Override
    public String toString() {
        return "Client{" + "name=" + name + ", NID=" + NID + '}';
    }
}
