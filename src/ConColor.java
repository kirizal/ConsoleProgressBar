package ConsoleUtils;

public class ConColor
{
	public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
	public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
	public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
	public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
	public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
	public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
	public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
	public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";




	public static boolean ColorCheck(String ansi_color)
	{
		if(ansi_color == ANSI_RESET ||
		   ansi_color == ANSI_BLACK ||
		   ansi_color == ANSI_RED ||
		   ansi_color == ANSI_GREEN ||
		   ansi_color == ANSI_YELLOW ||
		   ansi_color == ANSI_BLUE ||
		   ansi_color == ANSI_PURPLE ||
		   ansi_color == ANSI_CYAN ||
		   ansi_color == ANSI_WHITE ||
		   ansi_color == ANSI_BLACK_BACKGROUND ||
		   ansi_color == ANSI_RED_BACKGROUND ||
		   ansi_color == ANSI_GREEN_BACKGROUND ||
		   ansi_color == ANSI_YELLOW_BACKGROUND ||
		   ansi_color == ANSI_BLUE_BACKGROUND ||
		   ansi_color == ANSI_PURPLE_BACKGROUND ||
		   ansi_color == ANSI_CYAN_BACKGROUND ||
		   ansi_color == ANSI_WHITE_BACKGROUND) return true;
		else return false;
	}
}