import java.util.ArrayList;
import java.util.Objects;

public class blockChain {
    ArrayList<block> blocks = new ArrayList<block>();



    public static void main(String[] args) {
    }

    public void createGenesis(){
        block genesis = new block("", "Genesis", 0);
        genesis.hash = "89123749182734";
        this.blocks.add(genesis);
    }

    public void createBlock(String value){
        block previousHeadBlock = blocks.get(blocks.size()-1);
        block newHeadBlock = new block(previousHeadBlock.getHash(), value, blocks.size());
        newHeadBlock.generateHash();
        blocks.add(newHeadBlock);
    }

    public void PrintFullChain(){
        block[] arrayChain = new block[this.blocks.size()];
        this.blocks.toArray(arrayChain);
        for (block blockA: arrayChain) {
            System.out.println("----------------");
            System.out.println(blockA.getIndex());
            System.out.println(blockA.getValue());
            System.out.println("Hash: " + blockA.getHash());
            System.out.println("Previous Hash: " + blockA.previousHash);
            System.out.println("----------------");
            System.out.println("");
        }
    }
}
