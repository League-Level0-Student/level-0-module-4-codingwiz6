PImage face;
void setup() {
  size(800,600);
  face=loadImage("Face2.png");
  face.resize(800,600);
}

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
 // x =310 y=300
 // x 50 y 50 
 // L 285 R 335 U 275 D 325
    if(mouseX <285){
     mouseX=285;
    }
    if(mouseX>335){
     mouseX=335; 
    }
    if(mouseY <275){
      mouseY=275;
    }
    if(mouseY>325){
     mouseY=325; 
    }
    
}
