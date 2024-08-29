class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        ArrayList<Integer> list = new ArrayList<>();

        while (temp1 != null) {
            list.add(temp1.val);
            temp1 = temp1.next;
        }

        while (temp2 != null) {
            list.add(temp2.val);
            temp2 = temp2.next;
        }

        Collections.sort(list);
        ListNode head = convert(list);
        return head;
    }

    private ListNode convert(ArrayList<Integer> list) {
        if (list.isEmpty()) return null;
        ListNode head = new ListNode(list.get(0));
        ListNode current = head;
        for (int i = 1; i < list.size(); i++) {
            current.next = new ListNode(list.get(i));
            current = current.next;
        }
        return head;
    }
}