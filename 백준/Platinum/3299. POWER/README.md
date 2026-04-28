# [Platinum III] POWER - 3299

[문제 링크](https://www.acmicpc.net/problem/3299)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 34, 정답: 22, 맞힌 사람: 20, 정답 비율: 62.500%

### 분류

다이나믹 프로그래밍, 누적 합

### 문제 설명

<p>Dobrica get an interesting and well-paid job. Every morning he needs to turn off all the street lamps in his village. All the lamps are located on the same side of a straight road.</p>

<p>Dobrica is at the party every night until 5 AM and then he starts to turn off the lamps. In the beginning, he is standing besides one of them.</p>

<p>Every lamp has a light bulb of a defined power, and because Dobrica is ecologically conscious, he wants to turn off all the lamps in order that would minimize total energy spent.</p>

<p>Dobrica is moving at the speed of 1 m/s because he is very tired. Turning off a lamp does not take extra time because he can do it while passing by.<br />
Write a program to calculate minimal energy that needs to be spent to turn all the lamps off for given locations of lamps, powers of light bulbs and</p>

<p>Dobrica&#39;s starting position.</p>

### 입력

<p>First line of the input file contains integer N, 2 &le; N &le; 1000, the number of lamps in the village.</p>

<p>Second line contains integer V, 1 &le; V &le; N, number of the lamp at which Dobrica started.</p>

<p>Each of the following N lines contains data describing a lamp - two integers D and W separated by a single space character, 0  D  1000, 0  W  1000. D is distance of a lamp from the beginning of the village (expressed in meters), and W is power of a light bulb in that lamp, i.e. the amount of energy spent by that light bulb during one second. Lamps are given in sorted order.</p>

### 출력

<p>First and only line of the output file should contain one integer - minimal amount of spent energy.</p>

<p>Note: the solution will always be smaller than 1,000,000,000.</p>