# Git Hands-on 2

## Objective

Learn how to use `.gitignore` to ignore unwanted files and folders from being tracked by Git.

---

## Steps Completed

1. Created a local Git repository.
2. Created `.log` files (`app.log`, `error.log`).
3. Created a `log` folder containing `server.log`.
4. Created a normal file `welcome.txt`.
5. Created a `.gitignore` file.
6. Added the following ignore rules:

```gitignore
*.log
log/
```

7. Verified that Git ignored all `.log` files and the `log` directory.
8. Added only the required files to Git.
9. Committed the changes.
10. Connected the local repository with GitHub.
11. Pushed the repository successfully.

---

## Commands Used

```bash
git init
git status

mkdir log

echo "Application Log" > app.log
echo "Error Log" > error.log
echo "Log Folder File" > log/server.log
echo "Hello Git" > welcome.txt

git add .
git status

git commit -m "Added .gitignore to ignore log files"

git remote add origin https://github.com/Jeet-Lohar-29/GitIgnoreDemo.git
git branch -M main
git push -u origin main
```

---

## Files Created

```
GitIgnoreDemo/
│
├── .gitignore
├── welcome.txt
├── app.log
├── error.log
└── log/
    └── server.log
```

---

## .gitignore Contents

```gitignore
*.log
log/
```

---

## Result

- Successfully ignored all `.log` files.
- Successfully ignored the `log` directory.
- Only the required project files were committed to Git.
- Repository successfully pushed to GitHub.

---

## GitHub Repository

```
https://github.com/Jeet-Lohar-29/GitIgnoreDemo
```