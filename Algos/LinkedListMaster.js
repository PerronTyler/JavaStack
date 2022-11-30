
class ListNode {

    constructor(data) {
        this.data = data;
        this.next = null;
    }
}


class SinglyLinkedList {
    constructor() {
        this.head = null;
    }

    isEmpty() {
        return this.head === null
    }

    insertAtBack(data) {
        if (!this.head) {
            this.head = new ListNode(data)
            return
        }
        let cur = this.head;
        while (cur.next) {
            cur = cur.next
        }
        cur.next = new ListNode(data)
    }



    /**
     * Removes the last node of this list.
     * - Time: O(?).
     * - Space: O(?).
     * @returns {any} The data from the node that was removed.
     */
    removeBack() {
        let runner = this.head
        while (runner.next.next) {
            runner = runner.next
        }
        runner.next = null
    }

    /**
     * Determines whether or not the given search value exists in this list.
     * - Time: O(?).
     * - Space: O(?).
     * @param {any} val The data to search for in the nodes of this list.
     * @returns {boolean}
     */
    contains(val) {
        let runner = this.head
        while (runner) {
            if (runner.data === val) {
                return true
            }
            runner = runner.next
        }
        return false
    }

    /**
     * Determines whether or not the given search value exists in this list.
     * - Time: O(?).
     * - Space: O(?).
     * @param {any} val The data to search for in the nodes of this list.
     * @param {?ListNode} current The current node during the traversal of this list
     *    or null when the end of the list has been reached.
     * @returns {boolean}
     */
    containsRecursive(val, current = this.head) {
        if (current.data === val) {
            return true
        }
        else if (current.next === null) {
            return false
        }
        return this.containsRecursive(val, current.next)
    }





    insertAtBackMany(vals) {
        for (const item of vals) {
            this.insertAtBack(item);
        }
        return this;
    }

    toArr() {
        const arr = [];
        let runner = this.head;

        while (runner) {
            arr.push(runner.data);
            runner = runner.next;
        }
        return arr;
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