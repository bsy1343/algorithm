# [Platinum V] Firepersons - 6673

[문제 링크](https://www.acmicpc.net/problem/6673)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 48, 정답: 19, 맞힌 사람: 13, 정답 비율: 37.143%

### 분류

수학, 다이나믹 프로그래밍, 분할 정복을 이용한 거듭제곱

### 문제 설명

<p>The Association for Courtly Manners, an international organization for standardization of social interactions (Better known under the name Absurdly Clumsy Moralists, but let&#39;s not take prejudice.) has decided to create a new international standard defining ranks of firepersons (Formerly firemen, but the international standards of course must be politically correct.) - each fireperson receives an integer number describing his rank and when they arrive to a fire, they must enter the fire ground in order of increasing ranks and the low ranked firepersons must keep the fire burning long enough for the high ranked firepersons to enjoy extinguishing sufficiently.</p>

<p>The ranks are assigned according to an Arbitrary Constant Multiplier Sequence. An ACM-sequence of order k is an integer sequence defined by its first k terms a<sub>0</sub>, a<sub>1</sub>,...a<sub>k-1</sub> and a recurrence relation \(a_n = \sum_{i=1}^{k}{a_{n-i}b_i}\)&nbsp;mod 10 000 for n &gt;= k, where the b<sub>i</sub>&#39;s are integer constants. The i-th oldest fireperson then gets rank a<sub>i</sub>.</p>

<p>Your task is to calculate the rank of the i-th fireperson, given parameters of the ACM-sequence and the number i.</p>

### 입력

<p>The input consists of several instances. Each instance is described on a single line containing the following integers separated by a single space: k, a<sub>0</sub>, , a<sub>k-1</sub>, b1, , b<sub>k</sub>, i. Here 1 &lt;= k &lt;= 100 is the order of the sequence, 0 &lt;= a<sub>i</sub> &lt; 10 000 are the first k elements of the sequence, 0 &lt;= b<sub>i</sub> &lt; 10 000 are the multipliers and 0 &lt;= i &lt; 1 000 000 000 is the number of the element we ask for.</p>

<p>The input ends with a line containing a number 0.</p>

<p>&nbsp;</p>

### 출력

<p>The output consists of several lines corresponding to the instances on the input. The l-th line contains a single integer a<sub>i</sub> which is the i-th element of the sequence described by the l-th input instance.</p>

<p>&nbsp;</p>