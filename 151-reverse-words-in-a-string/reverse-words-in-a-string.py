class Solution(object):
    def reverseWords(self, s):
        ls = s.split()
        rev_ls = ls[::-1]
        return " ".join(rev_ls)
        