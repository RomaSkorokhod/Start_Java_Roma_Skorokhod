package helphomeWork10;

import lesson12.homewWork10.Human;

public class Family {
    private String familyName;

    public String getFamilyName() {
        return familyName;
    }

    private lesson12.homewWork10.Human mother;
    private lesson12.homewWork10.Human father;
    private lesson12.homewWork10.Human[] children;

    public Family(lesson12.homewWork10.Human mother, lesson12.homewWork10.Human father, String familyName) {
        this.mother = mother;
        this.father = father;
        this.children = new lesson12.homewWork10.Human[0];
        this.familyName = familyName;
        this.mother.setFamily(this);
        this.father.setFamily(this);
    }

    public int countFamily() {
        return 2 + children.length;
    }

    public void addChild(lesson12.homewWork10.Human newChild) {
        newChild.setFamily(this);
        lesson12.homewWork10.Human[] newArray = new lesson12.homewWork10.Human[children.length + 1];
        for (int i = 0; i < children.length; i++) {
            newArray[i] = children[i];
        }
        newArray[children.length] = newChild;
        children = newArray;
    }

    public void deleteChild(int index) {
        children[index].setFamily(null);
        children[index] = null;
        lesson12.homewWork10.Human[] newArray = new Human[children.length - 1];
        int k = 0;
        for (int i = 0; i < children.length; i++) {
            if (children[i] == null) {
                continue;
            }
            children[i] = newArray[k];
            k++;
        }
        children = newArray;
    }
}
