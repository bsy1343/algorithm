# [Gold III] Dividing Stones - 30146

[문제 링크](https://www.acmicpc.net/problem/30146)

### 성능 요약

시간 제한: 7 초, 메모리 제한: 1024 MB

### 통계

제출: 31, 정답: 10, 맞힌 사람: 8, 정답 비율: 34.783%

### 분류

백트래킹, 자료 구조, 해시를 사용한 집합과 맵, 런타임 전의 전처리, 집합과 맵

### 문제 설명

<p>There are N stones, which can be divided into some piles arbitrarily. Let the value of each division be equal to the product of the number of stones in all the piles modulo P. How many possible distinct values are possible for a given N and P?</p>

### 입력

<p>The first line contains the number of test cases T. T lines follow, one corresponding to each test case, containing 2 integers: N and P.</p>

### 출력

<p>Output T lines, each line containing the required answer for the corresponding test case.</p>

### 제한

<ul>
	<li>T &le; 20</li>
	<li>2 &le; N &le; 70</li>
	<li>2 &le; P &le; 10<sup>9</sup></li>
</ul>

### 힌트

<p>In the first test case, the possible ways of division are (1,1,1), (1,2), (2,1) and (3) which have values 1, 2, 2, 3 and hence, there are 3 distinct values.</p>

<p>In the second test case, the numbers 1 to 6 constitute the answer and they can be obtained in the following ways:</p>

<ul>
	<li>1=1*1*1*1*1</li>
	<li>2=2*1*1*1</li>
	<li>3=3*1*1</li>
	<li>4=4*1</li>
	<li>5=5</li>
	<li>6=2*3</li>
</ul>