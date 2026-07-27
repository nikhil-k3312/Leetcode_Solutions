class Solution(object):
    def search(self, nums, target):
       for i in nums:
        if(i==target):
            return nums.index(i)
       return -1
        