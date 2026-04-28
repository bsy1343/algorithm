# [Gold V] Hunger Games - 11261

[문제 링크](https://www.acmicpc.net/problem/11261)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 256 MB

### 통계

제출: 143, 정답: 90, 맞힌 사람: 78, 정답 비율: 77.228%

### 분류

다이나믹 프로그래밍, 배낭 문제

### 문제 설명

<p>At the start of the Hunger Games, the participant from each district can select a set of weapons from the toolboxes. However, each participant will be given a sack. Each sack can hold a certain weight. Thus, the total weight of the weapons selected must not exceed the limit of the sack. However, each participant prefers different type of weapons. Therefore, the selection must maximize the participant&rsquo;s preference as well.</p>

### 입력

<p>The first line of standard input contains an integer T, the number of test cases (1 &lt;= T &lt;= 100). T data sets follow. Each test case consists of four lines. The first line contains an integer N, the number of weapons where 1 &lt;= N &lt;= 50. The second line contains an integer W, the capacity of the sack where 1 &lt;= W &lt;= 5000. The third line consists of N integers, each of which represents the weight of each weapon. The last line consists of N integers, each of which represents the participant&rsquo;s preference value of each weapon. The weight value and the preference value of each weapon are ranged between 1 and 100.</p>

### 출력

<p>For each case, you are to output a line giving the maximum total preference value possible of that test case.</p>