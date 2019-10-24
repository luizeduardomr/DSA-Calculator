public class Calculadora {
    Pilha stack;
    Lerarquivo readFile;

    public Calculadora() {
        readFile = new Lerarquivo();
        stack = new Pilha();

        Pilha calculadora = readFile.Lerarquivo("arquivo.txt");
    }

    public Calculadora(Pilha pilhaAtual) {
        this.stack = pilhaAtual;
    }

    public void sum() {
        double primeiroValor = stack.pop();
        double segundoValor = stack.pop();

        Double resultado = primeiroValor + segundoValor;
        stack.push(resultado);
    }

    public void div() {
        double primeiroValor = stack.pop();
        double segundoValor = stack.pop();

        Double resultado = segundoValor / primeiroValor;
        stack.push(resultado);
    }

    public void sub() {
        double primeiroValor = stack.pop();
        double segundoValor = stack.pop();

        Double resultado = segundoValor - primeiroValor;
        stack.push(resultado);

    }

    public void mult() {
        double primeiroValor = stack.pop();
        double segundoValor = stack.pop();

        Double resultado = primeiroValor * segundoValor;
        stack.push(resultado);

    }


    public void pop() {
        if (this.stack.isEmpty()) throw new IllegalArgumentException("Stack underflow");
        else {
            this.stack.pop();
        }
    }

    public void dup() {
        if (this.stack.isEmpty()) throw new IllegalArgumentException("Stack underflow");
        else {
            double ultimoValor = this.stack.top();
            this.stack.push(ultimoValor);
        }
    }

    public void swap() {
        if (this.stack.isEmpty()) throw new IllegalArgumentException("Stack underflow");
        if(this.stack.size() == 1) return;

        double primeiroValor = this.stack.pop();
        double segundoValor = this.stack.pop();

        this.stack.push(primeiroValor);
        this.stack.push(segundoValor);
    }

    public void chs() {
        if (this.stack.isEmpty()) throw new IllegalArgumentException("Stack underflow");

        double valor = this.stack.pop();

        if(valor >= 0) {
            this.stack.push(valor * -1);
        } else {
            this.stack.push(valor * -1);
        }
    }

    public void sqrt() {
        if (this.stack.isEmpty()) throw new IllegalArgumentException("Stack underflow");

        double value = this.stack.pop();

        if(value > 0) {
            this.stack.push(Math.sqrt(value));
        } else {
            throw new IllegalArgumentException("You can't square root zero or a negative number");
        }
    }
}