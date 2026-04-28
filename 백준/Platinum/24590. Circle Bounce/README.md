# [Platinum III] Circle Bounce - 24590

[문제 링크](https://www.acmicpc.net/problem/24590)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 71, 정답: 49, 맞힌 사람: 41, 정답 비율: 67.213%

### 분류

수학, 기하학, 정수론, 분할 정복을 이용한 거듭제곱, 모듈로 곱셈 역원

### 문제 설명

<p>You are standing by the wall in a large, perfectly circular arena and you throw a tennis ball hard against some other part of the arena. &nbsp;After a given number of bounces, where does the tennis ball next strike the wall?</p>

<p>Map the arena as a unit circle centered at the origin, with you standing at the point $(-1, 0)$. &nbsp;You throw the ball with a direction given by a slope in the coordinate plane of a rational fraction $a/b$. &nbsp;Each bounce is perfect, losing no energy and bouncing from the wall with the same angle of reflection as the angle of incidence to a tangent to the wall at the point of impact.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/24590.%E2%80%85Circle%E2%80%85Bounce/f09d36bb.png" data-original-src="https://upload.acmicpc.net/02c5eb61-4046-4780-9b5b-e9e45e1ffb6f/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 356px; height: 200px;" /></p>

<p>After $n$ bounces, the ball strikes the circle again at some point $p$ which has rational coordinates that can be expressed as $(r/s, t/u)$. &nbsp;Output the fraction $r/s$ modulo the prime $M = 1{,}000{,}000{,}007$.</p>

<p>It can be shown that the $x$ coordinate can be expressed as an irreducible fraction $r/s$, where $r$ and $s$ are integers and $s \not\equiv 0 \pmod M$. Output the integer equal to $r\cdot s^{-1} \pmod M$. In other words, output an integer $k$ such that $0 \le k &lt; M$ and $k\cdot s \equiv r \pmod M$.</p>

<p>For example, if we throw the ball with slope $1/2$ and it bounces once, it first strikes the wall at coordinates $(3/5, 4/5)$. &nbsp;After bouncing, it next strikes the wall at coordinates $(7/25, -24/25)$. &nbsp;The modular inverse of $25$ with respect to the prime $M$ is $280{,}000{,}002$, and the final result is thus $7\cdot 280{,}000{,}002 \pmod M = 960{,}000{,}007$.</p>

### 입력

<p>The single line of input will contain three integers $a$, $b$ ($1 \le a,b \le 10^9, \gcd(a,b)=1$) and $n$ ($1 \le n \le 10^{12}$), where $a/b$ is the slope of your throw, and $n$ is the number of bounces. Note that $a$ and $b$ are relatively prime.</p>

### 출력

<p>Output a single integer value as described above.</p>

<p>Note that Sample 2 corresponds to the example in the problem description.</p>