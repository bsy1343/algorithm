# [Platinum IV] Colorful Intervals - 33190

[문제 링크](https://www.acmicpc.net/problem/33190)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 57, 정답: 21, 맞힌 사람: 12, 정답 비율: 28.571%

### 분류

두 포인터, 브루트포스 알고리즘

### 문제 설명

<p>The <em>Museum of Contemporary Art</em> is holding a painting gallery focused on modern art, especially <em>Monochromatic style</em> paintings, which use only a single color. The gallery displays $n$ paintings arranged in a line.</p>

<p>The ICPC wants to bring students on an excursion to the gallery to spark their interest in art. However, the students are programmers, and everyone knows programmers only care about the colors of these modern paintings. They are also somewhat impatient. To keep their attention and to ensure they see every color without overwhelming them, the organizer decided to show them exactly two intervals of painting. This approach balances their short attention span and ensures all colors are represented. The task is to find two intervals of paintings such that each color appears at least once in at least one of the intervals, and the total number of paintings the students need to see is minimized.</p>

### 입력

<p>The input consists of a single line containing a non-negative integer $n$ ($2 \le n \le 2000$), indicating the number of paintings. This is followed by $n$ lines, each containing a string representing the color of a painting. Each color is represented by a non-empty lowercase string with a length of less than $20$. It is guaranteed that there are at least $2$ and at most $50$ different colors in the input.</p>

### 출력

<p>In the output, print the minimum number of paintings the ICPC students need to see, which is the sum of the lengths of the two intervals.</p>