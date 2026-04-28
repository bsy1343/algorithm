# [Platinum IV] 멋진 부분집합 - 27470

[문제 링크](https://www.acmicpc.net/problem/27470)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 1003, 정답: 195, 맞힌 사람: 123, 정답 비율: 16.577%

### 분류

수학, 정수론, 무작위화, 소인수분해

### 문제 설명

<p>KSA 학생들은 <strong>멋진 집합</strong>을 좋아한다. <strong>멋진 집합</strong>이란 모든 원소들의 최대공약수가 $1$보다 큰 정수들의 중복집합이다. 크기가 $N$인 중복집합이 주어졌을 때, 주어진 중복집합의 부분집합 중 크기가 $\left\lceil\cfrac{N}{2}\right\rceil$인 <strong>멋진 집합</strong>을 찾아보자!</p>

### 입력

<p>첫 번째 줄에 정수 $N$이 주어진다.</p>

<p>두 번째 줄에 중복집합의 원소들인 $N$개의 정수가 주어진다.</p>

### 출력

<p>첫 번째 줄에 <strong>멋진 집합</strong>이 존재한다면 <code><span style="color:#e74c3c;">YES</span></code>, 아니라면 <code><span style="color:#e74c3c;">NO</span></code>를 출력한다.</p>

<p>만약 <strong>멋진 집합</strong>이 존재한다면, 두 번째 줄에 <strong>멋진 집합</strong>에 속한 $\left\lceil\cfrac{N}{2}\right\rceil$개의 정수를 출력한다.</p>

<p>정답이 여러 개 존재한다면 아무거나 출력해도 상관없으며, 각 원소를 출력하는 순서는 상관없다.</p>

### 제한

<ul>
	<li>$3 \leq N \leq 5 \times 10^{5}$</li>
	<li>주어지는 중복집합의 원소들은 $2$ 이상 $10^{9}$ 이하의 정수</li>
</ul>