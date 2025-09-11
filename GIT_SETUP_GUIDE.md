# Git Setup Guide for Automation Training Project

## Installing Git on Windows

### Option 1: Download from Official Website (Recommended)
1. Go to https://git-scm.com/download/win
2. Download the latest version for Windows
3. Run the installer with default settings
4. Restart your terminal/PowerShell after installation

### Option 2: Using Chocolatey (if you have it)
```powershell
choco install git
```

### Option 3: Using Winget (Windows 10/11)
```powershell
winget install Git.Git
```

## Verify Installation
After installation, restart your terminal and run:
```bash
git --version
```

## Initialize Your Automation Training Project

### 1. Initialize Git Repository
```bash
# Navigate to your project directory
cd C:\Users\anike\Automation-java-training

# Initialize Git repository
git init

# Add all files to staging
git add .

# Create initial commit
git commit -m "Initial commit: Maven project with Selenium and Rest Assured training"
```

### 2. Configure Git (First Time Setup)
```bash
# Set your name and email
git config --global user.name "Your Name"
git config --global user.email "your.email@example.com"

# Optional: Set default branch name
git config --global init.defaultBranch main
```

### 3. Create .gitignore (Already Created)
The project already includes a comprehensive .gitignore file that excludes:
- `target/` - Maven build output
- `.idea/` - IntelliJ IDEA files
- `.vscode/` - VS Code files
- `*.log` - Log files
- `test-output/` - Test reports

## Git Workflow for Automation Testing

### Daily Workflow
```bash
# Check status
git status

# Add changes
git add .

# Commit changes
git commit -m "Add new test case for login functionality"

# Push to remote (if configured)
git push origin main
```

### Branching Strategy
```bash
# Create feature branch
git checkout -b feature/new-test-suite

# Work on your changes
# ... make changes ...

# Commit changes
git add .
git commit -m "Implement new test suite"

# Switch back to main
git checkout main

# Merge feature branch
git merge feature/new-test-suite
```

## Best Practices for Automation Projects

### 1. Commit Messages
Use descriptive commit messages:
```bash
git commit -m "Add Selenium test for user registration"
git commit -m "Fix WebDriver memory leak in tearDown method"
git commit -m "Update Rest Assured dependency to latest version"
```

### 2. File Organization
- Keep test data in separate files
- Use meaningful file names
- Organize tests by feature/functionality

### 3. Branch Naming
- `feature/` - New features or test suites
- `bugfix/` - Bug fixes
- `hotfix/` - Critical fixes
- `refactor/` - Code refactoring

## Common Git Commands for Automation Testing

```bash
# View commit history
git log --oneline

# View changes in working directory
git diff

# View staged changes
git diff --cached

# Undo last commit (keep changes)
git reset --soft HEAD~1

# Undo last commit (discard changes)
git reset --hard HEAD~1

# Create and switch to new branch
git checkout -b feature/api-tests

# List all branches
git branch -a

# Delete branch
git branch -d feature/api-tests
```

## Integration with IDEs

### IntelliJ IDEA
- Git integration is built-in
- Use VCS menu or keyboard shortcuts
- Visual diff and merge tools available

### VS Code
- Install Git extension
- Use Source Control panel
- Integrated terminal for Git commands

## Troubleshooting

### If Git is still not recognized after installation:
1. Restart your computer
2. Check if Git is in your PATH:
   - Go to System Properties > Environment Variables
   - Add Git installation path to PATH variable
3. Try using Git Bash instead of PowerShell

### Common Issues:
- **Large files**: Use Git LFS for test data files
- **Merge conflicts**: Use IDE merge tools
- **Authentication**: Set up SSH keys or use personal access tokens

## Next Steps

1. Install Git using one of the methods above
2. Restart your terminal
3. Run the initialization commands
4. Start using Git for version control in your automation project

