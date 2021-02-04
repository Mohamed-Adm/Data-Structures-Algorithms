class Node:
    def __init__(self, data):
        self.data = data
        self.next = None


class linked_list:
    def __init__(self):
        self.head = None

    def listlenght(self):
        cur_node = self.head
        lenght = 0
        while cur_node is not None:
            lenght += 1
            cur_node = cur_node.next
        return lenght

    def insertHead(self, newNode):
        temp = self.head
        self.head = newNode
        self.head.next = temp
        del temp

    def insertAt(self, newNode, position):
        if position == 0:
            self.insertHead(newNode)
            return
        if position < 0 or position > self.listlenght():
            print("Invalid position")
            return
        currNode = self.head
        currposition = 0
        while True:
            if currposition == position:
                prevNode.next = newNode
                newNode.next = currNode
                break
            prevNode = currNode
            currNode = currNode.next
            currposition += 1

    def insertEnd(self, newNode):
        if self.head is None:
            self.head = newNode
        else:
            lastNode = self.head
            while True:
                if lastNode.next is None:
                    break
                lastNode = lastNode.next
            lastNode.next = newNode

    def printList(self):
        if self.head is None:
            print("List is empty")
            return

        currentNode = self.head
        while True:
            if currentNode is None:
                break
            print(currentNode.data)
            currentNode = currentNode.next


node0 = Node("O")
node1 = Node("A")
node2 = Node("B")
my_list = linked_list()
my_list.insertHead(node0)
my_list.insertEnd(node1)
my_list.insertEnd(node2)
node3 = Node("Between")
my_list.insertAt(node3, 0)
my_list.printList()
