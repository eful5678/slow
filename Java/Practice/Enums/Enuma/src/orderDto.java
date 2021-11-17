public class orderDto {

    public static class orderRequest{

        private String name;

        private Integer quantity;

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getQuantity() {
            return this.quantity;
        }

        public void setQuantity(Integer quantity) {
            this.quantity = quantity;
        }
        
        public orderRequest(){

        }

    }
    
}
