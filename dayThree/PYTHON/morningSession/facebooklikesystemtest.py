import unittest


class FaceBookLikeSystem(unittest.TestCase):

    def test_that_no_one_likes_this(self)(self):
        String [] name = ;
        String [] expected = "no one likes this";
        String [] actual = FaceBookLikeSystem.getLikes(names)

        self.assertEqual(expected, actual)

    def test_that_peter_likes_this(self):

        String [] name = "Peter";
        String [] expected = "Peter likes this";
        String [] actual = FaceBookLikeSystem.getLikes(names);
        
        assertEquals(expected, actual);

        self.assertEqual(expected, actual)

    def test_that_Jacob_and_alex_likes_this(self):

        String [] name = "Jacob, Alex";
        String [] expected = "Jacob and Alex likes this";
        String [] actual = FaceBookLikeSystem.getLikes(names);

        self.assertEqual(expected, actual)

    def test_that_Max_John_and_Max_likes_this(self):

        String [] name = "Max, John Mark";
        String [] expected = "Max, John and Mark likes this";
        String [] actual = FaceBookLikeSystem.getLikes(names);

        self.assertEqual(expected, actual)

    def test_that_alex_jacob_and_two_others(self):

        String [] name = "Alex, Jacob, Mark, Max";
        String [] expected = "Alex, Jacob, and 2 others likes this"
        String [] actual = FaceBookLikeSystem.getLikes(names);

        self.assertEqual(expected, actual)

