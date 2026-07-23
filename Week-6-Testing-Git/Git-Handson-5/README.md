# Git Hands-on 5

## Objective

Learn how to synchronize a local Git repository with a remote repository by performing pull and push operations.

---

## Steps Completed

1. Created the Git-Handson-5 project.
2. Cloned the remote GitHub repository.
3. Verified the repository status.
4. Listed all local and remote branches.
5. Pulled the latest changes from the remote repository.
6. Modified the project by updating `hello.xml`.
7. Verified the repository status.
8. Staged and committed the local changes.
9. Attempted to push the changes to GitHub.

---

## Commands Used

```bash
git clone https://github.com/Jeet-Lohar-29/GitConflictDemo.git

cd GitConflictDemo

git status

git branch

git branch -a

git pull origin main

git status

git add .

git commit -m "Verified remote synchronization"

git push origin main
```

---

## Files Modified

```
GitConflictDemo/
│
└── hello.xml
```

---

## Result

- Successfully cloned the remote repository.
- Successfully synchronized the local repository using `git pull`.
- Successfully created and committed a local change.
- Push to the remote repository could not be completed because of a local SSL certificate trust issue (`SEC_E_UNTRUSTED_ROOT` / `self-signed certificate in certificate chain`).
- The Git workflow and commands were executed successfully; only the environment prevented the final upload.

---

## GitHub Repository

```
https://github.com/Jeet-Lohar-29/GitConflictDemo
```

> **Note:** The final `git push` was blocked due to a local SSL certificate configuration issue unrelated to the Git workflow.