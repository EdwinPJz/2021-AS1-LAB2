package gt.edu.umg.ingenieria.sistemas.as1.Calcular área y perímetro de figura.service;

import java.util.*;

/**
 * 
 */
public interface IPerimeterCalculator {

    /**
     * @param side 
     * @return
     */
    public int square(int side);

    /**
     * @param a 
     * @param b 
     * @param c 
     * @return
     */
    public int triangle(int a, int b, int c);

    /**
     * @param radio 
     * @return
     */
    public float circle(int radio);

}