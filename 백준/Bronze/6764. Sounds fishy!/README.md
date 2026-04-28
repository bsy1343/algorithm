# [Bronze IV] Sounds fishy! - 6764

[문제 링크](https://www.acmicpc.net/problem/6764)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 7310, 정답: 3091, 맞힌 사람: 2867, 정답 비율: 42.619%

### 분류

구현

### 문제 설명

<p>A fish-finder is a device used by anglers to find fish in a lake. If the fish-finder finds a fish, it will sound an alarm. It uses depth readings to determine whether to sound an alarm. For our purposes, the fish-finder will decide that a fish is swimming past if:</p>

<ul>
	<li>there are four consecutive depth readings which form a strictly increasing sequence (such as 3 4 7 9) (which we will call &ldquo;Fish Rising&rdquo;), or</li>
	<li>there are four consecutive depth readings which form a strictly decreasing sequence (such as 9 6 5 2) (which we will call &ldquo;Fish Diving&rdquo;), or</li>
	<li>there are four consecutive depth readings which are identical (which we will call &ldquo;Constant Depth&rdquo;).</li>
</ul>

<p>All other readings will be considered random noise or debris, which we will call &ldquo;No Fish.&rdquo;</p>

<p>Your task is to read a sequence of depth readings and determine if the alarm will sound.</p>

### 입력

<p>The input will be four positive integers, representing the depth readings. Each integer will be on its own line of input.</p>

### 출력

<p>The output is one of four possibilities. If the depth readings are increasing, then the output should be <code>Fish Rising</code>. If the depth readings are decreasing, then the output should be <code>Fish Diving</code>. If the depth readings are identical, then the output should be <code>Fish At Constant Depth</code>. Otherwise, the output should be <code>No Fish</code>.</p>