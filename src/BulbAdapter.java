public class BulbAdapter implements SmartDevice{
        private final LegacyBulb bulb;

        public BulbAdapter(LegacyBulb bulb){
            if (bulb == null ) throw new IllegalArgumentException();
        }
     @Override
     public void  turnOn(){
            bulb.setBrightness(255);
     }
     @Override
    public void turnOff(){
            bulb.setBrightness(0);
     }

     void isOn(){
            if(bulb.hasPower() == true && bulb.readBrightness() >0 ){return true};
     }
}
