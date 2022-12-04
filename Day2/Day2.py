
scores = {
    "A X\n": 3+0,
    "B X\n": 1+0,
    "C X\n": 2+0,
    "A Y\n": 1+3,
    "B Y\n": 2+3,
    "C Y\n": 3+3,
    "A Z\n": 2+6,
    "B Z\n": 3+6,
    "C Z\n": 1+6,
}


def get_score(line):
    return scores[line]


file = open("C:/Users/zkari/OneDrive/Documents/School/apcs/Advent2022/Day2/input.txt")
lines = file.readlines()
scores = [get_score(line) for line in lines]
print(sum(scores))


