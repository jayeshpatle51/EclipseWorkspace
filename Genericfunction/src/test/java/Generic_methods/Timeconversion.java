package Generic_methods;

public class Timeconversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String dt ="01:00:00PM";
        char ap = dt.charAt(dt.length() - 2);
        dt = dt.substring(0, dt.length() - 2);
        if (ap == 'A') {
            int hh = Integer.parseInt(dt.substring(0, 2));
            if (hh == 12) hh = 0;
            String s = Integer.toString(hh);
            if (s.length() == 1) {
                s = "0" + s;
            }
            System.out.println(s + dt.substring(2, dt.length()));
        } else {
            int hh = Integer.parseInt(dt.substring(0, 2));
            if (hh != 12) hh += 12;
            String s = Integer.toString(hh);
            if (s.length() == 1) {
                s = "0" + s;
            }
            System.out.println(s + dt.substring(2, dt.length()));
    
        }

		
	}

}
