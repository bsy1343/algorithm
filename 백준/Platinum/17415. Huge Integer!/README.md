# [Platinum III] Huge Integer! - 17415

[문제 링크](https://www.acmicpc.net/problem/17415)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 528, 정답: 72, 맞힌 사람: 44, 정답 비율: 14.148%

### 분류

그래프 이론, 수학, 정수론

### 문제 설명

<p>$N$개의 정수, $B_1, B_2, \cdots, B_N$과 $N$개의 수열, $C_1, C_2, \cdots, C_N$에 대하여, $\lambda$를 다음과 같이 정의하자.</p>

<p style="text-align: center;">$\lambda = {\overline{C_{1,1} C_{1,2}\cdots C_{1,B_1} C_{2,1} C_{2,2} \cdots C_{2,B_2} \cdots\cdots C_{N,1} C_{N,2} \cdots C_{N,B_N}}}_{(10)}$</p>

<p>$1 \le i \le N$인 정수 $i$에 대하여, $C_{i,1} = C_{i,2} = \cdots = C_{i,B_i} = A_i$를 만족할 때, $\lambda$를 $K$로 나눈 나머지를 구하는 프로그램을 작성하시오.</p>

### 입력

<p>첫 번째 줄에 두 개의 정수 $N$과 $K$가 사이에 공백을 두고 주어진다.</p>

<p>두번째 줄부터 $N$개의 줄에 걸쳐, $A$와 $B$의 정보가 주어진다.</p>

<p>$(i+1)$번째 줄에는 두 정수 $A_i$와 $B_i$가 사이에 공백을 두고 주어진다$(1 \le i \le N)$.</p>

<p>$1 \le i \le N$인 정수 $i$에 대하여, $0 \le A_i \le 9$와 $1 \le B_i \le 10^{18}$을 만족한다.</p>

<p>모든 입력 데이터에 대하여, $1 \le N \le 2 \times 10^6$와 $1 \le K \le 5 \times 10^5$을 만족한다.</p>

### 출력

<p>첫 번째 줄에 $\lambda$를 $K$로 나눈 나머지를 출력한다.</p>