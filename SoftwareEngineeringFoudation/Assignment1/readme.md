# Assignment

### Convert 24F from Hexadecimal to Binary.

![hex2bin](https://user-images.githubusercontent.com/58776463/213848451-5d8fc713-5f2a-4ca7-909a-7b011f667c7a.png)

### Convert 723 from Octal to Binary.

![oct2bin](https://user-images.githubusercontent.com/58776463/213849063-289a3a56-0f0d-44c0-8edf-294a2a8ce04a.png)

### List down the input and output of a Domino's Online Store.

**The inputs to the Domino's Online Store are -**
- Customer's Name
- Customer's Contact Details
- Customer's Location/Residential/Delivery Details
- Customer's Email Address
- Customer's Choice of Items from The Menu
- CUstomer's Prefereble variety of toppings/crust or additional sides for the items they have choosen
- Customer's Preferable Mode on Payment
- Customer's Payment Details
- Any Offer Coupon that Customer wants to Redeem
- Whether customer want to cancel/place an order
- Customer's Feedback/Rating for the service provided

**The outputs to the Domino's Online Store are -**
- A interactive and immersive UI for the online store which is easily accessible and usable by anyone
- Dynamic and Extensive Variety of Items in the Menu
- Offers
- Order Bill
- Delivery of the Order in the Most Efficient Way(Which is Fast, Reliable and Safe)
- Recommendation of Items Based on Customer's Feedback/Rating and Browsing Activity

### Create a repository, add 2 files file1.txt, file2.txt, commit them and then modify file2.txt and commit it.

**Screeshots of the implementation is given below**

**The directory and the initial state**
![Screenshot1](https://user-images.githubusercontent.com/58776463/213862447-3385d559-f8ff-4733-bc5b-fe81c243908e.png)

**Make a directory**
![Screenshot2](https://user-images.githubusercontent.com/58776463/213862449-4f06e949-ba13-4fa3-82b0-0edff4bee31a.png)

**The directory is made. Move into that directory**
![Screenshot3](https://user-images.githubusercontent.com/58776463/213862451-5a9abf17-c317-4bda-a652-6860748c5b5f.png)

**Moved into the directory**
![Screenshot4](https://user-images.githubusercontent.com/58776463/213862454-c2f54da3-0236-43ce-9c68-46c4a95e3bc9.png)

**Initialize a git repository**
![Screenshot5](https://user-images.githubusercontent.com/58776463/213862455-d39ec0df-a725-419b-9b7e-9598bdf000be.png)

**Git repository is initialized**
![Screenshot6](https://user-images.githubusercontent.com/58776463/213862457-386dfd54-4eed-45da-b028-aa5df3e3da9d.png)

**Create a file**
![Screenshot7](https://user-images.githubusercontent.com/58776463/213862458-03afefdc-d443-4b9e-9a47-c60a21ea578b.png)

**The file is created**
![Screenshot8](https://user-images.githubusercontent.com/58776463/213862460-d56b1d64-04aa-4219-b9e4-795df954c84b.png)

**Create another file**
![Screenshot9](https://user-images.githubusercontent.com/58776463/213862461-64d84b92-1d04-4e3e-972e-b987e23b876f.png)

**The file is created**
![Screenshot10](https://user-images.githubusercontent.com/58776463/213862462-9b4c7bbf-5094-46f6-bb46-e911605f2181.png)

**Stage changes**
![Screenshot11](https://user-images.githubusercontent.com/58776463/213862463-e0d98c78-16f1-41e8-8f47-c94d5572f216.png)

**Commit changes**
![Screenshot12](https://user-images.githubusercontent.com/58776463/213862466-41f59561-b6da-4ad0-a35a-48317cad5c90.png)

**Changes are committed**
![Screenshot13](https://user-images.githubusercontent.com/58776463/213862467-a611174c-fa01-4e7c-9af3-10a421c61bfd.png)

**Modify a file**
![Screenshot14](https://user-images.githubusercontent.com/58776463/213862469-b694f3ad-88fe-41bb-b00a-9f2ca9298517.png)

**Check status**
![Screenshot15](https://user-images.githubusercontent.com/58776463/213862470-d514518d-91f6-4fce-b08f-1387ea77bae6.png)

**Stage changes**
![Screenshot16](https://user-images.githubusercontent.com/58776463/213862471-bdc6c907-7bc8-414d-bde5-78f4ff482208.png)

**Commit changes**
![Screenshot17](https://user-images.githubusercontent.com/58776463/213862472-efd11954-f4ea-4375-91c1-2754e8fd0e14.png)

**Changes committed successfully**
![Screenshot18](https://user-images.githubusercontent.com/58776463/213862473-a36399e8-b359-4a9e-bb64-f3b62c2f8700.png)

**Check git log**
![Screenshot19](https://user-images.githubusercontent.com/58776463/213862474-964866a3-8fe8-4fc5-b099-2b7fda89edbd.png)

### Create a logic function to compare two sets of numbers.

Let F1(P,Q) be the logic function where if P > Q then it gives 1 else 0.
Let F2(P,Q) be the logic function where if P = Q then it gives 1 else 0.
Let F3(P,Q) be the logic function where if P < Q then it gives 1 else 0.

A subtractor logic -
D(p,q,Bin) = p XOR q XOR Bin
Bout(p,q,Bin) = p'.Bin + p'.q + q.Bin

![image](https://user-images.githubusercontent.com/58776463/213864692-4325ea43-6427-446d-ac36-dd38654c751e.png)

The above are subtractor logic of 1-bit number. In n-bit subtractor, the Bout of lower position bit is fed into Bin of higher position bit.
A 4-bit logic circuit for adder-subractor is given below -

![image](https://user-images.githubusercontent.com/58776463/213864780-16b81247-fd45-482d-8614-ce88cde26382.png)

Let the N bit number be A and B. The C0 will be 1. The output will be Sn.....S0 of N-bit and 1-bit Bout.

Let Z = ![sum](https://user-images.githubusercontent.com/58776463/213864928-c3cdb344-e5f1-4947-8080-bf5ecdbe2f2e.png)

F2(A,B) = Z'

F1(A,B) = Z.Bout'

F3(A,B) = Z.Bout
