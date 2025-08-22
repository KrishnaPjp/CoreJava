package AddCoustmor;

    class Customer {
        private String name;
        private int id;

        public Customer(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public String toString()
        {
            return "Customer ID " + id + ", Name " + name;
        }
    }


