public abstract class Factory {
    
    public final Product create(String owner) {
        Product p = createProduct(owner);
        regsiterProduct(p);
        return p;
    }

    protected abstract Product createProduct(String owner);

    protected abstract void regsiterProduct(Product product);
}
