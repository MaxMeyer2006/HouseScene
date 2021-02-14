import processing.core.PApplet;

public class Square extends Rect {
  
  Square(PApplet p){
    super(p);
  }
  
  @Override
  void draw(int x, int y){
    p.push();
    p.fill(255,175,245);
    p.rect(x,y, 100, 100);
    p.pop();
  }
  
}
