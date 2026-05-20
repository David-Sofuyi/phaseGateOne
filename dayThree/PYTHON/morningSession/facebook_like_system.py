def get_likes(names):
    number = len(names)
    if number == 0:
        return "no one likes this"
    elif number == 1:
        return f"{names[0]} likes this"
    elif number == 2:
        return f"{names[0]} and {names[1]} like this"
    elif number == 3:
        return f"{names[0]}, {names[1]} and {names[2]} like this"
    else:
        return f"{names[0]}, {names[1]} and {n - 2} others like this"
