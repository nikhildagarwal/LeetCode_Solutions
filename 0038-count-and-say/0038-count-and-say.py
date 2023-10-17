class Solution:
    def parser(self, input: int) -> str:
        input = str(input)
        prev = None
        c = 0
        message = ""
        for curr in input:
            if prev == None:
                prev = curr
                c += 1
            else:
                if curr == prev:
                    c += 1
                else:
                    message += str(c) + prev
                    prev = curr
                    c = 1
        return message + str(c) + prev


    def countAndSay(self, n: int) -> str:
        if n == 1:
            return "1"
        return self.parser(self.countAndSay(n-1))

    