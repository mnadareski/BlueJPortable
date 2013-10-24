
/*
 * Copyright (C) 2009-2010, OpenSCG. All Rights Reserved.
 *
 */

import java.io.*;
import java.net.*;

public class PortChecker {

    public static void main(String[] args) {

	int port=0;

	if (args.length == 1) {
    	  try {
	        port = Integer.parseInt(args[0]);
	    } catch (NumberFormatException e) {
	        System.err.println("INVALID ARGUMENT: must be an integer.");
	        System.exit(2);
	    }
      	} else {
	    System.err.println("A single integer argument is required");
	    System.exit(2);
	}

	try {
	    ServerSocket srv = new ServerSocket(port);
	    srv.close(); 
	    srv = null;
	    System.exit(0);
	} catch (IOException e) {
	    System.exit(1);
	}
    }

}
