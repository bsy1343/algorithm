# [Platinum III] 진단 0 : 1 - 26657

[문제 링크](https://www.acmicpc.net/problem/26657)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 156, 정답: 57, 맞힌 사람: 35, 정답 비율: 30.172%

### 분류

수학, 다이나믹 프로그래밍, 조합론

### 문제 설명

<p>$2$ <strong>이상</strong>의 양의 정수 $m$에 대해서, 음이 아닌 정수 집합을 정의역으로 갖는 함수 $f_{m}$을 다음과 같이 정의한다.</p>

<p>$$f_{m}(x) = \begin{cases} 0 &amp; (x = 0) \\ f_{m}{\left(\dfrac{x}{m}\right)} &amp; (x \equiv 0 \pmod {m}) \\ f_{m}{\left(\left\lfloor\dfrac{x}{m}\right\rfloor\right)} + 1 &amp; (x \not\equiv 0 \pmod {m}) \end{cases}$$</p>

<p>양의 정수 $a$, $b$, $m$, $n$이 주어질 때, $a \le k \le b$에서 $f_{m}(k) = n$인 정수 $k$의 개수를 구하여라.</p>

### 입력

<p>첫 번째 줄에 테스트 케이스의 개수 $T$가 주어진다. $(1 \le T \le 50\,000)$</p>

<p>다음 $T$개의 줄에 양의 정수 $a$, $b$, $m$, $n$이 공백으로 구분되어 주어진다. $(1 \le a \le b \le 10^{18};$ $2 \le m \le 10;$ $1 \le n \le 100)$</p>

### 출력

<p>$T$개의 줄에 걸쳐, 각각의 $a$, $b$, $m$, $n$에 대해 $a \le k \le b$에서 $f_{m}(k) = n$인 정수 $k$의 개수를 출력한다.</p>