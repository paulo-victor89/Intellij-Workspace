package pvictor.poo.aula05;


public class ContaBanco {
    // Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public void estadoAtual() {
        System.out.println("___________________________________________________________________________");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: "+this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
        System.out.println("___________________________________________________________________________");
    }

    // Métodos personalizados
    public void abrirConta(String t) {
        this.setTipo(t);// conta corrente (CC) recebe R$ 50 conta poupanca("CP") recebe R$ 150
        this.setStatus(true);
        if ("CC".equals(t)) {
            this.setSaldo(50);
            //System.out.println("Ao abrir a conta do tipo "+getTipo()+ " voce recebeu: R$ " +this.getSaldo() + " de saldo inicial ");

        } else if ("CP".equals(t)) {
            this.setSaldo(150);
        }
        System.out.println("Conta criada com sucesso!");
        System.out.println("Ao abrir a conta do tipo "+getTipo()+ " voce recebeu: R$ " +this.getSaldo() + " de saldo inicial ");
    }

    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("A conta da(o) " +this.getDono() +" não pode ser fechado porque ainda tem dinheiro!");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta não pode ser fechadoa porque ainda tem debito!");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }

    public void depositar(float v) {
        if (this.getStatus()) {
            // this.saldo = this.saldo + v;// usando atributos
            this.setSaldo(this.getSaldo() + v); // usando metodos especiais
            System.out.println("Deposito no valor de R$" + v +" realizado na conta da(o) " + this.getDono());
        } else {
            System.out.println("Impossivel depositar em uma conta fechada");
        }

    }

    public void sacar(float v) {
        if (this.getStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado no valor de R$" + v +" na conta de " + this.getDono());
            } else {
                System.out.println("Saldo insuficente para saque na conta da(o) " + this.getDono());
            }

        } else {
            System.out.println("Impossivel sacar de uma conta fechada!");
        }

    }

    public void pagarMensal() {// conta corrente (CC) paga R$ 12 conta poupanca("CP") paga R$ 20
        int v = 0;
        if (this.getTipo().equals("CC")) {
            v = 12;

        } else if (this.getTipo().equals("CP")) {
            v = 20;
        }
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso"+ " no valor de: R$ "+ v + " por " + this.getDono());
        }
        else {
            System.out.println("Impossivel pagar uma conta fechada!");
        }

    }

    // Métodos especiais
    // constructor
    public ContaBanco() {
//		this.setSaldo(0);  pode utilizar as duas formas, não deve dar erro
//		this.setStatus(false);
        this.saldo = 0;
        this.status = false;

    }


    // getters e setters
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
