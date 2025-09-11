@echo off
echo === Git Setup for Automation Training Project ===

REM Check if Git is installed
git --version >nul 2>&1
if %errorlevel% neq 0 (
    echo Git is not installed. Please install Git first:
    echo 1. Go to https://git-scm.com/download/win
    echo 2. Download and install Git for Windows
    echo 3. Restart your terminal and run this script again
    echo.
    echo Alternative: Install using winget (if available):
    echo winget install Git.Git
    pause
    exit /b 1
)

REM Check if we're in the right directory
if not exist "pom.xml" (
    echo Error: pom.xml not found. Please run this script from the project root directory.
    pause
    exit /b 1
)

echo Setting up Git repository...

REM Initialize Git repository
echo Initializing Git repository...
git init

REM Configure Git
echo Configuring Git...
set /p userName="Enter your Git username (or press Enter to skip): "
set /p userEmail="Enter your Git email (or press Enter to skip): "

if not "%userName%"=="" if not "%userEmail%"=="" (
    git config --global user.name "%userName%"
    git config --global user.email "%userEmail%"
    echo Git user configured: %userName% ^<%userEmail%^>
) else (
    echo Skipping Git user configuration. You can set it later with:
    echo git config --global user.name "Your Name"
    echo git config --global user.email "your.email@example.com"
)

REM Set default branch name
git config --global init.defaultBranch main

REM Add all files
echo Adding files to Git...
git add .

REM Create initial commit
echo Creating initial commit...
git commit -m "Initial commit: Maven project with Selenium and Rest Assured training

- Added Maven configuration with Java 17
- Included Selenium 4.21.0 and Rest Assured 5.4.0 dependencies
- Created sample Selenium test for example.org
- Created sample Rest Assured test for reqres.in API
- Added TestNG configuration
- Included comprehensive .gitignore
- Added Java fundamentals tutorial and examples"

echo.
echo === Git Setup Complete! ===
echo Your automation training project is now under version control.
echo.
echo Useful Git commands:
echo   git status          - Check repository status
echo   git log --oneline   - View commit history
echo   git add .           - Stage all changes
echo   git commit -m 'msg' - Commit changes
echo.
echo Next steps:
echo 1. Continue developing your automation tests
echo 2. Commit changes regularly
echo 3. Consider setting up a remote repository (GitHub, GitLab, etc.)
pause

