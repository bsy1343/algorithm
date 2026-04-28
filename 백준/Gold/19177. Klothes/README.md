# [Gold III] Klothes - 19177

[문제 링크](https://www.acmicpc.net/problem/19177)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 58, 정답: 31, 맞힌 사람: 25, 정답 비율: 54.348%

### 분류

그리디 알고리즘, 애드 혹

### 문제 설명

<p>What an unsmurfy day! &nbsp;Smurfette just found out that someone (probably Jokey Smurf) has stolen all of her clothes and she&#39;ll need to buy new ones. &nbsp;There are $n$ sets of clothes in the shop each having different integer price from $1$ to $n$ smurfcoins. Since smurfiness of an article of clothing is proportional to its price Smurfette wants to spend all of her $s$ smurfcoins. &nbsp;However her wardrobe will fit only $k$ clothes so she needs to buy exactly $k$ (having empty places in a wardrobe is bad for her image).</p>

### 입력

<p>First line of input file contains the number of testcases $t$ ($t \leq 8000$). Each testcase consists of a single line containing three integers $n$, $s$, and $k$ ($1 \leq k \leq n \leq 40\,000$, $0 \leq s \leq 10^9$). $n$ is the number of clothes available in the shop, $k$ is the number of clothes Smurfette wants to buy, and $s$ is the amount of smurfcoins she wants to spend.</p>

### 출력

<p>For each testcase output on a single line the word &quot;YES&quot; (without quotes) if it is possible to buy $k$ clothes so that their price is $s$, or &quot;NO&quot; otherwise. &nbsp;If the answer is &quot;YES&quot; then on the following line output a string of $n$ digits $a_i$.&nbsp; $a_i$ should be $1$ if Smurfette should buy article of clothing with price $i$, otherwise $a_i$ should be $0$.</p>