class Solution(object):
    def capitalizeTitle(self, title):
        """
        :type title: str
        :rtype: str
        """
        l=""
        for i in title.lower().split():
            if len(i)>2:
                l+=i.capitalize()+" "
            else:
                l+=i+" "
        l=l.strip()
        return l


        