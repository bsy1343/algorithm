# [Gold II] FRIENDS - 3289

[문제 링크](https://www.acmicpc.net/problem/3289)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 15, 정답: 6, 맞힌 사람: 6, 정답 비율: 46.154%

### 분류

백트래킹, 비트마스킹, 브루트포스 알고리즘, 다이나믹 프로그래밍, 비트필드를 이용한 다이나믹 프로그래밍

### 문제 설명

<p>Clarke is a successful owner of a small company. Due to the dynamics of a work, each employee got a mobile phone to talk with other employees of the same company. Clark pays all the mobile phone bills of his employees and he tries to cut them down.</p>

<p>He found out about a service allowing lowering phone bills under certain conditions. Two persons that often call each other can use &lsquo;friends&rsquo; service, offered by a phone company, which makes their mutual conversation cheaper. Of course, each person can be a member of only one &lsquo;friends&rsquo; pair and the price of talking with others stay the same.</p>

<p>Clever Clarke obtained a list of calls (containing who talked with whom and how long) his employees made last month. He then tried to pair his employees to make total phone bills as small as possible.</p>

<p>Write a program that will help Clarke to lower his company&rsquo;s phone bills as much as possible using prices of &lsquo;regular&rsquo; and &lsquo;friends&lsquo; phone calls and list of calls of his employees.</p>

### 입력

<p>The first line of input file contains two integers F and R, separated by a space character, 1 &le; F &le; R &le; 100. Number F determines a price of one-minute conversation of &nbsp;&lsquo;friends&rsquo; pair, while number R denotes a price of one minute of &lsquo;regular&rsquo; conversation (i.e. of people who are not in the same &lsquo;friends&rsquo; pair).</p>

<p>The second line contains even integer N, 2 &le; N &le; 16, the number of employees.</p>

<p>The third line of input file contains an integer C, 1 &le; C &le; 10000, the number of calls.</p>

<p>Each of the following C lines contain three integers, separated by a space character, A, B, M, 1 &le; A &le; N, 1 &le; B &le; N, 1 &le; M &le; 100, meaning that employees A and B made a call with duration M minutes.</p>

### 출력

<p>The first line of output file should contain the smallest possible total payment for phone bills for given list.</p>

<p>The next N/2 lines should contain pairs of &lsquo;friends&rsquo; in any order, two numbers separated with a space character.</p>

<p>Note: a solution needs not to be unique.</p>