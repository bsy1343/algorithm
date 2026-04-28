# [Platinum I] 분수 - 1224

[문제 링크](https://www.acmicpc.net/problem/1224)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 227, 정답: 34, 맞힌 사람: 24, 정답 비율: 21.429%

### 분류

수학, 정수론, 많은 조건 분기

### 문제 설명

<p>유리수를 표현하기 위해 보통 분수를 사용한다. 분수 a/b에서 a를 분자, b를 분모라고 부르고, a와 b는 모두 정수이다. 분수에서 분모가 너무 큰 숫자이면 수식에서 다루기 힘들어진다. 그래서 수학자들은 분모 b가 매우 큰 분수 a/b가 있을 때, 이를 대신하여 분모가 작은 분수 a<sub>1</sub>/b<sub>1</sub>와 a<sub>2</sub>/b<sub>2</sub>를 사용한다, 여기서 a<sub>1</sub>/b<sub>1</sub> &le;&nbsp;a/b &le; a<sub>2</sub>/b<sub>2</sub>이고 b<sub>1</sub>과 b<sub>2</sub>는 둘 다 특정한 정수 c보다 크지 않아야 한다. (즉, b<sub>1</sub>, b<sub>2</sub> &le; c).</p>

<p>분수 a<sub>1</sub>/b<sub>1</sub>과 a<sub>2</sub>/b<sub>2</sub>를 a/b의 근사치 분수 쌍이라고 하자. 수학자들은 근사치 분수 쌍들 중 두 분수의 차이(즉,&nbsp; a<sub>2</sub>/b<sub>2</sub> - a<sub>1</sub>/b<sub>1</sub>)가 최소가 되는 근사치 분수 쌍을 사용하기를 원한다. 수학자를 도와주기 위해, 주어진 분수에 대해 차이가 최소가 되는 근사치 분수 쌍을 찾는 프로그램을 작성하시오.&nbsp;</p>

### 입력

<p>첫째 줄에 세 개의 정수 a, b, c가 주어진다.</p>

### 출력

<p>첫째 줄에 네 개의 정수 a<sub>1</sub>, b<sub>1</sub>, a<sub>2</sub>, b<sub>2</sub>를 출력한다. 여기서 a<sub>1</sub>/b<sub>1</sub>과 a<sub>2</sub>/b<sub>2</sub>는 주어진 분수의 근사치 분수 쌍들 중 그 차이가 최소인 것이어야 하고, a<sub>1</sub>과 b<sub>1</sub>이 서로소이고 a<sub>2</sub>와 b<sub>2</sub>가 서로소이어야 한다. 단, 값이 0인 분수는 항상 &ldquo;0 1&rdquo;을 출력한다.</p>

### 제한

<ul>
	<li>0 &le; a &lt; b &le; 2&times;10<sup>9</sup></li>
	<li>1 &le; c &le; 2&times;10<sup>9</sup></li>
</ul>