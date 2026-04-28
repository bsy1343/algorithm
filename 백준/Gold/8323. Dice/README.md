# [Gold II] Dice - 8323

[문제 링크](https://www.acmicpc.net/problem/8323)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 109, 정답: 22, 맞힌 사람: 14, 정답 비율: 16.667%

### 분류

다이나믹 프로그래밍, 수학, 확률론

### 문제 설명

<p>Jack claims that he has telekinetic powers. He has made a bet with Mike that he would throw a die <em>n</em>&nbsp;times and would get exactly <em>k</em>&nbsp;pips in total. Jack&#39;s die has 6 faces with numbers from 1 to 6 written on them and is perfectly symmetric. Mike does not believe in Jack&#39;s telekinetic powers (in general, being a tenacious rationalist, he does not believe in telekinesis), but he is concerned that Jack could win the bet simply by luck. Therefore, he would like to know what is the chance (in percent) of such an unlucky event, and asked you to write a program that would help him solve this problem.</p>

### 입력

<p>The first line of the standard input contains a single integer <em>t</em>&nbsp;(1 &le; <em>t</em> &le; 20) denoting the number of test cases. Each of the following <em>t</em>&nbsp;lines contains a description of one test case in the form of two integers <em>n<sub>i</sub></em>&nbsp;and <em>k<sub>i</sub></em>&nbsp;(1 &le; <em>n<sub>i</sub></em>, <em>k<sub>i</sub></em> &le; 10<sup>6</sup>) separated by a single space.</p>

### 출력

<p>To the standard output <em>t</em>&nbsp;lines should be written, containing the answers to respective test cases. The answer to one test case is the probability (in percent) that Jack wins the bet, rounded&nbsp;<i>down</i>&nbsp;to the nearest integer.</p>