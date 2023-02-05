# Assignment 6

## Objective

Create a terminal application for Shopping.

## Requirements

It should have 3 classes - Customer(name, email, phone), Product(name, brand, qty, price) and Cart(id, prodList, Total)
- create 5 product(whichever product is added to cart,the qty of that product should reduce by 1)
- Print Cart Total,Cart detail(all product with details name,price,qty)

Inventory- list of all the products with quantity(optional)

## Implementation
- Customer objects are kept in a collection.
- Each customer is allocated a Cart object.
- Each Cart can have 0 and more Product objects.
- Inventory has collection of Product objects. Only one object of Inventory can be used.
- Whenever a new Product is registered, it is added to the Inventory.
- When a Product is to be added to Cart of a Customer, the quantity added is reduced from the Inventory and a deep copy object of the same Product is added to the Customer card.
- Similarly, Product removal from Cart reduces object quantity from the Cart and increases the quantity in the Inventory.

The interaction between various objects are given below -

![interaction](https://user-images.githubusercontent.com/58776463/216822596-3a2c7eb7-7b92-4367-89c4-3709ddee49a6.png)

## Output

```
PS C:\Users\RICK\Documents\AntWalk\Assignment6\src\model> cd "c:\Users\RICK\Documents\AntWalk\Assignment6\src\" ; if ($?) { javac App.java } ; if ($?) { java App }
Choose an option:
1. Add a customer(Register new customer)
2. Add a product to the inventory(Product is already registered)
3. Remove a product from the inventory
4. See all customers
5. Add a product to a customer's cart
6. Remove a product from customer's cart
7. Add new product to the inventory(Register new product)
8. Show all products in inventory
9. Exit
Enter option: 1
Enter name: prajeet
Enter email: pro@gmail.com
Enter phone: 1234567889
Choose an option:
1. Add a customer(Register new customer)
2. Add a product to the inventory(Product is already registered)
3. Remove a product from the inventory
4. See all customers
5. Add a product to a customer's cart
6. Remove a product from customer's cart
7. Add new product to the inventory(Register new product)
8. Show all products in inventory
9. Exit
Enter option: 7
Enter product name: Fan
Enter product brand: Havells
Enter product quantity: 200
Enter product price: 1200
Choose an option:
1. Add a customer(Register new customer)
2. Add a product to the inventory(Product is already registered)
3. Remove a product from the inventory
4. See all customers
5. Add a product to a customer's cart
6. Remove a product from customer's cart
7. Add new product to the inventory(Register new product)
8. Show all products in inventory
9. Exit
Enter option: 7
Enter product name: Bottle
Enter product brand: Tupperware
Enter product quantity: 100
Enter product price: 1000
Choose an option:
1. Add a customer(Register new customer)
2. Add a product to the inventory(Product is already registered)
3. Remove a product from the inventory
4. See all customers
5. Add a product to a customer's cart
6. Remove a product from customer's cart
7. Add new product to the inventory(Register new product)
8. Show all products in inventory
9. Exit
Enter option: 7
Enter product name: Cabinet
Enter product brand: Antec
Enter product quantity: 400
Enter product price: 2000
Choose an option:
1. Add a customer(Register new customer)
2. Add a product to the inventory(Product is already registered)
3. Remove a product from the inventory
4. See all customers
5. Add a product to a customer's cart
6. Remove a product from customer's cart
7. Add new product to the inventory(Register new product)
8. Show all products in inventory
9. Exit
Enter option: 7
Enter product name: Chips
Enter product brand: Lays
Enter product quantity: 1000
Enter product price: 50
Choose an option:
1. Add a customer(Register new customer)
2. Add a product to the inventory(Product is already registered)
3. Remove a product from the inventory
4. See all customers
5. Add a product to a customer's cart
6. Remove a product from customer's cart
7. Add new product to the inventory(Register new product)
8. Show all products in inventory
9. Exit
Enter option: 7
Enter product name: Mobile
Enter product brand: Redmi
Enter product quantity: 10
Enter product price: 12000
Choose an option:
1. Add a customer(Register new customer)
2. Add a product to the inventory(Product is already registered)
3. Remove a product from the inventory
4. See all customers
5. Add a product to a customer's cart
6. Remove a product from customer's cart
7. Add new product to the inventory(Register new product)
8. Show all products in inventory
9. Exit
Enter option: 8
Inventory [products=[Product [product_id=1, name=Fan, brand=Havells, price=1200.0, qty=200], Product [product_id=2, name=Bottle, brand=Tupperware, price=1000.0, qty=100], Product [product_id=3, name=Cabinet, brand=Antec, price=2000.0, qty=400], Product [product_id=4, name=Chips, brand=Lays, price=50.0, qty=1000], Product [product_id=5, name=Mobile, brand=Redmi, price=12000.0, qty=10]]]
Choose an option:
1. Add a customer(Register new customer)
2. Add a product to the inventory(Product is already registered)
3. Remove a product from the inventory
4. See all customers
5. Add a product to a customer's cart
6. Remove a product from customer's cart
7. Add new product to the inventory(Register new product)
8. Show all products in inventory
9. Exit
Enter option: 2
Enter product_id: 3
Enter quantity to add: 20
Choose an option:
1. Add a customer(Register new customer)
2. Add a product to the inventory(Product is already registered)
3. Remove a product from the inventory
4. See all customers
5. Add a product to a customer's cart
6. Remove a product from customer's cart
7. Add new product to the inventory(Register new product)
8. Show all products in inventory
9. Exit
Enter option: 3
Enter product_id: 1
Enter quantity to remove: 2
Choose an option:
1. Add a customer(Register new customer)
2. Add a product to the inventory(Product is already registered)
3. Remove a product from the inventory
4. See all customers
5. Add a product to a customer's cart
6. Remove a product from customer's cart
7. Add new product to the inventory(Register new product)
8. Show all products in inventory
9. Exit
Enter option: 8
Inventory [products=[Product [product_id=1, name=Fan, brand=Havells, price=1200.0, qty=198], Product [product_id=2, name=Bottle, brand=Tupperware, price=1000.0, qty=100], Product [product_id=3, name=Cabinet, brand=Antec, price=2000.0, qty=420], Product [product_id=4, name=Chips, brand=Lays, price=50.0, qty=1000], Product [product_id=5, name=Mobile, brand=Redmi, price=12000.0, qty=10]]]
Choose an option:
1. Add a customer(Register new customer)
2. Add a product to the inventory(Product is already registered)
3. Remove a product from the inventory
4. See all customers
5. Add a product to a customer's cart
6. Remove a product from customer's cart
7. Add new product to the inventory(Register new product)
8. Show all products in inventory
9. Exit
Enter option: 5
Enter customer id: 1
Enter product id: 3
Quantity: 4
Choose an option:
1. Add a customer(Register new customer)
2. Add a product to the inventory(Product is already registered)
3. Remove a product from the inventory
4. See all customers
5. Add a product to a customer's cart
6. Remove a product from customer's cart
7. Add new product to the inventory(Register new product)
8. Show all products in inventory
9. Exit
Enter option: 4
[Customer [customer_id=1, name=prajeet, email=pro@gmail.com, phone=1234567889, cart=Cart [card_id=1, products=[Product [product_id=3, name=Cabinet, brand=Antec, price=2000.0, qty=4]], total_price=8000.0]]]
Choose an option:
1. Add a customer(Register new customer)
2. Add a product to the inventory(Product is already registered)
3. Remove a product from the inventory
4. See all customers
5. Add a product to a customer's cart
6. Remove a product from customer's cart
7. Add new product to the inventory(Register new product)
8. Show all products in inventory
9. Exit
Enter option: 9
GoodByee!!
PS C:\Users\RICK\Documents\AntWalk\Assignment6\src>
```
