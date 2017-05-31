
public class Excercise3 {	
	public static long Tri(long num){
		return (num * (num + 1))/2;
		
	}
	
	public static long lazy(long num){
		return (num*num + num + 2)/2;
		
	}
	
	public static void main(String[] args) {
		if(args.length < 2){
			System.out.println("Missing arguments!");
			System.exit(1);
		}
		
		if(args[0].equalsIgnoreCase("triangle")){
			long n = 0;
			
			try{
				n = Long.parseLong(args[1]);
			
			}catch(NumberFormatException nfe){
				System.out.println("Invalid number!");
				System.exit(2);
				
			}
			
			System.out.println("Tri(" + n + ") = " + Tri(n));
			
		}else if(args[0].equalsIgnoreCase("lazy")){
			long n = 0;
			
			try{
				n = Long.parseLong(args[1]);
			
			}catch(NumberFormatException nfe){
				System.out.println("Invalid number!");
				System.exit(2);
				
			}
			
			System.out.println("Lazy(" + n + ") = "+ lazy(n));
			
		}
	}

}
