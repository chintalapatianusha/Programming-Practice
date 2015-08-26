package com.test.string;

	public class StrgReplace {

		public static void main(String[] args) {

		    String words = "“hello Eric Erik”";

		    String from = "E";

		    String to = "H";




		    System.out.println(replace(words, from, to));

		}

		

		public static String replace(String aInput, String aOldPattern, String aNewPattern)

	    {

	         if ( aOldPattern.equals("") ) {

	            throw new IllegalArgumentException("Old pattern must have content.");

	         }




	         final StringBuffer result = new StringBuffer();

	         int startIdx = 0;

	         int idxOld = 0;

	         while ((idxOld = aInput.indexOf(aOldPattern, startIdx)) >= 0) {

	           result.append( aInput.substring(startIdx, idxOld) );

	           result.append( aNewPattern );




	           //reset the startIdx to just after the current match, to see

	           //if there are any further matches

	           startIdx = idxOld + aOldPattern.length();

	         }

	         //the final chunk will go to the end of aInput

	         result.append( aInput.substring(startIdx) );

	         return result.toString();

	      }

	}

