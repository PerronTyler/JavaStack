class SinglyLinkedList {
    constructor() {
        this.head = null;
    }

    reverseList() {
        if (this.head.next === null) {
            return false
        }
        let previous = this.head
        let runner = this.head.next
        this.head.next = null
        while (runner) {
            let temp = runner.next
            runner.next = previous
            console.log(previous.data)
            previous = runner
            runner = temp

        }
        this.head = previous

        return true
    }
}