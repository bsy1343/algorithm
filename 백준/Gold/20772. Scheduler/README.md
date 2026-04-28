# [Gold IV] Scheduler - 20772

[문제 링크](https://www.acmicpc.net/problem/20772)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 72, 정답: 33, 맞힌 사람: 29, 정답 비율: 56.863%

### 분류

자료 구조, 우선순위 큐

### 문제 설명

<p>There are $T$ processes running in the multitasking operating system &lt;&lt;Squirrel OS&gt;&gt;. Each of the $T$ processes has a given priority $p_i$, which affects how often the process is run. Since the system only has a single core in a single processor to run things, it is facing a challenge of distributing the CPU time between these processes, taking their priorites into account.</p>

<p>The algorithm of defining which process is run at each time moment can be described in the following way. For each process, in addition to the priority $p_i$, there is also a counter $t_i$. Initially all $t_i$ equal 0. Then every second:</p>

<ol>
	<li>processes with the maximum value of $p_i + t_i$ are chosen.</li>
	<li>among such processes, the process with the minimum number $i$ is chosen.</li>
	<li>the chosen process $i$ is run for one second.</li>
	<li>for the chosen process $i$ the value $t_i$ is set to 0.</li>
	<li>for all other processes, the value $t_i$ is increased by 1.</li>
</ol>

<p>Model the work of the operating system for $T$ seconds and calculate for how many seconds each process was run. Assume that all calculations and switches between processes are instant, so the running time for each process in seconds is an integer.</p>

### 입력

<p>The first line contains two space-separated integers $N$ and $T$ --- the number of processes in the operating system ($1 \le N \le 10^5$) and the number of seconds to be modeled ($1 \le T \le 10^6$).</p>

<p>The second line contains $N$ space-separated integers $p_i$ --- the process priorities ($0 \le p_i \le 10^5$).</p>

### 출력

<p>In the only line of the output file, print $N$ space-separated integers --- for how many seconds each of the processes was run.</p>