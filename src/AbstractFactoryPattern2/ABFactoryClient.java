package AbstractFactoryPattern2;

//Step 2: Define Abstract Factory Interface
interface OperatingSystemFactory {
 FileSystem createFileSystem();
 ProcessScheduler createProcessScheduler();
 MemoryManager createMemoryManager();
}

//Step 3: Implement Concrete Factories
class Windows32BitFactory implements OperatingSystemFactory {
	@Override
    public FileSystem createFileSystem() {
        return new NTFSFileSystem();
    }

    @Override
    public ProcessScheduler createProcessScheduler() {
        return new WindowsProcessScheduler();
    }

    @Override
    public MemoryManager createMemoryManager() {
        return new WindowsMemoryManager();
    }
}

//Concrete implementation of the factory for Linux OS and 64-bit architecture
class Linux64BitFactory implements OperatingSystemFactory {
 @Override
 public FileSystem createFileSystem() {
     return new Ext4FileSystem();
 }

 @Override
 public ProcessScheduler createProcessScheduler() {
     return new LinuxProcessScheduler();
 }

 @Override
 public MemoryManager createMemoryManager() {
     return new LinuxMemoryManager();
 }
}

//Step 4: Define Interface for OS-specific Components
//Interface for OS-specific components
interface FileSystem {
 void readFile(String filePath);
 void writeFile(String filePath, String content);
}

interface ProcessScheduler {
 void scheduleProcess(String processName);
 void killProcess(String processName);
}

interface MemoryManager {
 void allocateMemory(int size);
 void deallocateMemory(int size);
}

//Step 5: Implement Concrete Components
// Implementation for NTFS file system
class NTFSFileSystem implements FileSystem {
	@Override
	public void readFile(String filePath) {
	}
	@Override
	public void writeFile(String filePath, String content) {
	}
}
//Implementation for EXT4 File system
class Ext4FileSystem implements FileSystem {
	@Override
	public void readFile(String filePath) {
	}
	@Override
	public void writeFile(String filePath, String content) {
	}
}
//Implementation for Windows process scheduler
class WindowsProcessScheduler implements ProcessScheduler {

	@Override
	public void scheduleProcess(String processName) {
		
	}
	@Override
	public void killProcess(String processName) {
		
	}
}
//Implementation for Linux process scheduler
class LinuxProcessScheduler implements ProcessScheduler {

	@Override
	public void scheduleProcess(String processName) {
		
	}
	@Override
	public void killProcess(String processName) {
		
	}
}

//Implementation for Windows memory manager
class WindowsMemoryManager implements MemoryManager {

	@Override
	public void allocateMemory(int size) {
		
	}
	@Override
	public void deallocateMemory(int size) {
		
	}
}
//Implementation for Linux memory manager
class LinuxMemoryManager implements MemoryManager {

	@Override
	public void allocateMemory(int size) {
		
	}
	@Override
	public void deallocateMemory(int size) {
		
	}
}

//Step 6: Client Code
public class ABFactoryClient {
 public static void main(String[] args) {
     // Choose the factory based on the desired OS and architecture
     OperatingSystemFactory factory = new Windows32BitFactory(); // or new Linux64BitFactory();

     // Use the factory to create OS-specific components
     FileSystem fileSystem = factory.createFileSystem();
     ProcessScheduler processScheduler = factory.createProcessScheduler();
     MemoryManager memoryManager = factory.createMemoryManager();

     // Use the created components
     // ...
     fileSystem.readFile("abc");
     processScheduler.scheduleProcess("pc1");
     memoryManager.allocateMemory(512);
 }
}

