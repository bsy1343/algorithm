# [Silver IV] Equal Schedules - 30949

[문제 링크](https://www.acmicpc.net/problem/30949)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 161, 정답: 87, 맞힌 사람: 77, 정답 비율: 53.846%

### 분류

자료 구조, 문자열, 집합과 맵, 해시를 사용한 집합과 맵, 트리를 사용한 집합과 맵

### 문제 설명

<p>You are one of the people on-call for a high-availability service that offers users to solve programming tasks. As an organized team, you have an on-call schedule specifying who is responsible for the service at which time. A colleague sends you a new schedule, and you want to make sure that everyone has the same amount of on-call time as before, or print any differences.</p>

<p>The on-call schedule is specified with lines of form $s_ie_it_i$, where $s_i$ and $e_i$ represent the start and end offsets of the on-call shift for a teammate $t_i$ from some start hour.</p>

<p>Given a sample schedule</p>

<pre>
<code>0 7 jan
7 14 tomaz
14 20 jure
20 24 jan
24 25 tomaz
25 26 jure
</code></pre>

<p>we can see that <code>jan</code> is on-call for the first 7 hours (hour 0, 1, 2, 3, 4, 5, and 6), <code>tomaz</code> for next 7, ... In total, <code>jan</code> is on-call for 11 hours, <code>tomaz</code> for 8 and <code>jure</code> for 7.</p>

### 입력

<p>The input contains two schedules separated by a horizontal line <code>------</code>. Each schedule contains one or more lines of form $s_ie_i t_i$, where integers $s_i$ and $e_i$ specify that teammate $t_i$ is on-call for hours from $s_i$ up to and excluding $e_i$. A final line <code>======</code> is printed after the second schedule.</p>

### 출력

<p>Output the differences between two schedules, in form $t_i \pm\! d_i$, where $d_i$ is the difference between the second and the first schedule for the teammate $t_i$. The output should be sorted alphabetically by teammates&#39; names and teammates with no differences should be omitted, otherwise the difference should be printed with a <code>+</code> or a <code>-</code> sign. If no differences are found, print &quot;<code>No differences found.</code>&quot; (without the quotes).</p>

### 제한

<p>For each schedule, the following holds:</p>

<ul>
	<li>$s_1 = 0$</li>
	<li>$s_i &lt; e_i$</li>
	<li>$s_{i+1} = e_i$</li>
	<li>$e_i \leq 1000$</li>
	<li>Name $t_i$ will consist of lowercase letters from the English alphabet.</li>
	<li>$3 \leq |t_i| \leq 20$</li>
</ul>