# [Gold IV] Finding Celebrities - 32881

[문제 링크](https://www.acmicpc.net/problem/32881)

### 성능 요약

시간 제한: 20 초 (추가 시간 없음), 메모리 제한: 1024 MB (추가 메모리 없음)

### 통계

제출: 258, 정답: 48, 맞힌 사람: 36, 정답 비율: 20.339%

### 분류

애드 혹

### 문제 설명

<p><em>This is an interactive problem.</em></p>

<p>It is time for the Sogang Computer Science Festival (Korean: <em>서강대학교 컴퓨터공학과 전산제</em>). $N$ people gathered to congratulate the remarkable anniversary of the Department of Computer Science and Engineering.</p>

<p>There is a rumor that a celebrity has come to this festival. You, curious about who the celebrity is, are tasked with finding a celebrity among the $N$ people at this festival.</p>

<p>A <strong>celebrity</strong> is someone known by everyone at this festival who does not know anyone else. You can roam around the festival venue to ask if some person $A$ knows some other person $B$. By asking at most $Q$ questions, determine whether this festival has a celebrity and, if so, identify who it is.</p>

### 입력

<p>Initially, two space-separated integers are given: $N$, which denotes the number of attendees to this festival, and $Q$, which denotes the number of questions you can ask. ($1 \le N \le 100\,000;$ See below for $Q$)</p>

### 출력

<p>You can interact with the judging system by outputting one of the following:</p>

<ul>
	<li><span style="color:#e74c3c;"><code>?</code> $A$ $B$</span>: Ask if the person $A$ knows $B$. ($1 \le A,B \le N;$ $A \ne B$) This type of interaction can be made at most $Q$ times.

	<ul>
		<li>The judging system will answer <span style="color:#e74c3c;"><code>1</code></span> if the person $A$ knows $B$, or <code><span style="color:#e74c3c;">0</span></code> if they don't.</li>
	</ul>
	</li>
	<li><span style="color:#e74c3c;"><code>!</code> $X$</span>: If $X \ne -1$, identify the celebrity as person $X$. Otherwise, conclude that there is no celebrity in this festival.
	<ul>
		<li>Depending on your answer, the judging system will terminate your program and determine the verdict as either <span style="color:#16a085;"><strong>Accepted </strong></span>or <span style="color:#e74c3c;">Wrong Answer</span>.</li>
	</ul>
	</li>
</ul>

<p>You should also output a newline character and flush the standard output buffer. Failure to adhere to any of these requirements can result in an unexpected verdict.</p>

### 힌트

<p>(For Sogang students:) Note that this problem is an improvised version that matches the format of a problem in a general programming contest. While in the exam, the original scoring was:</p>

<ul>
	<li>Around $75$ points for Subtask 1.</li>
	<li>Around $25$ points for Subtask 2.</li>
</ul>