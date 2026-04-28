# [Silver III] Colorful Drink - 16827

[문제 링크](https://www.acmicpc.net/problem/16827)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 85, 정답: 47, 맞힌 사람: 38, 정답 비율: 55.882%

### 분류

자료 구조, 그리디 알고리즘, 해시를 사용한 집합과 맵, 정렬, 두 포인터, 집합과 맵

### 문제 설명

<p>In the Jambo Amusement Garden (JAG), you sell colorful drinks consisting of multiple color layers. This colorful drink can be made by pouring multiple colored liquids of different density from the bottom in order.</p>

<p>You have already prepared several colored liquids with various colors and densities. You will receive a drink request with specified color layers. The colorful drink that you will serve must satisfy the following conditions.</p>

<ul>
	<li>You cannot use a mixed colored liquid as a layer. Thus, for instance, you cannot create a new liquid with a new color by mixing two or more different colored liquids, nor create a liquid with a density between two or more liquids with the same color by mixing them.</li>
	<li>Only a colored liquid with strictly less density can be an upper layer of a denser colored liquid in a drink. That is, you can put a layer of a colored liquid with density $x$ directly above the layer of a colored liquid with density $y$ if $x &lt; y$ holds.</li>
</ul>

<p>Your task is to create a program to determine whether a given request can be fulfilled with the prepared colored liquids under the above conditions or not.</p>

### 입력

<p>The input consists of a single test case in the format below.</p>

<pre class="mathjax">
$N$
$C_1$ $D_1$
$\vdots$
$C_N$ $D_N$
$M$
$O_1$
$\vdots$
$O_M$</pre>

<p>The first line consists of an integer $N$ ($1 \le N \le 10^5$), which represents the number of the prepared colored liquids. The following $N$ lines consists of $C_i$ and $D_i$ ($1 \leq i \leq N$). $C_i$ is a string consisting of lowercase alphabets and denotes the color of the $i$-th prepared colored liquid. The length of $C_i$ is between $1$ and $20$ inclusive. $D_i$ is an integer and represents the density of the $i$-th prepared colored liquid. The value of $D_i$ is between $1$ and $10^5$ inclusive. The ($N+2$)-nd line consists of an integer $M$ ($1 \leq M \leq 10^5$), which represents the number of color layers of a drink request. The following $M$ lines consists of $O_i$ ($1 \leq i \leq M$). $O_i$ is a string consisting of lowercase alphabets and denotes the color of the $i$-th layer from the top of the drink request. The length of $O_i$ is between $1$ and $20$ inclusive.</p>

### 출력

<p>If the requested colorful drink can be served by using some of the prepared colored liquids, print <code>Yes</code>. Otherwise, print <code>No</code>.</p>