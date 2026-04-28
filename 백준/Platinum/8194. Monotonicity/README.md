# [Platinum II] Monotonicity - 8194

[문제 링크](https://www.acmicpc.net/problem/8194)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 21, 정답: 8, 맞힌 사람: 8, 정답 비율: 38.095%

### 분류

(분류 없음)

### 문제 설명

<p>For an integer sequence a<sub>1</sub>,a<sub>2</sub>,&hellip;,a<sub>n</sub> we define its monotonicity scheme as the sequence s<sub>1</sub>,s<sub>2</sub>,&hellip;,s<sub>n-1</sub> of symbols &lt;, &gt; or =. The symbol s<sub>i</sub> represents the relation between a<sub>i</sub> and a<sub>i+1</sub>. For example, the monotonicity scheme of the sequence 2,4,3,3,5,3 is &lt;, &gt;, =, &lt;, &gt;.</p>

<p>We say that an integer sequence b<sub>1</sub>,b<sub>2</sub>,&hellip;,b<sub>n+1</sub>&nbsp;with monotonicity scheme s<sub>1</sub>,s<sub>2</sub>,&hellip;,s<sub>n</sub>, realizes another monotonicity scheme s&rsquo;<sub>1</sub>,s&rsquo;<sub>2</sub>,&hellip;,s&rsquo;<sub>k</sub> if for every i=1,2,&hellip;,n it holds that s<sub>i</sub>=s&#39;<sub>((i-1) mod k) + 1</sub>. In other words, the sequence s<sub>1</sub>,s<sub>2</sub>,&hellip;,s<sub>n</sub> can be obtained by repeating the sequence &nbsp;s&rsquo;<sub>1</sub>,s&rsquo;<sub>2</sub>,&hellip;,s&rsquo;<sub>k</sub> and removing appropriate suffix from that repetition. For example, the sequence 2,4,3,3,5,3 realizes each and every one of the following schemes:</p>

<ul>
	<li>&lt;,&gt;,=</li>
	<li>&lt;,&gt;,=,&lt;,&gt;</li>
	<li>&lt;,&gt;,=,&lt;,&gt;,&lt;,&lt;,=</li>
	<li>&lt;,&gt;,=,&lt;,&gt;,=,&gt;,&gt;</li>
</ul>

<p>as well as many others.</p>

<p>An integer sequence a<sub>1</sub>,a<sub>2</sub>,&hellip;,a<sub>n</sub> and a monotonicity scheme s<sub>1</sub>,s<sub>2</sub>,&hellip;,s<sub>k</sub> are given. Your task is to find the longest subsequence a<sub>i<sub>1</sub></sub>,a<sub>i<sub>2</sub></sub>,&hellip;,a<sub>i<sub>m</sub></sub> (1 &le; i<sub>1</sub> &lt; i<sub>2</sub> &lt; &hellip; &lt; i<sub>m</sub> &le; n) of the former that realizes the latter.</p>

### 입력

<p>The first line of the standard input holds two integers n and k (1 &le; n &le; 20,000, 1 &le; k &le; 100), separated by a single space, denoting the lengths of the sequences (a<sub>i</sub>) and monotonicity scheme (s<sub>j</sub>) respectively.</p>

<p>The second input line gives the sequence (a<sub>i</sub>), i.e, it holds n integers ai separated by single spaces (1 &le; a<sub>i</sub> &le; 1,000,000).</p>

<p>Finally, the third lines gives the monotonicity scheme (s<sub>j</sub>), i.e., it holds k symbols sj of the form &lt;, &gt; or = separated by single spaces.</p>

### 출력

<p>In the first line of the standard output your program should print out a single integer m, the maximum length of a subsequence of a<sub>1</sub>,a<sub>2</sub>,&hellip;,a<sub>n</sub> that realizes the scheme s<sub>1</sub>,s<sub>2</sub>,&hellip;,s<sub>k</sub>.</p>

<p>In the second line it should print out any such subsequence a<sub>i<sub>1</sub></sub>,a<sub>i<sub>2</sub></sub>,&hellip;,a<sub>i<sub>m</sub></sub>, separating its elements by single spaces.</p>