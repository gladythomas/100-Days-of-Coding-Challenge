class Solution {
    public:
        ListNode* deleteDuplicates(ListNode* head) {
            ListNode *temp1, *temp2;
            temp1 = temp2 = head;
            if(head==NULL || head->next == NULL){
                return head;
            }
            while(temp1->next!=NULL){
                if(temp1->next==temp2->next){
                  temp1 = temp1->next;
                    continue;}
                else if(temp1->val==temp2->val){
                    temp2->next = temp1->next;
                    delete(temp1);
                    temp1 = temp2;
                } 
                temp2 = temp1;
                temp1 = temp1->next;
            }if(temp1->next == NULL && temp1->val==temp2->val ){
                  temp2->next = temp1->next;
                    delete(temp1);
            }
            return head;
        }
    };