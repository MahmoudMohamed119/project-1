//console.log("hello");

//console.log("mahmoud");
//console.log("mohamed");
let x: string;
x = "Ali";
x = "youssef";
//console.log(x);

let cars: (string | number | Date)[] = [
  "mahmoud",
  "djsjdjsk",
  3,
  "fsh",
  87,
  new Date(),
];
cars.push("Ali");
cars.push(999);
//console.log(cars);
//console.log(cars[0]);

let obj: {
  readonly id: number;
  name: string;
  age?: number;
  data: { sub1: number; sub2: number };
} = {
  id: 1,
  name: "NNNN",
  data: {
    sub1: 45,
    sub2: 36,
  },
};
console.log(obj.name);

type mix = string | number;
type datauser = {
  readonly id: number;
  name: string;
  age?: number;
  car?: string;
};

let user: datauser = {
  id: 23,
  name: "LLLL",
  car: "BMW",
};
//user.id= 45;
user.name = "AAAA";
console.log(user.id, "   ", user.name);
