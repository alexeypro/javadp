
public class Demo {
    public static void main(String[] args) {

        System.out.println("Assume we are loading DomainModel1 and DomainModel2 using some DAO...");
        DomainModel1 dm1 = new DomainModel1(10, 20);
        DomainModel2 dm2 = new DomainModel2("Hello World", false);

        DataTransferObject dto = new DataTransferObject(dm1, dm2);

        System.out.println("Now we are ready to transfer and serialize our DTO..");
        System.out.println("XML   = " + dto.toXML());
        System.out.println("JSON  = " + dto.toJSON());
    }

}
