import * as funcoes from "./modules/function";
import { minhaPromisse } from "./modules/promisse"

// minhaPromisse()
//   .then(response => {
//     console.log(response);
//   })
//   .catch(err => {
//   })


async function executaPromisse() {
  console.log(await minhaPromisse())
  console.log(await minhaPromisse())
  console.log(await minhaPromisse())
}

executaPromisse();