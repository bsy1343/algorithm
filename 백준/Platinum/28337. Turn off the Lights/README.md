# [Platinum I] Turn off the Lights - 28337

[문제 링크](https://www.acmicpc.net/problem/28337)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 1024 MB

### 통계

제출: 34, 정답: 6, 맞힌 사람: 5, 정답 비율: 71.429%

### 분류

비트마스킹, 다이나믹 프로그래밍, 비트필드를 이용한 다이나믹 프로그래밍

### 문제 설명

<p>Eunjin has a rectangular-shaped board of light bulbs. It is consisted of $R$ rows and $C$ columns, therefore there are $RC$ bulbs in total. A light bulb can have either of two states: turned on (often denoted by &ldquo;<code>1</code>&rdquo;) or turned off (often denoted by &ldquo;<code>0</code>&rdquo;).</p>

<p>Wonha, a mischievous boyfriend, messed up her light board by turning on some bulbs. The other bulbs are currently turned off. After Eunjin noticed his mischief, she decided to turn all the lights off using minimum number of operations. The only operation she can do is to reverse the state of a consecutive sequence of light bulbs in a row or column.</p>

<p>You must write a program that computes the smallest possible number of operations needed for her, to make all the bulbs turned off. It is allowed that some light bulbs to be turned on during the whole process, but after a sequence of appropriate operations, all the bulbs must be turned off.</p>

### 입력

<p>The input consists of $T$ test cases. The number of test cases $T$ is given in the first line of the input.</p>

<p>The first line of each test cases contains two integers $R$ and $C$, which denotes the number of rows and the number of columns, respectively, in the light board. Each of the following $R$ rows contains a string of $C$ digits &ldquo;<code>1</code>&rdquo; or &ldquo;<code>0</code>&rdquo;. Each digit denotes the initial state of each light bulb after Wonha changed the state of some light bulbs: &ldquo;<code>1</code>&rdquo; means the bulb is turned on, and &ldquo;<code>0</code>&rdquo; means the bulb is turned off. You may assume that both $R$ and $C$ are not greater than $15$.</p>

### 출력

<p>Print exactly one line for each test case. The line should contain an integer indicating the smallest number of operations needed.</p>