# [Gold II] Coins - 8298

[문제 링크](https://www.acmicpc.net/problem/8298)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 516, 정답: 116, 맞힌 사람: 87, 정답 비율: 25.588%

### 분류

자료 구조, 집합과 맵, 누적 합, 해시를 사용한 집합과 맵, 트리를 사용한 집합과 맵

### 문제 설명

<p>Joe claims that he has telekinetic abilities. This statement has shocked Stan, who is a confirmed rationalist, and he immediately wanted Joe to prove it.</p>

<p>Joe decided to toss a coin to show what he is capable of. He says that he can do it in such a way, that there will be exactly <em>k</em>&nbsp;times more heads than tails. Stan has written down the results for all tosses and now he wants to find the longest sequence of consecutive tosses, in which heads are exactly&nbsp;<em>k</em>&nbsp;times more common than tails.</p>

### 입력

<p>The first line of the standard input contains two integers <em>n</em>&nbsp;and <em>k</em>&nbsp;(3 &le; <em>n</em> &le; 1 000 000, 2 &le; <em>k</em> &le; <em>n</em> - 1). The first is the number of tosses made by Joe, whereas the meaning of the second number has already been described in the task statement. The second line contains a sequence of <em>n</em>&nbsp;characters describing the outcomes of consecutive tosses. It consists of letters&nbsp;<code>O</code>&nbsp;and&nbsp;<code>R</code>&nbsp;denoting heads and tails respectively.</p>

### 출력

<p>Your program should output one integer to the first and only line of the standard output equal to the length of the longest sequence of consecutive tosses, in which there are exactly <em>k</em>&nbsp;times more heads than tails. If such sequence does not exist, your program should output 0.</p>

### 힌트

<p>The series from fifth to twelfth as well as from sixth to thirteenth toss contain exactly 6 heads and 2 tails, i.e., three times more heads than tails. There does not exist a longer sequence with this property.</p>