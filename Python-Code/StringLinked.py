class Node():
    def __init__(self, item):
        self.item = item
        self.next = None


class Linked:
    def __init__(self):
        self.head = None

    def find(self, searchItem):
        runner = self.head
        while runner:
            if(runner != None and str(runner.item) == str(searchItem)):
                return True
                runner = runner.next
        return False

    def insert(self, data):
        newNode = Node(data)
        if self.head == None:
            self.head = newNode
        elif str(self.head.item) >= str(data):
            newNode.next = self.head
            self.head = newNode
        else:
            runner = self.head.next
            prev = self.head
            while runner != None and str(runner.item) < str(data):
                prev = runner
                runner = runner.next
            newNode.next = runner
            prev.next = newNode

    def printItem(self):
        temp = self.head
        while temp:
            print(temp.item)
            temp = temp.next


link = Linked()
link.insert('Mohamed')
link.insert('Adam')
link.insert('Ibrahim')
print(link.find('Adam'))
link.printItem()
