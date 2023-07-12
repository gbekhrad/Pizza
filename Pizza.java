/** A class that stores information about a single pizza.
 * Includes private member variables for the pizza. 
 * The size (either small, medium, or large), amount of cheese, pepperoni, and veggies.
 * Includes methods involving the pizza.
 * @author Gabriella (Gabi) Bekhrad
 * @version 1.0
 */

public class Pizza {

   /** Stores size of the pizza, either “small”, “medium”, or “large" */
   private String m_size;
   /** Stores the number of cheese, pepperoni, and veggie toppings. */
   private int m_cheese; 
   private int m_pepperoni; 
   private int m_veggie; 
   
   /** The default constructor:
    * creates a medium cheese pizza
    */
   public Pizza(){
      this.m_size = "medium";
      this.m_cheese = 1;
      this.m_pepperoni = 0; 
      this.m_veggie = 0;
   }

   /** The overloaded constructor:
    * sets all member variables for Pizza to be created
    * @param m_size the String representation of the size of the pizza
    * @param m_cheese the integer amount of cheese of the pizza
    * @param m_pepperoni the integer amount of pepperoni of the pizza
    * @param m_veggie the integer amount of veggies of the pizza
    */
   public Pizza(String m_size, int m_cheese, int m_pepperoni, int m_veggie){
      this.m_size = m_size;
      this.m_cheese = m_cheese;
      this.m_pepperoni = m_pepperoni; 
      this.m_veggie = m_veggie;
   }

   /** Copy constructor: creates a duplicate Pizza object
    * all deep copies, therefore having their own references 
    * @param pizzaToCopy Pizza Object of which to duplicate
    */
   public Pizza(Pizza pizzaToCopy){
      this.m_size = pizzaToCopy.m_size;
      this.m_cheese = pizzaToCopy.m_cheese;
      this.m_pepperoni = pizzaToCopy.m_pepperoni; 
      this.m_veggie = pizzaToCopy.m_veggie;
   }

   // ~~~~~~~~~~~~~~~~ Start of accesors and mutators ~~~~~~~~~~~~~~~~

   /** Accessor for the String representation of the Pizza size
    * @return the String representation of the Pizza's size
    */
   public String getSize() {
      return this.m_size;
   }

   /** Mutator for the String representation of the Pizza size
    * @param newSize the new String representation of the size
    */
   public void setSize(String newSize) {
      this.m_size = newSize;
   }

   /** Accessor for the int representation of the Pizza amount of cheese
    * @return the int representation of the Pizza's amount of cheese
    */
   public int getCheese() {
      return this.m_cheese;
   }

   /** Mutator for the int representation of the Pizza amount of cheese
    * @param newCheese the new int representation of the cheese
    */
   public void setCheese(int newCheese) {
      this.m_cheese = newCheese;
   }
   
   /** Accessor for the int representation of the Pizza amount of pepperoni
    * @return the int representation of the Pizza's amount of pepperoni
    */
   public int getPepperoni() {
      return this.m_pepperoni;
   }

   /** Mutator for the int representation of the Pizza amount of pepperoni
    * @param newPepperoni the new int representation of the amount of pepperoni
    */
   public void setPepperoni(int newPepperoni) {
      this.m_pepperoni = newPepperoni;
   }

   /** Accessor for the int representation of the Pizza amount of veggies
    * @return the int representation of the Pizza's amount of veggies
    */
   public int getVeggie() {
      return this.m_veggie;
   }

   /** Mutator for the int representation of the Pizza amount of veggies
    * @param newVeggie the new int representation of the amount of veggies
    */
   public void setVeggie(int newVeggie) {
      this.m_veggie = newVeggie;
   }

   // ~~~~~~~~~~~~~~~~ End of accesors and mutators ~~~~~~~~~~~~~~~~

   /** Public method that calculates the cost of the pizza
    * Cost is determined by the following calculations:
    *    Small: $10 + $2 per topping 
	 *    Medium: $12 + $2 per topping 
	 *    Large: $14 + $2 per topping 
    * @return double of the cost of the pizza
    */
   public double calcCost(){
      double pizzaCost = 0.0; // this double temporarily stores a value of 0 for the cost
      int totalToppings = (m_cheese + m_pepperoni + m_veggie); // stores total number of toppings

      if (m_size.equals("small")){
         pizzaCost += 10 + (2 * totalToppings); 
      } else if (m_size.equals("medium")){
         pizzaCost += 12 + (2 * totalToppings);
      } else if (m_size.equals("large")){
         pizzaCost += 14 + (2 * totalToppings);
      } // new value of pizzaCost based on mentioned calculations
      
      return pizzaCost; 
   }

   /** the textual representation of a Pizza includes
    * all private member variables formatted to include/return info on Pizza
    * @return a String containing pizza size, quantity of each toppings, and cost using calcCost() method
    */
   public String toString() {
      return "\nThe pizza is a size " + this.m_size  
      + " with " + this.m_cheese + " cheese, "
      + this.m_pepperoni + " pepperoni, and "
      + this.m_veggie + " veggie(s). " 
      + "\nThe total cost is $" + calcCost() + ".";
   }

   /** the equals() method compares 2 objects and determines its equality
    * the method determines equality if they are the same size and same number of each topping
    * @return a boolean, true if equal, false if not
    * @param p the passed in Pizza with which to compare the other Pizza
   */
   public boolean equals(Pizza p){
      if (p.getSize().equals(this.getSize()) && (p.getCheese() == this.getCheese()) && 
      (p.getPepperoni() == this.getPepperoni()) && (p.getVeggie() == this.getVeggie())){ 
         // if the sizes and num of each toppings equal
         return true;
      } else { // if they do not equal
         return false;
      }
   }  
}
