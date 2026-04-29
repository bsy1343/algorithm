# [Bronze II] Alliteration - 34436

[문제 링크](https://www.acmicpc.net/problem/34436)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 99, 정답: 64, 맞힌 사람: 54, 정답 비율: 63.529%

### 분류

구현, 문자열

### 문제 설명

<p>Many magnificent minstrels have made massive manuscripts made with multitudes of matching marks. Indeed, introverted intellectuals not infrequently instigate these intriguing itineraries intending to invigorate their insatiable intellects. Nevertheless... you get the idea. For each line of text in the input, output the letter that starts the most words in the line. In case there's a tie, output the first letter alphabetically in the tie. Words in the text are always separated by spaces or new lines; a hyphenated word only counts as one word, not two.</p>

### 입력

<p> The first line contains a single integer $n$, the number of lines of text that follow.</p>

<p>The next $n$ lines of input are all lines of text, up to $10^6$ characters long. The text consists of only lowercase letters, spaces, and punctuation.</p>

### 출력

<p>The output should be $n$ lines long; each line of output should only contain the letter that starts the most words in the corresponding line of input.</p>

### 제한

<ul>
	<li>$0 &lt; n \leq 100$</li>
</ul>