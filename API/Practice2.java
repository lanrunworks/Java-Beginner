package API;

public class Practice2 {

	public String concatPath(String folder, String file) {

		if (!folder.endsWith("\\")) {
			folder += "\\";
		}
		return folder + file;

	}

}
