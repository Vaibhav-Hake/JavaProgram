class DefiningIp {
    public static String defangIPaddr(String address) {
        return address.replace(".","[.]");
    }
	public static void main(String[]args)
	{
		System.out.println(defangIPaddr("11.532.13.4"));
	}
}