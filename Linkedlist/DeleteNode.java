    public Node deleteNode(Node head, int value) {
        if (head == null) {
            return head;
        }
        if (head.val = value) {
            return head.next;
        }

        while (head.next != null) {
            if (head.next.val == value) {
                head.next = head.next.next;
                return head;
            }
            head = head.next;
        }
        return head;
    }
