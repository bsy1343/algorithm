# [Platinum III] Salad Bar - 10121

[문제 링크](https://www.acmicpc.net/problem/10121)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 256 MB

### 통계

제출: 432, 정답: 122, 맞힌 사람: 98, 정답 비율: 30.721%

### 분류

자료 구조, 세그먼트 트리, 스위핑, 스택

### 문제 설명

<p>Bytea went to a salad bar. There are &nbsp;fruits one next to another on the bar counter. Specifically, these are apples and oranges. Bytea can pick any contiguous part of the line of fruits for her salad.</p>

<p>The fruits she chooses will be added to the salad either from left to right or from right to left. As Bytea loves oranges, she requires that throughout the salad making process, the number of oranges in it should always be no smaller than the number of apples, regardless of whether these are added % from left to right or from right to left. Help Bytea out by writing a program that will find the longest contiguous part of the line of fruits that satisfies her requirements.</p>

### 입력

<p>The first line of the standard input contains a single integer n (1 &le; n &le; 1,000,000), denoting the number of fruits. The next line contains a string of n characters a<sub>1</sub>a<sub>2</sub>&hellip;a<sub>n</sub> (a<sub>i</sub> &isin; {j, p}). These stand for Polish names of apples and oranges: jab\l{ka} and pomara\&#39;ncze). Consequently, if a<sub>i</sub>=j, then the i-th fruit in a line is an apple, and otherwise it is an orange.</p>

<p>&nbsp;</p>

### 출력

<p>The first and only line of the standard output should contain a single integer equal to the number of fruits in the longest contiguous part of the line that satisfies Bytea&#39;s requirements. Note that it could be the case that 0 is the correct result.</p>

### 힌트

<p>Once the leftmost and the rightmost apples are discarded, Bytea can order a salad out of all remaining fruits.</p>