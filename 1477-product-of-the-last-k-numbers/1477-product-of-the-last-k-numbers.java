import java.util.ArrayList;
import java.util.List;

class ProductOfNumbers {
    private List<Integer> cumulativeProduct;

    public ProductOfNumbers() {
        cumulativeProduct = new ArrayList<>();
        cumulativeProduct.add(1); 
    }

    public void add(int num) {
        if (num == 0) {
            cumulativeProduct = new ArrayList<>();
            cumulativeProduct.add(1);
        } else {
            int lastProduct = cumulativeProduct.get(cumulativeProduct.size() - 1);
            cumulativeProduct.add(lastProduct * num);
        }
    }

    public int getProduct(int k) {
        int n = cumulativeProduct.size();
        if (k >= n) {
            return 0;
        }
        return cumulativeProduct.get(n - 1) / cumulativeProduct.get(n - 1 - k);
    }
}
