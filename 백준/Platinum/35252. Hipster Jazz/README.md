# [Platinum III] Hipster Jazz - 35252

[문제 링크](https://www.acmicpc.net/problem/35252)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 11, 정답: 5, 맞힌 사람: 5, 정답 비율: 45.455%

### 분류

해 구성하기

### 문제 설명

<p>A new class has just started at jazz school, consisting of $N$ students. Among them, $M$ pairs of students are friends. Each student has to pick an instrument to focus on during their studies, either piano or saxophone. Of course, all the students want to be very original jazz musicians. Therefore, they want to make sure that at least half of their friends choose a different instrument than what they chose.</p>

<p>It turned out to be hard for the students to choose instruments in this manner by themselves, so they turned to you for some help. Can you select an instrument for each child, such that at least half of their friends play the other instrument?</p>

### 입력

<p>The first line contains the number of students $N$ ($1 \le N \le 200$) and pairs of friends $M$ ($0 \le M \le \frac{N(N - 1)}{2}$).</p>

<p>This is followed by $M$ lines, one for each friendship. A friendship is described by two integers $a$ and $b$ ($1 \le a \neq b \le N$), denoting that the $a$'th and $b$'th students are friends. No friendship will be listed twice.</p>

<p>The input will always be chosen in such a way that a valid selection of instruments for the students exists.</p>

### 출력

<p>Output a single string with $N$ characters. The $i$'th character should denote the instrument of the $i$'th student: either <code>P</code> if they should play the piano, or <code>S</code> if they should play the saxophone.</p>