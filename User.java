enum Rank{
	Major,
	Colonel,
	General,
	Captain
}
Rank a = Rank.Major;
 switch(a){
 	case Major:
 		System.out.println("the Major says fire");
 	case General:
 		System.out.println("hold your fire Captain");
 }