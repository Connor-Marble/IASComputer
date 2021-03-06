package lab4;

public class Computer {

    private long ac, mq, mbr, ibr, ir;
    private int pc, mar;
    private boolean left, ibrLoad;
    private Memory memory;
    private String description;

    public Computer() {
        memory = new Memory(100);

        mq = 0;
        ac = 0;
        description = "";
    }

    public Computer(Memory memory) {
        this.memory = memory;

        mq = 0;
        ac = 0;
        description = "";
    }

   public void run(){
        pc = 0;
        left = true;
        mar = pc;
        mbr = memory.getMemory(mar);
    }

    
    public void compute(int location, int instruction, int address) {
        boolean setDesc = true;

        switch (instruction) {
        case Opcode.HALT:
            break;
        case Opcode.LOADMX:
            // load mx to ac
            break;
        case Opcode.LOADMXNEG:
            // load -mx to ac
            break;
        case Opcode.LOADMXABS:
            // load |mx| to ac
            break;
        case Opcode.LOADMXABSNEG:
            // load -|mx| to ac
            break;
        case Opcode.ADDMX:
            // add mx to ac
            break;
        case Opcode.SUBMX:
            // sub mx from ac
            break;
        case Opcode.ADDMXABS:
            // add |mx| to ac
            break;
        case Opcode.SUBMXABS:
            // sub |mx| from ac
            break;
        case Opcode.LOADMQMX:
            // xfer mx to mq
            break;
        case Opcode.LOADMQ:
            // xfer mq to ac
            mq = ac;
            break;
        case Opcode.MULMX:
            // multiply ac by mx, most sig in ac, least sig in mq
            break;
        case Opcode.DIVMX:
            // divide ac by mx, quotient to mq, remainder in ac
            break;
        case Opcode.JUMPMXLEFT:
            // left instruction from mx
            break;
        case Opcode.JUMPMXRIGHT:
            // right instruction from mx
            break;
        case Opcode.JUMPMXPOSLEFT:
            // ac >=0 left instruction
            break;
        case Opcode.JUMPMXPOSRIGHT:
            // ac >=0 right instruction
            break;
        case Opcode.STORMX:
            // xfer ac to mx
            break;
        case Opcode.STORMXLEFT:
            // set mx left to ac right
            break;
        case Opcode.STORMXRIGHT:
            // set mx right to ac right
            break;
        case Opcode.LSH:
            // multiply ac by 2
            break;
        case Opcode.RSH:
            // divide ac by 2 (will be floored)
            break;
        default:
            setDesc = false;
        }

        if (setDesc)
            description = Opcode.DESCRIPTION[instruction];
        else
            description = "ERROR, INSTRUCTION NOT FOUND";
    }

    public void run() {
        
    }
}
