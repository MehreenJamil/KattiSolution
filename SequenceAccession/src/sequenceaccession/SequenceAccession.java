/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sequenceaccession;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.soap.Node;

import org.dom4j.Document;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;
import org.w3c.dom.Document;

/**
 *
 * @author mehre
 */
public class SequenceAccession {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Document document = null;
		try {
			File inputFile = new File("parse.xml");
			SAXReader reader = new SAXReader();
			document = reader.read(inputFile);
		} catch (Exception e) {

		}

	
		int i = 0;
		
		List<Map<String, String>> list = new ArrayList<Map<String, String>>();
		List<Map> listHisto = new ArrayList<Map>();
		List<Map> listPositionCount = new ArrayList<Map>();
		List<Map> listReversePositionCount = new ArrayList<Map>();
	//	ThreeInOne obj = new ThreeInOne();
//		 String elements = "SHTYVWQLKEGPCMADIRFN";
		String elements = "ACDEFGHIKLMNPQRSTVWY";
		 
		//System.out.println("Root element :" + document.getRootElement().getName());

		List<org.dom4j.Node> entryNodes = document.selectNodes("//uniprot/entry");
		System.out.println("------------------------------------------------");
		outerloop:
		for (org.dom4j.Node entryNode : entryNodes) {
			String sequence = entryNode.selectSingleNode("sequence").getStringValue();
			sequence = sequence.replaceAll("[^a-zA-Z]", "");
			String accession = "";
			List<org.dom4j.Node> accessionNodes = entryNode.selectNodes("accession");
			
			
			for (org.dom4j.Node accessionNode : accessionNodes) {
				accession = accessionNode.getText();
				//System.out.println(accession);
				break;
			}

			ArrayList<String> myStringArray = new ArrayList<String>();
			List<org.dom4j.Node> featureNodes = entryNode.selectNodes("feature[@type=\"disulfide bond\"]");
			for (org.dom4j.Node featureNode : featureNodes) {
				HashMap<String, String> disulfideSequence = new HashMap<String,String>();
				
				Node node = featureNode.selectSingleNode("location/begin");
				int begin=-1;
				int end=-1;
				if (node != null && !"".equals(node.valueOf("@position")))  {
					 begin = Integer.parseInt(node.valueOf("@position"));
				}
				node = featureNode.selectSingleNode("location/end");
				if (node != null && !"".equals(node.valueOf("@position"))  ) {
					end = Integer.parseInt(node.valueOf("@position"));
				}
				if(begin!=-1 && end !=-1 ){
					
					begin =begin-21;
					end = end+20;
					if(end<sequence.length()){
						i++;
						//String disulphideSequence= sequence.substring(begin, end);
						//obj.calculateMoments(elements.toString(),disulphideSequence);
					
					}
					
				}
			
			//	list.add(disulfideSequence);
			}
			
			
			
			
		}
		System.out.println(i);
		
		
	
    }
    
}
