package interfaces;

public class DeskPhone implements ITelephone {
    private int myNumber;

    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
    }

    private boolean isRinging;

    @Override
    public void powerOn() {
        System.out.println("The desk phone is always on ");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now ringing" + phoneNumber + "on deskphone");

    }

    @Override
    public void answer() {
        if (isRinging) {
            System.out.println("Answering the desk phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber) {
            isRinging = true;
            System.out.println("Ring-ring");
        }
        return false;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
