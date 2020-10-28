PImage face;
void setup() {
  size(800,600);
  face=loadImage("Face2.png");
  face.resize(800,600);
}

void draw() {
  background(face);
  ellipse(490,300,50,50);
}
