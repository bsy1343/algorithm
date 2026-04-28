# [Silver IV] Poetry - 6906

[문제 링크](https://www.acmicpc.net/problem/6906)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 79, 정답: 37, 맞힌 사람: 32, 정답 비율: 43.836%

### 분류

구현, 문자열

### 문제 설명

<p>A simple poem consists of one or more four-line verses. Each line consists of one or more words consisting of upper or lowercase letters, or a combination of both upper and lowercase letters. Adjacent words on a line are separated by a single space.</p>

<p>We define the last syllable of a word to be the sequence of letters from the last vowel (<code>a</code>, <code>e</code>, <code>i</code>, <code>o</code>, or <code>u</code>, but not <code>y</code>) to the end of the word. If a word has no vowel, then the last syllable is the word itself. We say that two lines rhyme if their last syllables are the same, ignoring case.</p>

<p>You are to classify the form of rhyme in each verse. The form of rhyme can be <em>perfect, even, cross, shell</em>, or <em>free</em>:</p>

<ul>
	<li>perfect rhyme: the four lines in the verse all rhyme</li>
	<li>even rhyme: the first two lines rhyme and the last two lines rhyme</li>
	<li>cross rhyme: the first and third lines rhyme, as do the second and fourth</li>
	<li>shell rhyme: the first and fourth lines rhyme, as do the second and third</li>
	<li>free rhyme: any form that is not perfect, even, cross, or shell.</li>
</ul>

<p>The first line of the input file contains an integer $N$, the number of verses in the poem, $1 \le N \le 5$. The following $4N$ lines of the input file contain the lines of the poem. Each line contains at most $80$ letters of the alphabet and spaces as described above.</p>

<p>The output should have $N$ lines. For each verse of the poem there should be a single line containing one of the words <code>perfect</code>, <code>even</code>, <code>cross</code>, <code>shell</code>, or <code>free</code> describing the form of rhyme in that verse.</p>

### 입력



### 출력

