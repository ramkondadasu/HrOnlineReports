package texas.dot.hronline.configurations;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.ldap.core.LdapTemplate;
import org.springframework.ldap.core.support.LdapContextSource;

@Configuration
public class LdapConfig {
	
	@Bean
	public LdapContextSource getContextSource() throws Exception{
		LdapContextSource ldapContextSource = new LdapContextSource();
		ldapContextSource.setUrl("ldap://adldap.dot.state.tx.us:389");
		ldapContextSource.setBase("DC=dot,DC=state,DC=tx,DC=us");
		ldapContextSource.setUserDn("esbldap-f@dot.state.tx.us");
		ldapContextSource.setPassword("aPN6qTVC");
		return ldapContextSource;
	}
	
	@Bean
	public LdapTemplate ldapTemplate() throws Exception{
		LdapTemplate ldapTemplate = new LdapTemplate(getContextSource());
		ldapTemplate.setIgnorePartialResultException(true);
		ldapTemplate.setContextSource(getContextSource());
		return ldapTemplate;
	}

}
