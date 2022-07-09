public class main {
    public static void main(String[] args) {
        blockChain firstBlockChain = new blockChain();
        firstBlockChain.createGenesis();
        firstBlockChain.createBlock("testA");
        firstBlockChain.createBlock("1BTC from #al3HJ3d to #Dl6HJgc");
        firstBlockChain.PrintFullChain();
    }
}
