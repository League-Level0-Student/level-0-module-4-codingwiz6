PImage face;
void setup() {
  size(800,600);
  face=loadImage("Face2.png");
  face.resize(800,600);
}
//465R 515L 275U 325D
void draw() {
  background(face);
  fill(44,176,255);
  ellipse(490,300,50,50); 
  fill(3,0,0);
  ellipse(mouseX+180,mouseY,15,15);
  fill(44,176,255);
  ellipse(310,300,50,50);
  fill(3,0,0);
  ellipse(mouseX,mouseY,15,15);
 
    if(mouseX <465){
     mouseX=465;
    }
    if(mouseX>515){
     mouseX=515; 
    }
    if(mouseY <275){
      mouseY=275;
    }
    if(mouseY>325){
     mouseY=325; 
    }
}
