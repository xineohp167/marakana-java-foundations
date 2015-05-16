import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Laptop {

	private final String model;
	private final int size;
	private final List<Storage> storage;
	private Set<String> applications;
	private boolean on;

	public Laptop(String model, int size, List<Storage> storage) {
		this.model = model;
		this.size = size;
		this.storage = storage;
	}

	public void turnOn() {
		on = true;
	}

	public void turnOff() {
		on = false;
	}

	public boolean isOn() {
		return on;
	}

	public String getModel() {
		return model;
	}

	public int getSize() {
		return size;
	}

	public List<Storage> getStorage() {
		return storage;
	}

	public Set<String> getApplications() {
		return applications;
	}

	public void setApplications(Set<String> applications) {
		this.applications = applications;
	}
	
	public int totalStorage(){
		int total = 0;
		for (Storage s : storage) {
			total += s.getSize();
		}
		return total;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + size;
		result = prime * result + ((storage == null) ? 0 : storage.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Laptop other = (Laptop) obj;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (size != other.size)
			return false;
		if (storage == null) {
			if (other.storage != null)
				return false;
		} else if (!storage.equals(other.storage))
			return false;
		return true;
	}

	
	
	
	
}
