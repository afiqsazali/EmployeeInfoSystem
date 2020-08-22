public class LinkedList {

		Node head;
		Node tail;

		public LinkedList() {
				this.head = null;
				this.tail = null;
		}

		void insert(EmployeeData employee) {

				Node current = new Node(employee);

				if (this.tail == null) {
						this.head = this.tail = current;
						return;
				}

				this.tail.next = current;
				this.tail = current;

		}

		void remove(EmployeeData employee) {

				// If linked list is empty
				if (head == null)
						return;

				// Store head node
				Node temp = head;

				// If head needs to be removed
				if (employee.name.equals(head.employee.name))
				{
						head = temp.next;   // Change head
						return;
				}

				// Find previous node of the node to be deleted
				while (!temp.next.employee.name.equals(employee.name))
						temp = temp.next;

				// If position is more than number of nodes

				// Node temp->next is the node to be deleted
				// Store pointer to the next of node to be deleted

				temp.next = temp.next.next;  // Unlink the deleted node from list

		}

}
