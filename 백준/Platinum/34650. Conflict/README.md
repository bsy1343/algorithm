# [Platinum V] Conflict - 34650

[문제 링크](https://www.acmicpc.net/problem/34650)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 1024 MB

### 통계

제출: 142, 정답: 69, 맞힌 사람: 64, 정답 비율: 47.059%

### 분류

그래프 이론, 애드 혹, 해 구성하기

### 문제 설명

<blockquote>
<p><cite><em>In a desperate conflict, with a ruthless enemy...</em></cite></p>
</blockquote>

<p><em>This is an interactive problem.</em></p>

<p>As an elite spy fighting against a great evil empire, you have been tasked with $T$ separate reconnaissance missions. Each mission takes place in a different city of the empire, and your success is crucial to the resistance.</p>

<p>Every city is represented by $N$ key buildings, numbered from $1$ to $N$, connected by a network of roads. Each road connects two different buildings, and there may be multiple roads between the same pair of buildings. Your objective for each mission is to fully reconstruct the city's road network.</p>

<p>To achieve this, you are equipped with a special device capable of performing a <strong>sequential shutdown</strong> of the city's power grid. You can define a shutdown sequence  $p_1, p_2, \dots, p_N$ --- a permutation of all $N$ buildings. At the exact moment when the power to building $p_i$ is cut, the device reports the number of roads that connect $p_i$ to other buildings that <strong>still have power.</strong> </p>

<p>You are allowed to use this device at most $N-1$ times during each mission.</p>

### 입력



### 출력



### 제한

<ul>
<li>$1 \le T \le 1\,000$</li>
<li>$2 \le N \le 1\,000$</li>
<li>$0 \le M \le 10^4$</li>
<li>The sum of $N$ over all test cases is at most $2\,000$.</li>
<li>The sum of $M$ over all test cases is at most $10^4$.</li>
</ul>

### 힌트

<p>After printing each query, you must flush the output buffer to ensure the interactor receives your output. Failing to do so can result in an unexpected verdict. You can flush the output by using the following methods:</p>

<ul>
<li>In <code>C++</code>, call <code>fflush(stdout)</code> or <code>cout.flush()</code>.</li>
<li>In <code>Java</code>, call <code>System.out.flush()</code>.</li>
<li>In <code>Python</code>, call <code>sys.stdout.flush()</code>.</li>
<li>In <code>Kotlin</code>, call <code>System.out.flush()</code>.</li>
</ul>

<p>For other languages, you should refer to the official documentation for your language.</p>