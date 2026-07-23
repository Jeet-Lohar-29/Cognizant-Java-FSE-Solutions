# Git Hands-on 3

## Objective

Learn Git branching and merging by creating a new branch, making changes, comparing branches, merging the branch into the main branch, and deleting the merged branch.

---

## Steps Completed

1. Created a new local Git repository.
2. Created the initial file `welcome.txt`.
3. Committed the initial version to the `main` branch.
4. Created a new branch named `GitNewBranch`.
5. Switched to the new branch.
6. Modified `welcome.txt`.
7. Committed the changes in `GitNewBranch`.
8. Verified the repository status.
9. Switched back to the `main` branch.
10. Compared the differences between `main` and `GitNewBranch`.
11. Merged `GitNewBranch` into `main`.
12. Displayed the commit history using Git graph.
13. Deleted the merged branch.
14. Connected the local repository to GitHub.
15. Pushed the repository successfully.

---

## Commands Used

```bash
git init

git status

echo "This is the Master Branch" > welcome.txt

git add .
git commit -m "Initial Commit"

git branch -M main

git branch GitNewBranch

git branch

git checkout GitNewBranch

Add-Content welcome.txt "This line was added in GitNewBranch"

git status
git add .
git commit -m "Added content in GitNewBranch"

git checkout main

git diff main GitNewBranch

git merge GitNewBranch

git log --oneline --graph --decorate

git branch -d GitNewBranch

git status

git remote add origin https://github.com/Jeet-Lohar-29/GitBranchDemo.git

git remote -v

git push -u origin main
```

---

## Files Created

```
GitBranchDemo/
│
├── welcome.txt
└── .git/
```

---

## Branch Structure

```
main
   │
   └── GitNewBranch
            │
            └── Added new content
                   │
                   ▼
              Merged into main
```

---

## Result

- Successfully created a new branch.
- Successfully switched between branches.
- Successfully committed changes in the feature branch.
- Successfully compared branch differences.
- Successfully merged the feature branch into the main branch.
- Successfully viewed the commit graph.
- Successfully deleted the merged branch.
- Successfully pushed the repository to GitHub.

---

## GitHub Repository

```
https://github.com/Jeet-Lohar-29/GitBranchDemo
```