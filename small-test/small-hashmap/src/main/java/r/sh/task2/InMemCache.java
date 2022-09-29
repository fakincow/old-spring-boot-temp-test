package r.sh.task2;

interface  InMemCache {
    public  void Set(Integer key , String value);
    public  void Get(Integer key);
    public  void SetAll(String value);
}
