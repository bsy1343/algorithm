# [Platinum IV] Intruder Outsmarting - 29785

[문제 링크](https://www.acmicpc.net/problem/29785)

### 성능 요약

시간 제한: 5 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 16, 정답: 10, 맞힌 사람: 10, 정답 비율: 66.667%

### 분류

수학, 정수론, 모듈로 곱셈 역원, 확장 유클리드 호제법

### 문제 설명

<p>Amiria is a cautious internet user, and as such, she is setting up two-factor authentication for her accounts. She is using a special type of security key as an extra precaution to outsmart any intruders that may want to take it. Amiria&#39;s security key requires a code to activate. To enter the code, one must place it on wheels with numbers, similar to code padlocks.</p>

<p>Amiria&#39;s security key has a sequence of $\mathbf{W}$ wheels. Each wheel has the numbers $1$ through $\mathbf{N}$ printed in order. By one wheel rotation, the user can move the currently shown integer either to the next or the previous integer. Numbers on the wheel wrap around. This means the number after $\mathbf{N}$ is $1$ and the number before $1$ is $\mathbf{N}$.</p>

<p>There is no hidden password. To activate Amiria&#39;s security key, a person needs to move the wheels such that the sequence of numbers shown is palindromic. That is, the sequence of numbers is the same when read from left to right and from right to left. To slow down intruders, Amiria rigged the security key such that the wheels only rotate in increments of $\mathbf{D}$. That is, on a move, a wheel that is currently showing $x$ can be made to show $x - \mathbf{D}$ or $x + \mathbf{D}$, applying the proper wraparound. That is, if $x - \mathbf{D} \lt 1$ the actual number shown after the operation is $x - \mathbf{D} + \mathbf{N}$, and if $x + \mathbf{D} \gt \mathbf{N}$ the actual number shown is $x + \mathbf{D} - \mathbf{N}$.</p>

<p>Amiria wants to check how much this system would slow down an intruder trying to use her security key. Given the number of wheels and the number currently shown on each wheel, find the minimum number of operations needed to make the sequence of shown numbers palindromic, or report that it is impossible to do so.</p>

### 입력

<p>The first line of the input gives the number of test cases, $\mathbf{T}$. $\mathbf{T}$ test cases follow. Each test case consists of two lines. The first line of a test case contains $3$ integers $\mathbf{W}$, $\mathbf{N}$, and $\mathbf{D}$: the number of wheels in Amiria&#39;s security key, the number of integers shown in each of those wheels, and the fixed increment that Amiria rigged for every wheel. The second line of a test case contains $\mathbf{W}$ integers $\mathbf{X_1}, \mathbf{X_2}, \dots, \mathbf{X_W}$, where $\mathbf{X_i}$ is the number currently shown in the $i$-th wheel from left to right.</p>

### 출력

<p>For each test case, output one line containing <code>Case #x: y</code>, where $x$ is the test case number (starting from 1) and $y$ is the minimum number of operations needed to make the sequence of shown numbers palindromic. If there is no way to make the sequence of shown numbers palindromic through the allowed operations, $y$ must be <code>IMPOSSIBLE</code> instead.</p>

### 제한

<ul>
	<li>$1 \le \mathbf{T} \le 100$.</li>
	<li>$1 \le \mathbf{D} \le \mathbf{N} - 1$.</li>
	<li>$1 \le \mathbf{X_i} \le \mathbf{N}$, for all $i$.</li>
</ul>

### 힌트

<p>In Sample Case #1, the sequence can be made $5\, 4\, 5\, 4\, 5$, which is palindromic, with $3$ operations by using one addition operation on the first and fourth wheels, and one subtraction operation on the fifth wheel. There is no way to make the sequence palindromic with fewer moves.</p>

<p>In Sample Case #2 the sequence is already palindromic, so we do not need any operations.</p>

<p>In Sample Case #3, both numbers would need to be equal for the sequence to be palindromic. Since wheel values can only move by $2$ and both current numbers have different parity, that cannot be done.</p>