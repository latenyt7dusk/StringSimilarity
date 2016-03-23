/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import info.debatty.java.stringsimilarity.JaroWinkler;
import info.debatty.java.stringsimilarity.NormalizedLevenshtein;
import java.text.DecimalFormat;

/**
 *
 * @author HERU
 */
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DecimalFormat f = new DecimalFormat("#0.00");
        JaroWinkler jw = new JaroWinkler();
        NormalizedLevenshtein l = new NormalizedLevenshtein();
        //System.out.println(l.distance("Bernales, Maxima Marasigan", "Marasigan,Maxima Batula"));
        System.out.println(f.format(100*jw.similarity("Maxima", "Maxima "))+"%");
    }
    
}
