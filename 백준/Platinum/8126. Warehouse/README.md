# [Platinum III] Warehouse - 8126

[문제 링크](https://www.acmicpc.net/problem/8126)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 84, 정답: 16, 맞힌 사람: 12, 정답 비율: 21.818%

### 분류

그리디 알고리즘, 정렬

### 문제 설명

<p>The streets of the New Byte City form a rectangular grid - those running east-west are simply called streets, while those running north-south are called avenues. To avoid mistakes, we shall call them h-streets and v-streets, respectively. The v-streets are numbered from 1 to 500,000,000 eastwards. Similarly, the h-streets are numbered from 1 to 500,000,000 northwards. Every v-street crosses every h-street and, conversely, every h-street crosses every v-street. The distance between two consecutive v-streets, as well as between two consecutive h-streets, is exactly one kilometre.</p>

<p><img alt="" src="https://onlinejudgeimages.s3.amazonaws.com/problem/8126/1.gif" style="height:274px; width:263px" /></p>

<p>There are k shops in the city, each one of them is situated at a crossroads. Byteasar, the merchant, supplies every single one of the k shops, and furthermore he returns to some of them several times a day with fresh supplies. Recently he has decided to have a warehouse built, from which the goods would be delivered. For obvious reasons, it should stand at a crossroads. The lorry loaded with goods can supply only one shop per course - it leaves the warehouse, delivers to the shop and returns to the warehouse. The lorry always picks the shortest path from the warehouse to the shop, and the shortest one back (possibly the same one). The distance between points (x<sub>i</sub>,y<sub>i</sub>) and (x<sub>j</sub>,y<sub>j</sub>) equals max{|x<sub>i</sub>-x<sub>j</sub>|,|y<sub>i</sub>-y<sub>j</sub>|}.</p>

<p>
Write a programme that:</p>

<ul>
	<li>reads the locations of shops, as well as the numbers of their daily deliveries, from the standard input</li>
	<li>determines such a warehouse&#39;s position that the summary distance of the lorry&#39;s daily route is minimal,</li>
	<li>writes the result to the standard output.</li>
</ul>

### 입력

<p>The first line of the standard input contains one integer n (1 &le; n &le; 100,000), the number of shops in the New Byte City.</p>

<p>The following n lines contain the shops&#39; descriptions. The (i+1)&rsquo;th line contains three integers x<sub>i</sub>, y<sub>i</sub> and t<sub>i</sub> (1 &le; x<sub>i</sub>,y<sub>i</sub> &le; 500,000,000, 1 &le; t<sub>i</sub> &le; 1,000,000), separated by single spaces. This triple means that the &#39;th shop lies at the crossing of x<sub>i</sub>&rsquo;th v-street and y<sub>i</sub>&rsquo;th h-street and the lorry delivers goods to this shop t<sub>i</sub> times a day.</p>

### 출력

<p>The first and only line of the standard output should contain two integers x<sub>m</sub> and y<sub>m</sub>, separated by a single space, denoting the optimal position of the warehouse as the crossroads of the x<sub>m</sub>&rsquo;th v-street and the y<sub>m</sub>&rsquo;th h-street. Should there be many optimal solutions, your programme is to pick one of them arbitrarily.</p>

<p>&nbsp;</p>

### 힌트

<p>The picture below illustrates the example. The numbered points are the shops. The point &nbsp;is the optimal position of the warehouse.<br />
<img alt="" src="https://onlinejudgeimages.s3.amazonaws.com/problem/8126/2.gif" /></p>