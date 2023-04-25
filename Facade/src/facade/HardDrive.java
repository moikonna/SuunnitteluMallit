package facade;

public class HardDrive {
	public byte[] read(long lba, int size) {
		byte[] data = new byte[size];
		System.out.println("HardDrive read " + size + " bytes at LBA " + lba);
		return data;
	}
}
