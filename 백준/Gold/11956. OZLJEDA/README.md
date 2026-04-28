# [Gold I] OZLJEDA - 11956

[문제 링크](https://www.acmicpc.net/problem/11956)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 64 MB

### 통계

제출: 192, 정답: 83, 맞힌 사람: 68, 정답 비율: 39.306%

### 분류

누적 합

### 문제 설명

<p>Due to the frantical usage of the racket to kill flies, Marin has sustained a serious bodily injury known to the medical community as <em>epicondylitis lateralis humeri</em>. His grandma has advised smearing rakija over it, the doctor has prescribed a strong painkiller, but Marin has ignored every single advice and decided to look for the answer in integer sequences.</p>

<p>He has discovered a previously undiscovered sequence of integers and called it the <em>xorbonacci</em> sequence. The nth element in the sequence is denoted with x<sub>n</sub>. The sequence is defined recursively in the following way:</p>

<ul>
	<li>x<sub>1</sub> = a<sub>1</sub>,</li>
	<li>x<sub>2</sub> = a<sub>2</sub>,</li>
	<li>...</li>
	<li>x<sub>k</sub> = a<sub>k</sub>,</li>
	<li>x<sub>n</sub> = x<sub>n&minus;1</sub> &oplus; x<sub>n&minus;2</sub> &oplus; ... &oplus; x<sub>n&minus;k</sub>, n &gt; k</li>
</ul>

<p>Because of a reason only known to Marin, he determined that all his sorrows will go away if you answer his Q queries defined with numbers l and r. The answer to the query is represented with the value</p>

<ul>
	<li>x<sub>l</sub> &oplus; x<sub>l+1</sub> &oplus; ... &oplus; x<sub>r&minus;1</sub> &oplus; x<sub>r</sub></li>
</ul>

<p>Help Marin and answer his queries.</p>

<p>Please note: The operation &oplus; is the operation of binary XOR.</p>

### 입력

<p>The first line of input contains the integer K (1 &le; K &le; 100 000) from the task.</p>

<p>The following line contains K integers that represent the first K elements in the xorbonacci sequence.</p>

<p>All numbers are smaller than 10<sup>18</sup>.</p>

<p>The following line contains the integer Q (1 &le; Q &le; 10<sup>6</sup>) from the task.</p>

<p>The ith of the following Q lines contains two integers l<sub>i</sub> and r<sub>i</sub> (1 &le; l<sub>i</sub> &le; r<sub>i</sub> &le; 10<sup>18</sup>) that represent Marin&rsquo;s ith query.</p>

### 출력

<p>Each of the following Q lines of output must contain the answers to Marin&rsquo;s queries, the order being the same as the input.</p>