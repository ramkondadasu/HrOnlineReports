package texas.dot.hronline.configurations;

import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;
import javax.naming.directory.SearchControls;
import javax.naming.directory.SearchResult;

public class CustomLdapComponent {
	
	public String errormsg = "";
	public String ldapCheck(String uid, String pwd){
		String dn = null;		
		String msg ="";
		String trim_msg ="";
		int error =0;
		try{
					
		    //Connect to AD to get our dn
			dn = this.getDnFromAd(uid,pwd);
		}catch(NamingException e){			
			msg = e.getMessage();
			//check to see if the LDAP error code is in the message string
			if (msg.indexOf("LDAP: error code") != -1) {
				msg = msg.substring(18,21);
				trim_msg = msg.trim();
			}
			error = Integer.parseInt(trim_msg);
			getLdapErrorMessage(error);
					
		}
		
		//check dn if it is null then query from ldap errormsg = ed no records
		if(dn==null || dn.trim().equalsIgnoreCase("")){
			errormsg = "User Not Authenticated.";
			
				
		}else{
			errormsg = "Success";
				
		}

		return errormsg;
	}
	
	@SuppressWarnings("unchecked")
	private String getDnFromAd(String userId, String pword) throws NamingException {

		String dn = null;
		Hashtable env = new Hashtable();
		// removed on 8/18/2015 per INC0020942
		// String ldapURL = "ldap://txdot-dc1.dot.state.tx.us:389";
		// Added on 8/18/2015 per INC0020942
		String ldapURL = "ldap://adldap.dot.state.tx.us:389";
		String ADuser = "";
		String ADpassword = "";
		String domainName = "dot.state.tx.us:389";
		ADuser = userId + "@" + domainName;
		ADpassword = pword;
		// (Anonymous Bind to Server)
		// ADuser = "isd-ldr" + "@" + domainName;
		// ADpassword = "2load2";

		env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
		// set security credentials
		env.put(Context.SECURITY_AUTHENTICATION, "simple");
		env.put(Context.SECURITY_PRINCIPAL, ADuser);
		env.put(Context.SECURITY_CREDENTIALS, ADpassword);
		// connect to my domain controller
		env.put(Context.PROVIDER_URL, ldapURL);

		DirContext ctx = new InitialDirContext(env);
		// Specify the Base for the search
		String searchBase = "ou=ddos,dc=dot,dc=state,dc=tx,dc=us";

		String filter = ("(cn=" + userId + ")");
		String[] attrIDs = { "distinguishedName" };

		SearchControls ctls = new SearchControls();
		ctls.setReturningAttributes(attrIDs);
		ctls.setSearchScope(SearchControls.SUBTREE_SCOPE);

		NamingEnumeration answer = ctx.search(searchBase, filter, ctls);
		while (answer.hasMore()) {
			SearchResult sr = (SearchResult) answer.next();
			dn = sr.getName();
		}

		ctx.close();

		return dn;

	}
	
	private void getLdapErrorMessage(int error) {
		
		switch (error) {
		case 1:
			errormsg =  "LDAP: Internal server error";
			break;
		case 2:
			errormsg =  "LDAP: Invalid request";
			break;
		case 3:
			errormsg =  "LDAP: Time limit exceeded for request";
			break;
		case 4:
			errormsg =  "LDAP: Size limit exceeded for request";
			break;
		case 7:
			errormsg =  "LDAP: Authentication method not supported by LDAP server";
			break;
		case 8:
			errormsg =  "LDAP: Strong authentication required";
			break;
		case 11:
			errormsg =  "LDAP: LDAP server limits exceeded";
			break;
		case 12:
			errormsg =  "LDAP: Critical extension unavailable";
			break;
		case 13:
			errormsg =  "LDAP: Confidentiality required";
			break;
		case 16:
			errormsg =  "LDAP: Attribute does not exist in the entry";
			break;
		case 17:
			errormsg =  "LDAP: Attribute specified in the modify or compare operation does not exist in the entry";
			break;
		case 18:
			errormsg = "LDAP: The matching rule specified in the search filter does not match a rule defined for the attribute's syntax";
			break;
		case 19:
			errormsg = "LDAP: The attribute value specified in a modify, add, or modify DN operation violates size or content constraints placed on the attribute.";
			break;
		case 20:
			errormsg = "LDAP: Indicates that the attribute value specified in a modify or add operation already exists as a value for that attribute.";
			break;
		case 21:
			errormsg = "LDAP: The attribute value specified in an add, compare, or modify operation is an unrecognized or invalid syntax for the attribute";
			break;
		case 32:
			errormsg = "LDAP: The context specified cannot be found in the tree";
			break;
		case 33:
			errormsg = "LDAP: An error occurred when an alias was dereferenced";
			break;
		case 34:
			errormsg =  "LDAP: The syntax of the DN is incorrect";
			break;
		case 35:
			errormsg = "LDAP: The specified operation cannot be performed on a leaf entry";
			break;
		case 36:
			errormsg = "LDAP: During a search operation, either the client does not have access rights to read the aliased object's name or dereferencing is not allowed";
			break;
		case 48:
			errormsg = "LDAP: During a bind operation, the client is attempting to use an authentication method that the client cannot use correctly";
			break;
		case 49:
			errormsg =  "LDAP: Invalid Username/Password combination";
			
			break;
		case 50:
			errormsg = "LDAP: You do not have sufficient rights to perform the requested operation";
			break;
		case 51:
			errormsg = "LDAP: The LDAP server is too busy to process the client request at this time";
			break;
		case 52:
			errormsg = "LDAP: The LDAP server cannot process your bind request at this time";
			break;
		case 53:
			errormsg =  "LDAP: The LDAP server cannot process the request because of server-defined restrictions";
			
			break;
		case 64:
			errormsg = "LDAP: The add or modify DN operation violates the schema's structure rules";
			break;
		case 65:
			errormsg = "LDAP: The add, modify, or modify DN operation violates the object class rules for the entry";
			break;
		case 66:
			errormsg = "LDAP: The requested operation is permitted only on leaf entries";
			break;
		case 67:
			errormsg = "LDAP: The modify operation attempted to remove an attribute value that forms the entry's relative distinguished name";
			break;
		case 68:
			errormsg = "LDAP: The add operation attempted to add an entry that already exists, or the modify operation attempted to rename an entry to the name of an existing entry";
			break;
		case 69:
			errormsg = "LDAP: The modify operation attempted to modify the structure rules of an object class";
			break;
		case 70:
			errormsg =  "LDAP: Reserved for CLDAP";
			break;
		case 71:
			errormsg = "LDAP: The modify DN operation moves the entry from one LDAP server to another and thus requires more than one LDAP server";
			break;
		case 80:
			errormsg = "LDAP: Unknown error. This is the default value for NDS error codes which do not map to other LDAP error codes";
			break;
		case 91:
			errormsg =  "LDAP: Unknown Server Name";
			break;
		default:
			errormsg = "LDAP: Unknown error. This is the default value for NDS error codes which do not map to other LDAP error codes";
			break;
		}

	}

}
