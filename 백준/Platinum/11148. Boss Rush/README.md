# [Platinum II] Boss Rush - 11148

[문제 링크](https://www.acmicpc.net/problem/11148)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 25, 정답: 6, 맞힌 사람: 5, 정답 비율: 45.455%

### 분류

이분 매칭

### 문제 설명

<p>You are playing the fantastic new game Mega Man XIII-2. Unfortunately, the boss fights in the game are extremely hard. You have access to several weapons, like the PowerLaser, the EvilRocket and the PsychTerror. Each weapon belongs to one of three categories: laser, rocket and psiotic. In order to defeat a boss you must use three weapons, one from each category. A given boss is only vulnerable against a subset of the weapons, but you have studied the bosses in advance and know which weapons you can use against each of them.</p>

<p>You start the game with two of every available weapon. As the game progresses, you encounter every boss in a predefined order. For each boss fight, you choose one weapon from each category, and after the fight those three weapons are worn out and cannot be used again.</p>

<p>In order to progress as far as possible into the game, you need to select your weapons carefully. You don&rsquo;t want to lose against the last boss because you already spent the needed weapons in the beginning of the game! However, you are overwhelmed by the number of ways you can pick weapons against the bosses, so you have decided to write a computer program that determines the maximum number of bosses you can defeat if you pick the weapons for each boss fight optimally.</p>

### 입력

<p>The first line of the input consists of a single integer T, the number of test cases. Each test case begins with a line containing a single integer N, the number of bosses in the play session. Then N groups of 3 lines follow, a total of 3N lines. The i-th group of 3 lines describes which weapons can be used to defeat boss i from the categories laser, rocket and psiotic, respectively (one line for each category). These lines start with an integer W<sub>ij</sub>, the number of weapons from the j-th category that can be used to defeat boss i. The remainder of a line contains W<sub>ij</sub> space-separated strings containing the names of the weapons.</p>

<ul>
	<li>0 &lt; T &le; 100</li>
	<li>0 &lt; N &le; 100</li>
	<li>0 &lt; W<sub>ij</sub> &le; 10</li>
	<li>All string lengths are between 1 and 32, inclusive.</li>
	<li>A string only consists of upper- and lowercase letters from a to z.</li>
</ul>

### 출력

<p>For each test case, output on a single line M, the maximal number of bosses you can beat.</p>