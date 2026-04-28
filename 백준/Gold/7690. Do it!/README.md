# [Gold IV] Do it! - 7690

[문제 링크](https://www.acmicpc.net/problem/7690)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 22, 정답: 11, 맞힌 사람: 11, 정답 비율: 68.750%

### 분류

브루트포스 알고리즘, 다이나믹 프로그래밍, 그리디 알고리즘, 구현, 수학, 시뮬레이션

### 문제 설명

<p>You are the boss of a small lighting fixture company which has n employees. Inspired by Ben Stiller&rsquo;s character in Starsky and Hutch, you have recently taken on the habit of telling your employees to &ldquo;do it!&rdquo; when you want things done. While n<sub>+</sub> of the n employees respond positively to your &ldquo;do it!&rdquo;s, n<sub>&minus;</sub> employees respond negatively and n<sub>0</sub> are neutral to your words.</p>

<p>At time 0, each of your employees begins working alone on building a lighting fixture. Each lighting fixture takes 100 units of labor to finish. Normally, each of your employees contributes r units of labor towards finishing his/her lighting fixture during each time interval (or the amount of labor units remaining for the fixture, whichever is smaller). Thus, an employee would normally take d100/re time intervals to finish his or her lighting fixture. During an interval, however, if you yell &ldquo;do it!&rdquo; over the company intercom, employees who respond positively to your command will do r + 2 units of labor during that time interval, whereas employees who respond negatively will do r &minus; 1 units of labor during the time interval.</p>

<p>Assuming that each employee works on only his or her lighting fixture, and assuming that you yell &ldquo;do it!&rdquo; at most once during each time interval, your goal is to plan a sequence of &ldquo;do it!&rdquo;s so as to ensure that the sum of the times needed to finish all n lighting fixtures is minimized.</p>

### 입력

<p>The input test file will contain multiple test cases. Each input test case will be given as a line containing four integers, n<sub>+</sub>, n<sub>&minus;</sub>, n<sub>0</sub>, and r (where 0 &le; n<sub>+</sub>, n<sub>&minus;</sub>, n<sub>0</sub> &le; 1000 and 1 &le; r &le; 100). The end-of-file is marked by a test case with n<sub>+</sub> = n<sub>&minus;</sub> = n<sub>0</sub> = r = 0 and should not be processed.</p>

### 출력

<p>For each input case, the program should print the minimum sum of times needed to finish all n lighting fixtures.</p>

### 힌트

<p>In first test case, one optimal strategy is to yell &ldquo;do it!&rdquo; in each of the first 25 time intervals. As a result, the 3 positively-responding employees provide 4 units of labor per time interval and thus finish their fixtures in 25 time units. The 1 negatively-responding employee will provide 1 unit of labor per time interval for the first 25 time intervals, 2 units of labor per time interval afterwards, and thus will finish in 25 + 38 = 63 time units. Finally, the neutral employee will always provide 2 units of labor per time interval and hence will finish in 50 time units. This gives a total of 3(25) + 63 + 50 = 188 time units.</p>

<p>In the second test case, an optimal strategy is to never yell &ldquo;do it!&rdquo;. Thus all four employees finish in 50 time units so the total amount of time taken is 200 time units.</p>