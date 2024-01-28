package com.training.inheritance;

public class MobileMain {

	public MobileMain() {
		
		SmartPhone sp = new SmartPhone("Apple","iPhone",2000,"Swiggy", "Whatsup");
		sp.printOut();
		FeaturePhone fp = new FeaturePhone("Nokia","SPhone",2000,"Spongy");
		fp.printOut();
		Mobile mb = new Mobile("BlackBerry","Z260",345);
		mb.printOut();
		
		
	}

}
//Create main class as MobileMain
	// Create SmartPhone Obj and call getDetails and showApps ("Swiggy", "Whatsapp", "insta")
	// Create featurePhone Obj and Call.