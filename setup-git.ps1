# Git Setup Script for Automation Training Project
# Run this script as Administrator if needed

Write-Host "=== Git Setup for Automation Training Project ===" -ForegroundColor Green

# Check if Git is already installed
try {
    $gitVersion = git --version 2>$null
    if ($gitVersion) {
        Write-Host "Git is already installed: $gitVersion" -ForegroundColor Yellow
        Write-Host "Proceeding with repository initialization..." -ForegroundColor Green
    }
} catch {
    Write-Host "Git is not installed. Please install Git first:" -ForegroundColor Red
    Write-Host "1. Go to https://git-scm.com/download/win" -ForegroundColor Cyan
    Write-Host "2. Download and install Git for Windows" -ForegroundColor Cyan
    Write-Host "3. Restart your terminal and run this script again" -ForegroundColor Cyan
    Write-Host ""
    Write-Host "Alternative: Install using winget (if available):" -ForegroundColor Yellow
    Write-Host "winget install Git.Git" -ForegroundColor Cyan
    exit 1
}

# Check if we're in the right directory
if (-not (Test-Path "pom.xml")) {
    Write-Host "Error: pom.xml not found. Please run this script from the project root directory." -ForegroundColor Red
    exit 1
}

Write-Host "Setting up Git repository..." -ForegroundColor Green

# Initialize Git repository
Write-Host "Initializing Git repository..." -ForegroundColor Yellow
git init

# Configure Git (if not already configured)
Write-Host "Configuring Git..." -ForegroundColor Yellow
$userName = Read-Host "Enter your Git username (or press Enter to skip)"
$userEmail = Read-Host "Enter your Git email (or press Enter to skip)"

if ($userName -and $userEmail) {
    git config --global user.name $userName
    git config --global user.email $userEmail
    Write-Host "Git user configured: $userName <$userEmail>" -ForegroundColor Green
} else {
    Write-Host "Skipping Git user configuration. You can set it later with:" -ForegroundColor Yellow
    Write-Host "git config --global user.name 'Your Name'" -ForegroundColor Cyan
    Write-Host "git config --global user.email 'your.email@example.com'" -ForegroundColor Cyan
}

# Set default branch name
git config --global init.defaultBranch main

# Add all files
Write-Host "Adding files to Git..." -ForegroundColor Yellow
git add .

# Create initial commit
Write-Host "Creating initial commit..." -ForegroundColor Yellow
git commit -m "Initial commit: Maven project with Selenium and Rest Assured training

- Added Maven configuration with Java 17
- Included Selenium 4.21.0 and Rest Assured 5.4.0 dependencies
- Created sample Selenium test for example.org
- Created sample Rest Assured test for reqres.in API
- Added TestNG configuration
- Included comprehensive .gitignore
- Added Java fundamentals tutorial and examples"

Write-Host ""
Write-Host "=== Git Setup Complete! ===" -ForegroundColor Green
Write-Host "Your automation training project is now under version control." -ForegroundColor Green
Write-Host ""
Write-Host "Useful Git commands:" -ForegroundColor Yellow
Write-Host "  git status          - Check repository status" -ForegroundColor Cyan
Write-Host "  git log --oneline   - View commit history" -ForegroundColor Cyan
Write-Host "  git add .           - Stage all changes" -ForegroundColor Cyan
Write-Host "  git commit -m 'msg' - Commit changes" -ForegroundColor Cyan
Write-Host ""
Write-Host "Next steps:" -ForegroundColor Yellow
Write-Host "1. Continue developing your automation tests" -ForegroundColor Cyan
Write-Host "2. Commit changes regularly" -ForegroundColor Cyan
Write-Host "3. Consider setting up a remote repository (GitHub, GitLab, etc.)" -ForegroundColor Cyan

