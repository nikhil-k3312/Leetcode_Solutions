class Solution(object):
    def searchInsert(self, nums, target):
        for i in nums:
            if i==target:
                return nums.index(i)
            else:
                nums.sort()
                bisect.insort(nums,target)
                return nums.index(target)
        