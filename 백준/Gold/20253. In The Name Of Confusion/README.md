# [Gold III] In The Name Of Confusion - 20253

[문제 링크](https://www.acmicpc.net/problem/20253)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 86, 정답: 52, 맞힌 사람: 38, 정답 비율: 64.407%

### 분류

그리디 알고리즘, 많은 조건 분기

### 문제 설명

<blockquote>
<p>There&rsquo;s no such thing as public opinion.</p>

<hr />
<p>Jordan Ellenberg, American Mathematician</p>
</blockquote>

<p>In K City lives n residents who want to build a connection network with each other. However, some residents want the network wires colored black while the others want the wires colored white. The opinion of resident i can be quantified as a number ai . If we build a network wire between residents i and j, the cost of this wire will be a<sub>i</sub> &times; a<sub>j</sub>.</p>

<p>The mayor of K City wants to build a network such that:</p>

<ol>
	<li>There are exactly n &minus; 1 wires used.</li>
	<li>For any two different residents i and j, there exists a sequence p<sub>1</sub>, &middot; &middot; &middot; , p<sub>k</sub> such that p<sub>1</sub> = i, p<sub>k</sub> = j and residents p<sub>ℓ</sub> and p<sub>ℓ+1</sub> share a wire for 1 &le; ℓ &lt; k.</li>
</ol>

<p>In other words, the network should be a tree.</p>

<p>You, the renowned mathematician of K City, want to know not only the <em>minimum</em> cost to build the network. In the name of confusion, you also want to know the <em>maximum</em> cost!</p>

### 입력

<p>The first line begins with a number n indicating the number of residents. The second line contains n numbers a<sub>1</sub>, a<sub>2</sub>, . . . , a<sub>n</sub>. The opinion of resident i is the quantified as a<sub>i</sub>.</p>

### 출력

<p>Output two numbers separated by a blank in a line. The numbers are the <em>minimum</em> cost and the <em>maximum</em> cost to build the network, respectively. Since the absolute value of the costs may be extremely large, you have to modulo the answer with 10<sup>9</sup> + 7. Please note that the modulo of a number (defined by Donald Knuth) is a mod b = a &minus; b&lfloor;a/b&rfloor;. The output number should be non-negetive.</p>

### 제한

<ul>
	<li>1 &le; n &le; 10<sup>6</sup></li>
	<li>|a<sub>i</sub>| &le; 10<sup>6</sup></li>
</ul>