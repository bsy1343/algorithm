# [Platinum I] Deadlock Detection - 11042

[문제 링크](https://www.acmicpc.net/problem/11042)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 256 MB

### 통계

제출: 45, 정답: 16, 맞힌 사람: 7, 정답 비율: 63.636%

### 분류

다이나믹 프로그래밍, 그래프 이론, 그래프 탐색, 비트마스킹, 깊이 우선 탐색, 비트필드를 이용한 다이나믹 프로그래밍

### 문제 설명

<p>In concurrent processing environments, a deadlock is an undesirable situation where two or more threads are mutually waiting for others to finish using some resources and cannot proceed further. Your task is to detect whether there is any possibility of deadlocks when multiple threads try to execute a given instruction sequence concurrently.</p>

<p>The instruction sequence consists of characters &#39;u&#39; or digits from &#39;0&#39; to &#39;9&#39;, and each of them represents one instruction. 10 threads are trying to execute the same single instruction sequence. Each thread starts its execution from the beginning of the sequence and continues in the given order, until all the instructions are executed.</p>

<p>There are 10 shared resources called locks from L0 to L9. A digit k is the instruction for acquiring the lock Lk. After one of the threads acquires a lock Lk, it is kept by the thread until it is released by the instruction &#39;u&#39;. While a lock is kept, none of the threads, including one already acquired it, cannot newly acquire the same lock Lk.</p>

<p>Precisely speaking, the following steps are repeated until all threads finish.</p>

<ol>
	<li>One thread that has not finished yet is chosen arbitrarily.</li>
	<li>The chosen thread tries to execute the next instruction that is not executed yet.
	<ul>
		<li>If the next instruction is a digit k and the lock Lk is not kept by any thread, the thread executes the instruction k and acquires Lk.</li>
		<li>If the next instruction is a digit k and the lock Lk is already kept by some thread, the instruction k is not executed.</li>
		<li>If the next instruction is &#39;u&#39;, the instruction is executed and all the locks currently kept by the thread are released.</li>
	</ul>
	</li>
</ol>

<p>After executing several steps, sometimes, it falls into the situation that the next instructions of all unfinished threads are for acquiring already kept locks. Once such a situation happens, no instruction will ever be executed no matter which thread is chosen. This situation is called a deadlock.</p>

<p>There are instruction sequences for which threads can never reach a deadlock regardless of the execution order. Such instruction sequences are called safe. Otherwise, in other words, if there exists one or more execution orders that lead to a deadlock, the execution sequence is called unsafe. Your task is to write a program that tells whether the given instruction sequence is safe or unsafe.</p>

### 입력

<p>The input consists of at most 50 datasets, each in the following format.</p>

<pre>
n
s</pre>

<p>n is the length of the instruction sequence and s is a string representing the sequence. n is a positive integer not exceeding 10,000. Each character of s is either a digit (&#39;0&#39; to &#39;9&#39;) or &#39;u&#39;, and s always ends with &#39;u&#39;.</p>

<p>The end of the input is indicated by a line with a zero.</p>

### 출력

<p>For each dataset, if the given instruction sequence is safe, then print &quot;SAFE&quot; in a line. If it is unsafe, then print &quot;UNSAFE&quot; in a line.</p>

### 힌트

<p>The second input &quot;01u10u&quot; may possibly cause a deadlock. After one thread has executed the initial four instructions &quot;01u1&quot;, the thread keeps only one lock L1. If another thread executes the first instruction &#39;0&#39; at this time, this thread acquires L0. Then, the first thread tries to acquire L0, already kept by the second thread, while the second thread tries to acquire L1, kept by the first thread; This leads to a deadlock.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/11042.%E2%80%85Deadlock%E2%80%85Detection/5fbcc9f4.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/11042.%E2%80%85Deadlock%E2%80%85Detection/5fbcc9f4.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/11042/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:129px; width:341px" />&nbsp;&rarr; <img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/11042.%E2%80%85Deadlock%E2%80%85Detection/40d79cf8.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/11042.%E2%80%85Deadlock%E2%80%85Detection/40d79cf8.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/11042/2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:128px; width:340px" />&nbsp;&rarr; &nbsp;<img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/11042.%E2%80%85Deadlock%E2%80%85Detection/0227e8fe.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/11042.%E2%80%85Deadlock%E2%80%85Detection/0227e8fe.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/11042/3.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:128px; width:341px" /></p>

<p>Figure 1: Why the Sample Input 2 &quot;01u10u&quot; is unsafe.</p>

<p>Contrarily, the third input &quot;201u210u&quot; is safe. If one thread had executed up to &quot;201u21&quot; and another to &quot;20&quot;, then one may think it would lead to a deadlock, but this can never happen because no two threads can simultaneously keep L<sub>2</sub>.</p>