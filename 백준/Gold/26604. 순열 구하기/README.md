# [Gold II] 순열 구하기 - 26604

[문제 링크](https://www.acmicpc.net/problem/26604)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 83, 정답: 74, 맞힌 사람: 57, 정답 비율: 91.935%

### 분류

구현, 해 구성하기, 시뮬레이션

### 문제 설명

<p>$1$부터 $N$까지의 정수로 이루어진 길이 $N$의 순열 $P$가 있다. 배열 $A_{i}$는 $P$의 처음 $i(1&le;i&le;N)$개의 원소를 정렬시킨 길이 $i$의 배열로 정의한다. 배열 $B$는 $A_{1} \oplus A_{2} \oplus \cdots \oplus A_{N-1} \oplus A_{N} \oplus P$ 연산을 수행한 새로운 배열로 정의한다. 두 배열의 xor 연산은 아래의 절차로 이루어진다.</p>

<p>1. 두 배열의 길이가 같다면 다음과 같이 연산한다.</p>

<p style="text-align: center;">$ A \oplus B = [ A_{1} \oplus B_{1}, A_{2} \oplus B_{2}, \cdots , A_{N-1} \oplus B_{N-1}, A_{N} \oplus B_{N} ] $</p>

<p>2. 길이가 $N$인 배열 $A$와 길이가 $M$인 배열 $B$가 있는 경우 다음과 같이 연산한다. ( $N &lt; M$ )</p>

<p style="text-align: center;">$A \oplus B = [ A_{1} \oplus B_{1}, A_{2} \oplus B_{2}, \cdots , A_{N-1} \oplus B_{N-1}, A_{N} \oplus B_{N}, B_{N+1} , \cdots , B_{M-1}, B_{M} ] $</p>

<p>배열 $B$가 주어졌을 때 원래 순열 $P$를 구하는 프로그램을 작성하시오.</p>

<p>여기서 $\oplus$는 bitwise xor 연산을 의미한다. bitwise xor 연산의 정의는 하단 힌트 탭에 있다.</p>

### 입력

<p>첫째 줄에 순열의 길이 $N$이 주어진다. $ \left( 1 \leq N \leq 5\,000 \right) $</p>

<p>둘째 줄에 배열의 원소 $B_{i}$가 공백으로 구분되어 주어진다.</p>

<p>순열 $P$로 복원할 수 있는 배열 $B$만 주어지며 $B_{i}$는 항상 $2^{31}$보다 작은 음이 아닌 정수다.</p>

### 출력

<p>첫째 줄에 순열 $P$의 원소를 공백으로 구분해 출력한다.</p>

### 힌트

<p>bitwise xor 연산은 두 개의 2진수 값에 대해 자리 단위로 적용되는 연산이다. 먼저 피연산자로 주어진 두 값을 2진수로 표현한다. 그 뒤에 두 값의 각 자릿수를 비교해, 두 값이 다르면 1, 두 값이 같으면 0으로 계산한다.</p>

<p>예를 들어 $12 \oplus 6$의 값은 $10$이다. $12$는 2진수로 표현하면 $1100_{(2)}$이고 $6$은 2진수로 표현하면 $0110_{(2)}$이다. xor 연산은 아래의 그림과 같이 진행되고 결과는 $1010_{(2)}$, 즉 $10$이다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/26604.%E2%80%85%EC%88%9C%EC%97%B4%E2%80%85%EA%B5%AC%ED%95%98%EA%B8%B0/b85187ce.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/26604.%E2%80%85%EC%88%9C%EC%97%B4%E2%80%85%EA%B5%AC%ED%95%98%EA%B8%B0/b85187ce.png" data-original-src="https://upload.acmicpc.net/fd88b829-6b3d-4335-b38d-cc3881b6447a/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>