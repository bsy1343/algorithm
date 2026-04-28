# [Platinum I] Vocabulary - 10507

[문제 링크](https://www.acmicpc.net/problem/10507)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 256 MB

### 통계

제출: 164, 정답: 38, 맞힌 사람: 29, 정답 비율: 25.439%

### 분류

다이나믹 프로그래밍, 많은 조건 분기, 자릿수를 이용한 다이나믹 프로그래밍

### 문제 설명

<p>According to a popular belief, computer programmers drink a lot of coffee and know only a few words. The vocabulary of a typical programmer consists of just three words. Besides, he rarely knows how to spell them. To help programmers with their spelling mistakes, we published a book titled The Dictionary of the Three Words Every Typical Programmer Should Know.</p>

<p>You got a copy of the book but, soon after that, you spilled your coffee over it. Now, you cannot read some of the characters. Fortunately, the three words were, as usually in dictionaries, distinct and printed in lexicographical order.</p>

<p>Before you attempt to use that fact to recover the missing characters, you want to know in how many different ways you can do it. Since you expect this number might be large, you want to know it modulo 10<sup>9</sup> + 9.</p>

### 입력

<p>The first line of input contains the number of test cases T. The descriptions of the test cases follow:</p>

<p>Each test case consists of three lines, each containing a single nonempty word &ndash; in the order they appear in the dictionary. Words consist of small letters of the English alphabet and question marks, the latter denoting missing characters. Each word is at most 1 000 000 characters long.</p>

### 출력

<p>For each test case, output one line containing the number of different ways you can substitute each question mark with one of the 26 letters from a to z in such a way that the three words are distinct and in lexicographical order. The number should be printed modulo 10<sup>9</sup> + 9.</p>