# Java-BSU
A repository with the JAVA labs (BSU/FAMCS).

## Prerequisites
- [Java Development Kit](https://www.oracle.com/java/technologies/jdk8-downloads.html)
- [JetBrains IntelliJ IDEA](https://www.jetbrains.com/idea/)

## Structure
- Every lab is located on its own branch. 
- Base branch only includes `README.md`, `Makefile` and default `.gitignore` for **IntelliJ IDEA**.
### Every lab branch includes:
- `.idea/` - **IntelliJ IDEA** project settings
- `src/` - Project *source code*
- `README.md` - Lab description with the *main task* and, optionally, comments on the solution.
- `Makefile` - Makefile to support `make` commands and work outside of IDE.
- `.gitignore`

## Getting started
### Cloning project
1. Clone or download repository: `git clone git@github.com:Eug-VS/Java-BSU.git`
2. Checkout desired branch
  * List all branches: `git branch -a`
  * Checkout: `git checkout BRANCHNAME`
### Running project
#### IntelliJ IDEA
1. Open **IntelliJ IDEA starting screen** and proceed with `Import Project`, answering **yes** on every following question.
2. Go to `Run/Edit configurations/Templates/Application`
3. Put **Main** in the *Main class* field
4. *Apply* changes
5. Build project (`Ctrl+F9`)
6. Run project (`Shift+F10`)
#### Shell
To build, pack and run your project from a *shell* simply run command: 
```shell
make run
```
Keep it mind that it requires **make** to be installed. More info on make: https://www.gnu.org/software/make/
