public class MasterClass {
    public static void main(String[] args) {

        System.out.println("This class belongs to master Branch");

    }


    /*

        to start a project on your computer

    git init: to start git in your project. it is used only once to start git

    git add . : to add (save) all the files you have coded to a temp place

    git commit -m "message" : this code will create a version of your codes in timeline

    git remote add origin https://github.com/MehmetMagden/deleteThisProject.git  : to create a connection between our computer and git acc

    git push



    working with a lot of people in your computer, branches

    -- everybody should have a branch to work on project
    -- to try a new feature on the project we should create a branch to test it on the project

    git branch mehmet : it will create a branch named mehmet
    git checkout mehmet : it will switch to mehmet's branch
    git branch : shows names of the branches


    // how to merge
    -- we should be in our branch to take everything from others
    -- let's say, we are in mehmet's branch and we want to take every codes from hasan's branch
    git merge hasan : it will take all the codes from hasan's branch and it will merge them with our mehmet's branch


    // solving conflicts
    -- if coders write different codes in same line, Git can not decide which one to keep. It will inform us the problem

    // we are in master and trying to merge hasan's code

    >>>>>>>>>>> Head
    lkajsdfşlkajfdlşkjfdşlskdfj // some codes
    ===========
    şlakjsflşajsflaksfdjsaldjfk // some other codes
    <<<<<<<<<<< Hasan

    // we should decide which one to keep, just detele other parts will solve the problem
    // most of time we prefer keeping everybody's code in the system



     */



}
