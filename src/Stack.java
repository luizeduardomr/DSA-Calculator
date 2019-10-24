class Pilha {
    private int tamanho;
    private Node topo;

    private class Node{

        public Double element;
        public Node prev;


        public Node(Double element){
            this.element = element;
            prev = null;
        }
        public Node(Double element, Node next){
            this.element = element;
            this.prev = next;
        }
    }


    public Pilha(){
        this.topo = null;
        this.tamanho = 0;
    }


    public void push(Double e){
        Node aux = new Node(e);
        aux.prev = topo;
        topo = aux;
        tamanho++;
    }


    public boolean isEmpty(){
        return topo == null;
    }


    public Double pop(){
        if (isEmpty()){
            throw new RuntimeException("Pilha cheia!");
        }
        Double e = topo.element;
        topo = topo.prev;
        tamanho--;
        return e;
    }


    public Double top(){
        if(isEmpty()){
            throw new RuntimeException("Pilha vazia!");
        }
        return topo.element;
    }
    public int size() {return this.tamanho;}


    public void clear(){
        if(isEmpty()) {
            throw new RuntimeException("A pilha já está vazia");
        }

        int tamanhoatual = this.tamanho;

        for(int i=0; i <= tamanhoatual; i++) {
            this.pop();
        }
    }
}