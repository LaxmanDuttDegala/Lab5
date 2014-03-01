import java.io.*;


class Txt2Json {

	public static void main(String args[]) {

		String txtfile = "homeapp_classify.txt";
		String jsonfile = "homeapp_classify.json";
		
		BufferedReader br = null;		
		String result = "";
		int count=0;
		try {
			String sCurrentLine;
			br = new BufferedReader(new FileReader(txtfile));
			
			FileWriter file = new FileWriter(jsonfile,true);
			
			file.write("[{");
 
			file.write("\"id\":\"desc\"");
			
			while ((sCurrentLine = br.readLine()) != null) {
				
				if(sCurrentLine.contains("\t")){
					String Array[] = sCurrentLine.split("\t");
					String id = Array[0];
					String desc = Array[1];
					String Array2[]=desc;		
					try {
						 
			
							
					
						if(count>0&&count<=20)
						{
							file.write(",\"desc\":"+"\""+Array2[1]+"\"");	
						}
						if(count>20)
						{
							break;
						}
						
					
				 
					} catch (IOException e) {
						
						e.printStackTrace();
						result = e.toString();
					}
				//System.out.println(sCurrentLine);
								}
												
																count=count+1;
																			}
																						
																									
																												
																															file.write("}]");
																																		file.flush();
																																					file.close();
																																								result  ="convert success";
																																										
																																												} catch (IOException e) {
																																														e.printStackTrace();
																																																		result = e.toString();
																																																				} finally {
																																																							try {
																																																											if (br != null)br.close();
																																																														} catch (IOException ex) {
																																																																		ex.printStackTrace();
																																																																						result = ex.toString();
																																																																									}
																																																																											}
																																																																									    
																																																																										    		
//																																																																											    				return result;
				
				
		}
}
