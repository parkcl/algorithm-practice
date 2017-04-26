/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(nullptr) {}
 * };
 */
 
 /**
  Problem statement: You are given two non-empty linked lists representing two non-negative integers.
  The digits are stored in reverse order and each of their nodes contain a single digit. 
  Add the two numbers and return it as a linked list.
  */

 
class Solution {
public:
    ListNode *head = nullptr,
             *ref = nullptr;
    
    void append(int add) {
        if (!head) {
			head = new ListNode(add);
			ref = head;
			ref->next = nullptr;
		} else {
			ref->next = new ListNode(add);
			ref = ref->next;
			ref->next = nullptr;
		}
    }
    
    bool emptyIfNeeded(ListNode *n, int carry) {
        if (!n) return 0;
        
        int sum = 0, add;
	    while (n) {
	        sum = carry + n->val;
	        carry = sum / 10;
	        add = sum % 10;
	        append(add);
	        n = n->next;
	    }
	    
	    if (carry > 0) {
	        append(carry);
	    }
	    
	    return 1;
    }
    
    ListNode * addTwoNumbers(ListNode * A, ListNode * B) {
		int carry = 0,
		    sum = 0;

		while (A && B) {
			sum = carry + A->val + B->val;
			carry = sum / 10;
			append(sum % 10);
			
			
			A = A->next;
			B = B->next;
	    }

        if (!A && !B && carry > 0) {
            append(carry);
        } else {
	        !emptyIfNeeded(A, carry) ?
	            emptyIfNeeded(B, carry) : 0;
        }
	    
	    return head;
	}
};
