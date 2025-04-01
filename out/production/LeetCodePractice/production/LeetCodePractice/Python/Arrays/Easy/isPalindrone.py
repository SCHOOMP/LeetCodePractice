class Solution:
    def isPalindrome(self, x: int) -> bool:
        if x < 0:
            return False
        revNum = 0
        original = x
        while x > 0:
            revNum = revNum * 10 + (x % 10)
            x = x // 10

        return revNum == original


# Example usage:
solution = Solution()
num = 121
result = solution.isPalindrome(num)

print(result)
