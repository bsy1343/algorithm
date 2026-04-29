# [Platinum V] Sequences - 11381

[문제 링크](https://www.acmicpc.net/problem/11381)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 16, 정답: 9, 맞힌 사람: 5, 정답 비율: 71.429%

### 분류

(분류 없음)

### 문제 설명

<p>Let x<sub>1</sub> &lt; x<sub>2</sub> &lt; … &lt; x<sub>n</sub> be positive integers and let x<sub>1</sub> and x<sub>2</sub> be relatively prime (i.e. the only positive integer that evenly divides both of them is 1).</p>

<p>We consider all infinite sequences of integers, which are strictly increasing with first member 0, for which the difference between any two adjacent members is equal to one of the integers x<sub>1</sub>, x<sub>2</sub>, …, x<sub>n</sub>. For example, if n = 2, x<sub>1</sub> = 4 and x<sub>2</sub> = 7, then the first nine members of such a sequence are possible to be 0, 4, 8, 15, 19, 26, 33, 40, 44.</p>

<p>Write program sequence that determines the largest integer that cannot be found in any of these sequences.&nbsp;</p>

### 입력

<p>The integer n (1 &lt; n &lt; 6) is given on the first line of the standard input. There are n integers on the second line:&nbsp;x<sub>1</sub>, x<sub>2</sub>, …, x<sub>n</sub>.&nbsp;</p>

### 출력

<p>On a line of the standard output the program have to write the sought integer.</p>