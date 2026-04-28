# [Platinum I] English - 18898

[문제 링크](https://www.acmicpc.net/problem/18898)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 256 MB

### 통계

제출: 70, 정답: 18, 맞힌 사람: 10, 정답 비율: 38.462%

### 분류

백트래킹, 휴리스틱

### 문제 설명

<p>Sophie wants to learn the English letters and she asked Johnny for help. He wants to prepare a set of words so that each letter appears in one of them and as Johnny does not like to repeat himself, each letter should appear in exactly one word (exactly once). Sophie does not fully trust Johnny--he pulled her leg too many times before--so she wants to verify that the words are in her English dictionary. Unfortunately, she spilled some tea over it and all one- and two-letter words are now unreadable and all other words are unreadable with a probability $1/2$. Help Johnny--write a program that reads the list of readable words from the dictionary and computes the set of words according to the requirements. Luckily, Johnny has the same dictionary as Sophie (also with no one- nor two-letter words, but with all other words readable), he can share it with you so that you can prepare a bit. Furthermore Sophie personally guarantees that you can choose the requested set of words from <a href="https://upload.acmicpc.net/e545a204-5193-4649-a93c-4ec63227fd2f/">20k.unix.txt</a>.</p>

### 입력

<p>The first line of the input consists of a single positive integer $n$ of words in the dictionary ($1 \le n \le 20\,000$). The following $n$ lines contain lexicographically-sorted words of length at least $3$, one word per line. Each test file was randomly generated from a dictionary that contains $20\,000$ words (each of length at least $3$), i.e.&nbsp; each word was put in the file independently with a probability $1/2$.</p>

### 출력

<p>You should write a single positive integer $k$ ($1 \le k \le 8$) in the first line of the output. In the following $k$ lines you should write $k$ words, one per line. Each of those words should appear in the input dictionary and each letter of the English alphabet, which contains 26 letters in total, should appear exactly once in exactly one of those words. It is guaranteed that for each input file there is a solution.</p>

### 힌트

<p>Due to space constraints, the dictionary in the example was not created randomly and it is presented only to demonstrate the constraints on the solution. In particular, it will not be used for &nbsp;testing the correctness of your solution. Nevertheless, the seven words in the output contain all 26 letters of the English alphabet, each exactly once.</p>