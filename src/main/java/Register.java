import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Register {
	@Id
	private String Email;
	private String password;
	private String confirm;
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirm() {
		return confirm;
	}
	public void setConfirm(String confirm) {
		this.confirm = confirm;
	}
	@Override
	public String toString() {
		return "Register [Email=" + Email + ", password=" + password + ", confirm=" + confirm + "]";
	}
	
	
}
