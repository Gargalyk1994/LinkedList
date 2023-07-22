public class LinkListBubbleSort {

    private class ListElement {

        ListElement next;    // указатель на следующий элемент
        int data;            // данные
    }

    private ListElement head;       // указатель на первый элемент
    private ListElement tail;       // указатель последний элемент

    void addFront(int data) //добавить спереди
    {
        ListElement a = new ListElement();  //создаём новый элемент
        a.data = data;              //инициализируем данные.
        // указатель на следующий элемент автоматически инициализируется как null
        if (head == null) //если список пуст
        {
            head = a;
            tail = a;
        } else {

            a.next = head;
            head = a;

        }
    }

    private void swap(ListElement l1, ListElement l2) {
        int n = l1.data;
        l1.data = l2.data;
        l2.data = n;
    }

    public void bubbleSort() {
        boolean flag = true;

        while (flag) {
            ListElement le = head;
            flag = false;
            while (le != tail) {
                if (le.data > le.next.data) {
                    swap(le, le.next);
                    flag = true;
                }
                le = le.next;
            }
        }

    }

    @Override
    public String toString() {
        ListElement le = head;
        StringBuilder sb = new StringBuilder("[" + le.data + ", ");
        while ((le = le.next) != null) {
            sb.append(le.data + ", ");
        }
        sb.append("]");
        return sb.toString();

    }
}
