# [Silver III] NumberEater - 8529

[문제 링크](https://www.acmicpc.net/problem/8529)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 133, 정답: 52, 맞힌 사람: 30, 정답 비율: 34.483%

### 분류

자료 구조, 정렬, 집합과 맵, 해시를 사용한 집합과 맵

### 문제 설명

<p>The NumberEater is a famous monster from Byteland. It eats numbers, but it is very picky: each day its meal must be unique. The monster is given a sequence of integers (a<sub>n</sub>). It chooses the starting and ending positions of a meal -i and j (1 &le; i &le; j &le; n) - and prepares a meal that consists of elements a<sub>i</sub>, a<sub>i+1</sub>, &hellip;, a<sub>j</sub>. The monster considers two meals [i<sub>1</sub>,j<sub>1</sub>] and [i<sub>2</sub>,j<sub>2</sub>] identical if the sets of numbers that they contain are the same; in other words:</p>

<p>{a<sub>k</sub> : i<sub>1</sub> &le; k &le; j<sub>1</sub>} = {a<sub>k</sub> : i<sub>2</sub> &le; k &le; j<sub>2</sub>}</p>

<p>Help NumberEater and count the number of different meals that it can prepare using only the sequence a.</p>

### 입력

<p>The first line of the input contains one integer n (1 &le; n &le; 500), the length of the sequence a. The following n lines contain values of elements of the sequence. Each of them is at least 1 and at most 500.</p>

### 출력

<p>The first and only line of the output should contain the number of different meals that NumberEater can prepare.</p>

<p>&nbsp;</p>