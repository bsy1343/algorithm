# [Platinum III] Family Hotel (Small) - 14340

[문제 링크](https://www.acmicpc.net/problem/14340)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 32, 정답: 21, 맞힌 사람: 19, 정답 비율: 73.077%

### 분류

조합론, 다이나믹 프로그래밍, 수학, 누적 합

### 문제 설명

<p>You run a hotel with&nbsp;N&nbsp;rooms arranged along one long corridor, numbered from 1 to&nbsp;Nalong that corridor. Your guests are big families, and every family asks for exactly two adjacent rooms when they arrive. Two rooms are adjacent if their numbers differ by exactly 1.</p>

<p>At the start of the day today, your hotel was empty. You have been using the following simple strategy to assign rooms to your guests. As each family arrives, you consider all possible pairs of adjacent rooms that are both free, pick one of those pairs uniformly at random, and assign the two rooms in that pair to the family. New families constantly arrive, one family at a time, but once there are no more pairs of adjacent rooms that are both free, you turn on the NO VACANCY sign and you do not give out any more rooms.</p>

<p>Given a specific room number, what is the probability that it will be occupied at the time that you turn on the NO VACANCY sign?</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;T.&nbsp;T&nbsp;lines follow. Each line contains two numbers: the number of rooms&nbsp;N&nbsp;and the room number&nbsp;K&nbsp;that we are interested in.</p>

<h3>Limits</h3>

<ul>
	<li>1 &le;&nbsp;T&nbsp;&le; 100.</li>
	<li>1 &le;&nbsp;K&nbsp;&le;&nbsp;N.</li>
	<li>2 &le;&nbsp;N&nbsp;&le; 10<sup>4</sup>.</li>
</ul>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>y</code>&nbsp;is the sought probability computed&nbsp;modulo 10<sup>9</sup>+7, which is defined precisely as follows. Represent the probability that room&nbsp;K&nbsp;is occupied as an irreducible fraction&nbsp;<code>p/q</code>. The number&nbsp;<code>y</code>&nbsp;then must satisfy the modular equation&nbsp;<code>y &times; q &equiv; p (mod 10<sup>9</sup>+7)</code>, and be between 0 and 10<sup>9</sup>+6, inclusive. It can be shown that under the constraints of this problem such a number&nbsp;<code>y</code>&nbsp;always exists and is uniquely determined.</p>

### 힌트

<p>In sample case #3, there are four rooms and we are looking for probability that the first room is occupied. When the first family arrives, there are 3 possible situations, each with probability 1/3: occupy rooms 1+2, 2+3 or 3+4. In the first situation, the first room is already occupied and will stay occupied. In the second situation, the first room is free and no more families can be accommodated, so it will stay free. Finally, in the third situation, the next arriving family will definitely get rooms 1+2, and thus the first room will be occupied. The probability that the first room is occupied is thus 2/3, and the answer is 666666672, since&nbsp;<code>(666666672 * 3) mod 1000000007 = 2 mod 1000000007</code>.</p>

<p>The probability for sample case #1 is 1/2, and for sample cases #2 and #4 it is 1.</p>