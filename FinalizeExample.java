class FinalizeExample {
    protected void finalize() {
        System.out.println("finalize method called");
    }

    public static void main(String[] args) {
        FinalizeExample obj = new FinalizeExample();
        obj = null;
        System.gc();
    }
}