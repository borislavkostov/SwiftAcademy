package bg.swiftacademy.homework_06_2;

public class Dog extends Animal implements Eat, EnterRoom {
	
	
	public Dog() {
	}
	
	
	@Override
	public void enterRoom(Room room) {
		this.room = room;
		System.out.printf("The %s entred in %s%n", this.getClass().getSimpleName(), room.type);
	}
	
	@Override
	public void eat(){
		if (room == null) {
			System.out.printf("The %s is not in the house", this.getClass().getSimpleName());
		} else if (room.food == 0) {
			System.out.printf("There is no food in the %s,"
					+ " for your %s! %n", room.type, this.getClass().getSimpleName());
		} else {
			room.food -- ;
			System.out.printf("The %s ate some food from the %s%n", this.getClass().getSimpleName(), room.type);
		}
	}
	
}
