package texas.dot.hronline.configurations;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.naming.NamingException;
import javax.naming.directory.Attributes;

import org.springframework.ldap.core.AttributesMapper;
import org.springframework.ldap.core.DistinguishedName;
import org.springframework.ldap.core.LdapTemplate;
import org.springframework.ldap.filter.EqualsFilter;
import org.springframework.ldap.filter.Filter;
import org.springframework.security.ldap.DefaultLdapUsernameToDnMapper;
import org.springframework.security.ldap.LdapUsernameToDnMapper;



public class PersonRepo {
	
	private LdapTemplate ldapTemplate;
	
	/**
	 * The strategy for mapping usernames to LDAP distinguished names. This will be used
	 * when building DNs for creating new users etc.
	 */
	LdapUsernameToDnMapper usernameMapper = new DefaultLdapUsernameToDnMapper("cn=users",
			"uid");

	public void setLdapTemplate(LdapTemplate ldapTemplate) {
		this.ldapTemplate = ldapTemplate;
	}

//	public List<LdapPerson> getAllPerson(Filter filter) {
//		return ldapTemplate.search("", filter.encode(), new AttributesMapper() {
//			@Override
//			public LdapPerson mapFromAttributes(Attributes attr) throws NamingException {
//				LdapPerson person = new LdapPerson();
//				person.setCn((String) attr.get("cn").get());
//				return person;
//			}
//		});
//	}
	
	 public boolean authenticate(String userName, String password) {
      
		 ldapTemplate.authenticate("uid={0},ou=people", "(uid=" + userName + ")", password);
		
      
//		// Perform the authentication.
//		 Filter filter = new EqualsFilter("sAMAccountName", "rkonda-c");
//
//		 boolean authed = ldapTemplate.authenticate("OU=CorpUsers",
//		     filter.encode(),
//		     "Aug@2017");
//
//		 // Display the results.
//		 System.out.println("Authenticated: " + authed);
      
//		 getUserAttributes(userName);
//		 
//		 if(userExists(userName)){
//			 System.out.println("User Exists....");
//		 }else{
//			 System.out.println("User not in the system...");
//		 }
		 
      return true;
      
      
     }
	 
	 
	 @SuppressWarnings("unchecked")
	    public Map<String, String> getUserAttributes(String username) {
	        Map<String, String> results = new HashMap<String, String>();

	        String objectClass = "samAccountName=" + username;
	        LinkedList<Map<String, String>> list = (LinkedList<Map<String, String>>) ldapTemplate.search("", objectClass, new UserAttributesMapper());
	        if (!list.isEmpty()) {
	            // Should only return one item
	            results = list.get(0);
	        }
	        return results;
	    }
	 
	 
	 public boolean userExists(String username) {
			@SuppressWarnings("deprecation")
			DistinguishedName dn = usernameMapper.buildDn(username);
			
			
			

			try {
				Object obj = ldapTemplate.lookup(dn);				
				return true;
			}
			catch (org.springframework.ldap.NameNotFoundException e) {
				return false;
			}
		}
//	 public UserDetails loadUserByUsername(String username) {
//			DistinguishedName dn = usernameMapper.buildDn(username);
//			List<GrantedAuthority> authorities = getUserAuthorities(dn, username);
//
//			logger.debug("Loading user '" + username + "' with DN '" + dn + "'");
//
//			DirContextAdapter userCtx = loadUserAsContext(dn, username);
//
//			return userDetailsMapper.mapUserFromContext(userCtx, username, authorities);
//		}
	 
	 
	 
	 private class UserAttributesMapper implements AttributesMapper {

	        @Override
	        public Map<String, String> mapFromAttributes(Attributes attributes) throws javax.naming.NamingException {
	            Map<String, String> map = new HashMap<String, String>();

	            String fullname = (String) attributes.get("displayName").get(); 
	            String email = (String) attributes.get("mail").get(); 
	            String title = (String) attributes.get("title").get();

	            map.put("fullname", fullname);
	            map.put("email", email);
	            map.put("title", title);
	            return map;
	        }
	    }   
	 

}
