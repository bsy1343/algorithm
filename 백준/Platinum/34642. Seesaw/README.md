# [Platinum V] Seesaw - 34642

[문제 링크](https://www.acmicpc.net/problem/34642)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 41, 정답: 12, 맞힌 사람: 11, 정답 비율: 44.000%

### 분류

그리디 알고리즘, 분리 집합, 자료 구조

### 문제 설명

<p>A number of people are sitting on an infinitely long seesaw. The seesaw can be represented as a number line centered at $0$. Each person has a weight, and sits at a location along the seesaw. They contribute a torque equal to their weight times their position. The seesaw is balanced if the sum of torques is $0$. People are able to move any real-valued distance along the seesaw, so long as they do not go past the person immediately before them or after them. In other words, the relative ordering of the people along the seesaw must be preserved. It is ok for multiple people to occupy the same location, and for a person to move multiple times. What is the minimum sum of distances that people have to move to make the seesaw balanced?</p>

### 입력

<p>The first line of input contains a single integer $n$ ($1\leq n\leq 10^5$), which is the number of people.</p>

<p>Each of the next $n$ lines contains two integers $p$ ($-10^8 \leq p \leq 10^8$) and $w$ ($1\leq w \leq 10^5$), where $p$ is that person’s position on the seesaw, and $w$ is that person’s weight. The values of $p$ are guaranteed to be unique and in ascending order.</p>

### 출력

<p>Output a single number, which is the minimum total amount of distance moved for all people in order to balance the seesaw. Answer is correct if it is within absolute or relative error of $10^{-6}$.</p>