# Usefull Commands
In this file useful commands are explained. This exercise should train the basic tasks with git.

## git config
Is used to configurate the personal data in git. Such as the mail adress, name, branch and the pull command.
`git config` is usually followed by `--global` which indicates that the changes are made for the whole git
program. Usually this command is used once or if some of the data changes.

## git init
This command is used to introduce git with the directory it should manage. Therefore you have to open the
prefered directory in the terminal and use this command. Git will create a hidden directory. This command
is used one time when you introduce the directory to git.

## git clone (additional)
The directory which should be cloned is not only copied, but the complete repository including all commits,
branches and tags are cloned. It also sets up which directory it is descending. This command is used once or
when you want to clone your repo.

## git commit
Carries out the storing of the staged files. This command is used everytime you want to flush your files
from the staging area into the git repo.

## git status
Shows which files or directories are not tracked by git. Before the **.gitignore** file it said that the
`hmtl`and `pdf`file were not tracked. After that it did not show it.

## git add
Adds the given files to the so called staging area. This area includes all changed files which will be
stored in the git database once you enter `git commit`. Everytime a change was made in a file, you have to
add it to the staging area.

## git log
Shows all changes which were made to the repo. Is used for tracking.

## git diff
Shows the differences between the versions. With `+` it shows you whch parts were added,
with `-` it shows you which parts were removed.

## git pull
This command fetches all changes from the remote repo into the current branch. 
It basically connects the commands `git fetch` and `git merge`.

## git push
This is the counterpart to `git pull` it sends the changes to the remote repo.

## git branch
Creates a new branch. Needs to be done if you are changing something and want to merge it later on.
Needs to be done everytime you do not want to change something in your main branch.

## git checkout
Switches between the "active" branches. You have to be careful otherwise it may be possible to solve a
conflict.

## git merge
This command connects two branches back together. To merge back into the main branch you have to switch
to the main branch first, then merge the preferred branch into it.