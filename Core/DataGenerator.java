import java.util.Calendar;
import java.util.Observable;
import java.util.Random;
import java.util.Calendar;

class DataGenerator extends Observable implements Runnable {

    private Data data;
    private boolean stop = false;
    private int input_face=0;

    public void stop() {
        this.stop = true;
    }

    public Object getObject() {
        return data;
    }

    @Override
    public void run() {
        stop = false;

        Calendar calendar = Calendar.getInstance();
        long initialTime = calendar.getTimeInMillis();
        double timeStamp = 0;


        while (!stop) {
            System.out.println("data generator running");
            timeStamp = (System.currentTimeMillis() - initialTime) * .001;
            float max = (float) ((Math.random()*((1-0.7)))+0.7);
            float min1 =  (float) ((Math.random()*((0.6-0.01)))+0.01);
            float min2 =  (float) ((Math.random()*((0.6-0.01)))+0.01);
            float min3 =  (float) ((Math.random()*((0.6-0.01)))+0.01);
            float min4 =  (float) ((Math.random()*((0.6-0.01)))+0.01);
            float min5 =  (float) ((Math.random()*((0.6-0.01)))+0.01);
            if(input_face == 1)
                createAndNotify(timeStamp,max,
                        min1,min2,min3,min4,min5);
            else if(input_face == 2)
                createAndNotify(timeStamp,
                        min1,max,min2,min3,min4,min5);
            else if(input_face == 3)
                createAndNotify(timeStamp,
                        min1,min2,max,min3,min4,min5);
            else if(input_face == 4)
                createAndNotify(timeStamp,
                        min1,min2,min3,max,min4,min5);
            else if(input_face == 5)
                createAndNotify(timeStamp,
                        min1,min2,min3,min4,max,min5);
            else if(input_face == 6)
                createAndNotify(timeStamp,
                        min1,min2,min3,min4,min5,max);
            else
                createAndNotify(timeStamp,
                        min1,min2,min3,min4,min5,max);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }
        }
    }
    public void run_data_generator(int value)
    {
        input_face= value;
        run();
    }

    private void createAndNotify(double timestampsystem, float agreement, float concentrating, float disagreement, float interested, float thinking, float unsure) {
        System.out.println("notifying ...");

        data = new Data(timestampsystem, agreement, concentrating,disagreement,interested,thinking, unsure);
        data.setData( timestampsystem, agreement, concentrating,disagreement,interested,thinking, unsure);
        System.out.println(data.toString());
        //setChanged();
        //notifyObservers();
    }



}
