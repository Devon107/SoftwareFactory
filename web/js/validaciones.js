var sep = new Array(4,4);
var sep2 = new Array(4,6,3,1);
var sep3 = new Array(8,1);
function mascara(d,sep,pat,nums){
if(d.valant !== d.value){
  val = d.value;
  largo = val.length;
  val = val.split(sep);
  val2 = '';
  for(r=0;r<val.length;r++){
    val2 += val[r];
  }
  if(nums){
    for(z=0;z<val2.length;z++){
      if(isNaN(val2.charAt(z))){
        letra = new RegExp(val2.charAt(z),"g");
        val2 = val2.replace(letra,"");
      }
    }
  }
  val = '';
  val3 = new Array();
  for(s=0; s<pat.length; s++){
    val3[s] = val2.substring(0,pat[s]);
    val2 = val2.substr(pat[s]);
  }
  for(q=0;q<val3.length; q++){
    if(q ===0){
      val = val3[q];
    }
    else{
      if(val3[q] !== ""){
        val += sep + val3[q];
        }
    }
  }
  d.value = val;
  d.valant = val;
  }
  }
  
  function NumCheck(e, field) {
    key = e.keyCode ? e.keyCode : e.which;
    if (key === 8)
        return true;
    if (field.value !== "") {
        if ((field.value.indexOf(".")) > 0) {
            if (key > 47 && key < 58) {
                if (field.value === "")
                    return true;
                regexp = /[0-9]{1,10}[\.][0-9]{1,3}$/;
                regexp = /[0-9]{2}$/;
                return !(regexp.test(field.value))
            }
        }
    }
    if (key > 47 && key < 58) {
        if (field.value === "")
            return true;
        regexp = /[0-9]{10}/;
        return !(regexp.test(field.value));
    }
    if (key === 46) {
        if (field.value === "")
            return false;
        regexp = /^[0-9]+$/;
        return regexp.test(field.value);

    }

    return false;
}
