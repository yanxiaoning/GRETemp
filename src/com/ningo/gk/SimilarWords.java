package com.ningo.gk;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
public class SimilarWords {
	public List<String> orderedIdArray(String keyWord,List<String[]> initialList,int wordsDisplayAmount)
			{
		

		 
		List<String[]> wordList=initialList ;
		List<Set<String>> invertedTable= generateInvertedTable(wordList);
	    List<String[]> idArray=idArrayGenerator(keyWord,invertedTable);
	    return  orderedListgenerator(idArray,wordsDisplayAmount);
		
		
		
		
		
		

	
			}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*public static List<String[]> initial()
	{
		
		List<String[]> wordList=new ArrayList<String[]>();
			
			
		
		
		
			String[] temp={String.valueOf(0),"rich"};
			String[] temp1={String.valueOf(1),"stick"};
			String[] temp2={String.valueOf(2),"stich"};
			String[] temp3={String.valueOf(3),"stuck"};
			String[] temp4={String.valueOf(4),"static"};
			wordList.add( temp);
			wordList.add( temp1);
			wordList.add( temp2);
			wordList.add( temp3);
			wordList.add( temp4);
		
		
		
		return wordList;
	}
	
	*/
	
	
	
	
	
	private static List<Set<String>> generateInvertedTable(List<String[]> wordList)
	{
List<Set<String>> invertedTable=new ArrayList<Set<String>>() ;
		
		for(int t=0;t<wordList.size();t++){
		List<String> tempList=new ArrayList<String>();
		
		for(int i=0;i<wordList.get(t)[1].length()-1;i++){
			tempList.add(wordList.get(t)[1].substring(i, i+2));
		}
		
		
		
		
		for(int i=0;i<tempList.size();i++)
				{
			
			
			int j;
			int judgePara=1;
			
			
			
			
			for(j=0;j<invertedTable.size();j++)
			{
			if(invertedTable.get(j).contains(tempList.get(i)))
			{
				
				invertedTable.get(j).add(wordList.get(t)[0]);
				
				judgePara=0;
				break;
			}
			else
			{
				
			}
			
			}
			
			if(judgePara==1)
			{
				Set<String> set=new HashSet<String>();
				set.add(tempList.get(i));
				set.add(wordList.get(t)[0]);
				invertedTable.add(set);
				
				
				
			}
			
			
				}
			
		
			}
		
			return invertedTable;
		
	
	}
	
	
	
	
	
	
	private static List<String[]> idArrayGenerator(String keyWord,List<Set<String>> invertedTable)
	{
		List<String[]> idArray=new ArrayList<String[]>();
List<String> keyWordSubStrList=new ArrayList<String>();
		
		for(int i=0;i<keyWord.length()-1;i++){
			keyWordSubStrList.add(keyWord.substring(i, i+2));
		}
		
		
		for(int i=0;i<keyWordSubStrList.size();i++)
		{
			for(int j=0;j<invertedTable.size();j++)
			{
				if(invertedTable.get(j).contains(keyWordSubStrList.get(i)))
				{
					for(Iterator<String> it=invertedTable.get(j).iterator();it.hasNext();)
					{
						String singleIdTemp=it.next();
						if(Pattern.compile("[0-9]*").matcher(singleIdTemp).matches())
						
						
						
							
						{
						
						int judge=0;
						for(int p=0;p<idArray.size();p++)
						{
							
						if(idArray.get(p)[0]==singleIdTemp)
						{
							idArray.get(p)[1]=String.valueOf(Integer.parseInt(idArray.get(p)[1])+1);
							judge=1;
							break;
						}
						}
						if(judge==0)
						{
						String[]	normalArrayTemp={singleIdTemp,"1"};
						idArray.add(normalArrayTemp);
						}
						
						}
						else
						{
							
						}
					}
				}
			}
		}
		
		return idArray;
	}
	
	
	
	
	
	
	
	private static List<String> orderedListgenerator(List<String[]> idArray,int wordsDisplayAmount){
		
		List<String> orderedIdArray=new ArrayList<String>();
		
		for(int n=0;n<wordsDisplayAmount;n++)
		{
		

		String valueTemp;
		String[] unitTemp;
		
		unitTemp=idArray.get(0);
		valueTemp=idArray.get(0)[1];
		for(int i=0;i<idArray.size();i++)
		{
			if(Integer.parseInt(valueTemp)>=Integer.parseInt(idArray.get(i)[1]))
			{
				
			}
			else
			{
				valueTemp=idArray.get(i)[1];
				unitTemp=idArray.get(i);
			}
		}
		orderedIdArray.add(unitTemp[0]);
		idArray.remove(unitTemp);
		
		
		
		}
		
		return orderedIdArray;
	}
	
}
