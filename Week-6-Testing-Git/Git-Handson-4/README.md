# Git Hands-on 4

## Objective

Learn how to resolve merge conflicts in Git by creating conflicting changes in different branches, manually resolving the conflict, updating `.gitignore`, and completing the merge.

---

## Steps Completed

1. Initialized a new Git repository.
2. Created `hello.xml` and committed the initial version.
3. Renamed the default branch to `main`.
4. Created a new branch named `GitWork`.
5. Modified `hello.xml` in the `GitWork` branch and committed the changes.
6. Switched back to the `main` branch.
7. Modified `hello.xml` with different content and committed the changes.
8. Viewed the commit history using Git graph.
9. Compared the differences between the branches using `git diff`.
10. Merged `GitWork` into `main`, resulting in a merge conflict.
11. Resolved the merge conflict manually.
12. Committed the resolved merge.
13. Created a `.gitignore` file and ignored backup (`*.bak`) files.
14. Committed the updated `.gitignore`.
15. Deleted the merged branch.
16. Viewed the final commit history.
17. Connected the repository to GitHub.
18. Pushed the repository successfully.

---

## Commands Used

```bash
git init

git status

echo "<message>Hello Git</message>" > hello.xml

git add .
git commit -m "Initial hello.xml"

git branch -M main

git branch GitWork
git checkout GitWork

git add .
git commit -m "Updated hello.xml in GitWork"

git checkout main

git add .
git commit -m "Updated hello.xml in main"

git log --oneline --graph --decorate --all

git diff main GitWork

git merge GitWork

git add .
git commit -m "Resolved merge conflict"

git add .
git commit -m "Added backup files to gitignore"

git branch

git branch -d GitWork

git log --oneline --graph --decorate

git remote add origin https://github.com/Jeet-Lohar-29/GitConflictDemo.git

git push -u origin main
```

---

## Files Created

```
GitConflictDemo/
│
├── hello.xml
├── .gitignore
└── .git/
```

---

## .gitignore Contents

```gitignore
*.bak
```

---

## Merge Conflict Resolution

Both branches modified `hello.xml` differently.

The conflict was resolved manually by editing the file and committing the final merged version.

---

## Result

- Successfully created and merged branches.
- Successfully generated and resolved a merge conflict.
- Successfully committed the resolved merge.
- Successfully ignored backup files using `.gitignore`.
- Successfully deleted the merged branch.
- Successfully pushed the repository to GitHub.

---

## GitHub Repository

```
https://github.com/Jeet-Lohar-29/GitConflictDemo
```