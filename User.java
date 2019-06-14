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
 		break;
 	case General:
 		System.out.println("hold your fire Captain");
 		break;
 	case Captain:
 		System.out.println("jowel herr general");
 		break;
 }