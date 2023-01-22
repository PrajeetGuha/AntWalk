#Git Merging Assignment
## Fast Forward Merge

In fast forward merge, head of the master branch is the ancestor of the head of the branch that will get merged to it.

![FFMerge](https://user-images.githubusercontent.com/58776463/213901313-c4376498-f756-4c09-9645-3cb2142e26f6.png)

**Screenshots of FFMerge implementation is given below -**

**2 files created in the master branch**
![Screenshot1](https://user-images.githubusercontent.com/58776463/213901595-29dd77fc-3fc0-4999-b458-d2cc21a270a7.png)

**changes are staged and committed successfully**
![Screenshot2](https://user-images.githubusercontent.com/58776463/213901598-da8b1de7-a643-4ab3-a631-2f9e2fda622b.png)

**create a feature branch from master branch**
![Screenshot3](https://user-images.githubusercontent.com/58776463/213901600-fe7b993e-88c4-45d9-9cf8-7fde299ae3f9.png)

**create a new file**
![Screenshot4](https://user-images.githubusercontent.com/58776463/213901602-2c09244b-33b8-41b7-a399-7538ed29a749.png)

**new file is created**
![Screenshot5](https://user-images.githubusercontent.com/58776463/213901605-50d99c4a-71da-4dcc-9f4d-03b83304d382.png)

**stage changes**
![Screenshot6](https://user-images.githubusercontent.com/58776463/213901606-430d3e5f-4b5a-4161-8dcd-048eba034a93.png)

**changes committed**
![Screenshot7](https://user-images.githubusercontent.com/58776463/213901607-03a94539-c585-4c07-89c1-eff9cab1144b.png)

**switched to master branch**
![Screenshot8](https://user-images.githubusercontent.com/58776463/213901608-5295cdce-ef1e-45b1-be27-3cc6186eb1b7.png)

**merge feature branch**
![Screenshot9](https://user-images.githubusercontent.com/58776463/213901609-53504b44-5b21-4778-8d13-003ae6fd2643.png)

**feature branch merged successfully**
![Screenshot10](https://user-images.githubusercontent.com/58776463/213901610-d0b35d63-9b38-4ecc-a4fb-741da4895af9.png)

## Merging Without Conflict
**Screenshots of implementation is given below -**

**initial state of the directory**
![Screenshot1](https://user-images.githubusercontent.com/58776463/213902767-a1c458f3-bf2d-4460-82cf-e9dd1d3a8149.png)

**initial file is created, staged and committed to master branch**
![Screenshot2](https://user-images.githubusercontent.com/58776463/213902770-6b397980-78ef-4bee-87ac-56cbf3119889.png)

**feature branch is created from master**
![Screenshot3](https://user-images.githubusercontent.com/58776463/213902771-687b3d69-18c9-4729-8542-4a95c8436ccb.png)

**file is created, staged and committed to the feature branch**
![Screenshot4](https://user-images.githubusercontent.com/58776463/213902776-e996bb0a-8b98-4234-a18c-108dc24f8798.png)

**switched to master branch**
![Screenshot5](https://user-images.githubusercontent.com/58776463/213902779-de8375e9-0943-4362-b177-1698378f4abc.png)

**file is created, staged and committed to the master branch**
![Screenshot6](https://user-images.githubusercontent.com/58776463/213902780-132f5c45-6acc-413b-8887-1c82ad2b0ca1.png)

**merging action is undertaken. Merge message is typed**
![Screenshot7](https://user-images.githubusercontent.com/58776463/213902782-f4162420-0232-4cda-8fa2-ad93f14284e2.png)

**after merge message type, press esc and then :wq and enter**
![Screenshot8](https://user-images.githubusercontent.com/58776463/213902785-28a1ef1f-8027-45f3-a9ef-a9046c36da0f.png)

**branches are merged**
![Screenshot9](https://user-images.githubusercontent.com/58776463/213902787-7f80e465-4f46-4f3c-afeb-fa87ec906bed.png)

**log of commits**
![Screenshot (139)](https://user-images.githubusercontent.com/58776463/213903016-f31749b8-0b5e-4165-be57-4e1671b269b8.png)

## Merging With Conflict

**Screenshots of the implementation is given below -**

**Initial state of the directory**
![Screenshot1](https://user-images.githubusercontent.com/58776463/213903624-92602a13-ef71-42de-89a7-6695de0ce069.png)

**Repository initialized, file is added, staged and committed**
![Screenshot (141)](https://user-images.githubusercontent.com/58776463/213903628-352d963f-500f-48bc-8ba2-8cc6ac82882f.png)

**feature branch is created**
![Screenshot (142)](https://user-images.githubusercontent.com/58776463/213903689-076427d0-726c-4295-9d1d-c4f1434c44b0.png)

**The file is edited**
![Screenshot (143)](https://user-images.githubusercontent.com/58776463/213903656-6d1d0d67-d4fe-4b7a-8293-5ffcb69c4ecc.png)

**Changes are staged and committed to the feature branch**
![Screenshot (144)](https://user-images.githubusercontent.com/58776463/213903659-761f9fd1-f4b3-4d78-af55-36ca75e134a6.png)

**switched to master branch. File is changed**
![Screenshot (145)](https://user-images.githubusercontent.com/58776463/213903668-d9c399c6-da4d-4f32-baef-7da6abe13856.png)

**Changes are staged and committed**
![Screenshot (146)](https://user-images.githubusercontent.com/58776463/213903670-243b9c14-f69d-46e1-9dcd-8b3545db66d6.png)

**Feature branch merge is initiated**
![Screenshot (147)](https://user-images.githubusercontent.com/58776463/213903672-f46fa2a2-0713-40cf-b6bf-8730dc4001d4.png)

**Merge conflict. Moved to an intermediary stage where both changes are written to conflicting files**
![Screenshot (148)](https://user-images.githubusercontent.com/58776463/213903674-d63ca208-7985-42c6-bb98-05cfe31f889f.png)

**conflicting file can be edited**
![Screenshot (149)](https://user-images.githubusercontent.com/58776463/213903675-00926157-ddf4-484e-a469-a0fb478ea61b.png)

**conflicting file is edited**
![Screenshot (150)](https://user-images.githubusercontent.com/58776463/213903676-c439bfa2-f2f7-48fa-aba3-a1a4881835ce.png)

**After resolving conflict, the file is committed and merge is successful**
![Screenshot (151)](https://user-images.githubusercontent.com/58776463/213903677-93e48b88-58a5-4e9f-8784-3e87b2566a3b.png)
