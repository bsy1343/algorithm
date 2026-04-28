# [Gold V] The Game of Efil - 4076

[문제 링크](https://www.acmicpc.net/problem/4076)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 48, 정답: 20, 맞힌 사람: 19, 정답 비율: 43.182%

### 분류

브루트포스 알고리즘, 구현

### 문제 설명

<p>Almost anyone who has ever taken a class in computer science is familiar with the &ldquo;Game of Life,&rdquo; John Conway&rsquo;s cellular automata with extremely simple rules of birth, survival, and death that can give rise to astonishing complexity.</p>

<p>The game is played on a rectangular field of cells, each of which has eight neighbors (adjacent cells). A cell is either occupied or not. The rules for deriving a generation from the previous one are:</p>

<ul>
	<li>If an occupied cell has 0, 1, 4, 5, 6, 7, or 8 occupied neighbors, the organism dies (0, 1: of loneliness; 4 thru 8: of overcrowding).</li>
	<li>If an occupied cell has two or three occupied neighbors, the organism survives to the next generation.</li>
	<li>If an unoccupied cell has three occupied neighbors, it becomes occupied (a birth occurs).</li>
</ul>

<p>One of the major problems researchers have looked at over the years is the existence of so-called &ldquo;Garden of Eden&rdquo; configurations in the Game of Life &mdash; configurations that could not have arisen as the result of the application of the rules to some previous configuration. We&rsquo;re going to extend this question, which we&rsquo;ll call the &ldquo;Game of Efil&rdquo;: Given a starting configuration, how many possible parent configurations could it have? To make matters easier, we assume a finite grid in which edge and corner cells &ldquo;wrap around&rdquo; (i.e., a toroidal surface). For instance, the 2 by 3 configuration:</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/4076.%E2%80%85The%E2%80%85Game%E2%80%85of%E2%80%85Efil/56ecaeb2.png" data-original-src="https://www.acmicpc.net/upload/images2/ef1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:110px; width:158px" /></p>

<p>has exactly three possible parent configurations; they are:</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/4076.%E2%80%85The%E2%80%85Game%E2%80%85of%E2%80%85Efil/086e2afb.png" data-original-src="https://www.acmicpc.net/upload/images2/ef2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:114px; width:547px" /></p>

<p>You should note that when counting neighbors of a cell, another cell may be counted as a neighbor more than once, if it touches the given cell on more than one side due to the wrap around. This is the case for the configurations above.&nbsp;</p>

### 입력

<p>There will be multiple test cases. Each case will start with a line containing a pair of positive integers m and n, indicating the number of rows and columns of the configuration, respectively. The next line will contain a nonnegative integer k indicating the number of &ldquo;live&rdquo; cells in the configuration. The following k lines each contain the row and column number of one live cell, where row and column numbering both start at zero. The final test case is followed by a line where m = n = 0 &mdash; this line should not be processed. You may assume that the product of m and n is no more than 16.</p>

### 출력

<p>For each test case you should print one line of output containing the case number and the number of possible ancestors. Imitate the sample output below. Note that if there are 0 ancestors, you should print out</p>

<pre>
Garden of Eden.</pre>