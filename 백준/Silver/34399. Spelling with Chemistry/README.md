# [Silver II] Spelling with Chemistry - 34399

[문제 링크](https://www.acmicpc.net/problem/34399)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 18, 정답: 14, 맞힌 사람: 14, 정답 비율: 77.778%

### 분류

다이나믹 프로그래밍, 문자열

### 문제 설명

<p>Each element on the periodic table has a one or two letter symbol. These symbols can be combined to spell words, and many times there are multiple ways of spelling a word using different combinations of symbols. Can you determine how many different ways a word can be spelled using the symbols?</p>

<p>For example, the word "bacon" can be spelled $3$ different ways:</p>

<ol>
	<li>Barium, Cobalt, Nitrogen: BaCoN</li>
	<li>Boron, Actinium, Oxygen, Nitrogen: BAcON</li>
	<li>Barium, Carbon, Oxygen, Nitrogen: BaCON</li>
</ol>

<p>However, your friend from another universe wants to spell words with the elements found there, which are different than the elements in our universe. So, your input will include the set of symbols in the periodic table for that particular universe. In this other universe, they don't follow the same naming convention that we do, so the provided symbols could be up to $5$ letters in length.</p>

### 입력

<p>The first line of input will contain an integer $N$ ($1 \leq N \leq 200$), the number of symbols in that universe.</p>

<p>The next $N$ lines will contain a single unique symbol, each between $1$ and $5$ letters in length.</p>

<p>The next line of input will contain an integer $M$ ($1 \leq M \leq 20$), the number of words for which you should determine how many ways they can be spelled.</p>

<p>The next $M$ lines each contain a single word, each between $1$ and $40$ letters in length, containing only lowercase letters.</p>

### 출력

<p>Output a total of $M$ lines, each line indicating the number of ways that the corresponding input word can be spelled using the symbols in the periodic table for that universe. If a word is impossible to spell, output a $0$ on that line.</p>