# [Platinum V] Risky Lottery - 13966

[문제 링크](https://www.acmicpc.net/problem/13966)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 43, 정답: 22, 맞힌 사람: 15, 정답 비율: 53.571%

### 분류

비트마스킹, 다이나믹 프로그래밍, 비트필드를 이용한 다이나믹 프로그래밍, 런타임 전의 전처리, 담금질 기법

### 문제 설명

<p>Prof. Peter dicided to surprise his class by organizing a new lottery with a very peculiar system.</p>

<p>He starts by announcing a small positive number M. Afterwards, each student is going to secretly write an integer from the set {1, ..., M} on a slip of paper that is then folded. After everyone has selected a number, they reveal all choices and whoever wrote down the lowest unique number is the winner!&nbsp;</p>

<p>For instance, if there are only three students in the class, two of them select number 2 and the other selects number 5, then the student who chose number 5 is the winner.</p>

<p>The lottery was a success, but Prof. Peter is now wondering what strategy his students should have used. If everyone follows the same optimal randomized strategy, with which probability should each number be chosen so that they maximize their chances of winning? A strategy is optimal if, when everyone is following it, then no individual student can improve his winning probability selecting a different strategy. Can you help Prof. Peter?</p>

<p>Given N, the number of students in the class, and M, the largest number they can write down, determine the optimal randomized strategy (followed by all students). That is, determine the probability of selecting each number between 1 and M.</p>

### 입력

<p>There is one line with two integers: N, which is the number of students in the class, and M, which is the largest integer each student can choose.</p>

<ul>
</ul>

### 출력

<p>The output consists of M lines. Line k should have the probability of selecting number k.</p>

<p>The result will be considered correct as long as the absolute error does not exceed 10<sup>-3</sup>.</p>

### 제한

<ul>
	<li>3 &le; N &le; 7 Number of students in the class</li>
	<li>1 &le; M &le; N+1 Maximum number that can be selected</li>
</ul>