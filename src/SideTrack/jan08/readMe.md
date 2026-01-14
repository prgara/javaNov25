 ## Recap

- Git
- Github
- VCS ?
- init, add
- git commit -m "" -> snapshot of the code


These are common Git commands used in various situations:

start a working area (see also: git help tutorial)
clone      Clone a repository into a new directory
init       Create an empty Git repository or reinitialize an existing one

work on the current change (see also: git help everyday)
add        Add file contents to the index
mv         Move or rename a file, a directory, or a symlink
restore    Restore working tree files
rm         Remove files from the working tree and from the index

examine the history and state (see also: git help revisions)
bisect     Use binary search to find the commit that introduced a bug
diff       Show changes between commits, commit and working tree, etc
grep       Print lines matching a pattern
log        Show commit logs
show       Show various types of objects
status     Show the working tree status

grow, mark and tweak your common history
backfill   Download missing objects in a partial clone
branch     List, create, or delete branches
commit     Record changes to the repository
merge      Join two or more development histories together
rebase     Reapply commits on top of another base tip
reset      Reset current HEAD to the specified state
switch     Switch branches
tag        Create, list, delete or verify a tag object signed with GPG

collaborate (see also: git help workflows)
fetch      Download objects and refs from another repository
pull       Fetch from and integrate with another repository or a local branch
push       Update remote refs along with associated objects



Can we directly experiment on live code ? 

Calculator (add , sub, multi, div)
trignometry


Branch -> It is an independent line of development. It is a seprate workplace created from the exiting code.
Develop new features, fix bugs, Release safely without breaking the production


Branching strategy 

Back merge

3 branching startergy

Release management

Hotfix -> you ahve a bug in prod and product wants fix asap

you will create a hotfix branch from the main branch and fix the bug and then merge 
the same changes to release as well as develop branch and at the same time you will promote the changes to the prod.



Production - 1.0.0

Main  - 1.0.0   -> hotfix branch -> prod -> 1.0.0
Release - 1.2.0 (Testing) merge hotfix changes in release as well as develop
Develop - 1.2.0 

Monthly release - first sat of each month 

Functional & non functional 

git pull -> it is used to get the latest code form the remote into the local
PullRequest -> it is used create a request to merge one branch to another. Review - protected 
push -> to push you local branch change to remote branch repo
merge -> merge one branch to another


git branch -> to check the branches
git branch branchName -> to create a new branch with branchName
git checkout -b branchName -> create  anew branch with BranchName and checkout to that branch


- different env and 1 more branching startegy
- Release management





