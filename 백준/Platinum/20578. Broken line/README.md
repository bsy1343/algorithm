# [Platinum IV] Broken line - 20578

[문제 링크](https://www.acmicpc.net/problem/20578)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 40, 정답: 29, 맞힌 사람: 22, 정답 비율: 73.333%

### 분류

브루트포스 알고리즘, 애드 혹, 비트마스킹

### 문제 설명

<p>Basia has a string $s$, each character being one of the first 16 lowercase letters of the English alphabet.</p>

<p>Each character of this string will be replaced by an arrow to the right or up, but the same letters have to be replaced by the same arrow. For example, the string &quot;banan&quot; can be replaced to $\uparrow \uparrow \rightarrow \uparrow \rightarrow$ or $\uparrow \uparrow \uparrow \uparrow \uparrow$, but you cannot obtain $\rightarrow \rightarrow \rightarrow \uparrow \rightarrow$ because it would require replacing two letters &#39;a&#39; with different arrows.</p>

<p>Basia will use the resulting sequence of arrows to draw a broken line. She will start with a pencil set at point $(0, 0)$, then $n$ times she will move it $1$ unit right or up -- in the direction of the next arrow.</p>

<p>As a <em>result</em> of this drawing we will denote the area between the broken line and the OX axis. Formally, this area is a set of points $(x, y)$ such that $y \geq 0$ and there is a point $(x, y&#39;)$ that belongs to the broken line and $y&#39; \geq y$ occurs.</p>

<p>What is the largest possible result of Basia&#39;s drawing?</p>

### 입력

<p>The first and the only line of the standard input contains one string $s$ ($1 \leq |s| \leq 300\,000$), consisting of lowercase letters of the English alphabet &#39;a&#39;-&#39;p&#39; (16 possible characters).</p>

### 출력

<p>Output one integer -- the largest possible result of the drawing obtained after conversion from letters to arrows using given rules.</p>

### 힌트

<p>String &quot;banan&quot; should be replaced with $\uparrow \uparrow \rightarrow \uparrow \rightarrow$. The area under the broken line is then $5$:</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/1971f292-8c10-4113-bfd2-0496531dbe33/-/preview/" style="width: 130px; height: 113px;" /></p>

<p>For string &quot;abcdefghijklmnopaaaa&quot; there are two optimal solutions with the area 90:</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/2e8d554b-4670-4863-9144-a5dce58e37ab/-/preview/" style="width: 320px; height: 127px;" /></p>