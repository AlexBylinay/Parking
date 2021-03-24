package by.bylinay.trening.parking;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Pkhh {
	  private Car[] places;

		public Parking(int size) {
			this.places = new Car[size];
		}

		public Ticket park(Car car) {
	        int freePlaceNum = findFreePlaceNum();
	        places[freePlaceNum] = car;
	        return new Ticket(freePlaceNum, car);
		}
	    
	    private int findFreePlaceNum() {
	        for (int i = 0; i < places.length; i++) {
	            if (places[i] == null) {
	                return toNum(i);
	            }
	        }
	    }

		public Car pickUp(Ticket ticket) {
	        Car car = places[ticket.placeNum];
	        places[toIndex(ticket.placeNum)] = null;
	        return car;
		}

	    private int toNum(int index) {
	        return index + 1;
	    }
	    
	    private int toIndex(int num) {
	        return num - 1;
	    }
	    
	    
	    public class Ñheque {
	    	private static final long MILLISEKONDS_IN_HOUR = 1;
	    	public static int numberTiket;
	    	public static String typeCar;
	    	public static int ibnCar;
	    	public static String timeOn;
	    	public static String timeOff;
	    	public static int quantity;
	    	public static int rateOfHour;
	    	public static int rate;

	    	
	    	public  Ñheque (Ticket ticket, Parking parking) {
	    		// this.ibnCar = ticket.getIbnCar();
	   
	    		this.timeOn = ticket.getTimeOn();
	    		this.timeOff = new SimpleDateFormat("yyyy/MM/dd_HH:mm:ss").format(Calendar.getInstance().getTime());
	    		this.quantity =  timeCount( ticket);
	    		this.rateOfHour = parking.getRent();
	    		this.rate = calculationRote(ticket, parking);
	    		this.numberTiket = ticket.getNumberSpeace();
	    	
	    		
	    		//rate = calculationRote(ticket, parking); 
	    	}
	    		public static int timeCount(Ticket ticket) {
	    		return  (int) (System.currentTimeMillis() - (ticket.getStartTime() ) / MILLISEKONDS_IN_HOUR);
	    	}

	    	public static 
	    	int calculationRote(Ticket ticket, Parking parking) {
	    		String type = Parking.pickUp1(ticket).getType();
	    		return (int) (fillingChecue(ticket, parking) * parking.getRent() * TransportVehicleTypeÑefficients.getCefficient(type));
	    	}
	    	  public static void printCheque () {
	    		  System.out.print( );
	    	  }
	    }

}
