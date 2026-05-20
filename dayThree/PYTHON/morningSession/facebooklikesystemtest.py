import unittest

class FaceBookLikeSystem(unittest.TestCase):

    def test_that_no_one_likes_this(self):
        names = []
        expected = "no one likes this"
        actual = get_likes(names)
        self.assertEqual(expected, actual)

    def test_that_peter_likes_this(self):
        names = ["Peter"]
        expected = "Peter likes this"
        actual = get_likes(names)
        self.assertEqual(expected, actual)

    def test_that_jacob_and_alex_likes_this(self):
        names = ["Jacob", "Alex"]
        expected = "Jacob and Alex like this"
        actual = get_likes(names)
        self.assertEqual(expected, actual)

    def test_that_max_john_and_mark_likes_this(self):
        names = ["Max", "John", "Mark"]
        expected = "Max, John and Mark like this"
        actual = get_likes(names)
        self.assertEqual(expected, actual)

    def test_that_alex_jacob_and_two_others(self):
        names = ["Alex", "Jacob", "Mark", "Max"]
        expected = "Alex, Jacob and 2 others like this"
        actual = get_likes(names)
        self.assertEqual(expected, actual)

