public class DAHashTable {

    private Node[] table;

    public DAHashTable(int maxIdx){
        table = new Node[maxIdx+1];
    }

    public void insert(int in){
        if(in >= table.length){
            throw new RuntimeException("InsertedValueTooHigh");
        }
        if(in < 0){
            throw new RuntimeException("InsertedValueTooLow");
        }
        Node num = new Node(key(in), in);
        table[num.getKey()] = num;
    }

    public void delete(int key){
        if(key >= table.length){
            throw new RuntimeException("DeletedKeyValueTooHigh");
        }
        if(key < 0){
            throw new RuntimeException("DeletedKeyValueTooLow");
        }
        table[key] = null;
    }

    public Integer search(int key){
        if(key >= table.length){
            throw new RuntimeException("IndexOfSearchTooHigh");
        }
        if(key < 0){
            throw new RuntimeException("IndexOfSearchTooLow");
        }
        if(table[key] == null){
            return null;
        }
        return table[key].getValue();
    }

    public int key(int value){
        return value;
    }
}
