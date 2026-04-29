# [Gold II] Palindromic Crossword - 23017

[문제 링크](https://www.acmicpc.net/problem/23017)

### 성능 요약

시간 제한: 60 초 (추가 시간 없음), 메모리 제한: 1024 MB (추가 메모리 없음)

### 통계

제출: 45, 정답: 37, 맞힌 사람: 33, 정답 비율: 80.488%

### 분류

그래프 이론, 그래프 탐색, 구현

### 문제 설명

<p>A&nbsp;<a href="https://en.wikipedia.org/wiki/Crossword" target="_blank">crossword puzzle</a>&nbsp;is a rectangular grid of black cells and letters&nbsp;<code>A-Z</code>&nbsp;like the one shown below.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/23017.%E2%80%85Palindromic%E2%80%85Crossword/c2135f1d.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/23017.%E2%80%85Palindromic%E2%80%85Crossword/c2135f1d.png" data-original-src="https://upload.acmicpc.net/de3271dd-981c-432a-8774-02b1b91289ab/-/crop/242x177/0,94/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/23017.%E2%80%85Palindromic%E2%80%85Crossword/7ab99828.png" data-original-src="https://boja.mercury.kr/assets/problem/23017-2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>Words in the crossword are defined as maximal vertical or horizontal segments of characters. In the crossword below, DO and ON are examples of words.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/23017.%E2%80%85Palindromic%E2%80%85Crossword/a6df2aaf.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/23017.%E2%80%85Palindromic%E2%80%85Crossword/a6df2aaf.png" data-original-src="https://upload.acmicpc.net/b32ac8dc-68a8-4d4d-8074-2f565557197d/-/crop/252x174/22,47/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>A palindromic crossword is one where every word is a <a href="https://en.wikipedia.org/wiki/Palindrome">palindrome</a>. Let R<sub>i,j</sub> represent the character on the i-th row and j-th column, where i and j are 1-indexed. The top left corner is R<sub>1,1</sub>. In the example palindromic crossword below, the <code>B</code> in R<sub>3,2</sub> is part of both the horizontal word starting at R<sub>3,1</sub> and the vertical word ending at R<sub>4,2</sub>, and both are palindromes.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/23017.%E2%80%85Palindromic%E2%80%85Crossword/f52b8978.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/23017.%E2%80%85Palindromic%E2%80%85Crossword/f52b8978.png" data-original-src="https://upload.acmicpc.net/0d245359-2698-4839-9b2a-bbaede92d379/-/crop/242x170/0,17/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>You have been gifted a palindromic crossword puzzle with N rows and M columns. You finished the crossword and throw away the clues, preparing to hang it on your wall. However, you accidentally erase some of the letters! You want to recover as much of the crossword as possible, but you do not have the clues anymore. Using only the knowledge that the crossword is palindromic, restore the maximum possible number of missing characters in the given crossword.</p>

<p>Missing letters are represented as empty white cells in the below diagram. The crossword on the left is the crossword you are given and the crossword on the right is the result after you recover as many letters as possible. The remaining cells cannot be filled because we do not have sufficient information to recover them.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/23017.%E2%80%85Palindromic%E2%80%85Crossword/0a39f11a.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/23017.%E2%80%85Palindromic%E2%80%85Crossword/0a39f11a.png" data-original-src="https://upload.acmicpc.net/74174f5a-ccdd-4646-93bd-684324d35394/-/crop/562x172/0,96/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

### 입력

<p>The first line of the input gives the number of test cases, T. T test cases follow.</p>

<p>The first line of each test case contains two integers, N and M, representing the number of rows and columns in the crossword, respectively.</p>

<p>The next N lines represent the N rows of the grid. The i-th row consists of M characters representing R<sub>i,1</sub>, R<sub>i,2</sub>, &hellip;, R<sub>i,M</sub>. Each character is one of the following:</p>

<ul>
	<li>A capital letter of the alphabet (<code>A-Z</code>)</li>
	<li>A period (<code>.</code>) for a missing letter (empty white cell in the example crossword)</li>
	<li>A hash (<code>#</code>) for black cell</li>
</ul>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x:&nbsp;y</code>&nbsp;where&nbsp;x&nbsp;is the test case number (starting from&nbsp;1) and y&nbsp;is the number of empty white cells that were filled. Then, output&nbsp;N&nbsp;more lines representing the final grid, with the missing characters (<code>.</code>) replaced by capital letters (<code>A-Z</code>) where possible.</p>

### 제한

<ul>
	<li>1 &le; T &le; 100.</li>
	<li>There exists at least one way to fill in the given input grid such that it is a palindromic crossword.</li>
	<li>All characters in the grid are in the set&nbsp;{<code>A-Z</code>,&nbsp;<code>#</code>,&nbsp;<code>.</code>}</li>
</ul>

### 힌트

<p>In Sample Case #2, we are able to fill in&nbsp;8&nbsp;of the blanks. We can fill in the missing letters as follows:</p>

<ul>
	<li>row&nbsp;1, column&nbsp;4: We know this is&nbsp;<code>A</code>&nbsp;from character at row&nbsp;1, column&nbsp;1.</li>
	<li>row&nbsp;2, column&nbsp;4=<code>A</code>&nbsp;from row&nbsp;1, column&nbsp;4.</li>
	<li>row&nbsp;2, column&nbsp;6=<code>A</code>&nbsp;from row&nbsp;2, column&nbsp;4.</li>
	<li>row&nbsp;3, column&nbsp;6=<code>A</code>&nbsp;from row&nbsp;2, column&nbsp;6.</li>
	<li>row&nbsp;3, column&nbsp;2=<code>B</code>&nbsp;from row&nbsp;3, column&nbsp;1.</li>
	<li>row&nbsp;4, column&nbsp;2=<code>B</code>&nbsp;from row&nbsp;3, column&nbsp;2.</li>
	<li>row&nbsp;4, column&nbsp;3=<code>B</code>&nbsp;from row&nbsp;4, column&nbsp;2.</li>
	<li>row&nbsp;4, column&nbsp;4=<code>A</code>&nbsp;from row&nbsp;4, column&nbsp;11.</li>
</ul>