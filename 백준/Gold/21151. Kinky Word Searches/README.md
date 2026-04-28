# [Gold III] Kinky Word Searches - 21151

[문제 링크](https://www.acmicpc.net/problem/21151)

### 성능 요약

시간 제한: 6 초, 메모리 제한: 1024 MB

### 통계

제출: 60, 정답: 16, 맞힌 사람: 16, 정답 비율: 40.000%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>You&#39;re probably familiar with regular word searches, where you&#39;re presented with a grid of letters and a word to find. &nbsp;The word can be in a straight line horizontally, vertically, or diagonally (and perhaps backwards in any of those directions). &nbsp;For example, here is a grid of letters:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/21151.%E2%80%85Kinky%E2%80%85Word%E2%80%85Searches/ce27ac54.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/21151.%E2%80%85Kinky%E2%80%85Word%E2%80%85Searches/ce27ac54.png" data-original-src="https://upload.acmicpc.net/6a5bad95-62ba-4212-860b-a82547e38075/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 170px; height: 172px;" /></p>

<p style="text-align: center;">Figure 1:&nbsp;A word search grid</p>

<p>The word &quot;JAVA&quot; can be found going from the bottom right corner diagonally upwards.</p>

<p>In a <em>kinky word search</em> the path that spells out the word can have one or more &quot;kinks&quot; -- places where the path changes direction. &nbsp;For example, in the given grid you can spell the word &quot;PYTHON&quot; with $3$ kinks (one each at the T, H and &nbsp;O):</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/21151.%E2%80%85Kinky%E2%80%85Word%E2%80%85Searches/986a7249.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/21151.%E2%80%85Kinky%E2%80%85Word%E2%80%85Searches/986a7249.png" data-original-src="https://upload.acmicpc.net/d515c216-df97-4974-bb52-0bcbbf76a8a9/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 170px; height: 172px;" /></p>

<p style="text-align: center;">Figure 2:&nbsp;A kinky spelling of &quot;PYTHON&quot;</p>

<p>Adding kinks allows letters to be reused -- the word &quot;CPLUSPLUS&quot; can be found in the upper right corner of the grid (with $5$ kinks). &nbsp;However you cannot stay on a letter twice in a row, so you cannot spell the word &quot;HASKELL&quot; in this grid (though you can find at least $11$ more common programming languages). Your task is to see if the spelling of a word with a certain number of kinks is possible or not.</p>

### 입력

<p>Input begins with a line containing two positive integers $r$ and $c$ ($r, c \leq 10)$, the number of rows and columns in the grid. &nbsp;After this are $r$ rows of $c$ uppercase characters. &nbsp;Letters are separated by a space. After the grid are two lines: The first line is an integer $k$, the number of kinks. &nbsp;The second line contains an uppercase word to look for, with maximum length $100$.</p>

### 출력

<p>Output either the word <code>YES</code>&nbsp;if it is possible to spell the given word with exactly $k$ kinks on the grid provided, or <code>NO</code>&nbsp;if it is not.</p>