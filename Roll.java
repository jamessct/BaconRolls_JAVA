class Roll{
  private String name;
  private Bacon[] filling;

  public Roll(String name){
    this.name = name;
    this.filling = new Bacon[4];
  }

  public String getName(){
    return this.name;
  }

  public int baconCount(){
    int counter = 0;

    for(Bacon bacon : filling){
      if(bacon != null){
        counter++;
      }
    }
    return counter;
  }

  public void addBacon(Bacon bacon){
    if(heartAttackImminent()) return;
    int baconCount = baconCount();
    filling[baconCount] = bacon;
  }

  public boolean heartAttackImminent(){
    return baconCount() == filling.length;
  }

  public void vegetarian(){
    for(int i = 0; i < filling.length; i++){
    filling[i] = null;
    }
  }
}