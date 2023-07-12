/** A class that stores information about an order of potentially multiple pizzas.
 * Includes private member variables for the order. 
 * The pizzas in the order and how many pizzas in the order.
 * Includes methods involving the order.
 * @author Gabriella (Gabi) Bekhrad
 * @version 1.0
 */

public class PizzaOrder {
    /**  A private member variable which is an array of base type Pizza. 
     * Each pizza saved in this array is a Pizza object. */
    private Pizza[] m_order;
    /** A private member variable which tells how many Pizzas are in the order. */
    private int m_numPizzas;

    /** Default constructor which defaults to an order of a single medium cheese Pizza */
    public PizzaOrder() {
        this.m_numPizzas = 0;
        this.m_order = new Pizza[1];
        this.m_order[0] = new Pizza();
    }

    /** Overloaded constructor that tells how many pizzas will be added to the order
     * initializes the order instance variable to an empty array of that size 
     * @param numPizzas number of pizzas that will be added to the order
    */
    public PizzaOrder(int numPizzas){
        this.m_numPizzas = numPizzas; 
        Pizza[] pizzaArray = new Pizza[numPizzas];
        m_order = pizzaArray;
    }

    /** Method that adds a pizza to the order
     * @param pizza The pizza that the user passes in to add to the order
     * @return 1 if adding to the order is successful (the order is not full already), 
     * -1 if adding to the order is unsuccessful (the order is full)
     */
    public int addPizza(Pizza pizza){
        for (int i = 0; i < m_order.length; i++){
            if (m_order[i] != null){ // if the index is already in use  
                continue; // pass
            } else if (m_order[i] == null) { // if its a free index
                this.m_order[i] = pizza; // set the index to the pizza
                return 1; // and return 1
            }
        }
        return -1; // if it loops and all are full, return -1
    }

    /** method that calculates total cost of the pizza order 
     * @return total cost of all pizzas
     */
    public double calcTotal(){
        double totalCost = 0.0; 
        for (int i = 0; i < this.m_order.length; i++){
            if (this.m_order[i] == null){
                continue;
            } else {
                totalCost += this.m_order[i].calcCost(); // add all costs together
            }
        }
        return totalCost; 
    }

    /** the textual representation of a pizzaOrder includes
    * all private member variables/Pizzas formatted to include/return info on PizzaOrder
    * @return a String containing the Pizzas and total cost of the order 
    */
    public String toString(){
        return "There are " + m_numPizzas + " in the order that costs $"
        + calcTotal() + ".";
    }
}
