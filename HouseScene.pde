Rect r;
Square s;

void setup(){
  r= new Rect(this);
  s= new Square(this);
  print("The name of this class is" + s.toString());
  size(800, 600);
}


void draw(){
  background(45, 211, 250);
  r.draw(120,120);
  s.draw(350,100);
}
