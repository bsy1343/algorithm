# [Silver II] ICPC Scoreboard - 5739

[문제 링크](https://www.acmicpc.net/problem/5739)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 31, 정답: 13, 맞힌 사람: 11, 정답 비율: 45.833%

### 분류

구현, 정렬

### 문제 설명

<p>Charles is the contest director for the ICPC Tumbolian regional contest. His responsibility is ensuring the contest flows smoothly, that the contest rules are applied fairly, and, of course, announcing the final contest ranking.</p>

<p>According to ICPC rules, a team with more solved problems ranks above a team with less solved problems. If two teams have the same number of solved problems, the team with the smaller total penalty ranks above the team with the larger total penalty (in case both teams have the same number of solved problems and the same penalty, Charles considers them as tied).</p>

<p>The total penalty for a team is the sum of all the problem penalties of the problems that team has solved. The problem penalty for a problem is T P +EP &times;F A, where T P is the time penalty for that problem, EP is the contest&rsquo;s error penalty and F A is the number of failed attempts at solving the problem before submitting a correct solution.</p>

<p>The time penalty for a problem is the time since the start of the contest, in minutes, that the team needed to solve the problem. The error penalty is a positive integer chosen by the contest director, designed to reward teams that submit correct solutions on the first attempt.</p>

<p>Charles wants to change the error penalty from the &ldquo;standard&rdquo; value of 20 minutes to stir things up. To study the effects of that change on the final rankings, he wants to know the range of error penalties that don&rsquo;t change the final standings.</p>

<p>In other words, if team A is ahead of team B in the original standings, then A should be ahead of B in the modified standings; if A and B are tied in the original standings, they should also be tied in the modified standings (the original standings are the ones obtained with an error penalty of 20 minutes).</p>

<p>Charles has been very busy organizing the Tumbolian regional, so he asked you to make a program that will compute the range for him.</p>

### 입력

<p>The input contains several test cases. The first line of each test case contains two integers T and P separated by a single space, indicating the number of teams and the number of problems, respectively (2 &le; T &le; 100, 1 &le; P &le; 10). Each one of the next T lines describes the performance of a team. A team&rsquo;s performance description is a line containing P problem descriptions separated by single spaces. Teams are not necessarily given in order of their final standings.</p>

<p>Each problem description is a string &ldquo;A/S&rdquo;, where A is an integer representing the number of attempts that the corresponding team made at solving that problem (0 &le; A &le; 100), and S is either &ldquo;-&rdquo;, if the team did not solve that problem, or an integer indicating the number of minutes it took for the team to submit a correct solution (1 &le; S &le; 300). Attempts made after the first correct submission are not counted.</p>

<p>The end of input is indicated by T = P = 0.</p>

<p>The input must be read from standard input.</p>

### 출력

<p>For each test case in the input print two positive integers separated by a single space, indicating the smallest and largest error penalties that would not change the final ranking. If there is no upper bound for the error penalty, print a &ldquo;*&rdquo; instead of the upper bound.</p>

<p>The output must be written to standard output.</p>