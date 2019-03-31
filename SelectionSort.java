
/**
 * Implementation of SelectionSort.
 * 
 * @author jefcha
 */
public class SelectionSort extends SortAlgorithm
{
	
	/**
	 * Sort array.
	 * 
	 * @param array Array to be sorted.
	 */
    public void sort(int[] array) {
        
		//set the temporary variables
		//Temp stores the lowest integer
		//spot stores the position of the lowest variable			
		int temp=0; 
		int spot=0;

		//iterates through the array
		for(int i=0;i<array.length;i++)
		{
			
			//places the position of the array in temp
			temp = array[i];

			//iterates through the array starting at the position
			for(int j=i;j<array.length;j++)
			{
				//checks to see if the current value is less than the value
				//in the temporary position
				if(array[j]<temp)
				{
					//if it is, we place this value into the temporary spot
					temp=array[j];

					//and we remember the position.
					spot=j;
				}				
			}

			//checks to see if the temp position has been changed
			if(temp!=array[i])
			{
				//if it isn't we place the inital position into array
				//represented by spot
				array[spot]=array[i];
					
				//and we then place the value in temp into the inital array
				array[i]=temp;
			}

		//and we start all over again
		}

    } // end of sort()


} // end of class SelectionSort
