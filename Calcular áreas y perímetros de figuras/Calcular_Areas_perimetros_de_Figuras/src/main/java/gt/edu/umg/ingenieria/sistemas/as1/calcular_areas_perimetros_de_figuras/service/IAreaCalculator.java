package gt.edu.umg.ingenieria.sistemas.as1.Calcular área y perímetro de figura.service;

import java.util.*;

/**
 * 
 */
public interface IAreaCalculator {

    /**
     * @param side 
     * @return
     */
    public int square(int side);

    /**
     * @param base 
     * @param altura 
     * @return
     */
    public float triangle(int base, int altura);

    /**
     * @param radio 
     * @return
     */
    public float circle(int radio);

}