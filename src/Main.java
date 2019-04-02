import Facility.ClothingStore;
import Facility.DepartmentStore;
import Facility.Mall;
import Facility.Restaurant;
import Facility.Store;
import FacilityUse.MallEmployee;


public class Main {
	public static void main(String [] args){
		Mall mallFacility = new Mall();
		mallFacility.setName("Old Orchard");
		MallEmployee Bill = new MallEmployee();
		MallEmployee Bob = new MallEmployee();
		Bill.addEmployee("Bill", "Janitor");
		Bob.addEmployee("Bob", "Security Guard");

		Store ross = new ClothingStore();
		ross.setName("Ross");
		ross.setType("Clothing Store");
		ross.setID(23452);

		Store target = new DepartmentStore();
		target.setName("Target");
		target.setType("Department Store");
		target.setID(41234);

		Store redLobster = new Restaurant();
		redLobster.setName("Red Lobster");
		redLobster.setType("Restaurant");
		redLobster.setID(62987);

		System.out.println(mallFacility.getName() + " is the newest mall.");
		System.out.println("");

		mallFacility.addStore(ross);
		mallFacility.addStore(target);
		mallFacility.addStore(redLobster);

		System.out.println("");

		mallFacility.addMallEmployee(Bill);
		mallFacility.addMallEmployee(Bob);

		mallFacility.openMall(Bob);

		System.out.println("");

		ross.storeOpenClose(mallFacility, ross);
		target.storeOpenClose(mallFacility, target);
		redLobster.storeOpenClose(mallFacility, redLobster);

		System.out.println("");
//		System.out.println(ross.getOpened());

		mallFacility.setMaintenance(mallFacility.getStoreListing().get(0), mallFacility.getStoreListing().get(0).getID());
		mallFacility.setMaintenance(mallFacility.getStoreListing().get(1), mallFacility.getStoreListing().get(1).getID());
		mallFacility.setMaintenance(mallFacility.getStoreListing().get(2), mallFacility.getStoreListing().get(2).getID());
//		System.out.println("");
//		redLobster.storeOpenClose(mallFacility, redLobster);
		System.out.println("");
//		System.out.println(redLobster.getOpened());
//		redLobster.storeOpenClose(mallFacility, redLobster);

		mallFacility.closeMall(Bill);

		System.out.println("");

		ross.storeOpenClose(mallFacility, ross);
		target.storeOpenClose(mallFacility, target);
		redLobster.storeOpenClose(mallFacility, redLobster);
	}
}
