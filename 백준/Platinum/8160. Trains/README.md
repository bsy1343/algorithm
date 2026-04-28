# [Platinum III] Trains - 8160

[문제 링크](https://www.acmicpc.net/problem/8160)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 23, 정답: 12, 맞힌 사람: 11, 정답 비율: 61.111%

### 분류

자료 구조, 해싱, 해시를 사용한 집합과 맵, 문자열, 트리를 사용한 집합과 맵, 집합과 맵

### 문제 설명

<p>The Trains of Colour Parade begins tomorrow in Byteotia. Intense preparations are already in progress at the station&#39;s auxiliary tracks. There are n parallel tracks at the station, numbered from 1 to n. The train no. i occupies the i<sup>th</sup> track. Every train consists of l cars and each car is painted with one of 26 colours (denoted by non-capital letters of the English alphabet). We say that two trains look the same, if their corresponding cars are painted the same colour.</p>

<p>Throughout the parade a crane will switch places of certain pairs of cars. The real parade, however, will take place tomorrow. Today the train dispatcher, Byteasar, watched the general rehearsal closely. He even wrote down the sequence of car swaps.</p>

<p>Byteasar particularly dislikes many trains looking the same. For each train p he would like to calculate the maximum number of trains that at some moment look the same as the train p at the very same moment.</p>

<p>
Write a programme that:</p>

<ul>
	<li>reads descriptions of the trains occupying tracks and the sequence of car swaps,</li>
	<li>for each train determines the maximum number of trains that look the same as it at certain moment,</li>
	<li>writes out the result.</li>
</ul>

### 입력

<p>The first line of the input contains three integers n, l and m (2 &le; n &le; 1,000, 1 &le; l &le; 100, 0 &le; m &le; 100,000), denoting respectively the number of trains, their common length and the number of car swaps. The following n lines contain descriptions of the trains on successive tracks. The k<sup>th</sup> line consists of l small letters of the English alphabet denoting the colours of successive cars of the k<sup>th</sup> train. Then m lines describing the car swaps follow, in the order of the swaps. The r<sup>th</sup> line contains four integers p<sub>1</sub>, w<sub>1</sub>, p<sub>2</sub>, w<sub>2</sub> (1 &le; p<sub>1</sub>,p<sub>2</sub> &le; n, 1 &le; w<sub>1</sub>,w<sub>2</sub> &le; l, p<sub>1</sub>&ne;p<sub>2</sub> or w<sub>1</sub>&ne;w<sub>2</sub>) denoting the r<sup>th</sup> car swap-the car no. w<sub>1</sub> of the train no. p<sub>1</sub> is swapped with the car no. w<sub>2</sub> of the train no. p<sub>2</sub>.</p>

<p>&nbsp;</p>

### 출력

<p>Your programme should write out exactly n lines. The k<sup>th</sup> line should contain one integer-the number of trains looking the same as the train no. k at certain moment.</p>

<p>&nbsp;</p>

### 힌트

<p>The figure presents the successive car swaps:</p>

<p><br />
track 1: &nbsp;ababbd &nbsp; &nbsp; &nbsp;ababbd &nbsp; &nbsp; &nbsp;ababbd &nbsp; &nbsp; ababbd &nbsp; &nbsp; aaabbd &nbsp; &nbsp; &nbsp;aaabbd &nbsp; &nbsp; &nbsp;aaabbd &nbsp; &nbsp; &nbsp;aaabbd<br />
track 2: &nbsp;abbbbd &nbsp; &nbsp; ababbd &nbsp; &nbsp; &nbsp;ababbd &nbsp; &nbsp; aaabbd &nbsp; &nbsp; aaabbd &nbsp; &nbsp; &nbsp;acabbd &nbsp; &nbsp; &nbsp;acabbd &nbsp; &nbsp; &nbsp;acabbd<br />
track 3: &nbsp;aaabad -&gt; aaabad -&gt; aaabad -&gt; aaabbd -&gt; aaabbd -&gt; aaabbd -&gt; aaabbd -&gt; aaabbd<br />
track 4: &nbsp;caabbd &nbsp; &nbsp; caabbd &nbsp; &nbsp; &nbsp;caabbd &nbsp; &nbsp; caabbd &nbsp; &nbsp; &nbsp;cabbbd &nbsp; &nbsp; &nbsp;cabbbd &nbsp; &nbsp; &nbsp;cabbbd &nbsp; &nbsp; dabbbd<br />
track 5: &nbsp;cabaad &nbsp; &nbsp; &nbsp;cabbad &nbsp; &nbsp; &nbsp;caabbd &nbsp; &nbsp; caabbd &nbsp; &nbsp; &nbsp;caabbd &nbsp; &nbsp; &nbsp;aaabbd &nbsp; &nbsp;&nbsp;&nbsp;aaabbd &nbsp; &nbsp; &nbsp;aaabbc<br />
&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;(0) &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; (1) &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; (2) &nbsp; &nbsp; &nbsp; &nbsp;&nbsp;&nbsp; &nbsp;(3) &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; (4) &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; (5) &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; (6) &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;(7)</p>

<p>The number of trains looking the same as either of the trains no. 1, 2 or 3 was maximal at time (4) (when all three looked the same). The number of trains looking the same as the train no. 5 was maximal at time (5) and (6). The number of trains looking the same as the train no. 4 was maximal at time (2).</p>