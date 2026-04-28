# [Platinum II] Rolete - 31686

[문제 링크](https://www.acmicpc.net/problem/31686)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 31, 정답: 13, 맞힌 사람: 12, 정답 비율: 57.143%

### 분류

그리디 알고리즘, 구현, 삼분 탐색

### 문제 설명

<p>One Saturday Luka woke up from an afternoon nap and remembered: today is COCI! There was only one thing that he needed to do before the contest: raise the blinds.</p>

<p>Luka has $n$ blinds in his room, where the $i$-th one is lowered by $a_i$ centimeters from the top of the window. He can raise the blinds in two ways:</p>

<ul>
	<li>He can start lifting any singular blind manually. With this method, it takes him $t$ seconds to raise the blind by $1$ centimeter.</li>
	<li>He can press a button, which starts raising all blinds parallel at the same speed.</li>
</ul>

<p>The speed at which the blinds are raised with a button is defined as follows: If all blinds are still rising, each will rise by $1$ centimeter in s seconds. If $r$ blinds have already been risen to the top that slows down the system. Then it will take $s + k \cdot r$ seconds for all the remaining blinds to rise by $1$ centimeter.</p>

<p>COCI is about to start, and Luka wants to raise his blinds as soon as possible. Meanwhile, his brother Marin entered the room and asked him $q$ questions: <em>What is the minimum time you need to raise the blinds so that they are all lowered by at most $h$ centimeters?</em> Marin is interested in the answer for each question considering the initial state of the blinds.</p>

<p>They realized that there is not enough time to think about it before COCI. Fortunately, the problem has just appeared here as well! Help them solve it!</p>

<p>Note: Luka will always raise the blind by an integer value of centimeters.</p>

### 입력

<p>The first line contains integers $n$, $t$, $s$ and $k$ ($1 &le; n, t, s &le; 10^5$, $0 &le; k &le; 10^5$), the number of blinds, the time required to raise a blind manually, the time required to raise a blind with a button and the slowing factor of parallel raising.</p>

<p>The second line contains $n$ integers $a_i$ ($0 &le; a_i &le; 10^5$), the initial state of blinds.</p>

<p>The third line contains integer $q$ ($1 &le; q &le; 10^5$), number of questions.</p>

<p>The fourth line contains $q$ integers $h_i$ ($0 &le; h_i &le; 10^5$), required maximal blind height.</p>

### 출력

<p>In first and only line print $q$ numbers, $i$-th of them is minimum time for raising the blinds such that they are lowered by at most $h_i$ centimeters.</p>