let num = [1,2,4,10,20,30,11,21,32,44,556,77,999,91,101,71];

num.forEach(item => {
  if(item % 2 === 0){
    document.write(`${item} é Par<br>`)
  } else {
    document.write(`${item} é Impar<br>`)
  }
})