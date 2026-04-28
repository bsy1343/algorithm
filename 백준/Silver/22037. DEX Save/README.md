# [Silver II] DEX Save - 22037

[문제 링크](https://www.acmicpc.net/problem/22037)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 20, 정답: 16, 맞힌 사람: 10, 정답 비율: 83.333%

### 분류

브루트포스 알고리즘, 수학, 확률론, 재귀

### 문제 설명

<p><img alt="" src="https://upload.acmicpc.net/559a941e-ae0b-443b-847a-c0008f9eedba/-/preview/" style="width: 174px; height: 200px; float: right;" />Oh no! &nbsp;After months of playing a campaign in the table-top role-playing game Bungalows &amp; Banshees, your character accidentally triggered a trap and was squished under a gigantic rolling boulder. If you had only succeeded in that dexterity saving throw to dodge out of the way of the incoming boulder of doom...</p>

<p>Always one to dwell on the past, you begin to wonder what your chances actually were of succeeding with the saving throw, and discover that it is not immediately obvious -- you had that bardic inspiration giving you a d6 bonus, but then you had disadvantage on the roll due to being intoxicated, but on the other hand your dexterity save modifier was pretty high...</p>

<p>A basic dexterity saving throw with difficulty $d$ is performed in the following way: first, a d$20$ (i.e., a $20$-sided die) is rolled. &nbsp;If the result of the roll is $1$ the result is immediate failure, and if the result is $20$ the result is immediate success. &nbsp;Otherwise, the character&#39;s DEX save modifier $m$ is added to the die result. &nbsp;If the sum is at least the difficulty $d$, the result is a success, otherwise it is a failure.</p>

<p>There are two extensions to this. &nbsp;First, a roll may be made with either advantage or disadvantage. &nbsp;In these cases, two d$20$s are rolled instead of one, but then only the highest (for advantage) or lowest (for disadvantage) is kept and the result is then computed as in the basic case. &nbsp;Second, the roll may have additional bonuses or penalty in the form of additional dice that are rolled and then added to or subtracted from the d20 result before comparing it to $d$ (but these bonuses/penalties are only rolled once regardless of advantage or disadvantage).</p>

<p>Write a program which, given the data of a saving throw (its difficulty, the DEX save modifier, advantage/disadvantage status, and additional bonus dice) computes the probability that the saving throw will succeed.</p>

### 입력

<p>The input consists of three lines. &nbsp;The first line contains two integers $d$ and $m$ ($0 \le d \le 30$, $-10 \le m \le 10$), the difficulty of the roll and the DEX save modifier of the character. The second line contains one word indicating if the roll has advantage or disadvantage. &nbsp;This word is either &quot;<code>straight</code>&quot; (for a straight roll with neither advantage or disadvantage), &quot;<code>advantage</code>&quot;, or &quot;<code>disadvantage</code>&quot;. &nbsp;Finally, the third line starts with an integer $k$ ($0 \le k \le 5$) indicating the number of additional bonus/penalty dice. &nbsp;This is followed by $k$ dice descriptions, each of the form &quot;<code>[+-]d$x$</code>&quot; ($3 \le x \le 10$ is an integer) indicating that we add (if `<code>+</code>&#39;) or subtract (if `<code>-</code>&#39;) the outcome of an $x$-sided die to the result.</p>

### 출력

<p>Output a single number, the probability that a dexterity saving throw with the given parameters will succeed. &nbsp;This number should be given with an absolute error of at most $10^{-6}$.</p>