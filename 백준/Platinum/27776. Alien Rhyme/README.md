# [Platinum IV] Alien Rhyme - 27776

[문제 링크](https://www.acmicpc.net/problem/27776)

### 성능 요약

시간 제한: 20 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 23, 정답: 18, 맞힌 사람: 10, 정답 비율: 90.909%

### 분류

자료 구조, 그리디 알고리즘, 문자열, 트리, 트라이

### 문제 설명

<p>During some extraterrestrial exploration, you found evidence of alien poetry! Your team of linguists has determined that each word in the alien language has an accent on exactly one position (letter) in the word; the part of the word starting from the accented letter is called the accent-suffix. Two words are said to rhyme if both of their accent-suffixes are equal. For example, the words <code>PROL</code> and <code>TARPOL</code> rhyme if the accented letter in both is the <code>O</code> or the <code>L</code>, but they do not rhyme if the accented letters are the <code>R</code>s, or the <code>R</code> in <code>PROL</code> and the <code>P</code> in <code>TARPOL</code>, or the <code>O</code> in <code>PROL</code> and the <code>L</code> in <code>TARPOL</code>.</p>

<p>You have recovered a list of <b>N</b> words that may be part of an alien poem. Unfortunately, you do not know which is the accented letter for each word. You believe that you can discard zero or more of these words, assign accented letters to the remaining words, and then arrange those words into pairs such that each word rhymes only with the other word in its pair, and with none of the words in other pairs.</p>

<p>You want to know the largest number of words that can be arranged into pairs in this way.</p>

### 입력

<p>The first line of the input gives the number of test cases, <b>T</b>. <b>T</b> test cases follow. Each test case starts with a line with a single integer <b>N</b>. Then, <b>N</b> lines follow, each of which contains a string <b>W<sub>i</sub></b> of uppercase English letters, representing a distinct word. Notice that the same word can have different accentuations in different test cases.</p>

### 출력

<p>For each test case, output one line containing <code>Case #x: y</code>, where <code>x</code> is the test case number (starting from 1) and <code>y</code> is the size of the largest subset of words meeting the criteria described above.</p>

### 제한

<ul>
	<li>1 &le; <b>T</b> &le; 100.</li>
	<li>1 &le; length of <b>W<sub>i</sub></b> &le; 50, for all i.</li>
	<li><b>W<sub>i</sub></b> consists of uppercase English letters, for all i.</li>
	<li><b>W<sub>i</sub></b> &ne; <b>W<sub>j</sub></b>, for all i &ne; j. (Words are not repeated within a test case.)</li>
</ul>

### 힌트

<p>In Sample Case #1, the two words can rhyme with an appropriate accent assignment, as described above, so the largest subset is the entire input.</p>

<p>In Sample Case #2, no two words can rhyme regardless of how we assign accents, because any two suffixes will differ at least in the last letter. Therefore, the largest subset is the empty one, of size 0.</p>

<p>In Sample Case #3, we can use the entire set of words if we accentuate <code>CODEJAM</code> and <code>JAM</code> at the <code>J</code>s, <code>HAM</code> and <code>NALAM</code> at their last <code>A</code>s and <code>HUM</code> and <code>NOLOM</code> at the <code>M</code>s.</p>

<p>In Sample Case #4, any two words can be made to rhyme, but always by making the accented letter the <code>I</code>. Therefore, if we add two pairs to the subset, words from different pairs will rhyme. We can, thus, only form a subset of size 2, by choosing any 2 of the input words.</p>