class Node {
    constructor() {
        this.item = null;
        this.next = null;
    }
}

class Linked {
    constructor() {
        this.head = null;
    }
    Boolean(mystr) {
        var runner = this.head;
        while (runner != null) {
            if (runner != null && runner.item.localeCompare(mystr) == 0)
                return true;
            runner = runner.next;

        }
        return false;

    }

    printList() {
        var temp = this.head;
        while (temp != null) {
            console.log(temp.item);
            temp = temp.next;
        }
    }
    Insert(str) {
        var newNode = new Node();
        newNode.item = str;
        if (this.head == null) {
            this.head = newNode;
        } else if (this.head.item.localeCompare(str) >= 0) {
            newNode.next = this.head;
            this.head = newNode;
        } else {
            var runner, prev;
            runner = this.head.next;
            prev = this.head;
            while (runner != null && runner.item.localeCompare(str) < 0) {
                prev = runner;
                runner = runner.next;
            }
            newNode.next = runner;
            prev.next = newNode;
        }
    }
}

let list = new Linked();
list.Insert('Mohamed');
list.Insert('Adam');
list.Insert('Ibrahim');
list.printList();
console.log(list.Boolean('Adam'));