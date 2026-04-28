# [Platinum II] Adding Numbers - 21045

[문제 링크](https://www.acmicpc.net/problem/21045)

### 성능 요약

시간 제한: 0.5 초, 메모리 제한: 512 MB

### 통계

제출: 57, 정답: 19, 맞힌 사람: 15, 정답 비율: 32.609%

### 분류

많은 조건 분기, 다이나믹 프로그래밍, 수학, 누적 합

### 문제 설명

<p>Samouel has an array <em>A</em> of <em>N</em> integers indexed from 1 to <em>N</em>. Initially, all of the integers are 0. His friend, Gregor also has an array <em>B</em> of <em>N</em> integers indexed from 1 to <em>N</em>.</p>

<p>Samouel wants to modify his array such that his array becomes equal to Gregor&#39;s. To achieve that, Samouel can apply the following operation: choose two consecutive indices <em>i</em> and <em>i</em> + 1 (1 &le; <em>i</em> &lt; <em>N</em>) and do either the following:</p>

<ul>
	<li>Increment <em>A<sub>i</sub></em> by 1 and increment <em>A</em><sub><em>i</em>+1</sub> by 2, or</li>
	<li>Increment&nbsp;<em>A<sub>i</sub></em> by 2 and increment&nbsp;<em>A</em><sub><em>i</em>+1</sub> by 1.</li>
</ul>

<p>Determine whether it is possible for Samouel to achieve his goal.</p>

### 입력

<p>The first line contains one integer: <em>N</em> (1 &le; <em>N</em> &le; 100) in a line denoting the length of both array <em>A</em> and <em>B</em>. The second line contains <em>N</em> integers: <em>B</em><sub>1</sub>, <em>B</em><sub>2</sub>, ..., <em>B<sub>N</sub></em> (0 &le; <em>B<sub>i</sub></em> &le; 50,000) in a line denoting the value of array <em>B</em>.</p>

### 출력

<p>Output &ldquo;YES&quot; in a line if it is possible for Samouel to achieve his goal, or &quot;NO&quot; otherwise.</p>