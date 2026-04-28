# [Platinum V] Assimilation - 18042

[문제 링크](https://www.acmicpc.net/problem/18042)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 270, 정답: 101, 맞힌 사람: 84, 정답 비율: 39.623%

### 분류

자료 구조, 그리디 알고리즘, 트리를 사용한 집합과 맵

### 문제 설명

<p>An enlightened race of aliens plans to assimilate a star system, to help its inhabitants achieve perfection. They may resist, but &ndash; as you are all well aware &ndash; resistance is futile.</p>

<p>There are <em>n</em> planets in the system, inhabited by <em>a</em><sub>1</sub>, <em>a</em><sub>2</sub>, . . . , <em>a<sub>n</sub></em> people, respectively. Aliens start with 𝑘 assimilation ships and are allowed to make any of the following moves:</p>

<ul>
	<li>An <em>invasion</em> requires landing on a planet with some part of the fleet. The number of landing ships <em>s</em> must be greater or equal to the population <em>m</em> of the planet. After the invasion, these ships disappear, the planet is conquered and now has <em>m</em> + <em>s</em> inhabitants.</li>
	<li>A <em>mobilization</em> creates, from a conquered planet, a number of new ships equal to the population of the planet. Every planet can be mobilized at most once.</li>
</ul>

<p>For Aliens, invasions are easy and natural, but mobilizations turn out to be a bit tricky. Help them conquer all the planets in the system with minimal possible number of mobilizations.</p>

### 입력

<p>The first line of input contains the number of test cases <em>z</em> (1 &le; <em>z</em> &le; 30). The test cases follow, each one in the following format:</p>

<p>The first line of every test case contains two integers <em>n</em> and <em>k</em> (1 &le; <em>n</em> &le; 200 000; 1 &le; <em>k</em> &le; 10<sup>9</sup>) &ndash; the number of planets, and the size of Aliens&rsquo; initial fleet. The second line contains <em>n</em> integers <em>a</em><sub>1</sub>, . . . , <em>a<sub>n</sub></em>&nbsp;(1 &le; <em>a<sub>i</sub></em>&nbsp;&le; 10<sup>9</sup>) &ndash; the populations of the respective planets.</p>

<p>The sum of <em>n</em> values over all test cases does not exceed 500 000.</p>

### 출력

<p>For every test case, output a single integer: the minimal number of mobilizations required to conquer all the planets. If such conquest is impossible, output &minus;1 instead.</p>