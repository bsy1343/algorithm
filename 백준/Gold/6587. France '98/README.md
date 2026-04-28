# [Gold IV] France '98 - 6587

[문제 링크](https://www.acmicpc.net/problem/6587)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 55, 정답: 34, 맞힌 사람: 28, 정답 비율: 57.143%

### 분류

브루트포스 알고리즘, 구현, 수학, 확률론, 시뮬레이션

### 문제 설명

<p>Today the first round of the Soccer World Championship in France is coming to an end. 16 countries are remaining now, among which the winner is determined by the following tournament:</p>

<pre>
 1 Brazil -----+	
   	       +-- ? --+
 2 Chile ------+       |
		       +-- ? --+
 3 Nigeria ----+       |       |
	       +-- ? --+       |
 4 Denmark ----+	       |
	                       +-- ? --+
 5 Holland ----+	       |       |
	       +-- ? --+       |       |
 6 Yugoslavia -+       |       |       |
		       +-- ? --+       |
 7 Argentina --+       |	       |
	       +-- ? --+	       |
 8 England ----+		       |
				       +-- World Champion
 9 Italy ------+		       |
	       +-- ? --+	       |
10 Norway -----+       |               |
		       +-- ? --+       |
11 France -----+       |       |       |
	       +-- ? --+       |       |
12 Paraguay ---+	       |       |
			       +-- ? --+
13 Germany ----+	       |
	       +-- ? --+       |
14 Mexico -----+       |       |
		       +-- ? --+
15 Romania ----+       |
	       +-- ? --+
16 Croatia ----+
</pre>

<p>For each possible match A vs. B between these 16 nations, you are given the probability that team A wins against B. This (together with the tournament mode displayed above) is sufficient to compute the probability that a given nation wins the World Cup. For example, if Germany wins against Mexico with 80%, Romania against Croatia with 60%, Germany against Romania with 70% and Germany against Croatia with 90%, then the probability that Germany reaches the semi-finals is 80% * (70% * 60% + 90% * 40%) = 62.4%.</p>

<p>Your task is to write a program that computes the chances of the 16 nations to become the World Champion &#39;98.</p>

### 입력

<p>The input file will contain just one test case.</p>

<p>The first 16 lines of the input file give the names of the 16 countries, from top to bottom according to the picture given above.</p>

<p>Next, there will follow a 16 x 16 integer matrix P where element p<sub>ij</sub>gives the probability in percent that country #i defeats country #j in a direct match. Country #i means the i-th country from top to bottom given in the list of countries. In the picture above Brazil is #1 and Germany is #13, so p<sub>1,13</sub>=55 would mean that in a match between Brazil and Germany, Brazil wins with a probability of 55%.</p>

<p>Note that matches may not end with a draw, i.e. p<sub>ij</sub> + p<sub>ji</sub> = 100 for all i,j.</p>

### 출력

<p>Output 16 lines of the form &quot;<em>XXXXXXXXXX</em> p=<em>Y.YY</em>%&quot;, where <em>XXXXXXXXXX</em> is the country&#39;s name, left-justified in a field of 10 characters, and <em>Y.YY</em> is their chance in percent to win the cup, written to two decimal places. Use the same order of countries like in the input file.</p>