package clase15;

public class Proyect {
	private String modelVersion;
	private Parent parent;
	private String artifactId;
	private String name;
	
	public Proyect(String modelVersion, Parent parent, String artifactId, String name) {
		this.modelVersion = modelVersion;
		this.parent = parent;
		this.artifactId = artifactId;
		this.name = name;
	}

	public String getModelVersion() {
		return modelVersion;
	}

	public void setModelVersion(String modelVersion) {
		this.modelVersion = modelVersion;
	}

	public Parent getParent() {
		return parent;
	}

	public void setParent(Parent parent) {
		this.parent = parent;
	}

	public String getArtifactId() {
		return artifactId;
	}

	public void setArtifactId(String artifactId) {
		this.artifactId = artifactId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	 
	
	

}
