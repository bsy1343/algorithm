# [Gold III] Fold - 6547

[문제 링크](https://www.acmicpc.net/problem/6547)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 9, 정답: 3, 맞힌 사람: 3, 정답 비율: 50.000%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Read the statement of problem E: Edge to understand how to fold a sheet of paper and how to interpret the input. We define a &quot;stripe&quot; to be a maximally large part of the sheet that has no folding line going through. Since the turns occur at equidistant places, all stripes are congruent.</p>

<p>In this problem you are given the description of the result of performing several folding steps as in problem E: Edge, i.e., in the unfolded state. Additionally, you know that the length of the sheet in its folded state is exactly the length of 1 stripe (again, we ignore thickness).</p>

<p>Find the minimum number of folding steps necessary to generate the described sheet from an initially flat sheet of paper. Note that performing a folding step may create more than one turn in the result because parts of the sheet already overlay due to previous folding steps. When a step is carried out, however, all overlaying parts of the sheet are affected, i.e., it is not allowed to fold, say, only the top three layers.</p>

<p>Finally, note that every result can be obtained by iterating through the turns in a fixed direction and performing a folding step at each turn, thereby accumulating a 1 stripe long stack of all stripes. If <em>n</em> is the number of turns in the input description, this procedure in fact requires <em>n</em> folding steps, which is not necessarily minimal as can be observed in the sample output.</p>

### 입력

<p>The input contains several test cases, each on a separate line. Each line contains a nonempty string of characters <code>A</code> and <code>V</code> describing the longer edge of the sheet. You may assume that the length of the string is less than 200. The input file terminates immediately after the last test case.</p>

### 출력

<p>For each test case print on a line the minimum number of folding steps required to produce the described sheet of paper.</p>