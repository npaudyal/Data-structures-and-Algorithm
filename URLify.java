public String urlify(String str, int trueLength) {
  
  char[] ch = str.toCharArray();
  int spaces = 0;
  
  for(int i=0; i<trueLength; i++){
    if(ch[i] == ' '){
    spaces++;
    }
   
  }
  
  int index = trueLength + spaces *2;
  if(trueLength < ch.length()) ch[trueLength] ='\0';
  for(int i=trueLength-1; i>=0; i--){
    if(ch[i] = ' ') {
      ch[index-1] = '0';
      ch[index-2] = '2';
      ch[index-3] = '%';
      index = index-3;
    } else {
      ch[index-1] = ch[i];
      index--;
    }
    
  }
  return new String(ch);

}
