
	/***********  SOUND ***************
	 * Some computers are unable to play sounds. 
	 * If you cannot play sound on this computer, set canPlaySounds to false.
	 * If you are not sure, ask your teacher 
	 * *****************/
boolean canPlaySounds = false;

void setup() {
  
  //Find a Where's Waldo picture and drop it into this sketch.     
  PImage waldo = loadImage("waldo.jpeg"); // Change this to match your file name.
  size(800, 400); 
  // Resize your waldo picture to the same size as the sketch
  waldo.resize(800,400);
  // Make the waldo image your sketch background
background(waldo);
}

void draw() {

      // If the user presses the mouse .......
  if(mousePressed) {
          // Use this print statement to help you find the 
          //location of Waldo to use in the code below
      //  println("X: " + mouseX + " Y: " + mouseY); 
    /* New
      Left X 498 Left Y 121
      Right X 559 Right Y 146     
      Up X 527 Up Y 97
      Down X 529 Down Y 253
    */
          // Check if the location of the mouse is anywhere on the image of Waldo.
          // If it is, print “Waldo found!”  Use the text() command to write it on the sketch.
 if(mouseX<559 && mouseX>498 && mouseY>97 && mouseY<253) {
           
             text("You found Waldo" ,500,100);
          }
          // However, if the mouse is not on Waldo, print "Not here!" 
          // Use the text() command to write it on the sketch. 
        else{
         text("Waldo is not here" ,400,200); 
        }
                
  }
                
}

/*********************  This code is needed to play sounds. ********************
              Remove the comment markers below, but DON'T CHANGE THE CODE */
              

/*
import ddf.minim.*;
Minim minim = new Minim(this); 

AudioSample woohoo;
void playWoohoo() {
     if (woohoo == null) 
         woohoo = minim.loadSample("homer-woohoo.wav");
     woohoo.stop();
     woohoo.trigger();
}

AudioSample doh;
void playDoh() {
     if (doh == null)
         doh = minim.loadSample("homer-doh.wav"); 
     doh.stop();
     doh.trigger();
}
*/
