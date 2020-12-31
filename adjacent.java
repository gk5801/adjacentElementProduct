static int adjacentElementsProduct(int[] arr )
{
 int[] product = new int[20];
    
    for(int i=0;i<arr.length-1;i++)
    {
        product[i] = arr[i] * arr[i+1]; 
    }
    int great = product[0]; 
    for(int j=0;j<product.length;j++)
    {
        if(great < product[j])
        {
            great = product[j];
        }
    }
   return great;
}

