# [Silver III] Crossword Puzzle Clue Numbering - 9232

[문제 링크](https://www.acmicpc.net/problem/9232)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 117, 정답: 17, 맞힌 사람: 17, 정답 비율: 16.190%

### 분류

구현

### 문제 설명

<p>Professor Logophile is the local crossword puzzle setter. He has a very idiosyncratic way of working &mdash; he writes the words into a blank grid and then fills in the unused squares. That is the easy bit, but he has trouble doing the next bit &mdash; numbering the puzzle and preparing the the clues.&nbsp;</p>

<p>This is where you come in. Given a completed crossword, print out a form on which the clues can be written (showing word lengths). Note that he always prepares a true crossword, i.e. there is always at least one word in each direction and there is always at least one shared letter. All words contain three or more letters.</p>

### 입력

<p>Input will be a series of crosswords. The first line of each crossword will be a pair of integers (r and c, 3 &le; r c &le; 20) giving the number of rows and columns of the crossword. This will be followed r rows each containing c characters. Each character will be either an uppercase letter or a &lsquo;@&rsquo; representing a black square. The file will be terminated by a pair of zeroes (0 0).</p>

### 출력

<p>For each crossword, the output will start with a line containing &ldquo;Crossword puzzle &lt;cwnum&gt;&rdquo; where &lt;cwnum&gt; is a running number starting at 1, followed by a form showing the clue number and length for both across and down clues. Each form begins with the word &lsquo;Across&rsquo; or &lsquo;Down&rsquo; as appropriate, followed by a line for each across or down word that appears in the crossword. Each line begins with the word number with no preceding spaces followed by a full stop, two spaces, an open parenthesis (&lsquo;(&lsquo;), the length of the word with no preceding spaces and a closing parenthesis (&lsquo;)&rsquo;). Leave one blank line between the &lsquo;Across&rsquo; and &lsquo;Down&rsquo; parts and between successive crosswords.</p>