# [Platinum II] Intrepid cave explorer - 27687

[문제 링크](https://www.acmicpc.net/problem/27687)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 4, 정답: 2, 맞힌 사람: 2, 정답 비율: 50.000%

### 분류

다이나믹 프로그래밍, 자료 구조, 그리디 알고리즘, 트리, 트리에서의 다이나믹 프로그래밍, 우선순위 큐

### 문제 설명

<p>Maru likes to visit new places, but with her poor sense of direction she always struggles to find her way home. This summer, she&rsquo;s planning to explore an amazing lava cave. Your task is to help her mark the chambers in the cave so that she won&rsquo;t get lost.</p>

<p>The cave consists of <em>n</em> chambers numbered 1 through <em>n</em>. There are <em>n</em> &minus; 1 passages, each connecting a pair of chambers in such a way that the entire cave is connected. (Hence, the topology of the cave is a tree.) Chamber 1 contains the entrance to the cave.</p>

<p>Chamber <em>u</em> is an <em>ancestor</em> of chamber <em>v</em> if <em>u</em> lies on the path from <em>v</em> to the entrance. (In particular, each chamber is its own ancestor, and chamber 1 is an ancestor of every chamber.) For any chamber <em>v</em> &ne; 1, the ancestor of <em>v</em> that is directly adjacent to <em>v</em> is denoted <em>p</em><sub><em>v</em></sub> and called the parent of <em>v</em>. Chamber numbers are chosen in such a way that for all <em>v</em> &ne; 1, <em>p</em><sub><em>v</em></sub> &lt; <em>v</em>.</p>

<p>Maru has two pieces of chalk: a white one and a pink one. She wants to mark each chamber in the cave with some (possibly empty) string of white and pink dots. These strings must satisfy the following requirements:</p>

<ul>
	<li>If chamber <em>u</em> is an ancestor of chamber <em>v</em>, the string in <em>u</em> must be a prefix of the string in <em>v</em>.</li>
	<li>If chamber <em>u</em> <strong>is not</strong> an ancestor of chamber <em>v</em> and <em>v</em> <strong>is not</strong> an ancestor of <em>u</em>, the string in <em>u</em> <strong>must not</strong> be a prefix of the string in <em>v</em>.</li>
</ul>

<p>(The empty string is a prefix of any string. Each string is its own prefix. Note that we do not require the strings assigned to chambers to be pairwise distinct.)</p>

<p>Find a valid assignment of strings to chambers that minimizes the total number of chalk dots.</p>

### 입력

<p>The first line of the input file contains an integer <em>t</em> specifying the number of test cases. Each test case is preceded by a blank line.</p>

<p>Each test case describes a tree. In the first line there is an integer <em>n</em> &ndash; the number of chambers. The second line contains <em>n</em> &minus; 1 integers <em>p</em><sub>2</sub>, <em>p</em><sub>3</sub>, &hellip;, <em>p</em><sub><em>n</em></sub> where <em>p</em><sub><em>i</em></sub> is the parent of chamber <em>i</em> (1 &le; <em>p</em><sub><em>i</em></sub> &lt; <em>i</em>).</p>

### 출력

<p>For each test case, output one line with one integer &ndash; the smallest possible number of dots Maru has to draw in the cave in order to properly mark all chambers.</p>

### 힌트

<p>Using <code>W</code> and <code>P</code> to denote white and pink dots, respectively, one optimal labeling looks as follows: 1 &rarr; &ldquo;&rdquo; (i.e., an empty string), 2 &rarr;  &ldquo;<code>W</code>&rdquo;, 3 &rarr;  &ldquo;<code>P</code>&rdquo;, 4 &rarr;  &ldquo;<code>PW</code>&rdquo;, 5 &rarr;  &ldquo;<code>PP</code>&rdquo;.</p>