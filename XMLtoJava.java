package works;

public class XMLtoJava {
	public static void main(String[] args) {
		String resxml="<xml> <response> <agentid>236</agentid> <requestparam>login</requestparam> <state>READY###PROGRESSIVE###PROGRESSIVE###ENABLED###1######NULL###23###5###1</state> <call_duration>0</call_duration> <status>READY###PROGRESSIVE###PROGRESSIVE###ENABLED###1######NULL###236###23###5###1</status> <response_code>0</response_code> <CLI /> <session_id /> </response> </xml>";
		int g = resxml.indexOf("<transaction_id>");
		int h = resxml.indexOf("</transaction_id>");
		String erroemessage = resxml.substring(g, h).replaceAll("<transaction_id>", "");
		System.out.println(erroemessage);
		}
}
