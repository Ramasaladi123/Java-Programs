//24. Go to the previous classes and override equals(), toString(), hashCode().
public class PreClsOverride {
        private int id;
        private String name;
        public PreClsOverride(int id, String name) {
            this.id = id;
            this.name = name;
        }
        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null || getClass() != obj.getClass()) 
                return false; 
            PreClsOverride product = (PreClsOverride) obj;
            return id == product.id && name.equals(product.name);
        }
        @Override
        public int hashCode() {
            return id + name.hashCode();
        }
        @Override
        public String toString() {
            return "Product{id=" + id + ", name='" + name + "'}";
        }
        public int getId() {
            return id;
        }
    
        public void setId(int id) {
            this.id = id;
        }
    
        public String getName() {
            return name;
        }
    
        public void setName(String name) {
            this.name = name;
        }
        public static void main(String[] args) {
            PreClsOverride product1 = new PreClsOverride(1, "Laptop");
            PreClsOverride product2 = new PreClsOverride(1, "Laptop");
            PreClsOverride product3 = new PreClsOverride(2, "Phone");
    
            System.out.println("Product 1: " + product1); 
            System.out.println("Product 2: " + product2); 
            System.out.println("Product 3: " + product3); 
    
            System.out.println("Product 1 equals Product 2? " + product1.equals(product2)); 
            System.out.println("Product 1 equals Product 3? " + product1.equals(product3));
    
            System.out.println("Product 1 hashCode: " + product1.hashCode());
            System.out.println("Product 2 hashCode: " + product2.hashCode());
            System.out.println("Product 3 hashCode: " + product3.hashCode());
        }
    }
    

