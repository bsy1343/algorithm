# [Gold IV] Digits Are Not Just Characters - 16739

[문제 링크](https://www.acmicpc.net/problem/16739)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 152, 정답: 102, 맞힌 사람: 95, 정답 비율: 68.841%

### 분류

구현, 문자열, 정렬, 파싱

### 문제 설명

<p>Mr. Manuel Majorana Minore made a number of files with numbers in their names. He wants to have a list of the files, but the file listing command commonly used lists them in an order different from what he prefers, interpreting digit sequences in them as ASCII code sequences, not as numbers. For example, the files <code>file10</code>, <code>file20</code> and <code>file3</code> are listed in this order.</p>

<p>Write a program which decides the orders of file names interpreting digit sequences as numeric values.</p>

<p>Each file name consists of uppercase letters (from &lsquo;<code>A</code>&rsquo; to &lsquo;<code>Z</code>&rsquo;), lowercase letters (from &lsquo;<code>a</code>&rsquo; to &lsquo;<code>z</code>&rsquo;), and digits (from &lsquo;<code>0</code>&rsquo; to &lsquo;<code>9</code>&rsquo;).</p>

<p>A file name is looked upon as a sequence of items, each being either a letter or a number. Each single uppercase or lowercase letter forms a letter item. Each consecutive sequence of digits forms a number item.</p>

<p>Two item are ordered as follows.</p>

<ul>
	<li>Number items come before letter items.</li>
	<li>Two letter items are ordered by their ASCII codes.</li>
	<li>Two number items are ordered by their values when interpreted as decimal numbers.</li>
</ul>

<p>Two file names are compared item by item, starting from the top, and the order of the first different corresponding items decides the order of the file names. If one of them, say A, has more items than the other, B, and all the items of B are the same as the corresponding items of A, B should come before.</p>

<p>For example, three file names in Sample Input 1, <code>file10</code>, <code>file20</code>, and <code>file3</code> all start with the same sequence of four letter items <code>f</code>, <code>i</code>, <code>l</code>, and <code>e</code>, followed by a number item, 10, 20, and 3, respectively. Comparing numeric values of these number items, they are ordered as <code>file3</code> &lt; <code>file10</code> &lt; <code>file20</code>.</p>

### 입력

<p>The input consists of a single test case of the following format.</p>

<pre>
n
s<sub>0</sub>
s<sub>1</sub>
.
.
.
s<sub>n</sub></pre>

<p>The integer n in the first line gives the number of file names (s<sub>1</sub> through s<sub>n</sub>) to be compared with the file name given in the next line (s<sub>0</sub>). Here, n satisfies 1 &le; n &le; 1000.</p>

<p>The following n + 1 lines are file names, s<sub>0</sub> through s<sub>n</sub>, one in each line. They have at least one and no more than nine characters. Each of the characters is either an uppercase letter, a lowercase letter, or a digit.</p>

<p>Sequences of digits in the file names never start with a digit zero (0).</p>

### 출력

<p>For each of the file names, s<sub>1</sub> through s<sub>n</sub>, output one line with a character indicating whether it should come before s<sub>0</sub> or not. The character should be &ldquo;-&rdquo; if it is to be listed before s<sub>0</sub>; otherwise, it should be &ldquo;+&rdquo;, including cases where two names are identical.</p>