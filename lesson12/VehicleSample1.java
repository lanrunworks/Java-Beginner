package lesson12;

abstract class VehicleSample1 {

	protected int speed;

	public void setSpeed(int s) {
		
		speed = s;
		System.out.println("速度" + speed + "をにしました");
	
	}

	abstract void show();

}
