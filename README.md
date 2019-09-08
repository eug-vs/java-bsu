# Java-BSU
A repository with the JAVA labs (BSU/FAMCS).

## Prerequisites
- [Java Development Kit](https://www.oracle.com/java/technologies/jdk8-downloads.html)
- [JetBrains IntelliJ IDEA](https://www.jetbrains.com/idea/)

## Structure
- Every lab is located on its own branch. 
- Master branch only includes `README.md` and default `.gitignore` for **IntelliJ IDEA**.
### Every lab branch includes:
- `.idea/` - **IntelliJ IDEA** project settings
- `src/` - Project *source code*
- `README.md` - Lab description with the *main task* and, optionally, comments on the solution.
- `.gitignore`

## Getting started
### Cloning project
1. Clone or download repository: `git clone git@github.com:Eug-VS/Java-BSU.git`
2. Checkout desired branch
  * List all branches: `git branch -a`
  * Checkout: `git checkout BRANCHNAME`
3. Open **IntelliJ IDEA starting screen** and proceed with `Import Project`, answering **yes** on every following question.

### Running project
1. Go to `Run/Edit configurations/Templates/Application`
2. Put **Main** in the *Main class* field
3. *Apply* changes
4. Build project (`Ctrl+F9`)
5. Run project (`Shift+F10`)
