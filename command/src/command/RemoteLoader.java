package command;


public class RemoteLoader {
 
	public static void main(String[] args) {
		// 1. make an instance of the invoker, RemoteControl Class
//              RemoteControlWithUndo remote=new RemoteControlWithUndo();
            Light light=new Light("light is on");
             Command onLight=new LightonCommand(light);
                 Command offLight=new LightoffCommand(light);
//              remote.setCommand(0, onLight, offLight);
		// 2.  set the commands related to the light receiver on the slot 0 of the invoker
//              remote.onButtonWasPushed(0);
//              remote.offButtonWasPushed(0);
             // System.out.println(remote.toString());
//               remote.undoButtonWasPushed();
//               remote.offButtonWasPushed(0);
//               remote.onButtonWasPushed(0);
            //   System.out.println(remote.toString());
             
		// 3. trigger the action that switch the light on, then trigger the light that switch it off
 
		


		// 4. undo the last command
		

		// 5. repeat steps 3 and 4 but this time in 3, switch the light off then on after that trigger the undo 

	CeilingFan ceilingFan = new CeilingFan("Living Room");
        Command lowFan=new CeilingFanLowCommand(ceilingFan);
         Command medFan=new CeilingFanMediumCommand(ceilingFan);
         Command highFan=new CeilingFanHighCommand(ceilingFan);
         Command offFan=new CeilingFanoffCommand(ceilingFan);
		// 6. set the commands related to the fan on slots 1,2,3, in the order Low, medium, and high
         RemoteControlWithUndo remote=new RemoteControlWithUndo();
//                remote.setCommand(1, lowFan, offFan);
//           remote.setCommand(2, medFan, offFan);
//           remote.setCommand(3, highFan, offFan);
//            System.out.println(remote);
//            remote.onButtonWasPushed(1);
//            remote.offButtonWasPushed(1);
//            remote.undoButtonWasPushed();
//            remote.onButtonWasPushed(3);
//            remote.undoButtonWasPushed();
Command[]on={lowFan,medFan,highFan};
Command[]of={offFan,offFan,offFan};
RunThemAll onn=new RunThemAll(on);
RunThemAll off=new RunThemAll(of);
remote.setCommand(0, onn, off);
remote.offButtonWasPushed(0);
remote.onButtonWasPushed(0);
remote.undoButtonWasPushed();
            System.out.println(remote);
           // System.out.println(remote.toString());
		// 7. switch the fan on on low speed, then switch it off, after that trigger the undo
   RemoteControl3Undo remote3=new RemoteControl3Undo();
         remote3.setCommand(0, onLight, offLight);
	 remote3.setCommand(1, lowFan, offFan);
           remote3.setCommand(2, medFan, offFan);
           remote3.setCommand(3, highFan, offFan);
       
            remote3.onButtonWasPushed(1);
            remote3.onButtonWasPushed(2);
            remote3.onButtonWasPushed(3);
            remote3.offButtonWasPushed(1);
             //  System.out.println(remote3.toString());
            remote3.undoButtonWasPushed();
      
           // System.out.println(remote3.toString());

		// 8. now run the fan on high speed


		// 9. undo the command in 8
  
		
	}
}
