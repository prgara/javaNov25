## Recap 

- Shell
- kernel

# Commands
touch
vi
ls , ls -l
rmdir
rm 
cp
mv
cat
rm -r
cd
pwd


# ls -l

permissions    memory   owner      group of owner  size    Date           fileName 
-rw-r--r--.      1      ec2-user   ec2-user         0      Dec 12 01:11    myfile.txt


drwxr-xr-x. 2 ec2-user ec2-user 6 Dec 12 01:15 myDir
-rw-r--r--. 1 ec2-user ec2-user 0 Dec 12 01:11 myfile.txt


ls -a -> shows hidden files as well

Absolute path -> complete path from root directory
Relative path -> current directory 

D:\Lectures\Pragra PPt -> Absolute 

      num of lines   num of words    bytes      filename
wc ->  1               7               34         myfile.txt
wc -> word count


grep -> search file for certain keyword.

sort -> to view sorted data
sort -r 


Owner     Group             Others
-rwx      r-x                 r-x

r -> read
w -> write
x -> execute


chmod -> changing permission of file or folder
       Owner   group    other   
chmod  7        0         0

r--   ---        ---
rwx   ---        ---

0 -> No permission
1 -> exceute permission
2 -> write permission
4 -> read permission

4+2+1 = 7

2+4 =6
chmod 600 file.txt

-> create a file
1. Owner can read write execute but group & other can have read only access
2. Read only for group and other (owner & other) can read write and execute
3. Owner can read write and remaining can execute only

Shell script -> .sh

echo -> print anything
./filename and press enter to execute


---> write a shell script to find whether num is positive or negative 
make use of elif and show if number is 0.
12 -> positive
-12 -> negative
0 -> say zero

Shebang  -> #!/bin/bash -> which interperter to be used
bash, Zsh, bournshell


